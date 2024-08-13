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
            //return gameState;   
            // If you don't create a new object, react will not refresh the UI; 
            // It does not recognize the changes in the internals of the object
            // So that's why you create a new object by copying the existing object and return it
            let newGameState = {...gameState}; //spread operator; 
            return newGameState;
        default:
            return gameState;
    }
};
