let firstName = "Sachin";
//let message = "Hello " + firstName;

//Templated string or string interpolation
let message = `Hello ${firstName}`;
firstName = "Virat";
console.log(message);

let capital = "Tokyo";
let country = "Japan";

let comment = `The capital of ${country} is ${capital.toUpperCase()}`;
console.log(comment);

//backtick operator
let paragraph = `
    Hi!
    This is a paragraph.

    Here's a footer.
`;
console.log(paragraph);