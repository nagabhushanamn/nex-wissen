import React, { Component } from 'react';

class Navbar extends Component {

    render() {
        let { title } = this.props;
        return (
            <div>
                <nav className="navbar navbar-light bg-info">
                    <a className="navbar-brand" href="/">{title}</a>
                </nav>
            </div>
        );
    }

}

export default Navbar;