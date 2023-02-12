import java.util.Scanner;

public class TaxSaver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "|---------------------------------------------------------------------------------------------------|");
        System.out.println(
                "|                                        !! TAX SAVER !!                                            |");
        System.out.println(
                "|---------------------------------------------------------------------------------------------------|");

        System.out.print("| * Enter your tax income -> ");
        double taxIncome = scan.nextDouble();

        System.out.print("| * Enter the investment amount for Equity Linked Saving Scheme (ELSS) -> ");
        double investmentELSS = scan.nextDouble();

        System.out.print("| * Enter the investment amount for Public Provident Fund (PPF) -> ");
        double investmentPPF = scan.nextDouble();

        System.out.print("| * Enter the investment amount for National Pension Scheme (NPS) -> ");
        double investmentNPS = scan.nextDouble();

        System.out.print("| * Enter the investment amount for Home Loan Principal Repayment -> ");
        double investmentHomeLoan = scan.nextDouble();

        double totalInvestment = investmentELSS + investmentPPF + investmentNPS + investmentHomeLoan;
        double taxableIncome = taxIncome - totalInvestment;
        double tax = taxableIncome * 0.3;
        System.out.println(
                "|---------------------------------------------------------------------------------------------------|");
        System.out.println(
                "| * Your taxable income after investing in various funds, schemes, and loans is -> " + taxableIncome
                        + " Rs");
        System.out.println("| * Your tax after investing in various funds, schemes, and loans is -> " + tax
                + " Rs");
        System.out.println(
                "| * You have saved " + (taxIncome - tax) / taxIncome * 100
                        + "% tax");
        System.out.println(
                "|---------------------------------------------------------------------------------------------------|");
    }
}
