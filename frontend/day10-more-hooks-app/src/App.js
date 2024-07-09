import logo from './logo.svg';
import './App.css';
import { CountryViewWithoutReducer } from './reducerExample1/CountryViewWithoutReducer';
import { CountryViewWithReducer } from './reducerExample1/CountryViewWithReducer';
import GuessingGame from './lab01/GuessingGame';
import {BrowserRouter, Route, RouterProvider, Routes} from 'react-router-dom';
import { Menu } from './routerExample1/Menu';
import { router } from './routerExample1/Routes';

//Old style
/*
 <BrowserRouter>
        <Routes>
          <Route path="/" element={<h1>Home page</h1>}/>
          <Route path="/game" element={<GuessingGame/>}/>
          <Route path="/reducer" element={<CountryViewWithReducer/>}/>
        </Routes>
      </BrowserRouter>
*/

function App() {
  return (
    <div className="App">
      <Menu/>
      <RouterProvider router={router}/>
    </div>
  );
}

export default App;
