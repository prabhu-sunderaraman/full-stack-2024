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

* Arrays are faster to access compared to ArrayLists. WHY?
* Arrays or ArrayLists? which one is suited for concurrent applications?