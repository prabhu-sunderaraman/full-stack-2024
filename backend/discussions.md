### Jul 25
*  Array and Array List:

```
Arrays are fixed size collection; ArrayLists are dynamically growable collections
Arrays are faster to access compared to ArrayLists
Arrays are preferred when performance is key while ArrayLists are preferred when you need flexibility
```
 		
* List and ArrayList

```
List is an interface while ArrayList is an implementation of List
List has many implementations and ArrayList is just one of them
```

3. Why not use a Set instead of a List

```
List allows duplication while Set does not allow
```

4. Why do we need getter and setter method

```
Because the world says so
Security for those variables can be quoted as a reason; more theoritical; Because you can access them using Reflection
Coding Convention; make variables private and provide getter/setter properties to access them;
Some libraries like Hibernate, Spring expect you to follow this convention
Unlike languages like JavaScript where get and set give you variable like feature using dot notation, getter/setter is still a method in Java
```

5. How do we implement getter and setter method in javascript class (Ashrith)

``` javascript

class Person {
  constructor(firstName, lastName) {
    this._firstName = firstName;
    this._lastName = lastName;
  }

  get fullName() {
    return `${this._firstName} ${this._lastName}}`

  set fullName(value) {
    const [firstName, lastName] = value.split(' ');
    this._firstName = firstName;
    this._lastName = lastName;
  }
}

const person = new Person('John', 'Doe');
console.log(person.fullName); // Output: John Doe

person.fullName = 'Jane Smith';
console.log(person.fullName); // Output: Jane Smith

```



### Jul 26

* Arrays are faster to access compared to ArrayLists. WHY? - Malavika

```
Arrays are stored in contiguous memory locations, so easy to spot an element and access. It paves way for direct access. 
ArrayLists can also be accessed using index but are more dynamic in nature, so the access mechanism is a bit slower
```

* Arrays or ArrayLists? which one is suited for concurrent applications? - Anek

```
Concurrency is the ability to perform multiple tasks simultaneously
Arrays and ArrayLists are not suited for concurrent applications because they are not "thread-safe"
You have to design the collection in such a way that 
multiple people can access it without having to wait and without the corruption of data 
```


* Output of printstatement is weird - Swetha

``` markdown

* Set is a collection that DOES NOT allow duplicates
* List is a collection that allows duplicates

```

<br/>

### Jul 29

* Set or List, which collection preserves the order (inserting and fetching) with a code example - Swetha
* Set or List, which is faster to access with a code example - Aishuwarya
* ArrayList vs Vector vs LinkedList; (Code example) -> Aishuwarya
* TreeSet vs HashSet vs LinkedHashSet (Code example) -> Princy
* TreeMap vs. LinkedHashMap vs. Hashtable vs. HashMap() (Code example) -> Mathew Francis;


* static members
* interfaces- constants, default methods, static methods, abstract methods
* class can implement more than one interface whereas a class can inherit only one other class
* interfaces cannot be instantiated but can act as reference to classes that implement the interface

``` java
interface Animal {}
Animal animal = new Animal(); //ERROR

class Dog implements Animal {}
Animal animal = new Dog();

```  

* java.util package contains all the collections that you use
* List, Set and Map
* List is an ordered collection => ArrayList, Vector, Stack, Queue, LinkedList
* Set is an unordered collection that does not allow duplication => HashSet, TreeSet, SortedSet
* Map is a dictionary => HashMap, Hashtable, SortedMap, LinkedHashMap, TreeMap



#### ToDo

* Bundle the whole project as a jar file and run the class in Lab05


### Lambda expressions

* You can implement an interface in 3 ways
* Create a concrete class that implements the interface
* Create an anonymous inner class
* Create a lambda expression
* Lambda expression is a shortcut for anonymous inner class. ie., a new class is generated during runtime


### Built-in functional interfaces

* java.util.function is the package that contains all built-in functional interfaces
* Predicate, Function, Supplier, Consumer
* **Predicate** always return a boolean -> filter(...) methods take in a predicate as argument
* **Function** can take any type and return any type -> map(...) methods take in a Function as argument
* **Supplier** supply you with some data of any type -> get() methods 
* **Consumer** consumes the data you provide -> forEach method takes a consumer as argument


### Stream API

* java.util.stream package contains stream related classes
* Every collection has a .stream() method that you can use to create a stream
* Stream is a snapshot of your collection
* It gives a functional style of coding using methods like filter, map, reduce, collect, find
* Streams cannot be reused so that's why you create a stream everytime you want to process a collection
* Streams process sequentially by default
* Streams are lazily evaluated; Till it encounters a terminal operation like forEach, collect, get, reduce stream code is not evaluated
* Method Reference :: operator
* Method reference is a replacement for a lambda expression; If you have a lambda expression with many lines of code, 
* you can extract it to a separate method and refer to that method using :: operator

### Aug 2

* Set or List, which collection preserves the order (inserting and fetching) with a code example - Swetha

```
List preserves order
Set is an unordered collection
```

* Set or List, which is faster to access with a code example - Aishuwarya

```
Fast or Slow depends on how you access;
If you use .forEach, not much difference for 100K records; But Set still has an edge
If you use .contains() Set outperforms List

```

* ArrayList vs Vector vs LinkedList; (Code example) -> Aishuwarya

```
LinkedList is more linear traversal; has methods to addFirst and addLast
Access using element is not possible, only using index
LinkedList consumes more memory because it has to maintain pointers to other elements
```

