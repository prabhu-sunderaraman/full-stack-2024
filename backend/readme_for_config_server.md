* Create a __repo(any name of your choice)__ in GitHub/Gitlab and add application.yml file with a default message

``` yml
welcome: Default welcome
```

#### Setting up Config Server

* Create a new Spring Boot project say, **config-server**
* Select **Spring Web**, **Spring Boot actuator** and **Config Server** libraries while creating the project
* Add **@EnableConfigServer** annotation to the **MyConfigServerApplication.java**

* Create **application.yml** file in *resources* folder
* Add the following lines 


``` yml

spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        git:
          uri: https://github.com/<name>/<repo>.git
          default-label: main
server:
  port: 8888

```


#### Setting up Config Client

* Create a new SpringBoot project __hello-api__
* Select **Spring web**, **Spring Boot actuator** and **Config Client** dependencies


<br/> <br/>

* Add the following line in application. yml file

``` yml
spring:
  application:
    name: hello-api
  config:
    import: optional:configserver:http://localhost:8888
management:
  endpoints:
    web:
      exposure:
        include: "*"
```


* Create a __HelloController__ class with __@RefreshScope__ and __@RestController__ annotations
* In the __HelloController__ class add the following

```java
	@Value("${welcome: default}")
	private String welcome;
	
	@GetMapping("/hello")
	public String index() {
		return welcome;
	}
```

* Run http://localhost:8080/hello and observe the message you get
* Change welcome value to Default welcome message in the config repo and push it
* Run the following command to refresh the application without restarting it

```
curl -XPOST 'http://localhost:8080/actuator/refresh'
```

* Run http://localhost:8080/hello and observe the message you get


* Now add **hello-api.yml** file to the repo
* Add **welcome: Welcome from server** in this file
* Commit and push

* Run **curl -XPOST 'http://localhost:8080/actuator/refresh'**
* Run http://localhost:8080/hello and observe the message you get


#### Part II


* Move the config files of math-client-api, square-api, cube-api, api-gateway to the config server



