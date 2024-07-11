import { useEffect, useState } from "react";
import loadMessage from "../../apis/HomeApi";

const Home = () => {
    const [message, setMessage] = useState('');
    useEffect(() => {
        let response = loadMessage();
        response
            .then(output => setMessage(output));
    }, []);
    return (<div>
        {message}
    </div>);
};

export default Home;