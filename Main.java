package com.transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		List<TransactionDetails> transactionList = new ArrayList<>();
		transactionList.add(new TransactionDetails(1, 10000, "s1", "d1", "CREDIT", null, "2020-12-01 22:43:50"));
		transactionList.add(new TransactionDetails(2, 20000, "s2", "d2", "DEBIT", null, "2020-12-01 22:43:50"));
		transactionList.add(new TransactionDetails(3, 30000, "s2", "s1", "CREDIT", null, "2020-12-01 22:43:50"));
		transactionList.add(new TransactionDetails(4, 40000, "s3", "d2", "CREDIT", null, "2020-12-01 22:43:50"));
		transactionList.add(new TransactionDetails(5, 50000, "d1", "s1", "CREDIT", null, "2020-12-01 22:43:50"));
		Operations ops = new Operations();
		ops.display(transactionList);
	}
}// End of main() method
