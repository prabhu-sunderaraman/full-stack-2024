package com.indium.lab04;

import java.time.LocalDateTime;

// Data holder classes; Data transfer objects (DTO)
public record AccountTransactionRecord(long accountNumber,
                                       double amount,
                                       TransactionTypeEnum transactionType,
                                       LocalDateTime time) {
}
