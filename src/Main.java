public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        service.loanAmount = 1000000;
        service.yearPercents = 9.99;
        service.month = 12;
        int monthlyPayment = (int) service.calculate(1000000, 9.99, 12);
        System.out.println("Ежемесячный платеж составляет = " + monthlyPayment + "рублей");
        int monthlyPayment2 = (int) service.calculate(1000000, 9.99, 24);
        System.out.println("Ежемесячный платеж составляет = " + monthlyPayment2 + "рублей");
        int monthlyPayment3 = (int) service.calculate(1000000, 9.99, 36);
        System.out.println("Ежемесячный платеж составляет = " + monthlyPayment3 + "рублей");
    }
}
