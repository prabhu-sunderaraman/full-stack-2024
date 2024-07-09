import  {useEffect, useState} from 'react';
import { CovidGrid } from './CovidGrid';
import { Summary } from './Summary';

export const Lab01 = ({url}) => {
    const [covidData, setCovidData] = useState([]);
    const [loadingError, setLoadingError] = useState('');
    const [selectedCovidDataItem, setSelectedCovidDataItem] = useState({});

    const showSummary = (covidDataItem) => {
        setSelectedCovidDataItem(covidDataItem);
    };

    useEffect(() => {
        fetch(url, {
            method: "GET"
        })
        .then(response => response.json())
        .then(response => setCovidData(response))
        .catch(error => setLoadingError("Error loading covid data: " + error.message));
    }, []);

    return (<div>
        <h1>Lab01</h1>
        <CovidGrid data={covidData} onCovidGridRowItemClicked={showSummary}/>
        <h5 style={{color: 'red'}}>{loadingError}</h5>
        <hr/>
        {
            selectedCovidDataItem.country ?  <Summary covidDataItem={selectedCovidDataItem}/> : <span/>
        }
        
    </div>);
}