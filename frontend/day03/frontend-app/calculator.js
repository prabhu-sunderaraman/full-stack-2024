class Calculator {
    constructor() {
        this.listOfOperations = []
    }
    addToListOfOperations(message) {
        if(!this.listOfOperations.includes(message)) {
            this.listOfOperations.push(message);
        }
    }
    add(n1, n2) {
        let result = n1 + n2;
        this.addToListOfOperations(`Sum of ${n1} and ${n2} is ${result}`);
        return result;
    }
    subtract(n1, n2) {
        let result = n1 - n2;
        this.addToListOfOperations(`Subtraction of ${n1} and ${n2} is ${result}`);
        return result;
    }
    multiply(n1, n2) {
        let result = n1 * n2;
        this.addToListOfOperations(`Product of ${n1} and ${n2} is ${result}`);
        return result;
    }
    fetch() {
        return this.listOfOperations
    }
    clear() {
        this.listOfOperations =[]
        console.log("Cleared")
    }
}
// console.log("**Object1**")
// const c1 = new Calculator();
// c1.add(2, 3)
// c1.subtract(4, 5)
// c1.multiply(5, 6)
// let results = c1.fetch()
// console.log(results)
// c1.clear()
// results = c1.fetch()
// console.log(results)

// console.log("**Object2**")
// const c2 = new Calculator();
// c2.add(6, 7)
// c2.subtract(7, 8)
// c2.multiply(9, 10)
// let resultsList = c2.fetch()
// console.log(resultsList)
// c2.clear()