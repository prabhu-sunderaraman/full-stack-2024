import { useState } from "react";

const StateExample2 = () => {
    //UI gets automatically refreshed when you modify the state
    //This StateExample2() function gets called everytime you modify the state
    
    //When you update the state;
    //the component is rendered again
    //ie., a new Virtual DOM tree is constructed
    //React compares the new Virtual DOM tree with the previous Virtual DOM tree
    //Only if there are changes, it goes and updates the real DOM tree
    //After updation, it destroys the previous Virtual DOM tree
    

    console.log("*** RENDERED ***");
    const [message, setMessage] = useState('Hi');
    const [name, setName] = useState('');
    //let name = ''; //WEIRD behaviour

    const nameValueChanged = (e) => {
        let value = e.target.value;
        setName(value);
        //name = value;
    };

    const greetButtonClicked = () => {
        setMessage(`Hi ${name}`);
    }

    return (<div>
        <input type="text" placeholder="name" onChange={nameValueChanged}></input> <br/>
        <button onClick={greetButtonClicked}>Greet</button>
        <h3>{message}</h3>
    </div>);
};

export default StateExample2;