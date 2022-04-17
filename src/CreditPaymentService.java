public class CreditPaymentService {
    public double loanAmount;
    public double yearPercents;
    public int month;

    public double calculate(double loanAmount, double yearPercents, int month) {
        double monthlyPercentage = yearPercents / 100 / 12;
        return loanAmount * (monthlyPercentage + monthlyPercentage / (Math.pow(1+monthlyPercentage, month)-1 ));
    }
}
