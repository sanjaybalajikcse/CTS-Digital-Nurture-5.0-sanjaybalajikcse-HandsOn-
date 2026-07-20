import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 5
    };

    // "this" binding — needed because class methods aren't
    // auto-bound to the instance in JS
    this.increment = this.increment.bind(this);
    this.decrement = this.decrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }

  // 1a. increments the counter
  increment() {
    this.setState({ count: this.state.count + 1 });
    this.sayHello(); // 1b. also calls a second method
  }

  decrement() {
    this.setState({ count: this.state.count - 1 });
  }

  // Static message triggered from Increment
  sayHello() {
    alert('Hello! Member1');
  }

  // 2. Function that takes an argument
  sayWelcome(message) {
    alert(message);
  }

  // 3. Synthetic event handler
  handleClick(e) {
    // 'e' here is React's SyntheticEvent, not the raw DOM event
    alert('I was clicked');
  }

  render() {
    return (
      <div>
        <p>{this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <button onClick={() => this.sayWelcome('welcome')}>Say welcome</button>
        <button onClick={this.handleClick}>Click on me</button>
      </div>
    );
  }
}

export default Counter;