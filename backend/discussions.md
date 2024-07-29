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

```
Set is a collection that DOES NOT allow duplicates
List is a collection that allows duplicates
```

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












