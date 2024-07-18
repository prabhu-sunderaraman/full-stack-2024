// JavaScript is single threaded
// You cannot have a long running operation in Javascript; because it eats up all the space and time
// All other operations will be waiting for it to complete
// By default JS is synchronous
// If you want to make it asynchronous, you can use Promise API

function longRunningOperation() {
    console.log("longRunningOperation starts");
    for(let i = 0; i < 9999999999; i++) {
        // It talks to a backend API
        // Processes the result
        // Calls another backend API and stores the result
    }
    console.log("longRunningOperation ends");
}
setTimeout(() => longRunningOperation(), 0); // executed asynchronously without blocking the thread(or line of execution)
console.log("****End");





/*
function longRunningOperation() {
    for(let i = 0; i < 9999999999; i++) {
        // It talks to a backend API
        // Processes the result
        // Calls another backend API and stores the result
    }
}
const start = performance.now();
longRunningOperation();
const end = performance.now();
console.log("Long running operation ends at ", (end - start)/1000, "seconds");
console.log("****End");
*/