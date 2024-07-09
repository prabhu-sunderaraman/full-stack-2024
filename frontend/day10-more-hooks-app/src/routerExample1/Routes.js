import { createBrowserRouter } from "react-router-dom";
import GuessingGame from "../lab01/GuessingGame";
import { CountryViewWithReducer } from "../reducerExample1/CountryViewWithReducer";
import { ContactUs } from "./ContactUs";

export const router = createBrowserRouter([
    {
        path: '/',
        element: <p>Welcome Home</p>
    },
    {
        path: '/game',
        element: <GuessingGame/>
    },
    {
        path: '/reducer',
        element: <CountryViewWithReducer/>
    },
    {
        path: '/contact',
        element: <ContactUs/>
    }
]);