### ToDo

* Many-to-Many in JPA
* error handling/json in Kafka
* docker compose
* env in docker compose
* set up  k8s
* scale up/down k8s



### JSE (Spec)

* JDK -> J2SE -> Java Standard Edition
* Java SE contains the basic libraries to implement Java application
* Console applications; Desktop applications using Swing

### JEE (Spec)

* Java Enterprise Edition
* Enterprise applications
* Web applications; REST API; Messaging applications; Security; Transactions;Mail
* There are several implementations of JEE
* Oracle's core implementation of JEE is available JEE SDK
* Struts for Web applications
* Jersey Rest API 
* EJB for Txns, Security, Messaging
* If you want to build web applications, and use Security, Txn etc in Java
* You had to write complex code. ie. Create classes that extend some other class, override a lot of methods; implement several interfaces; create a lot of useless xml configuration files;

### Spring framework

* Build enterprise applications in Java, by writing extremely simple code
* POJO framework
* defacto or must-know framework for Java developers
* It's a collection of jar files
* https://spring.io/projects/spring-framework
* v6.x
* Working with Spring involves use of plenty of annotations. This is the reason why design is simple
* Spring is fundamentally built on Reflection
* **Dependency Injection** is the principle on which Spring framework is designed 
* DI is a mechanism by which you avoid writing unneccessary creation or look up code
* If you want to create a Person class object don't write code to do that
* Go to Spring framework and ask for a Person class object; it will create it and inject it to you
* If you want to use JDBC and execute queries, don't write lot of silly code to create connections/statements etc
* Spring framework will create all of them and inject them to you


### Core concepts

* Spring is a lightweight container
* ApplicationContext acts as a container
* It loads all the **@Component** and instantiates them during startup (change it using **@Lazy**)
* By default, all the beans are in singleton scope; Change the scope using **@Scope**
* Inject values using **@Value** and **@Autowired**
* Two types of DI; Field-based / Constructor based
* You can specify the beans of same type using **@Qualifier** or **@Primary**

### Spring boot

* Though Spring makes application development a breeze, developers had to do a lot of plumbing work
* It wasn't very agile like NodeJS or even Python
* Pressure from the Spring community to make it as competitive as building applications using NodeJS
* Should be agile; very lightweight; and focus on the code and not installing, configuring entities
* Spring boot comes to rescue
* How do you bootstrap working with Spring applications? 
* Spring boot is just built on the top of Spring; It's an abstraction of Core Spring
* Latest version is 3.x

### Spring boot project

* You can create a project choose templates by going to start.spring.io
* Command line applications; 
* Main class implements CommandLineRunner interface which can serve as a starting point
* You can configure extra beans by using **@Configuration** and **@Bean**
* By default you have **application.properties** in resources folder; Similar to .env file in NodeJS or React environments
* You access the properties using **"${}"**
* properties files are old-fashioned; YAML files are preferred now
* **application.yaml** reads from top to bottom; avoid repetition
* You can group items and refer to them using **@ConfigurationProperties(prefix="")**

#### Working with Raw JDBC API

* Say you want to retrieve a list of persons from db
* Add the driver dependency to pom.xml
* Load the driver
* Create a connection
* create a preparedstatement
* **execute the query** -> SHOULD BE THE FOCUS
* get the resultset
* process the resultset
* close the connection
* handle exceptions using try, catch, finally, throws


#### JPA

* JDBC is not a fit, if your db design is complex with number of relationships and column count;
* You have to handle a lot of SQL queries with complex joins 
* SQL syntax is too tied to the database; and changing the db will force you to change the code as well
* ORM -> Object Relational Database Mapping 
* Create classes that map with tables; Map the class with the table; Map the properties with the columns
* Several frameworks available to implement ORM in Java. TopLink, JDO, Hibernate, myBatis
* JPA -> Jakarta(or Java) Persistence API is an uniform API to access any ORM library from Java application
* Spring Boot JPA takes the convenience a step forward; 
* You create a Spring boot project and add JPA dependency; Automatically hibernate impl of JPA is added
* You create an Entity class and map it with the table; **@Column, @Entity, @Table, @Id**
* You define a DAO or repository; interface that extends CrudRepository or JpaRepository 
* save, findAll, findById, delete 
* finder methods in the repository interface; findBy or findAllBy
* @Query - JPQL; Query classes and properties
* You can also write native query, using **nativeQuery=true**


