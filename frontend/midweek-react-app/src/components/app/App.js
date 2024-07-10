import { RouterProvider } from 'react-router-dom';
import logo from '../../assets/images/logo.svg';
import '../../assets/styles/App.css';
import PublicRoutes from '../../routes/PublicRoutes';

function App() {
  return (
    <div>
      <RouterProvider router={PublicRoutes}></RouterProvider> 
    </div>
  );
}

export default App;
