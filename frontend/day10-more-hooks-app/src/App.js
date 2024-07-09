import logo from './logo.svg';
import './App.css';
import { CountryViewWithoutReducer } from './reducerExample1/CountryViewWithoutReducer';
import { CountryViewWithReducer } from './reducerExample1/CountryViewWithReducer';
import GuessingGame from './lab01/GuessingGame';

function App() {
  return (
    <div className="App">
      <GuessingGame/>
    </div>
  );
}

export default App;
