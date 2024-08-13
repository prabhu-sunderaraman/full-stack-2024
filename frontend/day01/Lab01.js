const numbers = [10, 23, 4, 66, 983, 22, 11, 56, 76, 39];

// Print the even numbers in the array

for(let i = 0; i < numbers.length; i++){
    if(numbers[i] % 2 == 0) {
        console.log("Even", numbers[i]);
    }
}


// Print the sum of all the numbers in the array
let sum = 0;
for(let i = 0; i < numbers.length; i++){
    sum += numbers[i];
}
console.log("Sum: ", sum);

// Print all the numbers divisible by 8

for(let i = 0; i < numbers.length; i++){
    if(numbers[i] % 8 == 0) {
        console.log("Divisible by 8: ", numbers[i]);
    }
}

// Collect the numbers greater than 50 in a separate array and print the values

let numbersGt50 = [];
for(let i = 0; i < numbers.length; i++){
    if(numbers[i] > 50) {
        numbersGt50.push(numbers[i]);
    }
}
console.log(numbersGt50);

// Find the largest and smallest numbers in the array

let largest = numbers[0];
let smallest = numbers[0];

for(let i = 1; i < numbers.length; i++) {
    let item = numbers[i];
    if(item > largest) {
        largest = item;
    }
    else if(item < smallest) {
        smallest = item;
    }
}

console.log("Largest: ", largest);
console.log("Smallest", smallest);

