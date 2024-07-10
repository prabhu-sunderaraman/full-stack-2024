### Reducer 

* Reducer is a mechanism by which you isolate all the state manipulation logic in a separate function
* Define a reducer by specifying the actions
* From the component you use the reducer and dispatch actions
* action is another JSON object that contains a type and data (or payload)

``` javascript

const myReducer = (state, action) => {
    switch(action.type) {
        //...
        //your state needs to be changed for the UI to refresh
        //That's why you construct a new state object everytime and return it
    }
}

//From the components
const [state, dispatch] = useReducer(myReducer);

const buttonClicked = () => {
    dispatch({
        type: '',
        //...
    })
}
```

* dispatch call is an asynchronous behaviour
* If you want to make it synchronous, you use async/await keywords and make it synchronous

### router

* npm i --save react-router-dom
* router enables view/hide of components in your single page application
* it also provides you with browser history population so you can navigate between components using browser back/forward buttons
* <BrowserRouter>

``` javascript
const myAppRouter = createBrowserRouter([
        {
            path: '/',
            element: <div>Home</div>
        },
        {
            path: '/about',
            element: <AboutUs/>
        }

    ]);
 
<Router.Provider router={myAppRouter}>
</Router.Provider>
```    











