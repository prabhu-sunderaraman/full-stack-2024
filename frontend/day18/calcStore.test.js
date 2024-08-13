const { calcStore } = require("./calcStore");

test('store addition results', () => {
    let output = calcStore(10, 20, "Sum of 10 and 20 is 30");
    expect(output).toBe(true);
});
