# CSC 241 Class Associations
In this assignment, you will create a set of Java classes with associations between them. We are going to use these classes to simulate the data used by a fictional on-line retailer. These will allow us to work with information about customers and the products they purchase.

Read the specification below for each Java class. Empty source files for each class have been placed in the `src/main/java/associations` folder, and you should edit each as necessary. Each of these class definitions will require instance variables, so you should determine the name and type of each to support the required methods. In general, all instance variables should be declared `private`. Make sure to follow the exact naming conventions listed in the specification.

## Specification

### Customer
This class represents a person who will purchase products. Implement each of these methods
- getLastName() - Returns a String that is the customer’s last name
- getFirstName() - Returns a String that is the customer’s first name
- getStreetAddress() - Returns a String indicating the customer’s street address
- getZipCode() - Returns a String indicating the customer’s zip code
- setAccount(Account a) - Sets the Account for this customer
- getAccount() - Returns a reference to the Account object associated with this customer
- A constructor that initializes the last name, first name, address, and zip code.

### Account
This class represents an account used by a customer to pay for purchases. Implement each of the following methods.
- getAccountNumber() - Returns a String representing the account number.
- getCustomer() - Returns a reference to the Customer object associated with this account
- getBalance() - Returns the available balance (may be a decimal value)
- A constructor that initializes the account number and Customer, and sets the balance to zero.

### Product
This class represents a product carried by the retailer.
- getProductName() - Returns a String that is the name of the product
- getIsbn() - Returns a String representing the ISBN (bar code) number
- getUnitPrice() - Returns a possible decimal value indicating the unit price for each product
- A constructor method that initializes the product name, ISBN number, and unit price

### OrderItem
This class represents a set of purchased products.
- getProduct() - Returns a reference to the Product object purchased
- getQuantity() - Returns an integer indicating how many products were purchased
- getPrice() - Returns the price of this item, based on the unit price of the product and the quantity
- A constructor that initializes the product and quantity

### Order
This class represents the set of all products purchased. Note that you will need to use an internal data structure that permits the storage of multiple order items.
- getAccount() - Returns a reference to the Account object associated with this order
- addItem(OrderItem item) - Adds an order item (above) to this order
- getItems() - Returns an array of OrderItem object references listing all purchases
- getTotal() - Returns the price of all items purchased
- A constructor that initializes the account number and an empty collection of items

## Testing
When you push your code back to your repository, GitHub will initiate a series of tests to verify the correct operation of each of the methods above.
