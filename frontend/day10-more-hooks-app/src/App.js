import logo from './logo.svg';
import './App.css';
import { CountryViewWithoutReducer } from './reducerExample1/CountryViewWithoutReducer';
import { CountryViewWithReducer } from './reducerExample1/CountryViewWithReducer';

function App() {
  return (
    <div className="App">
      <CountryViewWithReducer/>
    </div>
  );
}

export default App;
