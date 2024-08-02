* Create a Java program **Lab09.java** that reads numbers from a file named **numbers.txt**, 
* Sample file looks like this

```
10
20
abc
30
40

```

* Calculate their average, and prints it to the console. The file contains one number per line.

#### ToDo

* If the file is not found, throw a custom exception called **FileNotFoundException** with a descriptive message.
* If any line in the file contains a non-numeric value, throw a **NumberFormatException** with a message indicating the line number.
* Use a try-catch-finally block to handle the exceptions gracefully and print appropriate error messages.
* The program should continue processing the file even if there are errors, but it should skip the lines with errors.
