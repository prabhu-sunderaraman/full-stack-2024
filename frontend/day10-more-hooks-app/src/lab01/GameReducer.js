export const GameReducer = (gameState, action) => {
    switch (action.type) {
        case 'PLAY':
            let guess = action.payload.guess;
            gameState.attempts += 1;
            if(guess > gameState.target) {
                gameState.message = "Aim lower";
            } else if(guess < gameState.target) {
                gameState.message = "Aim higher";
            } else {
                gameState.message = "You've got it!!!";
                gameState.gameOver = true;
            }    
            let newGameState = {...gameState};
            return newGameState;
        default:
            return gameState;
    }
};
