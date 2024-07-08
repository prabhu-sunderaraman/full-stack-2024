import logo from './logo.svg';
import './App.css';
import {MyPanel} from './propsExample1/MyPanel';
import { Lab01 } from './lab01/Lab01';

function App() {
  return (
    <div className="App">
      <Lab01 url={'./covidData.json'}/>
    </div>
  );
}

export default App;
