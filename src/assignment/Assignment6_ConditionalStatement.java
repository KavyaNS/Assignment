package assignment;

public class Assignment6_ConditionalStatement {

	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;

		if (creditScore >750) {
			System.out.println("Loan approved");
		}
		else if(creditScore >= 650 && creditScore <=750 ) {
			if (income >= 50000.0 && isEmployed==true ) {
				if (debtToIncomeRatio<40.0)
					System.out.println("Loan approved");
			}
			else
				System.out.println("Loan Denied");
		}
		else {
		System.out.println("Loan Denied");
		}
	}

}
