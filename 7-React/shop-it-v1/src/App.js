import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import Navbar from './components/Navbar';
import Item from './components/Item';

class App extends React.Component {
  state = {
    items: [
      {
        id: 1,
        name: 'Laptop',
        price: 198000,
        canBuy: true,
        imgPath: 'images/Laptop.png',
        description: 'new mac pro'
      },
      {
        id: 2,
        name: 'Mobile',
        price: 43000,
        canBuy: true,
        imgPath: 'images/Mobile.png',
        description: 'new  pro'
      }
    ]
  }

  renderItems() {
    let { items } = this.state;
    return items.map((item, idx) => {
      return (
        <div className="list-group-item" key={idx}>
          <Item value={item} />
        </div>
      )
    })
  }
  render() {
    return (
      <div>
        <Navbar title="shopIT" />
        <hr />
        <hr />
        <div className="container">
          {this.renderItems()}
        </div>
      </div>
    );
  }
}

export default App;
