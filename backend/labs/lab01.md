* Create __Lab01.java__ file in a package __com.indium__ with a __main__ method
*  Implement a guessing game application, where user plays till she guesses a generated random number correct. 
* The application generates a random number between 1 and 100. And the user plays till she guesses the number correct
* Here's a sample behavior of the program

* Say 77 is the random number generated

``` 
Welcome to the Guessing Game. Enter a number between 1 and 100.* 
50 
Aim Higher 
90 
Aim Lower 
80  
Aim Lower 
77 
You've got it in 4 attempts !!!. 

```
* Use __(int)(Math.random() * 100)__ for generating random number like this

``` java
	int randomNumber = (int)(Math.random() * 100);
```

* Use the following code to read input from the console

``` java
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
``` 
