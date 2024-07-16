import logo from './logo.svg';
import './App.css';
import MoviesDisplay1 from './MoviesDisplay1';
import CountryForm from './CountryForm';
import ContinentForm from './ContinentForm';
import GameView from './GameView';

function App() {
  return (
    <div className="App">
      <CountryForm/>
      <br/> <hr/>
      <ContinentForm/>
      <br/> <hr/>
      <GameView/>
    </div>
  );
}

export default App;
