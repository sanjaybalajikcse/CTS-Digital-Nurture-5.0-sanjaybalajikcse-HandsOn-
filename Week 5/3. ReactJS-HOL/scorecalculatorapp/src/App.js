import React from 'react';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore
        Name="John Doe"
        School="Green Valley High School"
        total={450}
        goal={500}
      />
    </div>
  );
}

export default App;