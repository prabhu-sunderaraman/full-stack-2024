``` groovy
course {
	String instructor = 'Prabhu Sunderaraman'
	String email = 'prabhu.bits@gmail.com'
	String blog = 'http://healthycoder.in'
	def String[] books = ['Spring 3.0 Black Book', 'Practical Ext JS 4']
}
```    



#### Topics

```

Full Stack - Training - Key Topics and Concepts



Day 01
Web Technology
1.	Introduction to HTML CSS

JavaScript 
2.	Introduction to JavaScript:
•	What is JavaScript?
•	Setting up a development environment.
•	Basic Syntax and Structure.
•	Variables and Data Types.
•	Operators.
3.	Control Flow:
•	Conditional Statements (if, else, switch).
•	Loops (for, while, do..while, for..of, for..in).
4.	Functions:
•	Defining Functions.
•	Function Expressions.
•	Arrow Functions.
•	Callbacks and Higher-Order Functions.
•	Closures.
Day 02

5.	Objects and Arrays:
•	Creating and Accessing Objects.
•	Object Methods and the this Keyword.
•	Arrays and Array Methods.
•	Iterating through Arrays.
6.	Advanced JavaScript Concepts:
•	Asynchronous JavaScript (Promises, async/await).
•	The Event Loop.
•	Modules and Import/Export.
•	The Spread and Rest Operators.
•	Destructuring.

Day 03

7.	DOM Manipulation:
•	What is the DOM?
•	Selecting and Modifying Elements.
•	Event Listeners and Handling Events.
•	Creating and Removing DOM Elements.
8.	Advanced Topics:
•	JavaScript ES6+ Features.
•	Fetch API and AJAX.
•	Basics of JSON.
React

Day 04

9.	Introduction to ReactJS
•	What is React?
•	Why use React?
•	React's ecosystem and tools
10.	Setting Up Your Development Environment
•	Installing Node.js and npm
•	Creating a React project with Create React App
•	Project structure overview
11.	React Components
•	Understanding components in React
•	Functional components
•	Class components
•	JSX (JavaScript XML) syntax

Day 05

12.	Props and State
•	Passing data with props
•	Managing component state
•	Stateful vs. Stateless components
13.	Component Lifecycle 
•	Component lifecycle methods
•	Mounting, updating, and unmounting phases
•	Side effects with useEffect (for functional components)
14.	Handling Events
•	Event handling in React
•	Event binding and this context
•	Synthetic events

Day 06

15.	Conditional Rendering
•	Conditional rendering with if statements
•	Ternary operators
•	Logical && operator
•	Using the map function for dynamic rendering
16.	Lists and Keys
•	Rendering lists of data
•	Understanding keys
•	Updating lists and keys best practices
17.	Forms and Controlled Components
•	Creating forms in React
•	Handling form input with controlled components
•	Form submission and validation

Day 07

18.	Component Composition
•	Nesting components
•	Passing data between parent and child components
•	Composition vs. inheritance
19.	React Router
•	Setting up React Router
•	Creating and navigating routes
•	Route parameters and URL parameters

Day 08


20.	State Management with Context API and Redux (Optional) 
•	Context API for state management
•	Introduction to Redux
•	Actions, reducers, and store in Redux
21.	Asynchronous Data Fetching
•	Fetching data from APIs with fetch or Axios
•	Handling async operations with async/await
•	Displaying fetched data in components
22.	Styling in React (Optional)
•	CSS-in-JS libraries (e.g., styled-components)
•	CSS modules
•	Global vs. local styles
23.	Error Handling and Debugging
•	Error boundaries
•	Debugging React applications
•	React DevTools

Day 09


24.	Optimizing Performance (Optional)
•	Performance optimization techniques
•	Memoization and shouldComponentUpdate
•	React's PureComponent and React.memo
25.	Testing React Applications (Optional)
•	Unit testing with Jest and React Testing Library
•	Mocking and testing components
•	Testing user interactions
26.	Deployment and Build Optimization (Optional)
•	Building a production-ready React application
•	Deployment options (e.g., Netlify, Vercel, AWS, etc.)
•	Code splitting and lazy loading

Day 10


27.	Best Practices and Patterns
•	React best practices
•	Common design patterns (e.g., Higher-Order Components, Render Props)
28.	Advanced Topics (Optional)
•	Server-Side Rendering (SSR)
•	GraphQL and Apollo Client
•	React Native for mobile app development
•	React with TypeScript (Optional)
29.	Conclusion and Next Steps
•	Recap of key concepts
•	Resources for further learning
•	Building a personal or group project (Mandatory)

Day 11, 12

React Advanced

1. Deep Dive into React Core:
•	React Fiber Architecture:
•	Understanding the Reconciliation Algorithm.
•	How Fiber Works.
•	Hooks Deep Dive:
•	Internals of useState and useEffect.
•	Custom hooks best practices.
2. Advanced State Management:
•	Redux and Middleware:
•	Setting up Redux with React.
•	Advanced Redux Patterns.
•	Middlewares like redux-thunk and redux-saga.
•	Context API & useReducer:
•	When to use Context vs. Redux.
•	Building scalable applications with useContext and useReducer.

Day 13, 14

3. API Integration and Data Fetching:
•	Connecting to RESTful Services:
•	Using fetch and Axios.
•	Error Handling and Loading States.
•	GraphQL and Apollo Client:
•	Introduction to GraphQL.
•	Setting up Apollo Client.
•	Fetching, Mutating, and Caching data.

Day 15

4. Testing in React:
•	Unit Testing:
•	Introduction to Jest and React Testing Library.
•	Mocking and Simulating User Actions.
•	Testing Custom Hooks.
•	Integration and End-to-End Testing:
•	Setting up tools like Cypress.
•	Writing E2E tests for complex user flows.
5. Webpack and Bundling:
•	Deep Dive into Webpack:
•	Loaders, Plugins, and Configuration.
•	Code Splitting and Lazy Loading.
•	Tree Shaking and Optimization Techniques.
6. Performance Optimization:
•	Profiling Components:
•	Using the React DevTools Profiler.
•	Identifying Bottlenecks.
•	Optimizing Rerenders:
•	React.memo, useMemo, and useCallback.
•	Immutable data structures.

Day 16

7. WebSockets and Real-time Apps:
•	Introduction to WebSockets.
•	Integrating WebSockets with a React App.
•	Managing Real-time State.

8. Introduction to Microfrontends:
•	What are Microfrontends?
•	Strategies for Implementing Microfrontends.
•	Integration with React.
9. Server-Side Rendering with Next.js:
•	Introduction to Next.js.
•	Server Rendering vs. Static Site Generation.
•	Data Fetching Strategies in Next.js.
•	Building and Deploying Next.js Apps.

Day 17, 18


10. Advanced Routing:
•	Dynamic and Nested Routing with React Router.
•	Route Transitions and Animations.
•	Securing Routes (Authentication and Authorization).
11. Advanced Styling Patterns:
•	CSS-in-JS Solutions: Styled Components, Emotion.
•	Theming and Global Styles.
•	CSS Modules and SCSS with React.
12. Deployment and Package
•	Containerization of the application using Docker
•	Deploying to platforms like Vercel, Netlify, and traditional cloud providers.
•	Advanced build tools and strategies.
13. React and the Broader Ecosystem:
•	Introduction to Web Workers and Service Workers.
•	Progressive Web Apps (PWAs) with React.
•	Integrating with other libraries and platforms.
14. Additional Topics:
•	Security Best Practices in React Apps.
•	Internationalization and Localization.
•	Accessibility Best Practices in React.
 

Day 01
Overview of Java (2 hours)

•	JDK
•	Java language versions
•	Java release cycle
•	Javac, JRE, JVM 
•	Setting up JDK
•	IDE setup: IntelliJ vs Eclipse
•	Spring Tool suite 
•	Creating a Java project using Maven 
•	Naming conventions


Java language constructs – Part I (6 hours)

•	Data types
•	Primitive and Reference types
•	Boxing and autoboxing
•	Constants and Variables
•	Operators
•	Loops and conditionals

Day 02

•	Strings
•	String comparison
•	Exercises


Java constructs – Part II (12 hours)

•	Classes and Objects
•	Instance and Local Variables.
•	Constructors
•	Method overloading
•	Static members
•	Access specifiers

Day 03

•	Inheritance and Polymorphism
•	Abstract classes and Interfaces
•	Default methods in interfaces
•	Inner classes
•	Exception handling
•	Exercises


Day 04

Reflection and Annotations (2 hours)
 
•	Examining a Loaded Class
•	Loading a Class Dynamically 
•	Finding Annotations on Syntactic Elements of Loaded Classes
•	Interacting with Methods and Fields Dynamically
•	Defining Annotations 
•	Controlling Applicability and Retention of Annotations
•	Exercises

Packages, Collections and Generics (6 hours)

•	Packages
•	Module system in Java 9

Day 05

•	java.util
•	Lists, Sets, Maps
•	Generics
•	Generic collections
•	Generic types
•	java.nio
•	java.net
•	Date, time, calendar packages
•	Java.security API
•	MD5, SHA
•	Cryptography API
•	Exercises


Day 06

Functional style in Java (1 hour)

•	The evolution of Java after version 8
•	Major changes in the language
•	The paradigm shift
•	Adapting the functional style of programming
•	Immutability
•	Chaining and Composing
•	Higher order
•	Imperative style
•	Exercises


Lambda Expressions (6 hours)

•	What are Lambda Expressions?
•	Functional Interface
•	Static & default methods
•	No-parameter, Single parameter, Multi-parameters
•	Parameter Type Inference

Day 07

•	Storing Lambda Expression
•	Returning a Lambda Expression
•	Lexical Scoping in Closures
•	Consumer, Supplier, Predicate, Function
•	Optional
•	Method References
•	Exercises


Streams (6 hours)

•	Stream API
•	Composing functions
•	Lazy vs. eager evaluation

Day 08

•	Intermediate and terminal operations
•	Iterating lists
•	Transforming lists
•	Finding elements in a list
•	Map and reduce operations on list
•	Joining values
•	Collectors; grouping by
•	Reading files and listing directories
•	Exercises


Day 09

Design Principles and Patterns (12 hours)


•	SOLID principles
•	Why Patterns? 
•	Structure of Patterns 
•	Types of patterns 
•	When to use patterns? 
•	How to use patterns? 
•	Select Creational Patterns 
•	Singleton, Builder

Day 10, 11

•	Select Structural Patterns 
•	Façade, Composite, Decorator
•	Select Behavioral Patterns 
•	Iterator, Mediator, Strategy
•	Examples from popular libraries
•	Influence of lambdas on patterns 
•	Decorator with lambdas 
•	Lazy object creation, Lazy evaluations 
•	Function pipeline pattern 
•	Cascade Method Pattern, Execute Around Method Pattern
•	Exercises

Day 12

Concurrency in Java (6 hours)

•	Creating Threads with Runnable
•	Threads with Lambdas
•	Callable, Futures
•	Concurrency API
•	Thread-Safe Collections 
•	Using Locks and Synchronizers 
•	Thread Pools with ExecutorService, Callable, and Future

Day 13

•	Parallel Streams
•	Exercises


Packaging, Unit Testing (6 hours)

•	JUNIT Basic Concepts (Junit 5 version)
•	Mockito Basic Concepts (Version 3.6)
•	Key Annotations (@Test, @RunWith, @Before, @Mock, @MockBean, @InjectMock etc.)

Day 14

•	Packaging: jar vs war
•	Maven goals
•	Maven extensions and plugins 
•	Maven vs. Gradle
•	Gradle project


Java Memory management (4 hours)
•	JDK and JVM vendors
•	JIT compilation and AOT compilation
•	The C1 and C2 Compilers 
•	JConsole
•	JVM metaspace, PermGen
•	String pools size
•	Tuning the size of the heap
•	Generating a heap dump
•	Viewing a heap dump
•	Monitoring garbage collections
•	Turning off automated heap allocation sizing
•	Tuning garbage collection - old and young allocation
•	Selecting garbage collector
•	Benchmarking; warm-up period
•	Profilers; Using the IDE Profilers
•	What is GraalVM?
•	Using the Graal Compiler
•	Native image building with Graal
•	Exercises


Day 15, 16

Core Spring (8 hours)

•	What is Spring?
•	What does Spring provide?
•	Spring Framework
•	Dependency Injection 
•	Hello Spring 
•	Spring Configuration
•	Configuring beans
•	Factory Pattern
•	Dependency Injection and Inversion of Control
•	Application Context and Spring Beans
•	Xml and Annotation Configuration
•	@Component, @Autowired
•	@Scope
•	Dependency Injection Techniques
•	@Bean, @Qualifier
•	Configuration file
•	@Value
•	Exercises

Day 17

Database (10 Hrs)

•	Relational DB vs Non Relational DB (30 min)
•	Introduction to DB Design (1 Hr)
•	ER Modeling & Normalization 
•	SQL Queries, Stored Procedure, Functions & Triggers (3 Hrs)


Day 18

•	Indexing & Types (30 min)
•	Writing Optimized SQL & understanding Explain plans (2 Hrs)


Day 19

•	NoSQL Database and types  (1 Hr)
•	Query Writing with Mongo DB – Find and Aggregate (2 hrs)



Day 20

JDBC and Working with Databases in Spring (4 hours)

•	JDBC API
•	Connection
•	Statement
•	Resultset
•	Spring DAO
•	Configuring DataSources
•	Template classes
•	Support Classes
•	DataAccessException
•	Exercises

Day 21

ORM with Spring (4 hours)

•	Persistence mechanism
•	Persisting objects
•	Persistence libraries
•	Hibernate, JPA
•	ORM with Spring
•	Exercises

Day 22

Spring boot overview (4 hours)
•	What does Spring Boot give you?
•	start.spring.io
•	application.properties & application.yaml
•	Externalize Configuration
•	@Configuration
•	@ConfigurationProperties 
•	Exercises

RESTful services (8 hours)
•	What is REST?
•	Controllers and RestControllers
•	Configuration
•	@RestController, @Controller
•	Mappings
•	@RequestParam, @ResponseBody
•	@PathVariable
•	JSON response

Day 23


•	ExceptionHandler
•	Customizing Controller Responses
•	Consuming Rest Services
•	RestTemplate, WebClient
•	HttpClient (Java 11+)
•	Testing Rest Services
•	TestRestTemplate, TestWebClient
•	Exercises

Day 24

Spring boot reactive (4 hours)
•	Reactive programming
•	Asynchronous and Non blocking way of giving out data
•	Push model of data
•	Reactive libraries
•	Project Reactor
•	Spring webflux
•	Mono and Flux
•	Building reactive API
•	Reactive Database calls
•	Exercises

Day 25, 26

Spring Data (8 hours)

•	Overview of JDBC and JPA/Hibernate
•	Spring Boot and databases
•	DataSource configuration
•	Initializing Databases
•	Spring Data Repositories
•	Jpa/CrudRepository
•	Transaction management
•	@Transactional
•	Spring Data REST
•	NoSQL databases: MongoDB
•	Exercises

Day 27

Working with Cache (3 hours)

•	Need for Cache
•	Cache strategies; Ahead and After
•	TTL
•	Setting up Redis Cache
•	@CacheXYZ annotations
•	RedisTemplate
•	Changing the cache provider
•	Exercises

Day 28

AOP, Logging and Spring Security (6 hours)

•	Introduction to AOP
•	AOP vs. OOP
•	Pointcut, Joinpoint, Advice
•	Logging - Logback/Log4j
•	Logging Aspect
•	Web Security – OWASP Top 10 security risks
•	Spring security overview
•	Security configuration
•	Securing endpoints
•	Authentication Providers
•	Authorization rules

Day 29

•	OAuth
•	Securing API using JWT
•	SSL trust store
•	Storing credentials in KeyVault
•	Exercises


Spring boot services – Packages and Actuators (4 hours)

	Spring boot web
•	Packaging; JAR vs. WAR

Day 30

•	Overriding configuration properties
•	Tomcat instances
•	Health check using Actuator
•	Managing applications
•	Management port
•	Remote shutdown
•	@Refresh beans through actuator
•	Exercises


Day 31, 32, 33

Asynchronous communication (12 hours)

•	Setting up MoM
•	RabbitMQ (or ActiveMQ)
•	JmsTemplate, JmsListener
•	Streams API
•	Integrating Kafka
•	Producer, Consumer
•	Topics, Partitions
•	Consumer group
•	Error handling
•	Kafka Streams
•	Exercises

Day 34

Microservices Architecture (4 hours)

•	Monolith architectural style
•	Pros and Cons of Monolith
•	Monolith to Macro Services
•	Services to Microservices
•	Characteristics of Microservices
•	‘Micro’ in Microservices
•	Where is the database? Shared or Separate?
•	Communication between services
•	UI Layer
•	Distributed Transaction management
•	Containers
•	Devops pipeline in microservices
•	Overview of microservices patterns 
•	Exercises

Day 35, 36

Spring cloud (8 hours)

•	Spring Cloud Config
•	Profiles in GitHub repository
•	Circuit Breaker using Resilience4J
•	Discovery using Eureka
•	API Gateway using Spring cloud gateway
•	Swagger documentation
•	Logging and Tracing
•	Exercises


Day 37, 38

Overview of GraphQL (2 hours)

•	Working with Data
•	Need for GraphQL
•	Setting up the Development Environment
•	Setting up GraphQL server
•	GraphQL with Apollo
•	graphQL
•	Hello GraphQL
•	Setting up an external service
•	Setting up ApolloServer


GraphQL schemas and Queries (4 hours)

•	Defining schemas
•	Data Types
•	Custom Types
•	Collections
•	Interfaces
•	Resolvers
•	GraphQL queries
•	Aliases
•	Functions and variables
•	Directives
•	Fragments
•	Inline fragments
•	Pagination and Sorting
•	Exercises


Mutations and Subscriptions with GraphQL (2 hours)

•	Exploring Kinds of Mutations
•	Range Add, Node Delete and Change Fields
•	Configuring Mutations within GraphQL
•	Using the Source API
•	Using Promises with Mutations
•	Handling Errors from Failed Mutations
•	Setting up a subscription server
•	PubSub
•	Exercises


Introduction to Quarkus (8 hours)

•	Microprofile
•	Need for Quarkus
•	GraalVM
•	Quarkus vs Spring boot
•	Cloud native Quarkus development
•	Native image
•	REST api using Quarkus
•	ORM with Panache
•	Messaging with Kafka
•	Deploying Quarkus applications
•	Exercises

Introduction to Micronaut (8 hours)

•	Need for Micronaut
•	Micronaut vs Quarkus vs Spring boot
•	Cloud native Micronaut development
•	Micronaut Core
•	Micronaut Web
•	JPA
•	Messaging with Kafka
•	Deploying Micronaut applications
•	Exercises


Day 39

Cloud native development and deployment (4 hours)

•	Cloud Native applications
•	Cloud Native Computing foundation
•	Cloud native stack
•	CI/CD, DevOps, Serverless
•	Overview of AWS, Azure, GCP
•	CI/CD pipeline in Jenkins
•	AWS CodePipeline
•	Exercises

Day 40, 41


AWS CDK (8 hours)

•	Infrastructure as a Code
•	AWS Cloudformation
•	AWS CDK – core concepts
•	Setting up S3, IAM
•	Create and Deploy Lambdas
•	Setting up a CI/CD pipeline using CDK
•	Exercises

Day 42


Docker Overview (6 hours)

•	Images
•	Containers
•	Volumes, Networks
•	Installing Docker
•	Running a container
•	Building an image
•	Exercises

Day 43, 44

Introduction to Kubernetes (2 hours)

•	World of microservices
•	Need for containers
•	Docker introduction
•	Container Orchestration
•	Need for Kubernetes
•	Kubernetes architecture
•	Examples


Kubernetes Overview (6 hours)

•	Kubernetes Setup and Configuration
•	Creating a Kubernetes Cluster
•	CLI
•	Pods, Volumes, Labels, Services
•	Load balancer services
•	Deployments
•	Replica sets
•	Kubernetes with YAML
•	Monitoring and Logging
•	Exercises


```


