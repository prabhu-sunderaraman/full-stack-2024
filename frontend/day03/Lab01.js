const account = {
    balance: 10000,
    withdrawCount: 0,
    withdrawLimit: 3,
    transactions: [],

    deposit(amount) {
        this.balance += amount;
        this.transactions.push({
            //"amount": amount,
            amount,
            "date": new Date(),
            "type": "CREDIT"
        });
    },
    withdraw(amount) {
        if(this.balance < amount) {
            console.log("Insufficient balance");
        } else {
            this.balance -= amount;
            this.transactions.push({
                amount,
                "date": new Date(),
                "type": "DEBIT"
            });
            this.withdrawCount++;
            if(this.withdrawCount > this.withdrawLimit) {
                let fee = amount * 0.005;
                this.balance -= fee;
                this.transactions.push({
                    amount: fee,
                    "date": new Date(),
                    "type": "WITHDRAW FEE"
                }); 
            }    
        }
    },
    printStatement() {
        console.log("======STATEMENT=======");
        this.transactions.forEach(txn => {
            console.log(`Type: ${txn.type}, Amount: ${txn.amount}, Date: ${txn.date.toISOString()}`);
        });
    }
};

account.deposit(1000);
account.deposit(1000);
account.withdraw(100);
account.withdraw(100);
account.withdraw(100);
account.withdraw(400);
console.log(`Balance: ${account.balance}`);
account.printStatement();