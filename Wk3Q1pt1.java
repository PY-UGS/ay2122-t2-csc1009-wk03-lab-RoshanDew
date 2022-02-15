import java.util.Date;

public class Wk3Q1pt1 {
	
	//Step 1: Declare data attributes
	public double annualInterestRate;
	public int numberOfYears;
	public double loanAmount;
	public Date loanDate;
	
	//Step 2: Create Loan()
	public Wk3Q1pt1() {
		
	}
	
	//Step 3: Loan(...)
	public Wk3Q1pt1(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = new Date();
	}

	//Step 4: getMonthlyPayment()
	public double getMonthlyPayment() {
		double monthlyPayment;
		
		//Step 4a: Compute monthly interest rate
		double monthlyInterestRate = annualInterestRate / 12;
		
		
		//Step 4b: compute monthly payment
		monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		return monthlyPayment;
	}
	
	//Step 5: getTotalPayment()
	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12;
	}
	
}