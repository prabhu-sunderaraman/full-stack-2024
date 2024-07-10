import { Outlet } from "react-router-dom";

const MainLayout = () => {
    return (<div>
        <header>
            <h1>Midweek react app</h1>
            <ul className='layoutList'>
                <li><a href="/">Home</a></li>
                <li><a href="/lab01">Lab 01</a></li>
                <li><a href="/lab02">Lab 02</a></li>
                <li><a href="/contact">Contact us</a></li>
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