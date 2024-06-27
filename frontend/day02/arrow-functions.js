// const takeABreak = function() {
//     console.log("Time to wash my face");
// };

//Arrow functions are shortcuts; Of course they change the "context" (You will learn tomorrow)
const takeABreak = () => console.log("Time to wash my face");
takeABreak();

// const add = function(a, b) {
//     return a + b;
// }

const add = (a, b) => a + b;
console.log(add(10, 20));

const divide = (a, b) => a / b;
const square = (a) => a * a;

// const multiply = function(a, b) {
//     return a * b;
// };
const multiply = (a, b) => a * b;

const aPluBWholeSquared = (a, b) => {
    let aSquared = a * a;
    let bSquared = b * b;
    return aSquared + bSquared + (2 * a * b);
};





