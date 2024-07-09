import { useReducer, useRef, useState } from "react";
import { GameReducer } from "./GameReducer";
import { gameInitialState } from "./GameInitialState";

const GuessingGame = () => {
    const [game, dispatch] = useReducer(GameReducer, gameInitialState);
    const [guess, setGuess] = useState(0);
    const guessTextbox = useRef();
    const playButton = useRef();

    const guessValueChanged = (e) => {
        setGuess(parseFloat(e.target.value));
    };

    const playButtonClicked = async () => {
        await dispatch({
            type: 'PLAY',
            payload: {
                guess
            }
        });
        if(game.gameOver) {
            playButton.current.disabled = true;
        }
        console.log(guessTextbox.current);
        guessTextbox.current.focus();
        guessTextbox.current.select();
    };

    return (<div>
        <h1>Welcome to the guessing game. Enter a number between 1 and 100</h1>
        <input type="number" 
            ref={guessTextbox}
            placeholder="Guess" 
            disabled={game.gameOver ? 'disabled': ''} 
            onChange={guessValueChanged}></input>
        <p className={guess < 0 || guess > 100 ? 'error': 'success'}>Invalid input</p>
        <button onClick={playButtonClicked} ref={playButton}>Play</button>
        <h2>{game.message}</h2>
        <h3>{ game.attempts === 0 ? '' : `Attempts: ${game.attempts}` }</h3>
    </div>);
}
export default GuessingGame;