import {useState} from 'react';

export const CountryViewWithoutReducer = () => {
    const [countries, setCountries] = useState([]);
    const [country, setCountry] = useState();

    const addCountryButtonClicked = () => {
        let existingCountry = countries.find(item => item === country);
        if(!existingCountry) {
            setCountries([... countries, country]);
        }
    };
    const removeCountryButtonClicked = () => {
        let filteredCountries = countries.filter(item => item !== country);
        if(filteredCountries.length < countries.length) {
            setCountries(filteredCountries); 
        }
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