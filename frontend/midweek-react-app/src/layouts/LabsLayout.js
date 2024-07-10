import { Outlet } from "react-router-dom";

const LabsLayout = () => {
    return (<div>
        <header>
            <h5>Here' are the labs</h5>
            <ul className='layoutList'>
                <li><a href="/labs">Lab01</a></li>
                <li><a href="/labs/lab02">Lab02</a></li>
            </ul>
        </header>    
        <hr/>
        <main>
            <Outlet/>
        </main>
    </div>);
};

export default LabsLayout;