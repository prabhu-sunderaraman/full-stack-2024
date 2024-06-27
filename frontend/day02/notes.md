### JavaScript (recap)

* Dynamic typed
* string, number, boolean, or objects
* let, const, var, global
* let and const are block scoped
* var is function scoped
* global scoped; _Better stay away_
* arrays -> square brackets
* usually numerical index but you can have other types as index
* for, for-in, while
* functions: _function_ keyword
* functions can be invoked even before you define
* functions can be defined any number of times with the same name; the last definition overrides the previous one
* functions can be invoked with any number of arguments


###  Why higher order functions?

* Why should you write a function that accepts another function as argument?

``` javascript

//Functions are taught to accept data and they have some logic to apply on that data
function add(a, b) {
    console.log(a + b);
}

function multiply(a, b) {
    console.log(a * b);
}

add(10, 20);
multiply(10, 20);

```

* Reverse approach

``` javascript
//Why can't functions accept logic and apply the logic on the data

function math(logic) {
    let a = 10;
    let b = 20;
    logic(a, b);
}

const add = function(x, y) {
    console.log(a + y);
}

const multiply = function(x, y) {
    console.log(a * y);
}

math(add);
math(multiply);


```






