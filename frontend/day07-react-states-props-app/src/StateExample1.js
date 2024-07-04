import { useState } from "react";

const StateExample1 = () => {
    //let time = '';

    //React Hook
    let [currentTime, setCurrentTime] = useState(new Date().toTimeString()); //Define a 'variable' and a method to update that 'variable'
    
    const getTimeButtonClicked = () => {
        //time = new Date().toTimeString(); //NORMAL variable update
        
        //currentTime = new Date().toTimeString(); //UI doesn't get refreshed
        setCurrentTime(new Date().toTimeString());

        //But what you need is the data should be updated AND UI should also get refreshed
        //Here's where you need STATE
        //State in react is just some data
        //Updating that data, will automatically refresh the UI
    };

    return (<div>
        <button onClick={getTimeButtonClicked}>Get time</button>
        <h3>Time is {currentTime}</h3>
    </div>);
};

export default StateExample1;