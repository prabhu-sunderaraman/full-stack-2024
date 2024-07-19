const { calcStore } = require("./calcStore");

class Calc {
    constructor(store) {
        this.store = store;
    }
    add(a, b) {
        return a + b;
    }

    subtract(a, b) {
        return a - b;
    }

    multiply(a, b) {
        let result = a * b;
        let output = this.store(a, b, result);
        if(output != true) {
            throw new Error("Error while storing result");
        }
        return result;
    }
}

module.exports = Calc;