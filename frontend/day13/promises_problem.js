// every task is a function on its own
// generate a random number between 1 and 100
// increment the number by 1
// square the number
// print the result in the console


const generateRandom1 = () => Math.floor(Math.random() * 100);
const increment1 = num => num + 1;
const square1 = num => num * num;
const print1 = num => console.log(num);

// Design of the code sucks!!!
// Synchronous
const doSomething1 = () => {
    let num = generateRandom1(); //say it connects to backend and returns a random number
    let incNum = increment1(num); // say it connects to backend and increments the number
    let squaredNum = square1(incNum); // say it connects to backend and squares the number
    print1(squaredNum);
};

doSomething1();
console.log("END of program");




// Promise API
// Syntax is seamless; reading is elegant; async

// fetch("url")
//     .then(response => response.text())
//     .then(response => console.log(response));

// axios("url")
//     .then(response => response.text())
//     .then(response => console.log(response));    