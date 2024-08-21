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

### @Transactional

* You want to declaratively manage transactions in your code;
* Configure your method to act in a transaction context;
* So only when all the operations are successful, txn is commited; Even if one of them fails, all the db operations are rolled back
* Add **@Transactional** annotation to the method, and the magic happens during runtime


















 

























