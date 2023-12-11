// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int timeYear = 2;
        double yearPercent = 9.99;
        int creditSum = 10000000;
        double annuityPayment = service.calculate(yearPercent, creditSum, timeYear);
        System.out.println(annuityPayment);
        }
    }