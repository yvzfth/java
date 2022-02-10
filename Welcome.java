import java.text.NumberFormat;
import java.util.Scanner;

// Chapter 1: Programming Exercises, page 30.

// 1.1 Write a program that displays Welcome to Java, Welcome to Computer Science and Programming is fun.

// public class Welcome {
//     public static void main(String[] args){
//         System.out.println("Welcome to Java");
//         System.out.println("Welcome to Computer Science");
//         System.out.println("Programming is fun");

//     }
// }

// 1.2 Write a program that displays Welcome to Java five times.

// public class Welcome {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Welcome to Java");
//         }
//     }
// }

// 1.3 Write a program that displays JAVA in multi-line string.

// public class Welcome {
//     public static String javaAscii() {
//     return """
//             J      A     V     V     A     
//             J     A A     V   V     A A  
//         J   J    A A A     V V     A A A  
//          J J    A     A     V     A     A  

//         """;
// }
//     public static void main(String[] args) {
//         System.out.println(javaAscii());
//     }
// }

// 1.4 Write a program that displays following table.
// a   a^2  a^3
// 1    1    1 
// 2    4    8
// 3    9    27
// 4    16   64

// public class Welcome {
//     public static String aPower() {
//     return """
// a   a^2  a^3
// 1    1    1 
// 2    4    8
// 3    9    27
// 4    16   64
//         """;
// }
//     public static void main(String[] args) {
//         System.out.println(aPower());
//     }
// }

// 1.5 Write a program that displays the results of
// (9.5 * 4.5 - 2.5 * 3)/ (45.5 - 3.5)

// public class Welcome {
//     public static void main(String[] args) {
//         System.out.println((9.5 * 4.5 - 2.5 * 3)/ (45.5 - 3.5));
//     }
// }

// 1.6 Write a program that displays the result of
// 1 + 2 + .... 9

// public class Welcome {
//     public static void main(String[] args) {
//         int result = 0;
//         for (int i = 1; i < 10; i++) {
//             result += i;
//         }
//         System.out.println(result);
//     }
// }

// 1.7 pi can be computed using the following formula
// pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11...)

// public class Welcome {
//     public static void main(String[] args) {
//         // 2.9760461760461765
//         double pi=0;
//         int count = 0;
//         for (int i = 1; i < 13; i += 2) {
//             count++;
//             pi += count % 2 == 0 ? -1 * (1.0) / i : (1.0) / i;
//         }
//         System.out.println(pi * 4.0);
//         // 3.2837384837384844
//         pi = 0;
//         count = 0;
//         for (int i = 1; i < 15; i += 2) {
//             count++;
//             pi += count % 2 == 0 ? -1 * (1.0) / i : (1.0) / i;
//         }
//         System.out.println(pi * 4.0);
//         // six digits correct 3.1415928535897395
//         pi = 0;
//         count = 0;
//         for (int i = 1; i < 10000003; i += 2) {
//             count++;
//             pi += count % 2 == 0 ? -1 * (1.0) / i : (1.0) / i;
//         }
//         System.out.println(pi * 4.0);

//     }
// }

// 1.8 Write a program that displays the area and perimeter of circle that has radius of 5.5 using the following formula:
// perimeter = 2 * pi * radius
// area = radius * radius * pi 

// public class Welcome {
//     public static void main(String[] args) {
//         final double radius = 5.5;

//         double perimeter = 2 * Math.PI * radius;
//         double area = radius * radius * Math.PI;

//         System.out.println("perimeter: " + perimeter);
//         System.out.println("area: " + area);
//     }
// }

// 1.9 Write a program that displays the area and perimeter of rectangle with the width of 4.5 and height of 7.9

// public class Welcome {
//     public static void main(String[] args) {
//         final double width = 4.5;
//         final double height = 7.9;

//         final double perimeter = 2 * (width + height);
//         final double area = width * height;
//         System.out.println("perimeter: " + perimeter);
//         System.out.println("area: " + area);
//     }
// }

