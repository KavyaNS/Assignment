package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment7_ConditionalStatement {

	public static void main(String[] args) {
		
		List<Integer> transaction = new ArrayList<Integer>();
		transaction.add(50000);
		transaction.add(-2000);
		transaction.add(3000);
		transaction.add(-15000);
		transaction.add(-200);
		transaction.add(-300);
		transaction.add(4000);
		transaction.add(-3000);
		
		int creditCount = 0;
		int debitCount = 0;
        int totalCredit = 0;
        int totalDebit = 0;
        int suspiciousTransaction = 0;
        int totalbalance;
        
        for (int amount : transaction) {
            if (amount > 0) {
                creditCount++;
                totalCredit += amount;
            } else {
                debitCount++;
                totalDebit += amount;
            }
            
            // Checking for suspicious transactions
            if (amount >= 10000 || amount<= -10000 ) {
                System.out.println("Suspicious credit/debit Transaction with Amount: " + amount);
                suspiciousTransaction++;
            }
        }
        
        totalbalance = totalCredit+totalDebit;
        
        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total amount credited: " + totalCredit);
        System.out.println("Total amount debited: " + totalDebit);
        System.out.println("Final balance in account: " + totalbalance);
        System.out.println("Total number of suspicious transactions: " + suspiciousTransaction);

		
		

	}

}
