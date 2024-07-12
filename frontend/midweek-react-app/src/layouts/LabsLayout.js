import { NavLink, Outlet } from "react-router-dom";

const LabsLayout = () => {
    return (<div>
        <header>
            <h5>Here' are the labs</h5>
            <ul className='layoutList'>
                <li><NavLink to="/labs">Lab01</NavLink></li>
                <li><NavLink to="/labs/lab02">Lab02</NavLink></li>
                <li><NavLink to="/labs/lab03">Lab03</NavLink></li>
                <li><NavLink to="/labs/lab04">Lab04</NavLink></li>
            </ul>
        </header>    
        <hr/>
        <main>
            <Outlet/>
        </main>
    </div>);
};

export default LabsLayout;