// expect, test, beforeEach, afterEach ... etc are all functions provided in Jest library

const Calc = require("./calc");

let calc = null;

beforeEach(() => {
    calc = new Calc();
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







