//OLD STYLE
//function cook() {}

//BETTER STYLE
//const cook = function() {};

//MODERN STYLE
const cook = () => {};



const doSomething = fn => {
    fn();
}

function writeCode() {}
doSomething(writeCode);

const writeCodeInJava = function() {};
doSomething(writeCodeInJava);

const writeFunctionalStyleCode = () => {};
doSomething(writeFunctionalStyleCode);
doSomething(() => {}); //THIS IS THE MODERN STYLE






