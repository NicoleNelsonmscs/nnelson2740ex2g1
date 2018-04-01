import java.text.NumberFormat;

public class WhileFutureValue {
    public static void main() {
        int i = 1;
        int months = 36;
        double monthlyInterestRate = .06/12;
        double monthlyInvestment = 100.0;
        double futureValue = 0.0;
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        while (i <= months) {
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
            System.out.println("Month: " + Integer.toString(i) + "\tValue: " + currency.format(futureValue));
            i++;
        }
        System.out.println("\nValue after " + Integer.toString(i) + " months:  " + currency.format(futureValue));
    }
}
