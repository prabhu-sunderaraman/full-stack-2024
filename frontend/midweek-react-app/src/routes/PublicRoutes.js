import {createBrowserRouter} from 'react-router-dom';
import MainLayout from '../layouts/MainLayout';
import LabsLayout from '../layouts/LabsLayout';
import Home from '../components/home/Home';
import Contact from '../components/contact/Contact';

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
                        element: <div>Lab01 view</div>
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