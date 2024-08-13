import {useReducer, useState} from 'react';
import { GeoReducer } from './GeoReducer';

export const CountryViewWithReducer = () => {
    const [country, setCountry] = useState();

    const [countries, dispatch] = useReducer(GeoReducer, []);

    const addCountryButtonClicked = () => {
        dispatch({
            type: 'COUNTRY_ADDED',
            country
        });
    };
    const removeCountryButtonClicked = () => {
        dispatch({
            type: 'COUNTRY_DELETED',
            country
        });
    };

    return (<div>
        <input type="text" placeholder="Country" onChange={(e) => setCountry(e.target.value)}></input>
        <br/>
        <button onClick={addCountryButtonClicked}>Add country</button>
        <button onClick={removeCountryButtonClicked}>Remove country</button>
        <br/>
        <hr/>
        <ul>
            {countries.map(country => <li key={country}>{country}</li>)}
        </ul>
    </div>);
};