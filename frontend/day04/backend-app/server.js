const app = require('express')();
const cors = require('cors');


const Calculator = require('./calculator');


let port = 8080;
const calc = new Calculator();


app.use(cors({
    origin: '*'
}));

app.get("/calc/add/:a/:b", (req, res) => {
    let { a, b } = req.params;
    let sum = calc.add(parseInt(a), parseInt(b));
    res.end(`Sum: ${sum}`);
});

app.get("/calc/subtract/:a/:b", (req, res) => {
    let { a, b } = req.params;
    let sum = calc.subtract(parseInt(a), parseInt(b));
    res.end(`Difference: ${sum}`);
});

app.get("/calc/multiply/:a/:b", (req, res) => {
    let { a, b } = req.params;
    let sum = calc.multiply(parseInt(a), parseInt(b));
    res.end(`Product: ${sum}`);
});

app.get("/calc/fetch", (req, res) => {
    let results = calc.fetch();
    res.end(`${results.join()}`);
});

app.get("/calc/all", (req, res) => {
    let results = calc.fetch();
    res.json(results);
});

app.post("/calc/clear", (req, res) => {
	calc.clear();
	res.end("Results cleared");
})

app.listen(port, () => {
    console.log("Backend server started and running in port ", port);
});