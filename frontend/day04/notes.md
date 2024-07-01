### async/await

* functions like **fetch** are asynchronous in nature
* calling fetch does not wait for response
* Javascript engine continues with the next line of code after fetch
* If you want to make calls to fetch execute synchronously
* Add async/await keyword
* ie., Wait for the fetch to complete, then proceed with the next line of execution
* await cannot be used alone; await has to be used with async keyword only; the function should be marked as async

``` javascript
async function getCities() {

    await callBackend();

}

const getCities = async () => {

    await callBackend();
}

```

* If you want to design your own asynchronous style code, Promises come into picture

#### Fetching data from Backend

* You can use fetch API, axios API etc., for fetching data from backend 
* fetch is built-in. You don't have to install/configure anything extra to work with fetch API
* AJAX -> Asynchronous JavaScript and XML
* fetch is a way to send AJAX request;
* XML in Ajax is outdated; It's still called AJAX but people hardly use XML formatted data;


### React JS

* Why React?
* Javascript frameworks - Need?

* What do they provide? -? 
* They provide readymade functionalities that you can use in your code
* They provide a structure and modularity to your code
* They provide custom UI components
* They provide tools to improve performance
* They provide debugging facilities

* Angular (irctc), React (Facebook, BookMyShow), Vue, Ember
* One of the main reasons React is used is "Performance"
* React provides Virtual DOM
* You use React JS when your UI is very complicated with a lot of components and changes happenning very frequently
* https://react.dev/ 
* v18.x.x
* React can be used to build Frontend applications for web and mobile
* React Native is used for Mobile
* You can develop frontend applications in React using JS or TypeScript














