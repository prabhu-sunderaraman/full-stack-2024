import { useState } from "react";

const StateExample2 = () => {

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