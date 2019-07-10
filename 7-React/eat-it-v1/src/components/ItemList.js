import React, { Component } from 'react';
import Item from './Item';
import axios from 'axios'

class ItemList extends Component {
    state = {
        items: []
    } 
    componentDidMount() {
        let api = "http://localhost:8081/api/v1/items";
        axios.get(api)
            .then(response => response.data)
            .then(items => {
                this.setState({ items })
            })
    }
    renderItems() {
        let { items } = this.state;
        return items.map((item, idx) => {
            return (
                <div className="list-group-item" key={idx}>
                    <Item value={item} onBuy={e => this.props.onBuy(e)} />
                </div>
            )
        })
    }
    render() {
        return (
            <div>
                {this.renderItems()}
            </div>
        );
    }
}

export default ItemList;