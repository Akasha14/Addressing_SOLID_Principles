Use Case: A Payment System that handles multiple payment methods (e.g., credit card, cash), does tax calculations, and generates bills.

Principles Chosen
1. SRP:
  - Adhering to SRP ensures that each class is focused on a single responsibility, reducing complexity and making the code easier to maintain.
  - Applied in the project by seperating the god class OrderValidator into BillGenerator, OrderValidator, and TaxCalculator, each having their own responsibility.

2. OCP:
  - Following OCP allows new functions to be added without changing existing code, reducing the risk of creating bugs and making the system more independant.
  - Applied in the project by changing the TaxCalculator, which must be updated everytime a new tax is added, and creating a TaxRule interface,
    allowing new tax types to be implemented as separate classes without modifying the TaxCalculator.

3. ISP:
  - ISP ensures that interfaces service only the specific needs of each client, reducing unnecessary dependencies and code.
  - Applied in the project by splitting the broad PaymentInterface into the specific CardInterface and CashInterface, so each class only implements what it needs.
