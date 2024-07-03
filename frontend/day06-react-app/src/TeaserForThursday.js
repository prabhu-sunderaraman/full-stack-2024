import { useState } from "react";

const TeaserForThursday = () => {
    let now = 'current time' //WON'T UPDATE THE UI

    let [currentTime, setCurrentTime] = useState('');
    let [temperature, setTemperature] = useState('');

    const getTimeButtonClicked = () => {
        setCurrentTime(new Date().toTimeString());
        //now = new Date().toTimeString();
    }
    const getTemperatureButtonClicked = () => {
        let randomNumber = Math.random() * 50;
        setTemperature(randomNumber);
    };

    return (<div>
        <button onClick={getTimeButtonClicked}>Get time</button>
        <h1>Time is {currentTime}; Now: {now}</h1>
        <hr/>
        <button onClick={getTemperatureButtonClicked}>Get temperature</button>
        <h4>Temperature of Chennai is {temperature}</h4>
    </div>);
};

export default TeaserForThursday;