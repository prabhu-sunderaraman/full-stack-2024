/*
let oldStyleArr = new Array(10, 20, 30);
let oldStyleString = new String('Old style string');
let num = new Number(100);
let car = new Object();
car.model = "BMW";
car.year = 2023;
*/
let newStyleArr = [10, 20, 30];
console.log(typeof(newStyleArr));
let newStyleString = "New style string";
let num = 100;
let car = {"model": "BMW", "year": 2023}; // Javascript Object Notation (JSON)
console.log(car.model, car.year);

let person = {
    "name": "Tarun",
    "age": 20,
    "hobbies": ["Books", "Coding"],
    "address": {
        "city": "Pune",
        "country": "India"
    }
};
console.log(typeof(person));
console.log(person.name, person.address.city, person.hobbies[0]);




