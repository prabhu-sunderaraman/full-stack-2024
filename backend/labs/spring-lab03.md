
* Create a table __topics__ in __training__ database with the following fields
* __id__ int(primary key, auto increment), __title__(varchar) and __duration__ (number)

<br/>

* Create a __NEW__ spring boot project or module __spring-boot-jdbc-lab03__
* Add __Spring data Jdbc, MySQL driver__ dependencies
* You will implement the following in this application


<br/>

* Define __TopicDao__ class which has methods to add/remove/list all topics
* Implement a __ConferenceService__ class that uses __TopicDao__

``` java 

public class ConferenceService {
	
	public boolean addTopic(String title, int duration) {
		//true if succesfully inserted
		//false if insertion fails
		//Do not allow duplicate topics; throw TopicAlreadyExistsException
	}
	
	public List<Topic> getAllTopics() {
	
	} 
	
	public boolean removeTopic(String title) {
		//Throw TopicNotFoundException if the topic doesn't exist
	}
	
}

```

* Inject __ConferenceService__ in your main class
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

#### Part II

* Let's enhance the functionality of addTopic() method in ConferenceService.
* Create a table **summary, with id(primary key auto_increment), duration(int) and count(int)**

* Whenever you add a topic, let's perform an extra DB operation to update the count column in the summary table.
* So if you insert two 90 mins topics and three 45mins topic, the summary table will look like below

```
| id | duration | count |
-------------------------
| 1  |  90     |  2   |
| 2  |  45     |  3   |

```

* You'll learn **"Transactions support"** in this code


























