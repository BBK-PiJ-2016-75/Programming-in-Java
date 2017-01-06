public class Mortgage {
  private int loanAmount = 0;
  private int years = 0;
  private double interestRate = 0.0;
  private double totalToPay = 0.0;
  private double yearlyPayment = 0.0;
  
  public void setLoanAmount(int amount) {
    this.loanAmount = amount;
  }
  
  public void setYears(int years) {
    this.years = years;
  }
  
  public void setInterestRate(double rate) {
    this.interestRate = rate;
  }
  
  public void setTotalToPay() {
    double total = Math.round((double) loanAmount * (1 + (interestRate / 100)) * 100) / 100.0;
    this.totalToPay = total;
  }
  
  public void setYearlyPayment() {
    double yearly = totalToPay / (double) years;
    this.yearlyPayment = yearly;
  }
  
  public double getTotalToPay() {
    return totalToPay;
  }
  
  public double getYearlyPayment() {
    return yearlyPayment;
  }
  
  public double yearsOfInterest() {
    double interestYears = Math.round(((totalToPay - (double) loanAmount) / yearlyPayment) * 100) / 100.0;
    return interestYears;
  }
}