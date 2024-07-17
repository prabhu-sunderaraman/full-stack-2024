import { useContext } from "react";
import SecurityContext from "./SecurityContext";
import { useNavigate } from "react-router-dom";

const LoginView = () => {
    const navigate = useNavigate();
    const {setLoggedIn} = useContext(SecurityContext);

    const loginButtonClicked = () => {
        // Ignore username-password check; Let's keep it simple
        // JWT - Json Web Token
        // When you click a login button
        // your credentials are taken to a backend API(Authentication server); gets authenticated
        // and you get a JWT (this token is like an encrypted data which has information about you and the expiry time)
        // You store this JWT in LocalStorage or SessionStorage
        // You send this JWT token everytime when you send a request to a backend API
        setLoggedIn(true);
        localStorage.setItem("loggedIn", "1");
        navigate("/home", {replace: true});
    };
    return (<div>
        <input type="text" placeholder="username"></input> <br/>
        <input type="password" placeholder="password"></input> <br/>
        <button onClick={loginButtonClicked}>Login</button>    
    </div>);
};

export default LoginView;