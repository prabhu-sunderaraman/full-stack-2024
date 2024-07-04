//Core Business Logic
class Game {
    constructor() {
        this.target = Math.floor(Math.random() * 101);
        this.attempts = 0;
        this.message = '';
        this.gameOver = false;
    }

    play(guess) {
        this.attempts++;
        if(guess > this.target) {
            this.message = "Aim lower";
        } else if(guess < this.target) {
            this.message = "Aim higher";
        } else {
            this.message = "You've got it!!";
            this.gameOver = true;
        }
    }
}
export default Game;