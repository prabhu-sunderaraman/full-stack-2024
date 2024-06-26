let evenNumbers = [2, 4, 6, 8];
let names = ["Megharaj", "Sanchai", "Kaja"];

//arrays can be accessed using numerical index starting from 0
console.log(evenNumbers[0]);
console.log(names[0]);
console.log(evenNumbers[1]);
console.log(names[1]);

//arrays can have any type of item
let weirdArr = [10, 2.34, true, false, "hello", 'hi', [1, 2, 3]];

//OLD STYLE OF CODING
for(let i = 0; i < weirdArr.length; i++) {
    let item = weirdArr[i];
    console.log(item);
}

let index = 0;
while(index < weirdArr.length) {
    console.log(weirdArr[index]);
    index++;
}

//Arrays can have non-numerical index also

let capitals = [];
capitals["India"] = "New Delhi";
capitals["US"] = "Washington DC";
capitals["England"] = "London";

for(let key in capitals) {
    console.log(key, capitals[key]);
}


let numbers = [2, 4, 6, 8];

let max = numbers[0];
for(let i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
console.log("Max: ", max);