import logo from './logo.svg';
import './App.css';
import MyHeader from './MyHeader';
import MyFooter from './MyFooter';
import LoginForm from './LoginForm';

function App() {
  return (
    <div>
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
