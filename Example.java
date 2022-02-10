import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int max = max(num1, num2);
        int min = min(num1, num2);
        System.out.println("Greatest Common Divisor: " + greatestCommonDivisor(min, max));
        System.out.println("Least Common Multiplication: " + leastCommonMultiplication(min, max));
        input.close();
    }

    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }


    public static int greatestCommonDivisor(int min, int max) {
        if (min == max) return max;
        int gcd = 1;
        for (int i = min; i > 0; i--) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static int leastCommonMultiplication(int min, int max) {
        if (min == max) return min;

        int lcm = max * min;
        for (int i = max; i <= lcm; i++) {
            if (i % min == 0 && i % max == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
    }
}
