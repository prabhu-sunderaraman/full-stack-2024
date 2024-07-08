export const DisplayComment = ({age}) => {
    if(age) {
        if(age >= 70) {
            return <h5>You are too old to drive!</h5>
        } else {
            return <h6>Cool! Just be careful. Don't rash drive</h6>
        }
    } else {
        return (<span/>);
    }
    
}