import { useState } from "react";
import Game from "./Game";

const GuessingGame = () => {
    const [game, setGame] = useState(new Game());
    const [guess, setGuess] = useState();

    const guessValueChanged = (e) => {
        setGuess(parseFloat(e.target.value));
    };

    const playButtonClicked = () => {
        game.play(guess);
        setGame({ ...game, play: game.play}); //I had to add play property, because Game is a class and here we are creating an object
    };

    return (<div>
        <h1>Welcome to the guessing game. Enter a number between 1 and 100</h1>
        <input type="number" 
            placeholder="Guess" 
            disabled={game.gameOver ? 'disabled': ''} 
            onChange={guessValueChanged}></input>
        <p className={guess < 0 || guess > 100 ? 'error': 'success'}>Invalid input</p>
        <button onClick={playButtonClicked} disabled={game.gameOver ? 'disabled': ''}>Play</button>
        <h2>{game.message}</h2>
        <h3>{ game.attempts === 0 ? '' : `Attempts: ${game.attempts}` }</h3>
    </div>);
}
export default GuessingGame;