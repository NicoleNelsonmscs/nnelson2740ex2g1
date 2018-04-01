import java.text.NumberFormat;

public class ForFutureValue {
    public static void main() {
        //int i = 1;
        int months = 36;
        double monthlyInterestRate = .06/12;
        double monthlyInvestment = 100.0;
        double futureValue = 0.0;
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
            System.out.println("Month: " + Integer.toString(i) + "\tValue: " + currency.format(futureValue));
        }

        //System.out.println("\nValue after " + Integer.toString(i) + " months:  " + currency.format(futureValue));
    }
}
