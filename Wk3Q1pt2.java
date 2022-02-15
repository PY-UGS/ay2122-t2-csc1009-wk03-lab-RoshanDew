import java.util.Scanner;

public class Wk3Q1pt2 {
        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            
            //Step 1: Read inputs from keyboard
            System.out.print("Enter annual interest rate, for example 8.25(%): ");
            double annualInterestRate = input.nextDouble() / 100;
            
            System.out.print("Enter number of years as an integer: ");
            int numberOfYears = input.nextInt();
            
            System.out.print("Enter loan amount: ");
            double loanAmount = input.nextDouble();
            
            //Step 2: Create a Loan object
            Wk3Q1pt1 loan = new Wk3Q1pt1(annualInterestRate, numberOfYears, loanAmount);
            
            //Step 3: Print monthly payment and total payment
            System.out.println("The loan was created on " + loan.loanDate);
            System.out.println("The monthly payment is " + loan.getMonthlyPayment());
            System.out.println("The total payment is " + loan.getTotalPayment());

            input.close(); 
        }
    
    }