// 1.10 Assume a runner runs 14 km in 45 min and 30 sec.
// Write a program that displays the avarage speed in miles per hour. 1 mile = 1.6 km.

// public class Welcome {
//     public static void main(String[] args) {
//         final double miles = 14.0 / 1.6;
//         final double runTimeHour = (45.0 * 60.0 + 30.0) / 3600.0;
//         final double avarageSpeed = miles / runTimeHour;
//         System.out.println("Avarage Speed: " + avarageSpeed);
//     }
// }

// 1.11 The U.S. Census Bureau projects population based on the following assumptions:
// One birth every 7 seconds
// One death every 13 seconds
// One new immigrant every 45 seconds
// Write a program to display population for each of the next five years. 
// Assume the current population is 312032486 and one year has 365 days.

// public class Welcome {
//     public static void main(String[] args) {
//         int currentPopulation = 312032486;
//         int birthRange = 7;
//         int deathRange = 13;
//         int immigrantRange = 45;
//         int fiveYears = 365 * 5;
//         int fiveYearsSec = fiveYears * 24 * 60 * 60;
//         int birthsInFiveYears = fiveYearsSec / birthRange;
//         int deathsInFiveYears = fiveYearsSec / deathRange;
//         int immigrantsInFiveYears = fiveYearsSec / immigrantRange;
//         int populationAfterFiveYears = currentPopulation + birthsInFiveYears + immigrantsInFiveYears
//                 - deathsInFiveYears;
//         System.out.println("Population After Five Years: " + populationAfterFiveYears); 

//     }
// }

// 1.12 Assume a runner runs 24 miles in 1 hour, 40 minutes and 35 seconds.
// Write a program that displays the avarage speed in kilometers per hour. 1 miles = 1.6 km 

// public class Welcome {
//     public static void main(String[] args) {
//         final int distanceMiles = 24;
//         final double distanceKm = distanceMiles * 1.6;
//         final double runTimeHour = 1 + (40 * 60 + 35) / 3600.0;
//         final double avarageSpeed = distanceKm / runTimeHour;
//         System.out.println("Avarage Speed: " + avarageSpeed);

//     }
// }

// 1.13 Write a program that solves the following equation and displays the value for x and y:
// 3.4x + 50.2y = 44.5 
// 2.1x + 0.55y = 5.9
// You can use Cramer's rule to solve the following 2x2 system of linear equation:
// ax + by = e     
// cx + dy = f 
// x = (ed - bf) / (ad - bc)
// y = (af - ec) / (ad - bc)

// public class Welcome {
//     public static void main(String[] args) {
//         final double a = 3.4;
//         final double c = 2.1;
//         final double b = 50.2;
//         final double d = 0.55;
//         final double e = 44.5;
//         final double f = 5.9;
//         final double x = (e * d - b * f) / (a * d - b * c);
//         final double y = (a * f - e * c) / (a * d - b * c);
//         System.out.println("x: " + x);
//         System.out.println("y: " + y);
//     }
// }
public class Welcome {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("principal :- ");
        int principal = input.nextInt();
        System.out.print("Annual Interest Rate :- ");
        float annualInterest = input.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        System.out.print("years :- ");
        byte year = input.nextByte();
        int numberOfPayment = year * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment))
                / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("mortgage :- " + mortgageFormatted);
        input.close();
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter loan amount: ");
        // double loan = input.nextDouble();
        // System.out.print("\nEnter number of installments: ");
        // int months = input.nextInt();
        // System.out.print("\nEnter annual interest rate: ");
        // double annualInterest = input.nextDouble();
        // double monthlyInterest = annualInterest / 1200;
        // double installmentAmount = loan * ((monthlyInterest * Math.pow(1 + monthlyInterest, months))
        //         / (Math.pow(1 + monthlyInterest, months) - 1));
        // double totalPayBack = months * installmentAmount;
        // System.out.println("Total payment back: " + totalPayBack);
        // System.out.println("Installment Amount: " + installmentAmount);
        // input.close();
    }
}