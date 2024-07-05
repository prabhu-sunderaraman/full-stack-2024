import './App.css';
import Lab01 from './Lab01';
import Lifecycle from './Lifecycle';
import PropsExample from './PropsExample';
import PropsExample2 from './PropsExample2';

function App() {
  return (
    <div className="App">
      <PropsExample2 message="Hello" comment="WTH"/>
      <hr/>
      <PropsExample2 message="Hi" comment="Ayyo!"/>
      <hr/>
      <PropsExample2 message="Wassup" comment="Cool!!!"/>
    </div>
  );
}

export default App;
