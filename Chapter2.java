import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.Scanner;

// Listing 2.9 ComputeLoan page 61

// Stage 1: Requirements Specifications
// The program must satisfy following requirements:
//      It must let the user enter the interset rate, the loan amount,
//     and the number of years for which payments will be made.
//      It must compute and display the monthly payment and total payment amounts.

// Stage 2: System Analysis
// The output is the monthly payment and total payment, which can be obtained using the following formulas:
// monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))
// totalPayment = monthlyPayment * numberOfYears * 12
// Stage 3: System Design
// During system design, you identify the steps in the program.
// Step 1.  Prompt the user to enter the annual interest rate, the number of years, and the
//         loan amount.
//         (The interest rate is commonly expressed as a percentage of the principal for a period of
//         one year. This is known as the annual interest rate.)
// Step 2.  The input for the annual interest rate is a number in percent format, such as
//         4.5%. The program needs to convert it into a decimal by dividing it by 100. To
//         obtain the monthly interest rate from the annual interest rate, divide it by 12,
//         since a year has 12 months. So, to obtain the monthly interest rate in decimal
//         format, you need to divide the annual interest rate in percentage by 1200. For
//         example, if the annual interest rate is 4.5%, then the monthly interest rate is
//         4.5/1200 = 0.00375.
// Step 3. Compute the monthly payment using the preceding formula.
// Step 4.  Compute the total payment, which is the monthly payment multiplied by 12 and
//         multiplied by the number of years.
// Step 5. Display the monthly payment and total payment.

// Stage 4: Imlemenation
// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter annual interest rate, e.g., 7.25%: ");

//         double annualInterestRate = input.nextDouble();
//         double monthlyInterestRate = annualInterestRate / 1200;
//         System.out.println("Enter number of years as an integer, e.g., 5: ");
//         int numberOfYears = input.nextInt();
//         System.out.println("Enter loan amount, e.g., 12000: ");
//         double loanAmount = input.nextDouble();
//         double monthlyPayment = loanAmount * monthlyInterestRate
//                 / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
//         double totalPayment = monthlyPayment * numberOfYears * 12;
//         System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
//         System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);

//         input.close();
//     }
// }

// Listing 2.10 Counting Monetary Units. page 63

// 1. Prompt the user to enter the amount as a decimal number, such as 11.56.
// 2. Convert the amount (e.g., 11.56) into cents (1156).
// 3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
// the cents remainder 100.
// 4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
// cents using the remaining cents remainder 25.
// 5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
// cents using the remaining cents remainder 10.
// 6. Divide  the  remaining  cents  by  5  to  find  the  number  of  nickels.  Obtain  the  remaining
// cents using the remaining cents remainder 5.
// 7. The remaining cents are the pennies.
// 8. Display the result.

// public class Chapter2 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the amount as a decimal number, such as 11.56: ");

//         double centsDouble = input.nextDouble();
//         int cents = (int) (centsDouble * 100);
//         int dollars = cents / 100;
//         cents %= 100;
//         int quarters = cents/ 25;
//         cents %= 25;
//         int dimes = cents / 10;
//         cents %= 10;
//         int nikles = cents / 5;
//         int pennies = cents % 5;
//         System.out.println("dollars: " + dollars);
//         System.out.println("quarters: " + quarters);
//         System.out.println("dimes: " + dimes);
//         System.out.println("nikles: " + nikles);
//         System.out.println("pennies: " + pennies);
//         input.close();
//
//     }
// }
// -----------------------------------
// Decimal place 2 digits

// DecimalFormat df = new DecimalFormat();
// df.setMaximumFractionDigits(2);
// System.out.println(df.format(decimalNumber));
// -----------------------------------

// Chapter 2: Programming Exercises

// 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
// double value from the console, then converts it to Fahrenheit, and displays the
// result.
// The formula for the conversion is as follows:
// fahrenheit = (9 / 5) * celsius + 32

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter Celsius Degree convert it to Fahrenheit");
//         double celsius = input.nextDouble();
//         double fahrenheit = (9.0 / 5) * celsius + 32;
//         System.out.println("celsius: " + celsius + " to " + "fahrenheit: " + fahrenheit);
//         input.close();
//     }
// }

// 2.2 (Compute the volume of a cylinder) Write a program that reads in the radius
// and length of a cylinder and computes the area and volume using the following
// formulas:
// area = radius * radius * π
// volume = area * length

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         DecimalFormat df = new DecimalFormat();
//         df.setMaximumFractionDigits(2);

//         System.out.println("Enter radius and length of the cylinder");
//         double radius = input.nextDouble(), length = input.nextDouble();
//         double area = radius * radius * Math.PI;
//         double volume = area * length;
//         System.out.println(df.format(area));
//         System.out.println(df.format(volume));
//         input.close();

