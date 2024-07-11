import {createBrowserRouter} from 'react-router-dom';
import MainLayout from '../layouts/MainLayout';
import LabsLayout from '../layouts/LabsLayout';
import Home from '../components/home/Home';
import Contact from '../components/contact/Contact';
import Lab01 from '../components/lab01/Lab01';

const PublicRoutes = createBrowserRouter([
    {
        path: '/',
        element: <MainLayout/>,
        children: [
            {
                index: true,
                element: <Home/>
            },
            {
                path: '/labs',
                element: <LabsLayout/>,
                children: [
                    {
                        index: true,
                        element: <Lab01/>
                    },
                    {
                        path: '/labs/lab02',
                        element: <div>Lab02 view</div>
                    }
                ]
            },
            {
                path: '/contact',
                element: <Contact/>
            }
        ]
    }
]);

export default PublicRoutes;