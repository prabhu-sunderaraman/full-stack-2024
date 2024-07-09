import { useContext } from "react";
import { MyContext } from "./MyContext";

export const DisplayComment = () => {
    const {formData, copyrightsMessage} = useContext(MyContext);
    let age = formData.age;
    if(age) {
        if(age >= 70) {
            return <h5>You are too old to drive! {copyrightsMessage}</h5>
        } else {
            return <h6>Cool! Just be careful. Don't rash drive. {copyrightsMessage}</h6>
        }
    } else {
        return (<span/>);
    }
    
}