### @Transactional

* You want to declaratively manage transactions in your code;
* Configure your method to act in a transaction context;
* So only when all the operations are successful, txn is commited; Even if one of them fails, all the db operations are rolled back
* Add **@Transactional** annotation to the method, and the magic happens during runtime


### REST API

* Create controllers annotating them with @RestController
* @GetMapping, @PostMapping, @PatchMapping, @PutMapping, @DeleteMapping
* @PathVariable, @RequestParam, @RequestBody
* The url patterns should have **nouns** and preferrably **plurals**.
* POST -> Create something
* GET -> Fetching
* PUT -> Updates all the items except the primary key value or sometimes used to Upsert
* PATCH -> update specific items
* DELETE -> deleting something

* **Flow:** Controller -> Service -> Utils, Models, Repository -> Entity



### Communications between applications

* Two applications can talk to each other using

* File system (locking, concurrency, synchronization)
* Database (expensive, notifications)
* Synchronous (Directly invoke; Security, Latency; Change in contract)
* Asynchronous (**involves a middleware**)


### MoM

* Message Oriented Middleware or Message Broker
* RabbitMQ, ActiveMQ, IBM MQ series, AWS Kinesis, Azure Event Grid, Apache Kafka, Confluent Kafka
* Message broker is not a substitute of DB
* DB is a persistent store
* By default, most of the messages are present for 7 days or a max of say 30 days. Expensive to retain the messages for a longer period
* Two messaging models -> Publisher/Subscriber model; P2P -> Point-to-Point model

### Kafka

* If your objective is to make two applications talk to each other in an async manner you don't need kafka for that
* If you want to stream a millions of messages at a very high frequency
* Developed by LinkedIn
* Apache Kafka(https://kafka.apache.org/)  / Confluent Kafka
* Message? -> contains data(binary, json, text, avro) + header + timestamp
* Event? -> action + data
* Used to stream incredibly huge number of events for processing
* Supports Publisher/Subscriber model; Broadcast


### Producer and Consumer

* Create an empty project -> **kafka-app**
* Create a new module -> **producer-api**. {Spring Web, Spring kafka}
* Create a new module -> **consumer-app**. {Spring kafka}

### Basics of Kafka

* Create a topic with n partitions
* Producer to produce messages
* Each message has a key, value, header, timestamp
* You can serialize messages to any format you want
* Consumer consumes messages
* Consumer needs to specify the consumer group id;
* Kafka maintains the offset of every consumer group; It makes sure that every message is delivered only once
* You can multiple consumers belonging to the same consumer id; and only one of them is going to be active (**when partition count is 1**)

* Partition helps you distribute the processing of messages in a topic
* Each topic needs to specify a partition count during creation (cannot alter the partition after you create the topic)
* number of partitions is directly proportional to the cost
* Consumer group is linked with partitions
* If you want to scale up your consumer applications, you need to be aware of the partition count
* If you have 3 partitions, 3 or less number of consumers is adequate. more than 3, you are wasting your resources
* If you have 100 partitions, you can have 100 consumer instances and not more

### Cloud

* online database 
* large amount of data can be stored
* icloud, google drive, 

### Building applications on the cloud 

* Earlier applications were built using the libraries and frameworks or tech stack and pushed/hosted on the cloud
* Over a period of time, the cloud providers became more and more popular and powerful that they started giving services exclusively for their customers
* CNCF - cloud native
* You create scripts or programs to provision infrastructure
* Terraform or Ansible



### Questions for tomorrow's demo

* Which design strategies were used in the microservices?
* How was resiliency against databases designed in your project?
* How was logging designed in your project, centralized logging, tracing?
* Were there any single point of failures in the application architecture and how do you handle the same?
* How did you handle authentication?
* How did you ensure fault tolerance and prevent cascading failures in your microservices architecture?
* What monitoring and alerting tools did you use to keep track of the health and performance of your microservices?
* How did you handle monitoring of individual microservices and the overall system?
* Were there any specific auto-scaling mechanisms or strategies employed?
* Did you implement any distributed transaction patterns or rely on eventual consistency?
* Did you use any API management tools or platforms to handle versioning, documentation, and access control?
 

























