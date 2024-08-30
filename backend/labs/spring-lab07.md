### Spring boot Lab07

* Create a new Empty project __kafka-lab07__ in IntelliJ

#####  Calculator

* Create a Module __calculator-app__ which is a **spring boot scheduler** application
* Add spring kafka dependency
* Add **@EnableScheduling** to the main class
* Create a component that has two methods
* square() and increment() with the annotation **@Scheduled** and **@Scheduled**. 
* square runs every 15s and increment runs every 10s
<br/>

* The methods generate a random number and post a message IN **JSON format** to a topic **calculator-topic**
* The JSON message is of the following format 

``` json
{
	"number" : 10
}
```

* Add a **key** for each message which will be **square** or **increment**


##### Calculator consumers

* Create a Module __calculator-consumer__ which is a Kafka consumer application
* This consumer listens to **calculator-topic** and compute the result (square or increment) and print it on the console
* You can use ConsumerRecord or ConsumerRecords

#### Note

* You can create a record or a class that corresponds to the JSON message and send and consume
* Play with the scheduler time and publish multiple messages
* For now, **treat the JSON message as String** only. We'll discuss serialization/deserialization in the class