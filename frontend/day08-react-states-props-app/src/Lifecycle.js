import { useEffect, useState } from "react";

const Lifecycle = () => {
    console.log("****rendered****");
    const [currentTime, setCurrentTime] = useState();
    const [currentTemperature, setCurrentTemperature] = useState();
    
    // You need a function that will be called ONLY once and not everytime the state is changed

    useEffect(() => {
        //WHEN the component loads FOR THE FIRST TIME
        //Write code to go to backend
        //Get the deals of the day and initialize
        console.log("----- useEffect called FOR THE FIRST TIME");
    }, []);

    useEffect(() => {
        console.log("----- useEffect called because currentTime has changed");
    }, [currentTime]);

    useEffect(() => {
        console.log("----- useEffect called because currentTemperature has changed");
    }, [currentTemperature]);

    const getTimeButtonClicked = () => {
        setCurrentTime(new Date().toTimeString());
    };
    const getTemperatureButtonClicked = () => {
        setCurrentTemperature(Math.random() * 50);
    };

    return (<div>
        <button onClick={getTimeButtonClicked}>Get time</button>
        <h2>{currentTime}</h2>
        <button onClick={getTemperatureButtonClicked}>Get temperature</button>
        <h2>{currentTemperature}</h2>
    </div>);
};

export default Lifecycle;