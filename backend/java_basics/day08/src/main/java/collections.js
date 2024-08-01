const numbers = [121, 34543, 64571, 873, 89, 231, 892, 456, 12, 45, 8, 903];
// find the even numbers; increment by 1; print
const result = numbers
    .filter(num => {
        console.log("===== filtering " + num);
        return num % 2 == 0;
    })
    .map(num => {
        console.log("***** map " + num);
        return num + 1;
    });
console.log(result[0]);
// .forEach(num => {
//     console.log("~~~~~ printing " + num);
//     console.log(num);
// });