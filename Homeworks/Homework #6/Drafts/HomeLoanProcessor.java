/**
 * Processes an application for a home loan
 * @author Rohan Athalye
 */
public class HomeLoanProcessor
{
    private double loanAmount;
    private double annualIncome;
    private int yearsAtCurrentAddress;

    /**
     * Constructs a HomeLoanProcessor with the given loan amount, annual income, and years at the current address.
     * @param loanAmount amount of the loan.
     * @param annualIncome annual household income.
     * @param yearsAtCurrentAddress the number of years a person has lived at the current address.
     */
    public HomeLoanProcessor(double loanAmount, double annualIncome, int yearsAtCurrentAddress)
    {
        if (loanAmount <= 0 || annualIncome <= 0 || yearsAtCurrentAddress <= 0)
        {
            loanAmount = 0;
            annualIncome = 0;
            yearsAtCurrentAddress = 0;
        }

        this.loanAmount = loanAmount;
        this.annualIncome = annualIncome;
        this.yearsAtCurrentAddress = yearsAtCurrentAddress;
    }

    /**
     * Gets the annual household income of the applicant.
     * @return the annual household income of the applicant.
     */
    public double getAnnualIncome()
    {
        return this.annualIncome; 
    }

    /**
     * Sets a new annual household income for the applicant.
     * @param income the new annual household income for the applicant.
     */
    public void setAnnualIncome(double income)
    {
        if (income <= 0)
        {
            this.loanAmount = 0;
            this.annualIncome = 0;
            this.yearsAtCurrentAddress = 0;
        }

        else
        {
            this.annualIncome = income;
        }
    }

    /**
     * Sets a new loan amount for the applicant.
     * @param amount the new loan amount for the applicant.
     */
    public void setLoanAmount(double amount)
    {

    }

    /**
     * Determines if the applicant's application meets the stated requirements for a loan to be granted.
     * @return true if the application meets the stated requirements and false otherwise.
     */
    public boolean loanGranted()
    {
        return false;
    }

    /**
     * Gets the loan amount
     * @return the amount of this loan
     */
    public double getLoanAmount()
    {
        return this.loanAmount;
    }

    /**
     * gets the number of years at the current address
     * @return the number of years at the current address
     */
    public int getYearsAtCurrentAddress()
    {
        return this.yearsAtCurrentAddress;
    }

}