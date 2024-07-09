//Every reducer has state data and an action
//Based on the action type you will modify the state data
export const GeoReducer = (countries, action) => {
    switch (action.type) {
        case 'COUNTRY_ADDED':
            console.log('COUNTRY_ADDED');
            let countryToBeAdded = action.country;
            let existingCountry = countries.find(item => item === countryToBeAdded);    
            if(!existingCountry) {
                return [...countries, countryToBeAdded];
            }
            return countries; 
        case 'COUNTRY_DELETED':
            let countryToBeDeleted = action.country;
            let filteredCountries = countries.filter(item => item !== countryToBeDeleted);
            if(filteredCountries.length < countries.length) {
                return filteredCountries;
            }
            return countries; 
        default:
            break;
    }
};