//polyglot developer or programmer
//... rest operator
function add(... numbers) {
    // console.log(numbers);
    let sum = 0;
    for(let i = 0; i < numbers.length; i++) {
        sum += typeof(numbers[i]) === "number" ? numbers[i] : 0;
    }
    console.log("Sum", sum);
}

function greatest(... values) {
    let max = values.length > 0 ? values[0] : null;
    for(let i = 0; i < values.length; i++) {
        if(typeof(values[i]) === "number") {
            if(values[i] > max) {
                max = values[i];
            }
        }
    }
    console.log("Greatest", max);
}


add("a",1,5,34,324,324,235,2353);
add(21,65);
add(1,55,83);
let numbers = [12, 34, 55, 66, 7, 89];
add(... numbers);

greatest(1,5,34,324,324,235,2353);
greatest(21,65);
greatest(1,55,83,9,667);
