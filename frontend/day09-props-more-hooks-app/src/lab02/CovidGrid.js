import { useContext } from "react";
import { CovidGridRowItem } from "./CovidGridRowItem";
import { Lab02Context } from "./Lab02Context";

export const CovidGrid = () => {
    const {covidData} = useContext(Lab02Context);
    return (<div>
        <table style={{border: '1px solid black', 'margin': '15px'}}>
            <thead>
                <tr>
                    <th>Country</th>
                    <th>Cases</th>
                </tr>
            </thead>
            <tbody>
                {
                    covidData.map(item => <CovidGridRowItem key={item.country} covidDataItem={item}/>)
                }
            </tbody>
        </table>
    </div>);
};