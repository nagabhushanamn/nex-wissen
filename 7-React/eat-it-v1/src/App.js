import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import 'font-awesome/css/font-awesome.css';
import Navbar from './components/Navbar';
import CartView from './components/CartView'
import Home from './components/Home'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import ItemList from './components/ItemList';

class App extends React.Component {
  state = {
    cart: [],
  }
  addToCart(item, qty) {
    let { cart } = this.state;
    cart = cart.concat(item);
    this.setState({ cart })
  }
  render() {
    let { cart } = this.state;
    return (
      <div>
        <Navbar title="eat-IT" />
        <Router>
          <div>
            <hr />
            <i className="fa fa-shopping-cart"></i>&nbsp;
            {cart.length} items in cart
            <hr />
            <ul className="nav nav-pills">
              <li className="nav-item">
                <Link className="nav-link" to="/">Home</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/items">Items</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to="/cart">Cart</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link disabled" to="/orders">Orders</Link>
              </li>
            </ul>
            <hr />
            <div className="container">
              <div>
                <Route path={"/"} exact={true} component={Home} />
                <Route path={"/items"} render={() => <ItemList onBuy={e => this.addToCart(e.item)} />} />
                <Route path={"/cart"} render={() => <CartView value={cart} />} />
              </div>
            </div>
          </div>
        </Router>
      </div>
    );
  }
}

export default App;
