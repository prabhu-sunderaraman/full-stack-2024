import { useState } from "react";

const CalcComp = ({title}) => {
    const [message, setMessage] = useState('');
    const [number1, setNumber1] = useState();
    const [number2, setNumber2] = useState();

    const addButtonClicked = () => {
        setMessage(`Sum of ${number1} and ${number2} is ${number1 + number2}`);
    };

    const subtractButtonClicked = () => {
        setMessage(`Difference of ${number1} and ${number2} is ${number1 - number2}`);
    };

    const multiplyButtonClicked = () => {
        setMessage(`Product of ${number1} and ${number2} is ${number1 * number2}`);
    };

    return (<div>
        <h1>{title ? title : 'Calculator'}</h1>
        <input type="number" data-testid="number1Text" placeholder="number 1" onChange={e => setNumber1(parseInt(e.target.value))}></input> <br/>
        <input type="number" data-testid="number2Text" placeholder="number 2" onChange={e => setNumber2(parseInt(e.target.value))}></input> <br/>
        <button onClick={addButtonClicked} data-testid="addButton">Add</button>
        <button onClick={subtractButtonClicked} data-testid="subtractButton">Subtract</button>
        <button onClick={multiplyButtonClicked} data-testid="multiplyButton">Multiply</button>
        <h4>{message}</h4>
    </div>);
};

export default CalcComp;