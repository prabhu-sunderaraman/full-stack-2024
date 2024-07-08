import logo from './logo.svg';
import './App.css';
import { Lab01 } from './lab01/Lab01';
import { MyPanel } from './contextExample/MyPanel';
import { Lab02 } from './lab02/Lab02';

function App() {
  return (
    <div className="App">
      <Lab02 url={'./covidData.json'}/>
    </div>
  );
}

export default App;
