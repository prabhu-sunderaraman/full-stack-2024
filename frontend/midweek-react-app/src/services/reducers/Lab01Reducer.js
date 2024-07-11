import Lab01Action from "../actions/Lab01Action";

const Lab01Reducer = (countries, action) => {
    switch (action.type) {
        case Lab01Action.COUNTRY_ADDED:
            let countryToBeAdded = action.country;
            let existingCountry = countries.find(item => item === countryToBeAdded);    
            if(!existingCountry) {
                return [...countries, countryToBeAdded];
            }
            return countries; 
        case Lab01Action.COUNTRY_DELETED:
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
export default Lab01Reducer;