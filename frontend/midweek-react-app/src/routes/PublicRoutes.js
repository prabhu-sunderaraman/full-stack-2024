import {createBrowserRouter} from 'react-router-dom';
import MainLayout from '../layouts/MainLayout';

const PublicRoutes = createBrowserRouter([
    {
        path: '/',
        element: <MainLayout/>,
        children: [
            {
                index: true,
                element: <div>Home view</div>
            },
            {
                path: '/lab01',
                element: <div>Lab 01 view</div>
            },
            {
                path: '/lab02',
                element: <div>Lab02 view</div>
            },
            {
                path: '/contact',
                element: <div>Contact us view</div>
            }
        ]
    }
]);

export default PublicRoutes;