//     }
// }

// 2.3 (Convert feet into meters) Write a program that reads a number in feet, converts it
// to meters, and displays the result. One foot is 0.305 meter

// public class Chapter2 {
//     public static void main(String[] args) {
//         final double FOOT_METER= 0.305;
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter feet to convert it to meters: ");
//         double feet = input.nextDouble();
//         double meters = feet * FOOT_METER;
//         System.out.println(feet + " feet is " + meters + " meters.");
//         input.close();

//     }
// }

// 2.4 (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
// The program prompts the user to enter a number in pounds, converts it
// to kilograms, and displays the result. One pound is 0.454 kilogram.

// public class Chapter2 {
//     public static void main(String[] args) {
//         final double POUND = 0.454;
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter pound to convert it to kilometers: ");
//         double pound = input.nextDouble();
//         double kilogram = pound * POUND;
//         System.out.println(pound + " pound is " + kilogram + " kilogram.");
//     }
// }

// *2.5 (Financial application: calculate tips) Write a program that reads the subtotal
// and the gratuity rate, then computes the gratuity and total. For example, if the
// user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
// as gratuity and $11.5 as total

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter subtotal and gratuity rate: ");

//         double subtotal = input.nextDouble();
//         double gratuityRate = input.nextDouble();
//         double total = subtotal + (gratuityRate * subtotal / 100);
//         System.out.println("Total: $" + total);
//         input.close();
//     }
// }

// **2.6 (Sum the digits in an integer) Write a program that reads an integer between 0
// and 1000 and adds all the digits in the integer. For example, if an integer is 932,
// the sum of all its digits is 14.
// Hint: Use the % operator to extract digits, and use the / operator to remove the
// extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter an integer: ");
//         String numberString = input.nextLine();
//         String[] numberStringArr = numberString.split("");
//         int sum = 0;

//         for (String i : numberStringArr) {
//             int digit = Integer.parseInt(i);
//             sum += digit;
//         }
//         System.out.println("Sum of the digits in the integer: " + sum);
//         input.close();
//     }
// }

// *2.7 (Find the number of years) Write a program that prompts the user to enter the
// minutes(e.g.,1 billion),and displays the maximum number of years and remaining days
// for the minutes. For simplicity, assume that a year has 365 days.

// public class Chapter2{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the number of minutes: ");
//         int minutes = input.nextInt();
//         final int YEAR = 365;
//         final int DAY = 24;
//         final int HOUR = 60;

//         int days = (minutes / (HOUR * DAY)) % YEAR;
//         int years = (minutes / (HOUR * DAY * YEAR));

//         System.out.println("years: " + years + " days: " + days);
//         input.close();

//     }
//  }

// *2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
// the current time in GMT. Revise the program so it prompts the user to enter the
// time zone offset to GMT and displays the time in the specified time zone.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter GMT time zone: ");
//         ZonedDateTime date = ZonedDateTime.now(ZoneId.of("GMT"+input.nextLine()));
//         System.out.println("Current time: " + date.getHour() + ":" + date.getMinute());
//         input.close();
//     }
// }

// 2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity
// divided by the time taken to make the change, as given by the following formula:
// a = (v1 - v0) / t
//
// Write a program that prompts the user to enter the starting velocity v0 in meters/
// second, the ending velocity v1 in meters/second, and the time span t in seconds,
// then displays the average acceleration

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out
//                 .println("Enter starting velocity (m/s), ending velocity (m/s) and time span in seconds to calculate avarage acceleration: ");
//         double v0 = input.nextDouble(), v1 = input.nextDouble(), time = input.nextDouble();
//         double acceleration = (v1 - v0) / time;
//         System.out.println("acceleration: " + acceleration);
//         input.close();

//     }
// }

// 2.10 (Science: calculating energy) Write a program that calculates the energy needed
// to heat water from an initial temperature to a final temperature. Your program
// should prompt the user to enter the amount of water in kilograms and the initial
// and final temperatures of the water. The formula to compute the energy is
// Q = M * (finalTemperature – initialTemperature) * 4184
// where M is the weight of water in kilograms, initial and final temperatures are in
// degrees Celsius, and energy Q is measured in joules.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the amount of water in kg, initial temperature and final temperature.");
//         double weight = input.nextDouble(), initialTemperature = input.nextDouble(),
//                 finalTemperature = input.nextDouble();
//         double energy = weight * (finalTemperature - initialTemperature) * 4184;
//         System.out.println("The energy needed is: " + energy + "joules");
//         input.close();
//     }
// }

// 2.11 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
// to enter the number of years and display the population after the number of years.
// Use the hint in Programming Exercise 1.11 for this program.

