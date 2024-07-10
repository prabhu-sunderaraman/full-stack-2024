import {createBrowserRouter} from 'react-router-dom';
import MainLayout from '../layouts/MainLayout';
import LabsLayout from '../layouts/LabsLayout';

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
                element: <div>Contact us view</div>
            }
        ]
    }
]);

export default PublicRoutes;