import {useState} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { PLAY_GAME_ACTION } from './store';

const GameView = () => {
    const [guess, setGuess] = useState();
    const dispatch = useDispatch();

    const {message, attempts} = useSelector(state => state.game);
    const playButtonClicked = () => {
        dispatch(PLAY_GAME_ACTION.playGame({
            guess
        }))
    };

    return (<div>
        <input type="number" placeholder="Guess" onChange={e => setGuess(parseInt(e.target.value))}></input>
        <button onClick={playButtonClicked}>Play</button>
        <h3>Attempts: {attempts}</h3>
        <h1>{message}</h1>
    </div>);
};

export default GameView;