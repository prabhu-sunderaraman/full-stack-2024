### Testing



##### Unit testing

* Unit testing is NOT a testing tool
* It's a design tool
* Unit refers to a small piece; Can be a function; block of code; or a component or anything that is small
* Why do you need to write such unit tests?
* **It makes changes easy**
* **It gives you instant feedback**
* Automate verification of all the functionalities, because it's time and effort consuming to verify every piece 


* Who writes these tests? - *Developers*
* When do you write these tests? - *While writing the code*

###### Rules to keep in mind while writing unit tests

* Every test is run independently of the other
* You WILL NEVER CALL one test from another test
* Always test your code IN ISOLATION: How do you test YOUR CODE ALONE without getting impacted by other code

###### Unit testing libraries

* Jest
* QUnit
* Mocha
* Jasmine

<br/>

* React uses *Jest*

##### Jest

* create [day18] folder
* Navigate to [day18] folder in terminal or cmd
* **sudo npm init**
* **sudo npm i --save-dev jest**
* create a file **calc.js**
* create a file **calc.test.js**
* Modify the test script in package.json 
``` json
"scripts": {
    "test": "jest"
  }
```
* Run the tests **sudo npm run test**            



##### e2e(End 2 End) testing