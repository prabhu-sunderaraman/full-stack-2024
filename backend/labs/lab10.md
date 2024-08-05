
* Let's create a simple table named "accounts" with the following structure:

```
Column Name	Data Type	Description

account_id	INT	Unique identifier for the account
account_holder	VARCHAR(50)	Name of the account holder
balance	DECIMAL(10,2)	Account balance
account_type	VARCHAR(20)	Type of account (checking, savings, etc.)
```

### ToDo

* Insert at least 5 records into the "accounts" table with different values for each column.

```
account_id	account_holder	balance	account_type

1	John Doe	1500.00	checking
2	Jane Smith	2200.50	savings
3	Michael Johnson	500.25	checking
4	Emily Brown	3500.75	savings
5	David Lee	1200.00	checking

```

#### Data Retrieval

* Retrieve all records from the "accounts" table.
* Retrieve only the account_holder and balance columns for all accounts.
* Retrieve accounts with a balance greater than 1000.
* Retrieve accounts of type "checking".
* Retrieve accounts ordered by balance in descending order.
* Retrieve the top 3 accounts with the highest balance.

#### Data Modification
* Update the balance of an account with a specific account_id.
* Change the account_type of an account to "savings".

#### Data Deletion
Delete an account with a specific account_id.

