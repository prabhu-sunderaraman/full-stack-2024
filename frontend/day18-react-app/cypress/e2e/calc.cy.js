beforeEach(() => {
  cy.visit('http://localhost:3000')
});

describe('contains UI controls', () => {
  it('should have a heading h3', () => {
    cy.get('h3').should('have.text', 'React testing');
  });

  it('should have Calc', () => {
    cy.get('h1').should('have.text', 'Calculator');
  });

  it('should have Calc HTML components', () => {
    cy.get('[data-testid="number1Text"]').should('exist');
    cy.get('[data-testid="number2Text"]').should('exist');
    cy.get('[data-testid="addButton"]').should('exist');
    cy.get('[data-testid="subtractButton"]').should('exist');
    cy.get('[data-testid="multiplyButton"]').should('exist');
    cy.get('[data-testid="divideButton"]').should('exist');
  });
});

describe('Calc actions', () => {
  
  it('displays the sum of two numbers', () => {
    cy.get('[data-testid="number1Text"]').type('10');
    cy.get('[data-testid="number2Text"]').type('20');
    cy.get('[data-testid="addButton"]').click();
    cy.get('h4').should('have.text', 'Sum of 10 and 20 is 30');
  });

  it('displays the difference of two numbers', () => {
    cy.get('[data-testid="number1Text"]').type('10');
    cy.get('[data-testid="number2Text"]').type('20');
    cy.get('[data-testid="subtractButton"]').click();
    cy.get('h4').should('have.text', 'Difference of 10 and 20 is -10');
  });
})