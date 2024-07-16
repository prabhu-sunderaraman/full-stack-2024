import { configureStore, createSlice } from "@reduxjs/toolkit";

//similar to context API
const initialState = {
    countries: [],
    continents: [],
    game: {
        target: Math.floor(Math.random() * 100),
        message: '',
        attempts: 0
    }
};

//similar to reducer API
const addCountry = (countries, action) => {
    let {country} = action.payload;
    let existingCountry = countries.find(it => it === country);
    if(!existingCountry) {
        return [... countries, country];
    }
    return countries;
};

const deleteCountry = (countries, action) => {
    let {country} = action.payload;
    let existingCountry = countries.find(it => it === country);
    if(existingCountry) {
        let filteredCountries = countries.filter(it => it !== country);
        return [... filteredCountries];
    }
    return countries;
};

const addContinent = (continents, action) => {
    let {continent} = action.payload;
    let existingContinent = continents.find(it => it === continent);
    if(!existingContinent) {
        return [... continents, continent];
    }
    return existingContinent;
};

const playGame = (game, action) => {
    let {guess} = action.payload;
    let attempts = game.attempts + 1;
    let message = '';
    if(game.target > guess) {
        message = 'Aim higher';
    } else if(game.target < guess) {
        message = 'Aim lower'
    } else {
        message = "You've got it!!!"
    }
    return { ... game, attempts, message };
}

//It creates an action and a reducer for adding a country
const countriesSlice = createSlice({
    name: "day15",
    initialState: initialState.countries,
    reducers: {
        addCountry,
        deleteCountry
    }
});


const addContinentSlice = createSlice({
    name: "day15",
    initialState: initialState.continents,
    reducers: {
        addContinent
    }
});

const playGameSlice = createSlice({
    name: "day15",
    initialState: initialState.game,
    reducers: {
        playGame
    }
});

export const store = configureStore({
    reducer: {
        countries: countriesSlice.reducer,
        continents: addContinentSlice.reducer,
        game: playGameSlice.reducer
    }
});

export const COUNTRIES_ACTION = countriesSlice.actions;
export const ADD_CONTINENT_ACTION = addContinentSlice.actions;
export const PLAY_GAME_ACTION = playGameSlice.actions;


