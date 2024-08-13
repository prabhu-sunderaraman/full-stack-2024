import {useState} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { COUNTRIES_ACTION } from './store';

const CountryForm = () => {
    const dispatch = useDispatch();
    const [country, setCountry] = useState('');
    const countries = useSelector(state => state.countries);
    const addCountryButtonClicked = () => {
        dispatch(COUNTRIES_ACTION.addCountry({
            country
        }));
    };

    const deleteCountryButtonClicked = () => {
        dispatch(COUNTRIES_ACTION.deleteCountry({
            country
        }));
    };

    return (<div>
        <input type="text" placeholder="Country" onChange={e => setCountry(e.target.value)}></input><br/>
        <button onClick={addCountryButtonClicked}>Add country</button>
        <button onClick={deleteCountryButtonClicked}>Delete country</button>
        <ul>
            {
                countries ? countries.map(it => <li key={it}>{it}</li>) : ''
            }
        </ul>
    </div>);
};
export default CountryForm;