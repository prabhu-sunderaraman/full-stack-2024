import { useContext } from "react";
import { Lab02Context } from "./Lab02Context";

export const Summary = () => {
    const {selectedCovidDataItem} = useContext(Lab02Context);
    
    return (<p>
        Country: {selectedCovidDataItem.country} <br/>
        Cases: {selectedCovidDataItem.cases},
        Recovered: {selectedCovidDataItem.recovered} <br/>
        Deaths: {selectedCovidDataItem.deaths}
    </p>);
};