import { configureStore, createSlice } from "@reduxjs/toolkit";

const initialState = {
    addition: {
        num1: 0,
        num2: 0,
        sum: 0
    } 
};

const add = (addition, action) => {
    let {num1, num2} = action.payload;
    let sum = num1 + num2;
    return { ...addition, num1, num2, sum};
};

const addSlice = createSlice({
    name: "day16",
    initialState: initialState.addition,
    reducers: {
        add
    }
});

export const store = configureStore({
    reducer: {
        "addition": addSlice.reducer
    }
});

export const  addAction = addSlice.actions;