// public class Chapter2 {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the number of years: ");
//         long years = scanner.nextInt();
//         long currentPopulation = 312032486;
//         long birthRange = 7;
//         long deathRange = 13;
//         long immigrantRange = 45;
//         long daysInYears = 365 * years;
//         long seconds = daysInYears * 24 * 60 * 60;
//         long birthsInYears = seconds / birthRange;
//         long deathsInYears = seconds / deathRange;
//         long immigrantsInYears = seconds / immigrantRange;
//         long populationAfterYears = currentPopulation + birthsInYears + immigrantsInYears - deathsInYears;
//         System.out.println("Population After " + years + " Years: " + populationAfterYears);
//         scanner.close();

//     }
// }

// 2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
// speed v, you can compute the minimum runway length needed for an airplane to
// take off using the following formula:
// length = v^2/2a

// Write a program that prompts the user to enter v in meters/second (m/s) and
// the acceleration a in meters/second squared (m/s^2), then, displays the minimum
// runway length.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter speed and acceleration: ");
//         double speed = scanner.nextDouble(), acceleration = scanner.nextDouble();
//         double length = Math.pow(speed, 2) / 2 * acceleration;
//         System.out.println("Min runway length: " + length);
//         scanner.close();

//     }
// }

// **2.13 (Financial application: compound value) Suppose you save $100 each month into
// a savings account with an annual interest rate of 5%. Thus, the monthly interest
// rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
// 100 * (1 + 0.00417) = 100.417
// After the second month, the value in the account becomes
// (100 + 100.417) * (1 + 0.00417) = 201.252
// After the third month, the value in the account becomes
// (100 + 201.252) * (1 + 0.00417) = 302.507
// and so on.
// Write a program that prompts the user to enter a monthly saving amount and displays
// the account value after the sixth month. (In Programming Exercise 5.30, you
// will use a loop to simplify the code and display the account value for any month.)

// public class Chapter2 {
//     public static void main(String[] args) {
//         final double INTEREST_RATE = 0.00417;
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter monthly saving amount: ");
//         double savingAmount = scanner.nextDouble();
//         double finalAmount = 0;
//         for (int i = 0; i < 6; i++) {
//             finalAmount = (finalAmount + savingAmount) * (1 + INTEREST_RATE);
//         }
//         DecimalFormat df = new DecimalFormat();
//         df.setMaximumFractionDigits(2);
//         System.out.println("Final Amount After Six Months: $" + df.format(finalAmount));
//         scanner.close();

//     }
// }

// *2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
// health on weight.It can be calculated by taking your weight in kilograms and dividing,
// by the square of your height in meters. Write a program that prompts the user to
// enter a weight in pounds and height in inches and displays the BMI. Note one pound
// is 0.45359237 kilograms and one inch is 0.0254 meters.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter weight in pounds and height in inches: ");
//         double weightPound = scanner.nextDouble(), heightInch = scanner.nextDouble();
//         double weightKg = weightPound * 0.45359237, heightMeter = heightInch * 0.0254;
//         double bmi = weightKg / (heightMeter * heightMeter);
//         System.out.println("bmi: " + bmi);
//         scanner.close();

//     }
// }

// 2.15 (Geometry: distance of two points) Write a program that prompts the user to
// enter two points(x1,y1)and(x2,y2)and displays their distance.
// The formula for computing the distance is
// sqrt((x2 - x1)^2 + (y2 - y1)^2)
// Note you can use Math.pow(a, 0.5) to compute sqrt(a)

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter x1 and y1: ");
//         double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
//         System.out.println("Enter x2 and y2: ");
//         double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();
//         double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
//         System.out.println("Distance: " + distance);
//         scanner.close();
//     }
// }

//  (Geometry: area of a hexagon) Write a program that prompts the user to enter the
// side of a hexagon and displays its area. The formula for computing the area of a
// hexagon is
// Area = (s^2 * 3 * sqrt(3)) / 2

// where s is the length of a side.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the side of a hexagon: ");
//         double side = scanner.nextDouble();
//         double area = (Math.pow(side, 2) * 3 * Math.sqrt(3)) / 2;
//         System.out.println("Area of hexagon: " + area);
//         scanner.close();
//     }
// }

// *2.17 (Science: wind-chill temperature) How cold is it outside? The temperature alone is
// not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside. In 2001,
// the National Weather Service (NWS) implemented the new wind-chill temperature
// to measure the coldness using temperature and wind speed. The formula is
// twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
// where ta is the outside temperature measured in degrees Fahrenheit, v is the speed
// measured in miles per hour, and twc is the wind-chill temperature. The formula cannot
// be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.
// Write a program that prompts the user to enter a temperature between -58°F
// and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill
// temperature. Use Math.pow(a, b) to compute v0.16

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//         System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
//         double temperature = scanner.nextDouble();
//         System.out.println("Enter the wind speed (>=2) in miles per hour: ");
//         double windSpeed = scanner.nextDouble();
//         double tempWindChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
//         System.out.println("Temperature Wind Chill: " + tempWindChill);
//         scanner.close();
//     }
// }

