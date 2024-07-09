import { useContext } from "react";
import { Lab02Context } from "./Lab02Context";

export const CovidGridRowItem = ({covidDataItem}) => {
    const {showSummary} = useContext(Lab02Context);
    
    return (<tr key={covidDataItem.country} style={{backgroundColor: covidDataItem.deaths > 5000 ? 'red': 'white'}} 
        onMouseOver={() => showSummary(covidDataItem)}>
        <td>{covidDataItem.country}</td>
        <td>{covidDataItem.cases}</td>
    </tr>);
};