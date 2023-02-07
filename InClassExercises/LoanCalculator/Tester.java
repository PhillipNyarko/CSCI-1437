public class Tester {
    public static void main(String[] args){
        Loan casinoMoney = new Loan(0.06, 35, 1000000);
        System.out.println("The amount that we took out was: $" + casinoMoney.getLoanAmount());
        System.out.println("The interest rate is " + casinoMoney.getAnnualInterestRate() * 100 + "%");
        System.out.println("This will be repaid over " + casinoMoney.getNumberOfYears() + " years");
        System.out.println("This loan was started on " + casinoMoney.getLoanDate());
        System.out.println("The monthly payments will be $" + casinoMoney.getMonthlyPayment());
        System.out.println("The total payments will be $" + casinoMoney.getTotalPayment());
    }
}
