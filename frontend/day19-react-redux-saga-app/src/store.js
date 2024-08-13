import { configureStore, createSlice } from "@reduxjs/toolkit";
import { call, put, takeEvery } from "redux-saga/effects";
import createSagaMiddleware from '@redux-saga/core';
const initialState = {
    square: {
        num: '',
        result: ''
    },
    dataFromServer: ''
};

const talkToBackendApi = () => {
    return fetch('/backend.txt')
            .then(response => response.text());
};

function* getDataFromServer() {
    const output = yield call(talkToBackendApi);
    yield put({type: "day19/getDataFromServerSuccess", payload: output});
}

function* getDataFromServerSaga() {
    yield takeEvery("day19/getDataFromServer", getDataFromServer);
}


const squareNumber = (state, action) => {
    let {num} = action.payload;
    const result = num * num;
    console.log(num, result);
    return {
        ... state, num, result
    }
}

const getDataFromServerSlice = createSlice({
    name: "day19",
    initialState: initialState.dataFromServer,
    reducers: {
        getDataFromServerSuccess: (state, action) => {
            return action.payload;
        }
    }
});


const squareNumberSlice = createSlice({
    name: "day19",
    initialState: initialState.square,
    reducers: {
        squareNumber
    }
});

const sagaMiddleware = createSagaMiddleware();

export const store = configureStore({
    reducer: {
        square: squareNumberSlice.reducer,
        dataFromServer: getDataFromServerSlice.reducer
    },
    middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(sagaMiddleware)
});

sagaMiddleware.run(getDataFromServerSaga);
export const squareAction = squareNumberSlice.actions;
