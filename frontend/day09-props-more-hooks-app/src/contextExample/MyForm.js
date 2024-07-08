import { useContext, useState } from "react"
import { MyContext } from "./MyContext";

export const MyForm = () => {
    const {setFormData} = useContext(MyContext);
    const [name, setName] = useState('');
    const [age, setAge] = useState('');

    return (<div>
        <input type="text" placeholder="Name" onChange={e => setName(e.target.value)}></input>
        <br/>
        <input type="number" placeholder="Age" onChange={e => setAge(e.target.value)}></input>
        <br/>
        <button onClick={() => setFormData({name, age})}>Click</button>
    </div>);
};

//export default MyForm;