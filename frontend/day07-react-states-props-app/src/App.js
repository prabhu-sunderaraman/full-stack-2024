import './App.css';
import GuessingGame from './lab01/GuessingGame';
import StateExample1 from './StateExample1';
import StateExample2 from './StateExample2';
import StateExample3 from './StateExample3';
import TGIF from './TGIF';

function App() {
  return (
    <div className="App">
      <TGIF name="Vinoth" message="Movie time"/>
      <TGIF name="Lakshmi" message="Time for Pizza"/>
      <TGIF name="Umesh" message="Sleep well"/>
      <TGIF name="Princy" message="Malls"/>
      <TGIF name="Balakumar" message="Biriyani"/>
      <hr/>
      <GuessingGame/>
    </div>
  );
}

export default App;
