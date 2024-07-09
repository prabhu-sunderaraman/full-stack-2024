import {Display} from "./Display";
import { DisplayWarning } from "./DisplayWarning";
import { MyContext } from "./MyContext";
import {MyForm} from "./MyForm";
import {useState} from 'react';

export const MyPanel = () => {
    const [formData, setFormData] = useState({});
    const copyrightsMessage = "Copyrights reserved."
    const warningMessage = "Warning!!! Context API is confusing";
    //I will provide MyContext with these values formData and setFormData to ALL my CHILD components
    return (<div>
        <MyContext.Provider value={{formData, setFormData, copyrightsMessage, warningMessage}}>
            <MyForm/>
            <hr/>
            <Display/>
            <hr/>
            <br/>
            <DisplayWarning/>
        </MyContext.Provider>
    </div>);
};

// export const MyPanel = () => {
//     const [formData, setFormData] = useState({});
//     return (<div>
//         <MyForm setData={setFormData}/>
//         <hr/>
//         <Display data={formData}/>
//     </div>);
// };

//export default MyPanel;