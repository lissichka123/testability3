public class CreditPaymentService {
    public double calculate(double yearPercents, double creditSum, double timeYear) {
        double monthPercent = yearPercents / 100 / 12;
        double timeMonth = timeYear * 12;
        double x = Math.pow(monthPercent + 1, timeMonth);
        double annuityRate = (monthPercent * x) / (x - 1);
        double annuityPayment = (creditSum * annuityRate);
        return (annuityPayment);
    }
    }


