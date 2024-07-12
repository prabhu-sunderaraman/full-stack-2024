import {styled} from 'styled-components';
import Button from '../core/button/Button.styled';
import P from '../core/paragraph/Paragraph.styled';
import Input from '../core/text-input/TextInput.styled';

//css-in-javascript libraries

const MyStyledButton = styled.button`
  color: black;
  background-color: white;
  width: 200px;
  font-weight: bold;
`;

const MyCancelButton = styled(MyStyledButton)`
  color: red;
  background-color: black;
`;

const MyDiv = styled.div`
  margin: 10px;
  padding: 10px;
  border: 1px solid pink;
  width: 300px;
`;

const MyParagraph = styled.p`
  font-size: ${(props) => (props.size ? props.size : '8px')};
`;

const Lab04 = () => {
    //return (<div style={{margin: "10px", padding: "10px", width: "400px"}}>
    return (<MyDiv>

        <h4>My style guide</h4>
        <Button>Click</Button> <br/>
        <P>Paragraph</P> <br/>
        <Input type="text" placeholder="Name"></Input> <br/>
        <Input type="password" placeholder="Password"></Input> <br/>
        <hr/>

        <button style={{fontColor: 'black', backgroundColor: 'white', width: '100px'}}>Normal button</button>
        <h4>Lab04 using styled components</h4>
        <MyStyledButton onClick={() => console.log("MyStyledButton clicked")}>Styled button</MyStyledButton>
        <MyCancelButton>Cancel</MyCancelButton>
        <MyParagraph size='large'>Large paragraph</MyParagraph>
        <MyParagraph size='small'>Small paragraph</MyParagraph>
        <MyParagraph>My normal paragraph</MyParagraph>
    </MyDiv>);
};

export default Lab04;