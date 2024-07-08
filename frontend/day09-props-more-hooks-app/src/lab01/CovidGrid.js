import { CovidGridRowItem } from "./CovidGridRowItem";

export const CovidGrid = ({data, onCovidGridRowItemClicked}) => {
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
                    data.map(item => <CovidGridRowItem key={item.country} covidDataItem={item} onCovidGridRowItemClicked={onCovidGridRowItemClicked}/>)
                }
            </tbody>
        </table>
    </div>);
};