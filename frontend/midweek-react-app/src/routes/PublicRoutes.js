import {createBrowserRouter} from 'react-router-dom';
import MainLayout from '../layouts/MainLayout';
import LabsLayout from '../layouts/LabsLayout';
import Home from '../components/home/Home';
//import Contact from '../components/contact/Contact';
import React from 'react';
import Lab02 from '../components/lab02/Lab02';
import Lab03 from '../components/lab03/Lab03';
import Lab04 from '../components/lab04/Lab04';
//import Lab01 from '../components/lab01/Lab01';

const Contact = React.lazy(() => import('../components/contact/Contact'));
const Lab01 = React.lazy(() => import('../components/lab01/Lab01'));


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
                        element: <React.Suspense fallback={<div>Not able to load Lab01. Service Unavailable</div>}>
                            <Lab01/>
                        </React.Suspense>
                    },
                    {
                        path: '/labs/lab02',
                        element: <Lab02/>
                    },
                    {
                        path: '/labs/lab03',
                        element: <Lab03/>
                    },
                    {
                        path: '/labs/lab04',
                        element: <Lab04/>
                    }
                ]
            },
            {
                path: '/contact',
                element: <React.Suspense fallback={<div>Not able to load Contact us. Service Unavailable</div>}>
                    <Contact/>
                </React.Suspense>
            }
        ]
    }
]);

export default PublicRoutes;