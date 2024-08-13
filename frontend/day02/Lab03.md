* Here's a small exercise that will help you get accustomed to  functional style of coding in JavaScript. 


* Create an array of numbers 1, 2, 3, 4, 5, 6, 30, 56, 84, 23, 100
* Implement the following in a functional style using arrow functions


* Print all the numbers (*Use forEach*)
* Print the sum of all numbers (*Use reduce*)
* Print the first odd number (*Use find*)
* Generate an list of squares of all numbers (*Use map*)
* Generate a list of numbers divisible by 5.  (*Use filter*)
* Print all the even numbers (*Use filter and forEach*)

###### Hint:
* Refer to https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array

* Here's how you implement (1) without using a loop

``` javascript
let numbers = [1, 2, 3, 4, 5, 6, 30, 56, 84, 23, 100];
numbers.forEach(num => {
	console.log(num);
}); 
```

* __PLEASE DO NOT WRITE FOR LOOPS AT ALL__