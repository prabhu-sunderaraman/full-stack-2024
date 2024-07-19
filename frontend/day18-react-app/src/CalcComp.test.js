import { fireEvent, render, screen } from '@testing-library/react';
import CalcComp from './CalcComp';
import userEvent from '@testing-library/user-event';

beforeEach(() => {
   render(<CalcComp/>);
});

describe('heading tests', () => {
   test('page contains a heading', () => {
      const heading = screen.getByText('Calculator');
      expect(heading).toBeInTheDocument();
   });
   
   test('page contains a custom heading', () => {
      render(<CalcComp title="TGIF"/>);
      const heading = screen.getByText('TGIF');
      expect(heading).toBeInTheDocument();
   });
      
});

describe('UI components exist', () => {
   test('page contains two number text boxes', () => {
      const textbox1 = screen.getByPlaceholderText('number 1');
      const textbox2 = screen.getByPlaceholderText('number 2');
      expect(textbox1).toBeInTheDocument();
      expect(textbox2).toBeInTheDocument();
   });
   
   test('page contains add button', () => {
      //const addButton = screen.getByText('Add');
      const addButton = screen.getByTestId("addButton");
      expect(addButton).toBeInTheDocument();
   });
      
});

describe('add, subtract, multiply user actions', () => {
   test('enter values and click add button', async () => {
      const textbox1 = screen.getByTestId('number1Text');
      const textbox2 = screen.getByTestId('number2Text');
      await fireEvent.change(textbox1, {target: {value: 10}});
      await fireEvent.change(textbox2, {target: {value: 20}});
      const addButton = screen.getByTestId("addButton");
      await userEvent.click(addButton);
      const message = screen.getByText('Sum of 10 and 20 is 30');
      expect(message).toBeInTheDocument();
   });
   
   test('enter values and click subtract button', async () => {
      const textbox1 = screen.getByTestId('number1Text');
      const textbox2 = screen.getByTestId('number2Text');
      await fireEvent.change(textbox1, {target: {value: 10}});
      await fireEvent.change(textbox2, {target: {value: 20}});
      const subtractButton = screen.getByTestId("subtractButton");
      await userEvent.click(subtractButton);
      const message = screen.getByText(/difference of 10 and 20 is -10/i);
      expect(message).toBeInTheDocument();
   });

   test('enter values and click multiply button', async () => {
      const textbox1 = screen.getByTestId('number1Text');
      const textbox2 = screen.getByTestId('number2Text');
      await fireEvent.change(textbox1, {target: {value: 10}});
      await fireEvent.change(textbox2, {target: {value: 20}});
      const multiplyButton = screen.getByTestId("multiplyButton");
      await userEvent.click(multiplyButton);
      const message = screen.getByText(/product of 10 and 20 is 200/i);
      expect(message).toBeInTheDocument();
   });
      
});




