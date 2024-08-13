### CRA

* npx create-react-app <projectName>
* npm vs. npx; npm downloads the packages and runs them
* npx does not download the tool(or package) and runs them directly

* Earlier

```
    npm i -g create-react-app
    create-react-app <projectName>
```

* CRA template creates a NodeJS application with all react js libraries downloaded and configured
* It also creates a **boilerplate** code; html files, basic component etc.,


### Components

* Function based components

``` javascript
const App = () {
    //EH logic
    return <jsx></jsx>;
}

function App() {
    //EH Logic
    return <jsx></jsx>;
}
```            

* Class based components

``` javascript
class App extends React.Component {
    //EH Logic
    render() {
        return <jsx></jsx>;
    }
}
```