// 2.18 (Print a table) Write a program that displays the following table. Cast
// floating-point numbers into integers.
//  a b pow(a, b)
//  1 2 1
//  2 3 8
//  3 4 81
//  4 5 1024
//  5 6 15625

// public class Chapter2 {
//     public static void main(String[] args) {

//         System.out.println("a  b  pow(a, b)");
//         for (int i = 0; i < 6; i++) {
//             System.out.println(i + "  " + (i + 1) + "  " + Math.round(Math.pow(i, i + 1)));
//         }
//     }
// }

// *2.19 (Geometry: area of a triangle) Write a program that prompts the user to enter
// three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays
// its area. The formula for computing the area of a triangle is
// s = (side1 + side2 + side3)/2;
// area = sqrt(s(s - side1)(s - side2)(s - side3))

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//         System.out.println("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
//         double x1 = scanner.nextDouble(), y1 = scanner.nextDouble(), x2 = scanner.nextDouble(), y2 = scanner.nextDouble(), x3 = scanner.nextDouble(), y3 = scanner.nextDouble();
//         double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
//         double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
//         double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
//         double sides = (side1 + side2 + side3) / 2;
//         double area = Math.sqrt(sides * (sides - side1) * (sides - side2) * (sides - side3));
//         System.out.println("Area: " + area);
//         scanner.close();
//     }
// }

// *2.20(Financial application:calculate interest)If you know the balance and the
// annual percentage interest rate, you can compute the interest on the next monthly
// payment using the following formula:
// interest = balance * (annualInterestRate/1200)
// Write a program that reads the balance and the annual percentage interest rate
// and displays the interest for the next month.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//         System.out.println("Enter balance and interest rate: ");
//         double balance = scanner.nextDouble();
//         double annualInterestRate = scanner.nextDouble();
//         double interest = balance * (annualInterestRate / 1200);
//         System.out.println("Interest: " + interest);
//         scanner.close();
//     }
// }


// *2.21 (Financial application: calculate future investment value) Write a program that
// reads in investment amount,annual interest rate,and number of years and displays
// the future investment value using the following formula:
// futureInvestmentValue =
// investmentAmount * pow((1 + monthlyInterestRate), numberOfYears*12)
// For example, if you enter amount 1000, annual interest rate 3.25%, and number
// of years 1, the future investment value is 1032.98.


// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//         System.out.println("Enter investment amount: ");
//         double investmentAmount = scanner.nextDouble();
//         System.out.println("Enter annual interest rate in percentage: ");
//         double annualInterestRate = scanner.nextDouble();
//         System.out.println("Enter number of years:");
//         double numberOfYears = scanner.nextDouble();
//         double monthlyInterestRate =  annualInterestRate/1200;
//         double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
//         System.out.println("Future Investment Value: " + futureInvestmentValue);
//         scanner.close();
//     }
// }

// *2.22 (Financial application: monetary units) Rewrite Listing 2.10,
// ComputeChange.java, to fix the possible loss of accuracy when converting
// a double value to an int value. Enter the input as an integer whose last
// two digits represent the cents. For example, the input 1156 represents 11
// dollars and 56 cents

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in).useLocale(Locale.US);
//         System.out.println("Enter the amount as a decimal number, such as 11.56: ");

//         double centsDouble = input.nextDouble();
//         int cents = (int)Math.round(centsDouble * 100);
//         System.out.println(cents);
//         int dollars = cents / 100;
//         cents %= 100;
//         int quarters = cents/ 25;
//         cents %= 25;
//         int dimes = cents / 10;
//         cents %= 10;
//         int nikles = cents / 5;
//         int pennies = cents % 5;


//         System.out.println("dollars: " + dollars);
//         System.out.println("quarters: " + quarters);
//         System.out.println("dimes: " + dimes);
//         System.out.println("nikles: " + nikles);
//         System.out.println("pennies: " + pennies);
//         input.close();
//     }
// }

// *2.23 (Cost of driving) Write a program that prompts the user to enter the distance to
// drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
// then displays the cost of the trip.

// public class Chapter2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

//         System.out.println("Enter the driving distance: ");
//         double distance = scanner.nextDouble();
//         System.out.println("Enter miles per gallon: ");
//         double gallon = scanner.nextDouble();
//         System.out.println("Enter price per gallon: ");
//         double price = scanner.nextDouble();

//         double costOfTrip = (distance / gallon ) * price;
//         System.out.println("Cost of trip: " + costOfTrip);
//         scanner.close();

//     }
// }