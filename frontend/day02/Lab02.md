* Create Lab02.js and convert the following code to use arrow functions

``` javascript
function math(logic) {
    let a = 10;
    let b = 20;
    logic(a, b);
}

const add = function(x, y) {
    console.log(x + y);
}

const multiply = function(x, y) {
    console.log(x * y);
}

math(add);
math(multiply)
```