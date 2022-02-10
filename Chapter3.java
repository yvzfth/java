import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Chapter3 {
    public static void print(String item) {
        System.out.println(item);
    }
    // public static void main(String[] args) {
    //     //*3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation 
    //     // ax2 + bx + c = 0 can be obtained using the following formula:
    //     // r1 = -b + sqrt(b^2 - 4ac) / 2a
    //     // r2 = -b - sqrt(b^2 - 4ac) / 2a

    //     // b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the 
    //     // equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
    //     // Write a program that prompts the user to enter values for a, b, and c and displays 
    //     // the result based on the discriminant. If the discriminant is positive, display two 
    //     // roots. If the discriminant is 0, display one root. Otherwise, display “The equation 
    //     // has no real roots.”
    //     // Note you can use Math.pow(x, 0.5) to compute sqrt(x). 
    //     DecimalFormat df = new DecimalFormat();
    //     df.setMaximumFractionDigits(2);
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     print("Enter a, b, c: ");
    //     double a = input.nextDouble();
    //     double b = input.nextDouble();
    //     double c = input.nextDouble();
    //     double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
    //     if (discriminant > 0.0) {
    //         double root1 = (-b + discriminant) / (2 * a);
    //         double root2 = (-b - discriminant) / (2 * a);
    //         print("Equation has two roots " + df.format(root1) + " and " + df.format(root2));
    //     } else if (discriminant == 0.0) {
    //         double root = (-b + discriminant) / (2 * a);
    //         print("Equation has one root " + df.format(root));

    //     } else {
    //         print("Equation has no real root ");
    //     }
    //     input.close();
    // }

    // public static void main(String[] args) {
    //     // 3.2 (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, 
    //     // generates two integers and prompts the user to enter the sum of these two integers. 
    //     // Revise the program to generate three single-digit integers and prompt the user to 
    //     // enter the sum of these three integers.
    //     int number1 = 1 + (int) (Math.random() * 10);
    //     int number2 = 1 + (int) (Math.random() * 10);
    //     int number3 = 1 + (int) (Math.random() * 10);

    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);

    //     print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
    //     int answer = input.nextInt();
    //     print( number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));

    //     input.close();
    // }

    // public static void main(String[] args) {
    //     // *3.3 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using 
    //     // Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts 
    //     // the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report 
    //     // that “The equation has no solution.”      
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     print("Enter a, b, c, d, e, f: ");
    //     final double a = input.nextDouble();
    //     final double b = input.nextDouble();
    //     final double c = input.nextDouble();
    //     final double d = input.nextDouble();
    //     final double e = input.nextDouble();
    //     final double f = input.nextDouble();
    //     if (a * d - b * c == 0) {
    //         print("The equation has no solution");
    //     } else {

    //         final double x = (e * d - b * f) / (a * d - b * c);
    //         final double y = (a * f - e * c) / (a * d - b * c);
    //         print("x: " + x);
    //         print("y: " + y);
    //     }
    //     input.close();
    // }

    // public static void main(String[] args) {
    //     // **3.4 (Random month) Write a program that randomly generates an integer between 1 
    //     // and 12 and displays the English month names January, February, . . . , December 
    //     // for the numbers 1, 2, . . . , 12, accordingly  

    //     int monthIndex = 1 + (int) (Math.random() * 12);
    //     switch (monthIndex) {
    //         case 1:
    //             print("January");
    //             break;
    //         case 2:
    //             print("February");
    //             break;
    //         case 3:
    //             print("March");
    //             break;
    //         case 4:
    //             print("April");
    //             break;
    //         case 5:
    //             print("May");
    //             break;
    //         case 6:
    //             print("June");
    //             break;
    //         case 7:
    //             print("July");
    //             break;
    //         case 8:
    //             print("August");
    //             break;
    //         case 9:
    //             print("September");
    //             break;
    //         case 10:
    //             print("October");
    //             break;
    //         case 11:
    //             print("November");
    //             break;
    //         case 12:
    //             print("December");
    //             break;

    //     }
    // }

    // public static void main(String[] args) {
    //     // *3.5 (Find future dates) Write a program that prompts the user to enter an integer for 
    //     // today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also 
    //     // prompt the user to enter the number of days after today for a future day and 
    //     // display the future day of the week.
    //     String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    //     Scanner input = new Scanner(System.in);
    //     print("Enter today's day: ");
    //     int todayIndex = input.nextInt(); 
    //     print("Enter the number of days elapsed since today: ");
    //     int daysElapsed = input.nextInt();
    //     String today = days[todayIndex % 7];
    //     String futureDay = days[(daysElapsed + todayIndex) % 7];
    //     print("Today is " + today + " and the future day is " + futureDay);
    //     input.close();
    // // }
    // public static void main(String[] args) {
    //     // 3.7 (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
    //     // java, to display the nonzero denominations only, using singular words for single 
    //     // units such as 1 dollar and 1 penny, and plural words for more than one unit such 
    //     // as 2 dollars and 3 pennies.
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     System.out.println("Enter the amount as a decimal number, such as 11.56: ");

    //     double centsDouble = input.nextDouble();
    //     int cents = (int)Math.round(centsDouble * 100);
    //     System.out.println(cents);
    //     int dollars = cents / 100;
    //     cents %= 100;
    //     int quarters = cents/ 25;
    //     cents %= 25;
    //     int dimes = cents / 10;
    //     cents %= 10;
    //     int nikles = cents / 5;
    //     int pennies = cents % 5;

    //     if (dollars > 0) {
    //         System.out.println("dollars: " + dollars);
    //     }
    //     if (quarters > 0) {
    //         System.out.println("quarters: " + quarters);
    //     }
    //     if (dimes > 0) {
    //         System.out.println("dimes: " + dimes);
    //     }
    //     if (nikles > 0) {
    //         System.out.println("nikles: " + nikles);
    //     }
    //     if (pennies > 0) {
    //         System.out.println("pennies: " + pennies);
    //     }
    //     input.close();        
    // }
    //     public static void main(String[] args) {
    //         // *3.8 (Sort three integers) Write a program that prompts the user to enter three integers 
    //         // and display the integers in non-decreasing order.
    //         Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //         print("Enter three numbers: ");
    //         double number1 = input.nextDouble(), number2 = input.nextDouble(), number3 = input.nextDouble();
    //         double[] numbers ={number1, number2, number3};
    //         Arrays.sort(numbers);
    //         for (double number : numbers) {
    //             print(Double.toString(number));
    //         }
    //         input.close();

    //     }
    // public static void main(String[] args) {
    //     // **3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
    //     // consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, 
    //     // which is calculated from the other 9 digits using the following formula:
    //     // (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
    //     // d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11
    //     // If the checksum is 10, the last digit is denoted as X according to the ISBN-10 
    //     // convention. Write a program that prompts the user to enter the first 9 digits and 
    //     // displays the 10-digit ISBN (including leading zeros). Your program should read 
    //     // the input as an integer.
    //     Scanner input = new Scanner(System.in);
    //     print("Enter the first 9 digits of an ISBN as integer: ");
    //     String digits = input.next();

    //     int digitSum = 0;
    //     for (int i = 0; i < digits.length(); i++) {
    //         int digit = Integer.valueOf(Character.toString(digits.charAt(i)));
    //         digitSum += digit * (i+1);

    //     }
    //     if (digitSum % 11 == 10) {
    //         print("ISBN-10 number is " + digits + "X");

    //     } else {
    //         print("ISBN-10 number is " + digits + (digitSum % 11));
    //     }
    //     input.close();
    // }
    // public static void main(String[] args) {
    //     // 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a 
    //     // subtraction question. Revise the program to randomly generate an addition 
    //     // question with two integers less than 100.
    //     int number1 = 1 + (int)(Math.random() * 100);        
    //     int number2 = 1 + (int)(Math.random() * 100);
    //     Scanner input = new Scanner(System.in);
    //     print(number1 + " + " + number2 + " = " + " ? ");
    //     int answer = input.nextInt();
    //     print(number1 + " + " + number2 + " = " + answer + " is " + (number1+number2 == answer));
    //     input.close();
    // }

    // public static void main(String[] args) {
    //     // *3.11 (Find the number of days in a month) Write a program that prompts the user 
    //     // to enter the month and year and displays the number of days in the month. For 
    //     // example, if the user entered month 2 and year 2012, the program should display 
    //     // that February 2012 has 29 days. If the user entered month 3 and year 2015, the 
    //     // program should display that March 2015 has 31 days.
    //     Scanner input = new Scanner(System.in);
    //     print("enter year and month: ");
    //     int year = input.nextInt(), month = input.nextInt();
    //     YearMonth yearMonthObject = YearMonth.of(year, month);
    //     int daysInMonth = yearMonthObject.lengthOfMonth();
    //     print(getMonthForInt(month - 1) + " " + year + " has " + daysInMonth + " days."); 
    //     input.close();
    // }
    // static String getMonthForInt(int num) {
    //     String month = "wrong";
    //     DateFormatSymbols dfs =  new DateFormatSymbols(Locale.US);
    //     String[] months = dfs.getMonths();
    //     if (num >= 0 && num <= 11 ) {
    //         month = months[num];
    //     }
    //     return month;
    // }

    // public static void main(String[] args) {
    //     // 3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit 
    //     // integer and determines whether it is a palindrome integer. An integer is palindrome 
    //     // if it reads the same from right to left and from left to right. A negative integer is 
    //     // treated the same as a positive integer.
    //     Scanner input = new Scanner(System.in);
    //     print("Enter three digits integer: ");
    //     String number = input.next();
    //     String[] numberList = number.split("");
    //     for(int i = 0; i < numberList.length / 2; i++){
    //         String temp = numberList[i];
    //         numberList[i] = numberList[numberList.length - i - 1];
    //         numberList[numberList.length - i - 1] = temp;
    //     }
    //     String numberReversed = "";
    //     for (String digit : numberList) {
    //         numberReversed += digit;
    //     }

    //     if (Integer.parseInt(numberReversed) == Integer.parseInt(number)) {
    //         print(number + " is a palindrome");

    //     } else {
    //         print(number + " is not a palindrome");
    //     }
    //     input.close();
    // }
    // public static void main(String[] args) {
    //     // *3.13 (Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the 
    //     // source code to compute taxes for single filers. Complete this program to compute 
    //     // taxes for all filing statuses.
    //     Scanner input = new Scanner(System.in);

    //     // Prompt the user to enter filing status
    //     System.out.print("(0-single filer, 1-married jointly or " +
    //     "qualifying widow(er), 2-married separately, 3-head of " +
    //     "household) Enter the filing status: ");

    //     int status = input.nextInt();

    //     // Prompt the user to enter taxable income
    //     System.out.print("Enter the taxable income: ");
    //     double income = input.nextDouble();

    //     // Compute tax
    //     double tax = 0;

    //     if (status == 0) { // Compute tax for single filers
    //         if (income <= 8350)
    //         tax = income * 0.10;
    //         else if (income <= 33950)
    //         tax = 8350 * 0.10 + (income - 8350) * 0.15;
    //         else if (income <= 82250)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (income - 33950) * 0.25;
    //         else if (income <= 171550)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
    //         else if (income <= 372950)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (income - 171550) * 0.33;
    //         else
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
    //     }
    //     else if (status == 1) { // Left as an exercise
    //         // Compute tax for married file jointly or qualifying widow(er)
    //         if (income <= 16700)
    //         tax = income * 0.10;
    //         else if (income <= 67900)
    //         tax = 8350 * 0.10 + (income - 8350) * 0.15;
    //         else if (income <= 137050)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (income - 33950) * 0.25;
    //         else if (income <= 208850)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
    //         else if (income <= 372950)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (income - 171550) * 0.33;
    //         else
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
    //     }
    //     else if (status == 2) { // Compute tax for married separately
    //         // Left as an exercise in Programming Exercise 3.13
    //         if (income <= 8350)
    //         tax = income * 0.10;
    //         else if (income <= 33950)
    //         tax = 8350 * 0.10 + (income - 8350) * 0.15;
    //         else if (income <= 68525)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (income - 33950) * 0.25;
    //         else if (income <= 104425)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
    //         else if (income <= 186475)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (income - 171550) * 0.33;
    //         else
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
    //     }
    //     else if (status == 3) { // Compute tax for head of household
    //         // Left as an exercise in Programming Exercise 3.13
    //         if (income <= 11950)
    //         tax = income * 0.10;
    //         else if (income <= 45500)
    //         tax = 8350 * 0.10 + (income - 8350) * 0.15;
    //         else if (income <= 117450)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (income - 33950) * 0.25;
    //         else if (income <= 190200)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
    //         else if (income <= 372950)
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (income - 171550) * 0.33;
    //         else
    //         tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
    //         (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
    //         (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
    //     }
    //     else {
    //     System.out.println("Error: invalid status");
    //     System.exit(1);
    //     }

    //     // Display the result
    //     System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    //     input.close();

    // }

    // public static void main(String[] args) {
    //     // 3.14 (Game: heads or tails) Write a program that lets the user guess whether the flip 
    //     // of a coin results in heads or tails. The program randomly generates an integer 
    //     // 0 or 1, which represents head or tail. The program prompts the user to enter a 
    //     // guess, and reports whether the guess is correct or incorrect

    //     int flipCoin = (int) (Math.random() * 2);
    //     String headsOrTails = flipCoin == 1 ? "heads" : "tails";
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     print("Heads or Tails");
    //     String answer = input.next();

    //     if (headsOrTails.equals(answer)) {
    //         print("You Win!");
    //     } else {
    //         print("You Lose!");
    //     }
    //     print("Coin: " + headsOrTails + " \n You: " + answer.toLowerCase().trim());

    //     input.close();
    // }
    public static void main(String[] args) {

        // **3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three
        // digit integer. The program prompts the user to enter a three-digit integer and 
        // determines whether the user wins according to the following rules:
        // 1. If the user input matches the lottery number in the exact order, the award is 
        // $10,000.
        // 2. If all digits in the user input match all digits in the lottery number, the award 
        // is $3,000.
        // 3. If one digit in the user input matches a digit in the lottery number, the award 
        // is $1,000.

        int number = (int) ((Math.random() * 900) + 100);
        String numberString = String.valueOf(number);
        String[] numberDigits = numberString.split("");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        print("Enter three-digit integer: ");
        String guess = input.next();
        String[] guessDigits = guess.split("");
        System.out.print(number);
        Boolean allDigits = Arrays.equals(numberDigits, guessDigits);
        Boolean oneDigit = false;
        for (String guessDigit : guessDigits) {
            for (String numberDigit : numberDigits) {
                if (Integer.valueOf(guessDigit) == Integer.valueOf(numberDigit)) {
                    oneDigit = true;

                    break;
                }
            }
        }

        if (Integer.parseInt(guess) == number) {
            print("\nYou Win $10000. Number was " + number + " , and You guessed " + guess);
        } else if (allDigits) {
            print("\nYou win $3000. Number was " + number + " , and You guessed " + guess);
        } else if (oneDigit) {
            print("\nYou win $1000. Number was " + number + " , and You guessed " + guess);
        } else {
            print("\nYou lose");
        }
        input.close();

        // input.close();
    }
}
