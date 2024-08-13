const math = logic => {
    let a = 10;
    let b = 20;
    logic(a, b);
}

const add = (x, y) => console.log(x + y);

const multiply = (x, y) => console.log(x * y);


math(add);
math(multiply)