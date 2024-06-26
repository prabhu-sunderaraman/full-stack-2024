//console.log(company); //ERROR
let company = "Indium";


//You can invoke a function from anywhere you want before or after the actual  function definition
work(); //Function hoisting; All the function definitions are RUN first, then line-by-line execution starts

//A function can be defined with the same name ANY number of times; The last one overrides the previous
//THat's WHY in applications WE DON'T DEFINE functions like this
function work() {
    console.log("Working");
}

function sleep() {
    console.log("Sleeping");
}

function sleep(args) {
    console.log("Sleeping peacefully");
}

function sleep(hours, mins) {
    console.log("Snoring");
}

function sleep(venue) {
    console.log("I am attending Prabhu's class");
}

sleep();


//A function can be invoked with ANY number of arguments irrespective of the way it's defined
function play() {
    console.log("Playing");
}

play();
play("Cricket");
play("Cricket", "Football");
play(true);
play("I", "Don't", "Like", "playing", "I", "am", "a", "couch", "potato");

