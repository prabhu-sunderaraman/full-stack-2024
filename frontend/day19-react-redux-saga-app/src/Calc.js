import {useState} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { squareAction } from './store';

const Calc = () => {
    const dispatch = useDispatch();
    const [number, setNumber] = useState();
    const {result} = useSelector(state => state.square);
    const {dataFromServer} = useSelector(state => state)
    const squareButtonClicked = () => {
        dispatch(squareAction.squareNumber({
                num: number
        }));
    };

    const loadFromBackend = () => {
        // Let's not write axios or fetch code here
        // dispatch an action to a store which will fetch the data and give it to the reducer
        dispatch({type: "day19/getDataFromServer", payload: {}});
    };
    return (<div>
        <h3>{ dataFromServer === '' ? 'Calculator' : dataFromServer }</h3>
        <input type="number" onChange={e => setNumber(parseInt(e.target.value))}></input><br/>
        <button onClick={squareButtonClicked}>Get square</button>
        <h3>{result}</h3>
        <button onClick={loadFromBackend}>Load heading from backend</button>
    </div>);
};
export default Calc;