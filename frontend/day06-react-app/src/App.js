import logo from './logo.svg';
import './App.css';
import MyHeader from './MyHeader';
import MyFooter from './MyFooter';
import LoginForm from './LoginForm';
import TeaserForThursday from './TeaserForThursday';

function App() {
  return (
    <div>
      <TeaserForThursday/>
      <hr/>
      {/* 
        Implement Lab01 as a component 
        and 
        insert it here as  <Lab01/>
      */}
      <MyHeader/>
      <hr/>
      <LoginForm/>
      <br/><br/><br/><br/><br/>
      <hr/>
      <MyFooter/>

    </div>
  );
}

export default App;
