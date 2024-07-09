import { DisplayComment } from "./DisplayComment";

export const Display = ({data}) => {
    return (<div>
        { data.name ? `Hi ${data.name}. You are ${data.age} years old` : ''}
        <DisplayComment age={data.age}/>
    </div>);
};

//export default Display;