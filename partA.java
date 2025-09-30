package Practice1.PartA;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to stop):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Parsing string to int and autoboxing to Integer
                int num = Integer.parseInt(input);
                numbers.add(num); // Autoboxing: int → Integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        // Calculating sum using unboxing
        int sum = 0;
        for (Integer num : numbers) { // Unboxing: Integer → int
            sum += num;
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}