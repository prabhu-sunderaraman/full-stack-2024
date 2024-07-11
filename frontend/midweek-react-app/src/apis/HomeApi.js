const env = process.env;

const loadMessage = async () => {
    return await fetch(`${env.REACT_APP_BACKEND_URL}/message`)
        .then(response => response.text())
        .catch(error => error);
};



export default loadMessage;