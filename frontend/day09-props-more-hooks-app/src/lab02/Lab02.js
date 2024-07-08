import  {useEffect, useState} from 'react';
import { CovidGrid } from './CovidGrid';
import { Summary } from './Summary';
import { Lab02Context } from './Lab02Context';

export const Lab02 = ({url}) => {
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
        <Lab02Context.Provider value={{covidData, showSummary, selectedCovidDataItem}}>
            <h1>Lab02</h1>
            <CovidGrid/>
            <h5 style={{color: 'red'}}>{loadingError}</h5>
            <hr/>
            {
                selectedCovidDataItem.country ?  <Summary/> : <span/>
            }
        </Lab02Context.Provider>
    </div>);
}