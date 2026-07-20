import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: ''
    };

    this.handleAmountChange = this.handleAmountChange.bind(this);
    this.handleCurrencyChange = this.handleCurrencyChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleAmountChange(e) {
    this.setState({ amount: e.target.value });
  }

  handleCurrencyChange(e) {
    this.setState({ currency: e.target.value });
  }

  handleSubmit() {
    const rate = 80; // 1 unit = 80 (example conversion rate)
    const convertedAmount = this.state.amount * rate;
    alert(`Converting to ${this.state.currency} Amount is ${convertedAmount}`);
  }

  render() {
    return (
      <div>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
        <table>
          <tbody>
            <tr>
              <td>Amount:</td>
              <td>
                <input
                  type="text"
                  value={this.state.amount}
                  onChange={this.handleAmountChange}
                />
              </td>
            </tr>
            <tr>
              <td>Currency:</td>
              <td>
                <textarea
                  value={this.state.currency}
                  onChange={this.handleCurrencyChange}
                />
              </td>
            </tr>
          </tbody>
        </table>
        <button onClick={this.handleSubmit}>Submit</button>
      </div>
    );
  }
}

export default CurrencyConvertor;