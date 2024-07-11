const env = process.env;

const loadMessage = async () => {
    let output = '';
    output = await fetch(`${env.REACT_APP_BACKEND_URL}/message`)
        .then(response => response.text())
        .catch(error => error);
    return output;    
};



export default loadMessage;