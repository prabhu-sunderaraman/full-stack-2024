const LoginForm = () => {

    const onLoginButtonClicked = () => {
        console.log("Login button clicked");
    }

    const usernameChanged = (e) => {
        console.log(e.target.value);
    }

    return (<div>
        <input type="text" placeholder="Username"  onChange={usernameChanged}></input>
        <br/>
        <input type="password" placeholder="Password"></input>
        <br/>
        <button onClick={onLoginButtonClicked}>Login</button>
    </div>);

};

export default LoginForm;