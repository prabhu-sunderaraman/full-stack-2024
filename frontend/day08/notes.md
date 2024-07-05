### States in React

* Represent data models
* React hook called **useState**
* useState returns an array that you can destructure
* It returns a variable to hold the state, and a function to update the state

``` javascript
 let [stateVar, setStateVar] = useState(<initialValue>);
```

* Changing the state causes the component to render again
* UI gets refreshed automatically when you change the state
* UI is bound to the state; Just change the state and the UI will get refreshed 
* Changing the state always causes a new Virtual DOM to be created; 
* Virtual DOM is compared with the previous Virtual DOM;
* If there are any changes the real DOM is updated. The previous Virtual DOM is discarded

#### Copying objects and creating a new one

``` javascript
 let person = { "name": "Sam", "age": 12};
 //let person2 = { "name": person.name, "age": person.age};
 let person2 = {... person, "age":23};
```

