class Transaction {
    constructor(amount, type) {
        this.amount = amount;
        this.type = type;
        this.date = new Date();
    }
}

class Account {
    constructor(initialBalance) {
        this.balance = initialBalance;
        this.withdrawCount = 0;
        this.withdrawLimit = 3;
        this.transactions = [];
    }
    deposit(amount) {
        this.balance += amount;
        this.transactions.push(new Transaction(amount, "CREDIT"));
    }
    withdraw(amount) {
        if(this.balance < amount) {
            console.log("Insufficient balance");
        } else {
            this.balance -= amount;
            this.transactions.push(new Transaction(amount, "DEBIT"));
            this.withdrawCount++;
            if(this.withdrawCount > this.withdrawLimit) {
                let fee = amount * 0.005;
                this.balance -= fee;
                this.transactions.push(new Transaction(fee, "WITHDRAW FEE"));
            }    
        }
    }
    printStatement() {
        console.log("======STATEMENT=======");
        this.transactions.forEach(txn => {
            console.log(`Type: ${txn.type}, Amount: ${txn.amount}, Date: ${txn.date.toISOString()}`);
        });
    }
}

console.log("**********ACCOUNT 1");
const account1 = new Account(10000);
account1.deposit(1000);
account1.deposit(1000);
account1.withdraw(100);
account1.withdraw(100);
account1.withdraw(100);
account1.withdraw(100);
account1.printStatement();
console.log(`Account 1 Balance: ${account1.balance}`);

console.log("**********ACCOUNT 2");
const account2 = new Account(200000);
account2.deposit(1000);
account2.deposit(1000);
account2.withdraw(100);
account2.withdraw(100);
account2.withdraw(100);
account2.withdraw(100);
account2.printStatement();
console.log(`Account 2 Balance: ${account2.balance}`);