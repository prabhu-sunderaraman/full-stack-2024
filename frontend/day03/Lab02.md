
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
				const num2 = parseInt(document.getElementById("num1").value);
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

