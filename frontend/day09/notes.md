### Props

* Props are data that you pass into components as attributes(key="value")
* You can access the props inside your components using the property name

``` javascript
    <Person name="Sam" age="12"/>

    const Person = ({name, age}) => {

    }

```

* props are usually read-only. Doesn't make much sense modifying the props

### Container components

* A component can contain or be composed of other components
* You can make components interact with each other using props
* Common pattern used for this purpose is to have a parent component that passes on its information to child components
* Referred as **Prop drilling**

``` javascript
    const Parent = () => {
        const [state, setState] = useState();
        return (<div>
            <Child1 param={state}/>
            <Child2 param={setState}/>
        </div>);

    };
```