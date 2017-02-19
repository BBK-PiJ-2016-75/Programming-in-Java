package com.github.bbkpij201675.programminginjava.day04.ex07;

/**
 * Program to calculate how much one would have to pay when taking out a
 * mortgage of a given amount at a given interest rate, over a specific
 * period of time.
 */
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

  /**
   * Sets the total amount of the loan to pay back by multiplying the
   * requested amount by the interest rate.
   */
  public void setTotalToPay() {
    double total = Math.round((double) loanAmount * (1 + (interestRate / 100))
        * 100) / 100.0;
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

  /**
   * Calculates how many years will be needed to pay off only the loan interest.
   * @return the number of years needed to pay the interest off.
   */
  public double yearsOfInterest() {
    double interestYears = Math.round(((totalToPay - (double) loanAmount)
        / yearlyPayment) * 100) / 100.0;
    return interestYears;
  }
}
