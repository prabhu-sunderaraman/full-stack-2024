* You will implement topic/session planner lab implemented in lab03 using REST and JPA

* Create a new Spring boot project **spring-boot-rest-api-lab05**
* Add **Web, JPA, MySQLDriver, Lombok** dependencies

* Create a table __topics__ in __training__ database with the following fields
* __id__ int(primary key, auto increment), __title__(varchar) and __duration__ (number)

<br/>

<br/>

* Define Entity class for topics table
* Define the repository for Topic
* Implement a __TopicService__ class that uses __TopicDao__

``` java 

public class TopicService {
	
	public boolean addTopic(String title, int duration) {
		//true if succesfully inserted
		//false if insertion fails
		//Do not allow duplicate topics
	}
	
	public List<Topic> getAllTopics() {
	
	} 
	
	public boolean removeTopic(String title) {
		//Throw TopicNotFoundException if the topic doesn't exist
	}
	
	public boolean updateDuration(String title) {
		//Throw TopicNotFoundException if the topic doesn't exist
	}
	
}

```

* Create a **TopicController** class with the base mapping **("/api/v1/topics")**
* Define endpoints to add (@PostMapping), remove(@DeleteMapping) , update(@PatchMapping) and get(@GetMapping) all topics
* Handle all exceptions wherever required


* Inject __TopicService__ in Controller class

* Insert the following topics and check the operations

```
Functional programming with Erlang - 60 min
Scala Tricks - 45 min
Spring unit testing - 90 min
Unit testing JavaScript - 90 min
Concurrency on the JVM - 60 min
Goroutines - 45 min
RoR - 90 min
```