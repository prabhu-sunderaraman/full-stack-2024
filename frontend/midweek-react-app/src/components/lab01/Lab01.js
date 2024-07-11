import {useContext, useReducer, useState} from 'react';
import Lab01Reducer from '../../services/reducers/Lab01Reducer';
import Lab01Action from '../../services/actions/Lab01Action';
import Lab01Context from '../../services/contexts/Lab01Context';


const Lab01 = () => {
    const [country, setCountry] = useState();

    //const [countries, dispatch] = useReducer(Lab01Reducer, []);
    const {countries, countriesDispatch} = useContext(Lab01Context);

    const addCountryButtonClicked = () => {
        countriesDispatch({
            type: Lab01Action.COUNTRY_ADDED,
            country
        });
    };
    const removeCountryButtonClicked = () => {
        countriesDispatch({
            type: Lab01Action.COUNTRY_DELETED,
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
export default Lab01;