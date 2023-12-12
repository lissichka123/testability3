
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int annuityPayment = (int) service.calculate(9.99, 1_000_000, 3);
        System.out.println(annuityPayment);
    }
}