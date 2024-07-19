// expect, test, beforeEach, afterEach ... etc are all functions provided in Jest library

const Calc = require("./calc");
const CalcDb = require("./calcDb");
const { calcStore } = require("./calcStore");

let calc = null;
let mockCalcDb = jest.mock('./CalcDb');
beforeEach(() => {
    calc = new Calc(calcStore);
});


afterEach(() => {
    calc = null;
});

describe('set up tests', () => {
    test('calc setup', () => {
        expect(calc).not.toBe(null);
    });

    test('hello world', () => {
        let message = 'hello world';
        message = message.toUpperCase();
        expect(message).toBe('HELLO WORLD');
    });
});

describe('Addition', () => {
    test('add 10, 20', () => {
        let sum = calc.add(10, 20);
        expect(sum).toBe(30);
    });
    
    test('add large numbers', () => {
        let sum = calc.add(19089808987, 20987897987);
        expect(sum).toBe(40077706974);
    });
});

describe('Subtraction', () => {
    test('subtract 10, 20', () => {
        let difference = calc.subtract(10, 20);
        expect(difference).toBe(-10);
    });
});

describe('Multiplication', () => {
    test('multiply 10, 20', () => {
        let mockCalcStore = jest.fn((a, b, result) => true);
        let myCalc = new Calc(mockCalcStore);
        let product = myCalc.multiply(10, 20);
        expect(product).toBe(200);
        expect(mockCalcStore.mock.calls).toHaveLength(1); //Check if the calc store is called once
    });
});

describe('mocking classes', () => {
    CalcDb.mockImplementation(() => {
        return {
            load: jest.fn((query) => []),
            store: jest.fn((values) => {})
        }
    }); 
});






