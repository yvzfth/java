import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;

public class Chapter5 {
    /** *5.1 (Count positive and negative numbers and compute the average of numbers) 
     Write a program that reads an unspecified number of integers, determines how
     many positive and negative values have been read, and computes the total and average
     of the input values (not counting zeros). Your program ends with the input
     0. Display the average as a floating-point number.  */
    // public static void main(String[] args) {
    //     DecimalFormat df = new DecimalFormat("0.00");
    //     df.setRoundingMode(RoundingMode.HALF_EVEN);
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     System.out.print("Enter an integer, the input ends if it is 0: ");
    //     ArrayList<Integer> numbers = new ArrayList<Integer>();
    //     while (true) {
    //         int number = input.nextInt();
    //         numbers.add(number);
    //         if (number == 0) 
    //         break;
    //     }
    //     input.close();

    //     double sum = 0.0;
    //     double average = 0;
    //     int positiveCount = 0;
    //     int negativeCount = 0;
    //     if(contains(numbers, 0)){

    //         if (numbers.get(0) == 0)
    //             System.out.println("No numbers are entered expect 0");
    //         else {
    //             for (int i = 0; i < numbers.size(); i++) {           
    //                 if (numbers.get(i) == 0) 
    //                     break;
    //                 else if (numbers.get(i) > 0)
    //                     positiveCount++;
    //                 else
    //                     negativeCount++;
    //                 sum += numbers.get(i);
    //             }
    //             average =  sum / (positiveCount + negativeCount);
    //             System.out.println("The number of positives is " + positiveCount);
    //             System.out.println("The number of negatives is " + negativeCount);
    //             System.out.println("The total is " + sum);
    //             System.out.println("The average is " + df.format(average));
    //         }
    //     }
    //     else 
    //         System.out.println("End point not found!");

    // }

    // public static Boolean contains(ArrayList<Integer> list, int val) {
    //     for (int i = 0; i < list.size(); i++)
    //         if (list.get(i) == val)
    //             return true;
    //     return false;
    // }

    // public static int[] parseIntArray(String[] numbersStr) {
    //     int[] numbers = new int[numbersStr.length];
    //     for (int i = 0; i < numbersStr.length; i++) {
    //         numbers[i] = Integer.parseInt(numbersStr[i]);
    //     }
    //     return numbers;
    // }

    /** **5.7 (Financial application: compute future tuition) Suppose the tuition for a university is $10,000 this year and increases 5% every year. In one year, the tuition will 
     be $10,500. Write a program that displays the tuition in 10 years, and the total
     cost of four years’ worth of tuition starting after the tenth year. */
    // public static void main(String[] args) {

    //     double tuition = 10000;
    //     double totalTuitionFourYear = 0;
    //     for (int i = 0; i < 14; i++) {
    //         tuition = Math.round(tuition * 1.05);
    //         if (i < 10)
    //             System.out.println(tuition);
    //         else
    //             totalTuitionFourYear += tuition;

    //     }
    //     System.out.println("Total Tuition after ten years for four years: " + totalTuitionFourYear);
    // }
    /** *5.9 (Find the two highest scores) Write a program that prompts the user to enter the 
     number of students and each student’s name and score, and finally displays the
     student with the highest score and the student with the second-highest score. Use
     the next() method in the Scanner class to read a name rather than using the
     nextLine() method. Assume that the number of students is at least 2. */
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     System.out.print("Enter the number of students: ");
    //     int numOfStudent = input.nextInt();

    //     String[][] students = new String[numOfStudent][2];
    //     String[] student = new String[numOfStudent];
    //     System.out.println("Student name and score: ");
    //     // for (int i = 0; i < numOfStudent+1; i++) {
    //     //     String[] nameAndGrade = input.nextLine().split("\\s+");
    //     //     students[i] = nameAndGrade;
    //     // }
    //     for (int i = 0; i < student.length; i++) {
    //         for (int j = 0; j < 2; j++) {
    //             String nameAndGrade = input.next();
    //             student[j] = nameAndGrade;
    //         }
    //         students[i] = student.clone();
    //     }

    //     String[] tempHigh = students[0];
    //     for (int i = 1; i < numOfStudent; i++) 
    //         if(Double.valueOf(students[i][1]) > Double.valueOf(tempHigh[1]))
    //             tempHigh = students[i];

    //     System.out.println("Highest Score: " + tempHigh[1] + " by " + tempHigh[0]);
    //     input.close();
    // }

    /** Find the highest score*/

    // public static void main(String[] args) {
    //     double[] numbers = { 1.1, 2.5, 3.4, 4.7, 5.9, 6.6, 7.5, 8.2, 0.3, -5.4, 50.1, -1.6 };
    //     System.out.println(highest(numbers));
    // }

    // public static double highest(double[] list) {
    //     double tempHigh = list[0];
    //     for (int i = 1; i < list.length; i++) {
    //         if (list[i] > tempHigh) {
    //             tempHigh = list[i];
    //         }
    //     }
    //     return tempHigh;
    // }

    /** Prime Numbers in range */

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter a range: ");
    //     int start = input.nextInt(), end = input.nextInt();
    //     List<Integer> primes = getPrimes(start, end);
    //     for (int i = 0; i < primes.size(); i++) 
    //         System.out.println(primes.get(i));

    //     input.close();
    // }

    // public static List<Integer> getPrimes(int start, int end) {
    //     List<Integer> primes = new ArrayList<Integer>();
    //     if (start < 2)
    //     start = 2;

    //     if (end < 2)
    //     return primes;

    //     for (int i = start; i<=end; i++) {
    //         Boolean isPrime = true;

    //         for (int j = 2; j <= i / 2; j++) 
    //             if (i % j == 0) {
    //                 isPrime = false;
    //                 break;
    //             }

    //         if (isPrime) 
    //             primes.add(i);
    //     }
    //     return primes;
    // }

    /** First ... times prime number */

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter the number of prime numbers you want: ");
    //     int numOfPrimes = input.nextInt();
    //     List<Integer> primes = new ArrayList<Integer>();
    //     int counter = 0;
    //     int current = 2;
    //     while (counter < numOfPrimes) {

    //         Boolean isPrime = true;
    //         for (int j = 2; j <= current / 2; j++) {
    //             if (current % j == 0) {
    //                 isPrime = false;
    //                 break;
    //             }
    //         }
    //         if (isPrime) {
    //             primes.add(current);
    //             counter++;
    //             System.out.println(current);
    //         }
    //         current++;
    //     }
    //     input.close();
    // }

    /** second highest number in a list */
    // public static void main(String[] args) {

    //     int[] myList = { 11,1, 3,3,1,2,4,6,8,1};
    //     int first;
    //     int second;
    //     if(myList.length == 0)
    //     System.out.println("There is no element in given array!");
    //     else if(myList.length == 1){
    //         first = myList[0];
    //         System.out.println("There is no second element in given array!");
    //         System.out.println("Highest number: " + first);
    //     }else {
    //         first = second = Integer.MIN_VALUE;
    //         for (int i = 0; i < myList.length; i++) {
    //             if (myList[i] > first) {
    //                 second = first;
    //                 first = myList[i];
    //             } else if (myList[i] > second && myList[i] < first) {
    //                 second = myList[i];
    //             }
    //         }
    //         if(second == first){
    //             System.out.println("There is no Second highest number!");
    //             System.out.println("Highest number: " + first);              
    //         }
    //         else
    //             System.out.println("First: " + first +" second: " + second);
    //     }
    // }
}  

