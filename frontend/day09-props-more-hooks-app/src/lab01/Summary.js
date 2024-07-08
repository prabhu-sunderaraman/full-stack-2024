export const Summary = ({covidDataItem}) => {
    return (<p>
        Country: {covidDataItem.country} <br/>
        Cases: {covidDataItem.cases},
        Recovered: {covidDataItem.recovered} <br/>
        Deaths: {covidDataItem.deaths}
    </p>);
};