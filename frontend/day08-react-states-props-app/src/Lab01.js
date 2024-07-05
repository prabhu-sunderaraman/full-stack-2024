import { useEffect, useState } from "react";


const Lab01 = () => {
    const [countries, setCountries] = useState([]);
    const [cities, setCities] = useState([]);

    useEffect(() => {
        // CALLED ONLY ONCE ON FIRST LOAD
        fetch("/data.json", {
            method: "GET"
        })
        .then(response => response.json())
        .then(response => setCountries(response.countries));
    }, []);

    const getCountries = () => {
        let countriesInJsx = [];
        countriesInJsx = countries.map(country => {
            return <option key={country.name}>{country.name}</option>
        });
        countriesInJsx = [<option key="--SELECT--">--SELECT--</option>, ... countriesInJsx];
        return countriesInJsx;
    };

    const getCities = () => {
        let citiesInJsx = [];
        citiesInJsx = cities.map(city => {
            return <option key={city}>{city}</option>
        });
        citiesInJsx = [<option key="--SELECT--">--SELECT--</option>, ... citiesInJsx];
        return citiesInJsx;
    };

    const onCountryChanged = (e) => {
        let selectedCountry = e.target.value;
        if(selectedCountry !== "--SELECT--") {
            let selectedCities = countries
                                    .find(countryItem => countryItem.name === selectedCountry)
                                    .cities;
            setCities(selectedCities);
        } else {
            setCities([]);
        }
    }

    const onCountryChanged2 = (selectedCountry) => {
        if(selectedCountry !== "--SELECT--") {
            let selectedCities = countries
                                    .find(countryItem => countryItem.name === selectedCountry)
                                    .cities;
            setCities(selectedCities);
        } else {
            setCities([]);
        }
    }

    return (<div>
        <label>Country</label>
        <select onChange={e => onCountryChanged2(e.target.value)}>
            {getCountries()}
        </select>
        <br/>
        <label>City</label>
        <select>{getCities()}</select>
    </div>);
};

export default Lab01;