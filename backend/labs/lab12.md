#### Let's create the following tables

```
accounts (account_id, account_holder, balance, account_type)
persons (id int primary key auto_increment, name varchar, age int)
cars (id primary key auto_increment, model varchar, year int)
aadhar (id, aadhar_number)
```

#### Relate these tables

```
avoid duplication
maintain atomicity for example don't do this (column called cars (bmw, ferrari))
```

* one person has many cars (*or many cars can be owned by a person*) - **many-to-one** or **one-to-many**
* many persons can own many accounts(*one person can own many accounts; one account can be owned by many persons*) **many-to-many**
* each person has one aadhar card **one-to-one**



