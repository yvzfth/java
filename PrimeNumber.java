import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();


        for (int i = 2; i <= number; i++) {

            System.out.println(isPrime(i));
        }
        input.close();
    }

    public static String isPrime(int number) {
        Boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        String prime = isPrime ? "The number " + number + " is prime." : "The number " + number + " is not prime.";
        return prime;
    }
}