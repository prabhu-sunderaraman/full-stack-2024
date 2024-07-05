import CompA from "./CompA";
import CompB from "./CompB";

const Parent = () => {
    return (<div>
        <CompA/>
        <hr/>
        <CompB/>
    </div>);
};

export default Parent;