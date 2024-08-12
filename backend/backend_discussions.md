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















