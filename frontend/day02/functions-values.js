const i = 10;
//i = 11;
console.log(i);


//greet("Prabhu");
//RECOMMENDED OR BEST PRACTICE
const greet = function(name) {
    console.log("Hey", name);
};

// greet = function(name) {
//     console.log("Wassup", name);
// };

greet("Vinod");
greet("Swetha");
console.log(greet);


read("Why we sleep?");
//BAD PRACTICE
function read(book) {
    console.log("Reading", book);
}

//STOP PEOPLE FROM REDEFINING the FUNCTIONS
function read(book) {
    console.log("Buying", book);
}

