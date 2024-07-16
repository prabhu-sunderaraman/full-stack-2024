import {useState} from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { ADD_CONTINENT_ACTION } from './store';

const ContinentForm = () => {
    const dispatch = useDispatch();
    const [continent, setContinent] = useState('');
    const continents = useSelector(state => state.continents);
    const addContinentButtonClicked = () => {
        dispatch(ADD_CONTINENT_ACTION.addContinent({
            continent
        }));
    };

    return (<div>
        <input type="text" placeholder="Continent" onChange={e => setContinent(e.target.value)}></input><br/>
        <button onClick={addContinentButtonClicked}>Add continent</button>
        <ul>
            {
                continents.map(it => <li key={it}>{it}</li>)
            }
        </ul>
    </div>);
};
export default ContinentForm;