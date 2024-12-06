import java.util.Scanner;

public class FactorionInTwoclass {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isFactorion(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit of the range: ");
        int lower_limit = sc.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upper_limit = sc.nextInt();

        System.out.println("Factorion numbers in the range:");
        boolean found = false;

        for (int i = lower_limit; i <= upper_limit; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found.");
        }

        sc.close();
    }
}
