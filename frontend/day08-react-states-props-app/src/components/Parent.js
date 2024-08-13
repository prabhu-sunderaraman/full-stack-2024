import CompA from "./CompA";
import CompB from "./CompB";
import {useState} from 'react';

const Parent = () => {
    const [currentTime, setCurrentTime] = useState();

    const callMe = (value) => {
        console.log("Parent called");
        //setCurrentTime(new Date().toTimeString());
        setCurrentTime(value);
    }
    return (<div>
        <CompA parentPhoneNumber={callMe}/>
        <hr/>
        <CompB message={currentTime}/>
    </div>);
};

export default Parent;