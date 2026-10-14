import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // Default constructor: 2.5% interest, 1 year, 1000 amount //
    public Loan() {
       this(2.5, 1, 1000);
    }

    
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(); // current date
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // monthlyPayment = (P * r) / (1 - (1 + r)^-n) //
    public double getMonthlyPayment() {
        double r = annualInterestRate / 1200;   // monthly interest rate (percent -> decimal, / 12)
        int n = numberOfYears * 12;             // total number of monthly payments
        if (r == 0) {
            return loanAmount / n;              // no interest: avoid division by zero
        }
        return (loanAmount * r) / (1 - Math.pow(1 + r, -n));
    }

    /** Total payment over the whole life of the loan */
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
