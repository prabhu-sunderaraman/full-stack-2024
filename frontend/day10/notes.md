### Context API

* From a Parent component if you want to pass data to child components,
* you can use prop drilling, where you pass every item as prop to other components
* Can get really tedious to design and maintain

* Use a Context API to avoid prop drilling. 
* Context API gives you a context or a store where you can store all the items that you want
* Provide this context to all the child components
* Child components can use the context and access the items they need

``` javascript
//createContext 
const Day10Context = createContext();

//From the parent component provide this context to all the child components
<Day10Context.Provider values={}>
    <Child>
        <GrandChild/>
    </Child>
</Day10Context.Provider>

//From the child components
const {} = useContext(Day10Context);

```

* Using context does not replace props
* props is still preferred if your usecase is very simple; say you just want to pass some data to immediate child components only


