

import React, { Component } from 'react';
class CartView extends Component {
    renderCartItems(cart) {
        return cart.map((item, idx) => {
            return (
                <tr key={idx}>
                    <td>{item.name}</td>
                    <td>&#8377;{item.price}</td>
                    <td>qty</td>
                    <td>total</td>
                </tr>
            )
        })
    }
    render() {
        let { value: cart } = this.props;
        return (
            <div className="card">
                <div className="card-header">Item(s) in cart</div>
                <div className="card-body">
                    <table className="table table-sm table-bordered">
                        <tbody>
                            {this.renderCartItems(cart)}
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default CartView;