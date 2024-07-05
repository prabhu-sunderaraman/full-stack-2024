const CompA = ({parentPhoneNumber}) => {
    
    const getTimeButtonClicked = () => {
        let currentTime = new Date().toTimeString();
        parentPhoneNumber(currentTime);
    };

    return (<div>
        <button onClick={getTimeButtonClicked}>Get time</button>
    </div>);
};

export default CompA;