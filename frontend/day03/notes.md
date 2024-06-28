### Day 02 (recap)

* Functions
* Good way to define functions is use them as values to variables

``` javascript
 const watch = function() {
    console.log("Watching T20 world cup");
 } 
```

* Arrow functions

``` javascript
 const watch = () => console.log("Watching T20 world cup");
```

* Higher order functions
* Functions that take in other functions as arguments and those that can also return functions as return value

* Many built-in functions in JS are higher order functions; 
* forEach, filter, map, reduce, find, findAll
* Imperative style vs. declarative style coding
* Think twice before you use external iterators (for, while loops...)
* Template strings 

``` javascript
let comment = `Today is ${new Date()}`;
let multilineStrings = `
    Preserves whitespace characters
`; 
```
* Array destructuring

``` javascript
    let [a, b] = [100, 200];
```

* ... is rest and spread operator

* JSON 

``` javascript

let company = {
    "name": "Indium",
    "employees": 2000,
    "services": ["e-commerce", "hospitality"]
};

```
