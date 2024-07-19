import { render, screen } from '@testing-library/react';
import App from './App';

test('page contains a heading', () => {
   render(<App/>);
   const h3Element =  screen.getByText('React testing');
   expect(h3Element).toBeInTheDocument();
});
