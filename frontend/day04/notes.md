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