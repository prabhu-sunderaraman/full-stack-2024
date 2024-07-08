export const CovidGridRowItem = ({covidDataItem, onCovidGridRowItemClicked}) => {
    return (<tr key={covidDataItem.country} style={{backgroundColor: covidDataItem.deaths > 5000 ? 'red': 'white'}} 
        onMouseOver={() => onCovidGridRowItemClicked(covidDataItem)}>
        <td>{covidDataItem.country}</td>
        <td>{covidDataItem.cases}</td>
    </tr>);
};