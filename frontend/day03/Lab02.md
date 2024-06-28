
# Part I
* Create a folder **[frontend-app]** 
* Create a file **calculator.js** in the folder and do the following
* Create a class called **Calculator** that does the following.
* It has methods to add, subtract, multiply two numbers and return the result
* The class maintains a result of each operation in a collection as a string ie., *Sum of 12 and 13 = 25*, *Product of 2 and 4 = 8* and so on
* Create a method **fetch()** to return the collection
* Have a method **clear()** to empty the collection
* Create an object of calc and call all the operations


# Part II

* You will build an UI that uses the Calculator class defined in Part I
* Create **calculator.html** in  **[frontend-app]** folder
* Start with the following HTML code

``` html
<html>
	<head>
		<script src="calculator.js"></script>
		<script>
			const calc = new Calculator();
			
			const addButtonClicked = () => {
				const num1 = parseInt(document.getElementById("num1").value);
				const num2 = parseInt(document.getElementById("num2").value);
				const result = calc.add(num1, num2);
				document.getElementById("result").innerHTML = result;
			};
			// Implement subtractButtonClicked, multiplyButtonClicked, fetchButtonClicked, clearButtonClicked functions
			// YOUR CODE GOES HERE
		</script>			
	</head>
	<body>
		<p>	
			<input type="number" id="num1" placeholder="Number 1"><br/>
			<input type="number" id="num2" placeholder="Number 2"><br/>
		</p>
		<p>		
			<button onclick="addButtonClicked();">Add</button>
			<button>Subtract</button>		 	
			<button>Multiply</button>
		</p>
		<p>
			<h4 id="result"></h4>
		</p>
		<hr/>
		<p>
			<button>Fetch all results</button>
			<div id="all"></div>
		</p>
		<p>
			<button>Clear</button>
		</p>		
	</body>			
</html>

```


## Part III

* Let's implement a calculator backend application using NodeJS(**for the sake of simplicity**)
* Create a folder **[backend-app]**
* Copy the **calculator.js** file you created in Part I into this folder
* Create a file **package.json** with the following contents

``` json
{
  "name": "Lab02",
  "version": "1.0.0",
  "description": "",
  "main": "server.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "start": "node server.js"
  },
  "author": "",
  "license": "ISC",
  "dependencies": {
    "cors": "^2.8.5",
    "express": "^4.19.2"
  }
}

```

* Create a file **server.js** with the following contents

``` javascript
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

app.post("/calc/clear", (req, res) => {
	calc.clear();
	res.end("Results cleared");
})

app.listen(port, () => {
    console.log("Backend server started and running in port ", port);
});
```

* Open your **command prompt** or **Terminal** and navigate to **[backend-app]** folder
* Run the command **npm i** in Windows or **sudo npm i** in Mac
* Run **node server.js** command to start the backend server
* You can verify the backend by typing the following URLs in the browser 
```
	http://localhost:8080/calc/add/12/31
	http://localhost:8080/calc/multiply/112/31
	http://localhost:8080/calc/subtract/12/31
	http://localhost:8080/calc/fetch
```

* **NOW: We connect the frontend with the backend**

* Let's modify the UI **calculator.html** and connect it with the backend **(Discussed in the class)**







