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