import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] pricesA;
        pricesA = new double[4];

        double[] pricesB = new double[4];

        String[] titles = new String[3];
        Product[] products = new Product[5];
        final int TITLE_COUNT = 100;
        String[] titlesB = new String[TITLE_COUNT];

//        Scanner sc = new Scanner(System.in);
//        int titleCount = sc.nextInt();
//        String[] titlesC = new String[titleCount];

        pricesA[0] = 14.95;
        pricesA[1] = 12.95;
        pricesA[2] = 11.95;
        pricesA[3] = 9.95;

        String[] names = new String[3];
        names[0] = "Ted Lewis";
        names[1] = "Sue Jones";
        names[2] = "Ray Thomas";

        products[0] = new Product();
        products[0].setDescription("java");
        products[1] = new Product();
        products[1].setDescription("jsps");

        double[] pricesC = {14.95, 12.95, 11.95, 9.95};

        String[] namesB = {"Ted Lewis", "Sue Jones", "Ray Thomas"};
        Product[] productsB = {new Product(), new Product()};

        for (int i = 0; i < pricesC.length; i++) {
            System.out.println(pricesC[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < pricesC.length; i++) {
            sum += pricesC[i];
        }
        System.out.println("Average price: " + sum / pricesC.length);

        sum = 0.0;
        for (double price : pricesC) {
            System.out.println(price);
            sum += price;
        }
        System.out.println("Average price: " + sum / pricesC.length);

        int[] quantities = new int[5];
        Arrays.fill(quantities, 1);

        int[] numbersB = {2, 6, 4, 1, 8, 5, 9, 3, 7, 0};
        Arrays.sort(numbersB);
        for (int number : numbersB) {
            System.out.print(number + " ");
        }
        System.out.println();

        double[] grades = {92.3, 88.0, 95.2, 90.5};
        double[] percentages = grades;
        percentages[1] = 70.2;
        System.out.println("grades[1] = " + grades[1]);

        if (grades == percentages) {
            System.out.println("Both variables refer to the same array.");
        }
        else {
            System.out.println("Different arrays.");
        }

        if (Arrays.equals(grades, percentages)) {
            System.out.println("Both variables contain the same values.");
        }
        else {
            System.out.println("Different arrays.");
        }

        // create array of 11 random integers
        int[] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 51);  // num is >= 0 and <= 50
        }

        // sort the array
        Arrays.sort(numbers);

        // display numbers
        String numbersString = "";
        for (int number : numbers) {
            numbersString += number + " ";
        }
        System.out.println("Numbers: " + numbersString);

        // calculate total and display
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total: " + total);

        // get count of numbers and display
        int count = numbers.length;
        System.out.println("Count: " + count);

        // calculate average and display
        double average = (double) total / count;
        average = (double) Math.round(average * 10) / 10;
        System.out.println("Average: " + average);

        // if count of numbers is odd
        if (count % 2 != 0) {
            int medianIndex = count / 2;
            int median = numbers[medianIndex];
            System.out.println("Median: " + median);
        }
    }
}