* TreeSet vs HashSet vs LinkedHashSet (Code example) -> Princy

```
TreeSet sorts items; Does not allow null values
HashSet does not maintain order; Allows null values
LinkedHashSet maintains insertion order; Allows null values
```

* TreeMap vs. LinkedHashMap vs. Hashtable vs. HashMap() (Code example) -> Mathew Francis;

```
TreeMap sorts keys; Use Comparator to customize sorting
LinkedHashMap is a doubly linked list; maintains insertion order
HashMap allows null key and null values; 
```

#### Aug 2

* When will you prefer LinkedList to ArrayList? - Aishuwarya
* SortedSet vs TreeSet? - Princy
* TreeMap or LinkedHashMap? when will you prefer?


#### Modularity in Java

* .jmod -> java modules
* .jar -> java archives
* .class

* jdk is organized into modules, packages and classes

```
[modules]
	- [packages]
		- .class files
```

* **java.base** is the standard module which contains all the standard packages
* **java.lang** package is the standard package that is available to all the applications

* The executables that you can build in a java application is .jmod or .jar or .war[not used these days] file

* We are going to be creating java applications; building them; and generate .jar files; 
* Most of the Java applications, the deployable entity is a **.jar file**
* jar file is like a zip file

```
java -jar <yourjarfilename>
```

```
jar xf <yourjarfilename>
```

#### Exception handling

* try, catch, finally, throw, throws
* Checked, Unchecked
* Checked exceptions extend java.lang.Exception
* Unchecked exceptions extends java.lang.RuntimeException

#### Databases

* RDBMS - SQL databases; MySQL, Postgres, Oracle, DB2
* NoSQL databases - MongoDB, Couchbase, Graph, Cosmos

* When do your prefer RDBMS?
* Data integrity is extremely important and cannot afford to have duplication
* CRUD(Create-Retrieve-Update-Delete) operations
* Consistency and Atomicity
* Transactions

#### RDBMS

* Databases or Schemas
* Tables (Tables contains column definitions)
* Data duplication is very important
* Normalize data and maintain them
* You spread your data across tables and relate them 

* Business card or visiting card or LinkedIn

* name, title, city/country, educational experience, work experience, 

* NoSQL

``` json
{
	"name": "Prabhu",
	"title": "Full stack engineer",
	"city": "Chennai",
	"country": "India",
	"education": [
		{
			"year": 1996,
			"school": ""
		},
		{
			"year": 1994,
			"school": ""
		}
	],
	"workExperience": [
		{
			"year": 2000,
			"company": "",
			"role": "",
			"description": ""
		},
		{
			"year": 2000,
			"company": "",
			"role": "",
			"description": ""
		},
		{
			"year": 2000,
			"company": "",
			"role": "",
			"description": ""
		}
			
	]
}
// Gen Z
{
	"name": "Sam",
	"pronoun": "he/him",
	"title": "Backend engineer",
	"city": "Remote",
	"country": "India",
	"education": [
		{
			"year": 1996,
			"school": ""
		},
		{
			"year": 1994,
			"school": ""
		}
	],
	"hobbies": [
		{
			"name": "YT shorts",
			"description": "",
			"channel": ""
		}
	],
	"workExperience": [
		{
			"year": 2000,
			"company": "",
			"role": "",
			"description": ""
		}
	],
	"skills": [
		{
			"languages": []
		},
		{
			"writing": []
		}
	],
	"recommendations": []
}


{
	"firstName": "Sam",
	"designation": "Backend engineer",
	"city": "Remote",
	"educationalQualifications": [
		{
			"year": 1996,
			"school": ""
		},
		{
			"year": 1994,
			"school": ""
		}
	],
	"passtimeActivities": [
		{
			"name": "YT shorts",
			"description": "",
			"channel": ""
		}
	],
	"jobExperience": [
		{
			"year": 2000,
			"company": "",
			"role": "",
			"description": ""
		}
	],
	"skillSets": [
		{
			"languages": []
		},
		{
			"writing": []
		}
	],
	"recommendations": []
}

```

// Normalized data

```markdown

[persons]
id	first_name	last_name	age

P1  Prabhu		S			46
P2	Sam			T			23

[address]
id	city	country	person_id

A1	Chennai	India	P1


[education]
id	year	school

E1  1996	...
E2	1994	...
E3	2016	...
E4	2020	...

[person_education]
person_id	education_id

P1			E1
P1			E2
P2			E3
P2			E4
	
[hobbies]	

id	name	description
H1	YT		Watch Shorts all the time
H2	Hike	Mountain Hike
H3  Biriyani	Eat every weekend

[person_hobby]
person_id	hobby_id
P2			H1
P2			H2
P2			H3

```

* SQL -> Structured Query Language to work with your data
* Avoid duplication
* Consistency
* Support for transactions, concurrency
* Cost


#### Reflection

* every class gets compiled to bytecodes
* .class file contains bytecodes + metadata
* metadata contains all the info about the class
* Loading this metadata during runtime is Reflection
* java.lang.reflect package contains classes that you will use
* Access the metadata using **.class or Class.forName("") or .getClass()**


### Concurrency

* Creating threads using Thread class is old style;
* You can use the Thread pool classes in **java.util.concurrent** package
* ExecutorService; fixed thread pool; cached thread pool; forkjoinpool
* You can execute or submit a task (Runnable interface impl) to the thread pool
* Parallel Stream make use a fork join pool; It creates (n - 1) worker threads, where n is the number of processors
* You can create a custom forkjoinpool and execute your parallel stream code in it



































