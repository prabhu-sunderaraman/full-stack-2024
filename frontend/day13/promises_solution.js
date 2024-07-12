// every task is a function on its own
// generate a random number between 1 and 100
// increment the number by 1
// square the number
// print the result in the console

const generateRandom = () => {
    let num = Math.floor(Math.random() * 100);
    if(num > 50) {
        return new Promise((resolve, reject) => reject(`Too large a number: ${num}`));
    } else {
        return new Promise((resolve, reject) => resolve(num));
    }
    
};

const increment = num => {
    let incNum = num + 1;
    return new Promise((resolve, reject) => resolve(incNum));
};

const square = num => {
    let squaredNum = num * num;
    return new Promise((resolve, reject) => resolve(squaredNum));
};

const print = num => console.log(num);

//Functions that return promises can be chained using then/catch
//They execute asynchronously

const doSomething =  () => {
    generateRandom()
        .then(num => increment(num))
        .then(num => square(num))
        .then(num => print(num))
        .catch(error => console.log(`Error: ${error}`));
    console.log("I want to continue doing my work");
};

doSomething();



// Promise API
// Syntax is seamless; reading is elegant; async

// fetch("url")
//     .then(response => response.text())
//     .then(response => console.log(response));

// axios("url")
//     .then(response => response.text())
//     .then(response => console.log(response));    