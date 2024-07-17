import logo from './logo.svg';
import './App.css';
import Calc from './Calc';
import News from './News';

function App() {
  console.log(navigator.language);
  return (
    <div className="App">
      <News/>
    </div>
  );
}

export default App;
