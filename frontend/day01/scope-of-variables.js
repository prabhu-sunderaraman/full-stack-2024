//var is visible throughtout the function; It's function scoped
//const and let are Block scoped -> MOST RECOMMENDED
//Global scope variables defined without let/var/const

function scopeOfVariables(someNumber) {
    if(someNumber > 10) {
        var aVar = "Cool! number is > 10";
        let aLetVar = "Cool! number is > 10";
    }
    console.log(aVar);
    //console.log(aLetVar);
}

scopeOfVariables(100);
//scopeOfVariables(1);

for(let i = 0; i< 5; i++) {

}

//console.log(i); //ERROR

//j is GLOBAL scope
for(j = 0; j < 100; j++) {

}

function doSomething() {
    console.log("j", j);
    message = "Hello"; //GLOBAL scope
}

doSomething();
console.log(message);