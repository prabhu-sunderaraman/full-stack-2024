import CompA from "./CompA";
import CompB from "./CompB";
import {useState} from 'react';

const Parent = () => {
    const [currentTime, setCurrentTime] = useState();

    const callMe = () => {
        console.log("Parent called");
        setCurrentTime(new Date().toTimeString());
    }
    return (<div>
        <CompA parentPhoneNumber={callMe}/>
        <hr/>
        <CompB message={currentTime}/>
    </div>);
};

export default Parent;