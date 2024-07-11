import { useEffect, useState } from "react";
//import loadMessage from "../../apis/HomeApi";
//import loadMessage from "../../apis/AxiosApi";
import axiosApi from "../../apis/AxiosApi";

const Home = () => {
    const [message, setMessage] = useState('');
    useEffect(() => {
        axiosApi
            .get('/message')
            .then(output => setMessage(output.data));
    }, []);
    return (<div>
        {message}
    </div>);
};

export default Home;