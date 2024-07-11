import { RouterProvider } from 'react-router-dom';
import '../../assets/styles/App.css';
import PublicRoutes from '../../routes/PublicRoutes';
import { useReducer } from 'react';
import Lab01Reducer from '../../services/reducers/Lab01Reducer';
import Lab01Context from '../../services/contexts/Lab01Context';

function App() {
  const [countries, countriesDispatch] = useReducer(Lab01Reducer, []);
  return (
    <div>
      <Lab01Context.Provider value={{countries, countriesDispatch}}>
        <RouterProvider router={PublicRoutes}></RouterProvider> 
      </Lab01Context.Provider>
    </div>
  );
}

export default App;
