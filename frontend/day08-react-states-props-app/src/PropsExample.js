const PropsExample = (props) => {
    console.log(props);
    return (<div>
        <h4>Props</h4>
        <p>{props.message}, {props.comment}</p>
    </div>);
};

export default PropsExample;