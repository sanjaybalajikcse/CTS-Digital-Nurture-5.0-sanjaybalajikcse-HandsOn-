import './App.css';
import officeImg from './office.png';

const officeList = [
  { Name: "DBS", Rent: 50000, Address: 'Chennai' },
  { Name: "WeWork", Rent: 75000, Address: 'Bangalore' },
  { Name: "Regus", Rent: 45000, Address: 'Hyderabad' },
];

function App() {
  return (
    <div>
      <h1>Office Space , at Affordable Range</h1>
      {officeList.map((item, index) => {
        let colors = [];
        if (item.Rent <= 60000) {
          colors.push('textRed');
        } else {
          colors.push('textGreen');
        }

        return (
          <div key={index}>
            <img src={officeImg} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {item.Name}</h1>
            <h3 className={colors.join(' ')}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
            <hr />
          </div>
        );
      })}
    </div>
  );
}

export default App;