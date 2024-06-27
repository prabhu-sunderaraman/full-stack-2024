//... spread operator

function play(... sports) { //rest operator
    console.log(sports);
}

play("Cricket", "Football");


let favoriteSports = ["Baseball", "Basketball", "Squash"];
play(favoriteSports); // You are passing an array into play function; sports becomes an array of array
play(... favoriteSports); // spread operator