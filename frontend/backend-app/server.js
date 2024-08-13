const app = require('express')();
const cors = require('cors');

app.use(cors({
    origin: '*'
}));

app.get('/temperature', (req, res) => {
    res.send(Math.random() * 50 + "");
});

app.get('/cmp', (req, res) => {
    res.send(`${Math.random() * 1000}`);
});

app.get('/capital/:country', (req, res) => {
    let country = req.params.country;
    if(country === "India") {
        res.send("New Delhi");
    } else if(country === "USA") {
        res.send("Washington DC");
    } else if(country === "France") {
        res.send("Paris");
    } else {
        res.send("NA in DB");
    }
});


app.get('/message', (req, res) => {
    res.send("Hi there");
});

app.listen(8000, () => {
    console.log("server started in 8000");
});