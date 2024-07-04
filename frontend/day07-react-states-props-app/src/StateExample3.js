import { useState } from "react";

//APPROACH 3
const StateExample3 = () => {

    const [calc, setCalc] = useState({
        number1: 0, 
        number2: 0, 
        number3: 0, 
        sum: 0
    });
    

    const number1Changed = (e) => {
        // let obj = {
        //     number2: calc.number2,
        //     number3: calc.number3,
        //     sum: calc.sum,
        //     number1: parseInt(e.target.value)
        // };
        let obj = {
            ... calc,
            number1: parseInt(e.target.value)
        };
        setCalc(obj);
    }
    const number2Changed = (e) => {
        // let obj = {
        //     ... calc,
        //     number2: parseInt(e.target.value)
        // };
        // setCalc(obj);
        calc.number2 = parseInt(e.target.value);
        setCalc(calc);
    }
    const number3Changed = (e) => {
        let obj = {
            ... calc,
            number3: parseInt(e.target.value)
        };
        setCalc(obj);
    }
    const addButtonClicked = () => {
        let obj = {
            ... calc,
            sum: calc.number1 + calc.number2 + calc.number3
        };
        setCalc(obj);
    };


    return (<div>
                <input type="number" placeholder="Number 1" onChange={number1Changed}></input>
                <input type="number" placeholder="Number 2" onChange={number2Changed}></input>
                <input type="number" placeholder="Number 3" onChange={number3Changed}></input> <br/>
                <button onClick={addButtonClicked}>Add</button>
                <h3>{calc.sum}</h3>
    </div>);
};



//APPROACH 1

// const StateExample3 = () => {

//     const [number1, setNumber1] = useState();
//     const [number2, setNumber2] = useState();
//     const [number3, setNumber3] = useState();
//     const [sum, setSum] = useState();

//     const number1Changed = (e) => {
//         setNumber1(parseInt(e.target.value));
//     }
//     const number2Changed = (e) => {
//         setNumber2(parseInt(e.target.value));
//     }
//     const number3Changed = (e) => {
//         setNumber3(parseInt(e.target.value));
//     }
//     const addButtonClicked = () => {
//         setSum(number1 + number2 + number3);
//     };


//     return (<div>
//                 <input type="number" placeholder="Number 1" onChange={number1Changed}></input>
//                 <input type="number" placeholder="Number 2" onChange={number2Changed}></input>
//                 <input type="number" placeholder="Number 3" onChange={number3Changed}></input> <br/>
//                 <button onClick={addButtonClicked}>Add</button>
//                 <h3>{sum}</h3>
//     </div>);
// };

export default StateExample3;