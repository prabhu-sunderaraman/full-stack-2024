import { useContext } from "react";
import { DisplayComment } from "./DisplayComment";
import { MyContext } from "./MyContext";

export const Display = () => {
    const {formData} = useContext(MyContext);
    return (<div>
        { formData.name ? `Hi ${formData.name}. You are ${formData.age} years old` : ''}
        <DisplayComment/>
    </div>);
};

//export default Display;