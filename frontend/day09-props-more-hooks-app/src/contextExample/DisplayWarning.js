import { useContext } from "react";
import { MyContext } from "./MyContext";

export const DisplayWarning = () => {
    const {warningMessage} = useContext(MyContext);
    return (<div>
        {warningMessage}
    </div>);
};