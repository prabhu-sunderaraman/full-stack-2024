import {Display} from "./Display";
import {MyForm} from "./MyForm";
import {useState} from 'react';

export const MyPanel = () => {
    const [formData, setFormData] = useState({});
    return (<div>
        <MyForm setData={setFormData}/>
        <hr/>
        <Display data={formData}/>
    </div>);
};

//export default MyPanel;