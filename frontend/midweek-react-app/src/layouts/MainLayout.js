import { NavLink, Outlet } from "react-router-dom";

const MainLayout = () => {
    return (<div>
        <header>
            <h1>Midweek react app</h1>
            <ul className='layoutList'>
                <li><NavLink to='/'>Home</NavLink></li>
                <li><NavLink to='/labs'>Labs</NavLink></li>
                <li><NavLink to='/contact'>Contact us</NavLink></li>
            </ul>
        </header>    
        <hr/>
        <main>
            <Outlet/>
        </main> 
        <hr/>
        <footer>
            <p>Copyrights reserved, 2024</p>
        </footer>

    </div>);
};

export default MainLayout;