const CompA = ({parentPhoneNumber}) => {
    
    const getTimeButtonClicked = () => {
        parentPhoneNumber();
    };

    return (<div>
        <button onClick={getTimeButtonClicked}>Get time</button>
    </div>);
};

export default CompA;