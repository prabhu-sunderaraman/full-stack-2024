import { Outlet } from "react-router-dom";

const MainLayout = () => {
    return (<div>
        <header>
            <h1>Midweek react app</h1>
            <ul className='layoutList'>
                <li><a href="/">Home</a></li>
                <li><a href="/labs">Labs</a></li>
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