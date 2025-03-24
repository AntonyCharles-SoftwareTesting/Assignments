package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		
        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;
        
        System.out.println("Checking loan eligibility for: " + customerName);
        
        if (creditScore > 750) {
            System.out.println("Loan Approved: Excellent credit score.");
        } else if (creditScore >= 650 && creditScore <= 750) {
            if (income >= 50000) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40) {
                        System.out.println("Loan Approved: Meets all conditions.");
                    } else {
                        System.out.println("Loan Denied: High debt-to-income ratio.");
                    }
                } else {
                    System.out.println("Loan Denied: Unemployed.");
                }
            } else {
                System.out.println("Loan Denied: Income too low.");
            }
        } else {
            System.out.println("Loan Denied: Poor credit score.");
        }
    }
}
