package day04.ex07;

/**
 * Simple program to test the methods of the Mortgage class.
 */
public class MortgageTester {

  public static void main(String[] args) {
    MortgageTester tester = new MortgageTester();
    tester.launch();
  }

  private void launch() {
    Mortgage myMortgage = new Mortgage();
    System.out.print("Please enter the total amount you wish to borrow for a"
        + "mortgage: ");
    myMortgage.setLoanAmount(Integer.parseInt(System.console().readLine()));
    System.out.print("Now, enter over how many years you wish to pay it back: ");
    myMortgage.setYears(Integer.parseInt(System.console().readLine()));
    System.out.print("Finally, please enter the fixed-term interest rate: ");
    myMortgage.setInterestRate(Double.parseDouble(System.console().readLine()));
    myMortgage.setTotalToPay();
    myMortgage.setYearlyPayment();
    System.out.println("The total amount to pay on the mortgage is £"
        + myMortgage.getTotalToPay() + ".");
    System.out.println("The yearly payment amount is £"
        + myMortgage.getYearlyPayment() + ".");
    System.out.println("The interest will be paid off after "
        + myMortgage.yearsOfInterest() + " years.");
  }
}
