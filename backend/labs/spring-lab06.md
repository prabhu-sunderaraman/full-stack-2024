### Spring boot Lab06

* Create a new Empty project __Lab06__ in IntelliJ

##### Application 01
* Create a Module __palindrome-api__ which is a spring boot web application
* It runs on **8081** 
* It has an endpoint that accepts a word and computes if the given word is a palindrome or not

##### Application 02

* Create a Module __word-games-api__ which is a spring boot web application 
* It runs on **8080**
* Implement an endpoint **http://localhost:8080/game/{word}** 
* This communicates with **palindrome-api** and tells you whether the word is a palindrome or not

##### RestTemplate
* Talk to other services using **RestTemplate**/__WebClient__ class provided by Spring or even the **HttpClient** in core Java 

#### Dockerize 

* Add Dockerfile(s) for **palindrome-api** and **word-games-api**

