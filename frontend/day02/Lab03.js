const numbers = [1, 2, 3, 4, 5, 6, 30, 56, 84, 23, 100];

// Print all the numbers
numbers.forEach(num => console.log(num));

// Print the sum of all numbers
const sum = numbers.reduce((previousValue, currentValue) => previousValue + currentValue);
console.log("Sum", sum);

// Print the first odd number
const firstOddNumber = numbers.find(num => num % 2 !== 0);
console.log("first odd number", firstOddNumber);

// Generate an list of squares of all numbers
const listOfSquares = numbers.map(num => num * num);
listOfSquares.forEach(num => console.log(num));

// Generate a list of numbers divisible by 5.
// Declarative style of coding (You only write code and say what to do)
numbers
    .filter(num => num % 5 === 0)
    .forEach(num => console.log(num));

// Imperative style of coding (You write code and say what to do and also how to do)
let numbersDivisibleBy5 = [];    
for(let i = 0; i < numbers.length; i++) {
    let num = numbers[i];
    if(num % 5 === 0) {
        numbersDivisibleBy5.push(num);
    }
}
for(let i = 0; i < numbersDivisibleBy5.length; i++) {
    console.log(numbersDivisibleBy5[i]);
}    

// Print all the even numbers
numbers
    .filter(num => num % 2 === 0)    
    .forEach(num => console.log(num));