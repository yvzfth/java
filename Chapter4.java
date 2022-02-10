import java.util.Locale;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Chapter4 {
    /** *4.2 (Geometry: great circle distance) The great circle distance is the distance between 
     two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
     geographical latitude and longitude of two points. The great circle distance between
     the two points can be computed using the following formula:
     d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
     Write a program that prompts the user to enter the latitude and longitude of two
     points on the earth in degrees and displays its great circle distance. The average
     radius of the earth is 6,371.01 km. Note you need to convert the degrees into
     radians using the Math.toRadians method since the Java trigonometric methods
     use radians. The latitude and longitude degrees in the formula are for north
     and west. Use negative to indicate south and east degrees. */
    // public static void main(String[] args) {
    //     final double RADIUS_EARTH = 6371.01;
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     System.out.print("Enter ponit 1 (lat,long) in degrees: ");
    //     double lat1 = Math.toRadians(input.nextDouble()), long1 = Math.toRadians(input.nextDouble());
    //     System.out.print("Enter ponit 2 (lat,long) in degrees: ");
    //     double lat2 = Math.toRadians(input.nextDouble()), long2 = Math.toRadians(input.nextDouble());
    //     double distance = RADIUS_EARTH * Math
    //             .acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));

    //     System.out.println("The distance between the two points is " + distance + " km");
    //     input.close();
    // }

    /** *4.3 (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; 
     Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure
     in Section 4.1 to compute the estimated area enclosed by these four cities.
     (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
     between two cities. Divide the polygon into two triangles and use the formula in
     Programming Exercise 2.19 to compute the area of a triangle.)*/

    // public static void main(String[] args) {
    //     double[] orlando = { 28.5383355, -81.3792365 };
    //     double[] atlanta = { 33.7489954, -84.3879824 };
    //     double[] charlotte = { 35.2270869, -80.8431267 };
    //     double[] savannah = { 32.0835407, -81.0998342 };
    //     double triangleArea1 = triangleArea(orlando, atlanta, charlotte);
    //     double triangleArea2 = triangleArea(savannah, atlanta, charlotte);
    //     System.out.println("Bounded Area: " + (triangleArea1 + triangleArea2));
    // }

    // public static double triangleArea(double[] city1, double[] city2, double[] city3) {
    //     double[][] cities = { city1, city2, city3 };
    //     double[] lines = new double[3];
    //     double perimeter = 0.0;
    //     for (int i = 0; i < 3; i++) {
    //         double line = 0;
    //         if(i == 2)
    //             line = Math
    //                 .sqrt(Math.pow(cities[i][0] - cities[0][0], 2) + Math.pow(cities[i][1] - cities[0][1], 2));
    //         else
    //             line = Math
    //                 .sqrt(Math.pow(cities[i][0] - cities[i + 1][0], 2) + Math.pow(cities[i][1] - cities[i + 1][1], 2));

    //         lines[i] = line;
    //         perimeter += line;
    //     }
    //     double area = Math.sqrt(perimeter * (perimeter - lines[0]) * (perimeter - lines[1]) * (perimeter - lines[2]));
    //     return area;
    // }
    /** *4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon 
     in which all sides are of the same length and all angles have the same degree (i.e.,
     the polygon is both equilateral and equiangular). The formula for computing the
     area of a regular polygon is
     Area = (n * Math.pow(s, 2))  / (4 *Math.tan(Math.PI/n))
     Here, s is the length of a side. Write a program that prompts the user to enter the
     number of sides and their length of a regular polygon and displays its area.
     */
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in).useLocale(Locale.US);
    //     System.out.print("Enter the number of sides: ");
    //     int sides = input.nextInt();
    //     System.out.print("Enter the side: ");
    //     double sideLength = input.nextDouble();
    //     double area = (sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / sides));
    //     System.out.println("The area of the polygon is: " + area);
    //     input.close();
    // }
    /** *4.6 (Random points on a circle) Write a program that generates three random points 
     on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
     formed by these three points, as shown in Figure 4.4a. Display the angles in
     degrees. (Hint: Generate a random angle a in radians between 0 and 2pi, as shown
     in Figure 4.4b and the point determined by this angle is r^x * cos(alpha), r^x * sin(alpha)).) */
    // A degree = A degree * pi / 180 degree  => 0.0175 rad
    // public static void main(String[] args) {
    //     double[][] coordinates = new double[3][2];
    //     double[] side = new double[3];
    //     double radius = 40;
    //     for (int i = 0; i < 3; i++) {
    //         double randomRadians = (int)(Math.random() * 360) * Math.PI/180;
    //         double x = radius * Math.cos(randomRadians);
    //         double y = radius * Math.sin(randomRadians);
    //         coordinates[i][0] = x;
    //         coordinates[i][1] = y;
    //     }
    //     for (int i = 0; i < 3; i++) {

    //         double line = 0;
    //         if (i == 2)
    //             line = Math.sqrt(Math.pow(coordinates[i][0] - coordinates[0][0], 2)
    //                     + Math.pow(coordinates[i][1] - coordinates[0][1], 2));
    //         else
    //             line = Math.sqrt(Math.pow(coordinates[i][0] - coordinates[i + 1][0], 2)
    //                     + Math.pow(coordinates[i][1] - coordinates[i + 1][1], 2));

    //         side[i] = line;
    //     }
    //     double cosA = (-Math.pow(side[0], 2) + Math.pow(side[1], 2) + Math.pow(side[2], 2)) / (2 * side[1]* side[2]);
    //     double cosB = (-Math.pow(side[1], 2) + Math.pow(side[0], 2) + Math.pow(side[2], 2)) / (2 * side[0]* side[2]);
    //     double cosC = (-Math.pow(side[2], 2) + Math.pow(side[0], 2) + Math.pow(side[1], 2)) / (2 * side[0]* side[1]);

    //     final double A = Math.round(Math.acos(cosA)* 180/Math.PI);
    //     final double B = Math.round(Math.acos(cosB)* 180/Math.PI);
    //     final double C = Math.round(Math.acos(cosC)* 180/Math.PI);
    //     System.out.println("A: " + A + " B: " + B + " C: " + C);       
    // }
    /** *4.7 (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point 
     at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
     the user to enter the radius of the bounding circle of a pentagon and displays the
     coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use
     console format to display two digits after the decimal point. */
    // public static void main(String[] args) {
    //     DecimalFormat df = new DecimalFormat("0.00");
    //     double degree = 18;
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter the radius of the bounding circle: ");
    //     double radius = input.nextDouble();
    //     df.setRoundingMode(RoundingMode.HALF_EVEN);
    //     for (int i = 0; i < 5; i++) {

    //         double randomRadians = degree * Math.PI / 180;
    //         double x = radius * Math.cos(randomRadians);
    //         double y = radius * Math.sin(randomRadians);

    //         degree += 72;
    //         System.out.print("(" + df.format(x) + ", ");
    //         System.out.print(df.format(y) + ")");
    //         System.out.println();
    //     }

    //     input.close();
    // }
    /** *4.8 (Find the character of an ASCII code) Write a program that receives an ASCII code 
     (an integer between 0 and 127) and displays its character */
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter ASCII code: ");
    //     final byte ASCII = input.nextByte();
    //     char character = (char) ASCII;
    //     System.out.println("The character for ASCII code: " + ASCII + " is "+ character);
    //     input.close();
    // }
    /** *4.9 (Find the Unicode of a character) Write a program that receives a character and 
     displays its Unicode */
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter a character: ");
    //     char character = input.next().charAt(0);
    //     byte unicode = (byte) character;
    //     System.out.println("The Unicode for the character " + character + " is "+ unicode);
    //     input.close();
    // }
    /** *4.11 (Decimal to hex) Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number. For an incorrect 
     input number, display invalid input. */
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter a decimal value: ");
    //     int decimal = input.nextInt();
    //     System.out.println(Integer.toHexString(decimal));
    //     input.close();
    // }
    /** *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and 
     check whether the letter is a vowel or consonant. For a nonletter input, display
     invalid input. */
    // public static void main(String[] args) {
    //     char[] vowel = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter a letter: ");
    //     char letter = input.next().charAt(0);

    //     if ((byte) letter > 64 && (byte) letter < 91 || (byte) letter > 96 && (byte) letter < 123)
    //         if (java.util.Arrays.binarySearch(vowel, letter) >= 0)
    //             System.out.println(letter + " is a vowel");
    //         else
    //         System.out.println(letter + " is a consonant");
    //     else
    //         System.out.println(letter + " is an invalid input");
    //     input.close();
    // }
    /** *4.18 (Student major and status) Write a program that prompts the user to enter two 
     characters and displays the major and status represented in the characters. The
     first character indicates the major and the second is a number character 1, 2, 3, or
     4, which indicates whether a student is a freshman, sophomore, junior, or senior.
     Suppose that the following characters are used to denote the majors:
     M: Mathematics
     C: Computer Science
     I: Information Technology */
    // public static void main(String[] args){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter two characters: ");
    //     String response = input.next();
    //     String major = String.valueOf(response.charAt(0));
    //     int status = Integer.parseInt(String.valueOf(response.charAt(1)));
    //     HashMap<String,String> map = new HashMap<String,String>();
    //     map.put("M", "Mathematics");
    //     map.put("C", "Computer Science");
    //     map.put("I", "Information Technology");
    //     HashMap<Integer,String> map2 = new HashMap<Integer,String>();
    //     map2.put(1, "Freshman");
    //     map2.put(2, "Sophomore");
    //     map2.put(3, "Junior");
    //     map2.put(4, "Senior");
    //     Set<String> keys = map.keySet();
    //     if(keys.contains(major))
    //         for (String key : map.keySet()) {
    //             if (major.equals(key)) {

    //                 if(status == 1)
    //                     System.out.println(map.get(key) + " " + map2.get(1));
    //                 else if(status == 2)
    //                     System.out.println(map.get(key) + " " + map2.get(2));
    //                 else if(status == 3)
    //                     System.out.println(map.get(key) + " " + map2.get(3));
    //                 else if (status == 4)
    //                     System.out.println(map.get(key) + " " + map2.get(4));
    //                 else
    //                     System.out.println("Invalid Status input");
    //                 break;
    //             }
    //         }
    //     else
    //         System.out.println("Invalid Major input");

    //     input.close();
    // }
    /** *4.24 (Order three cities) Write a program that prompts the user to enter three cities 
     and displays them in ascending order. */
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter the first city: ");
    //     String city1 = input.next(); 
    //     System.out.print("Enter the first city: ");
    //     String city2 = input.next();
    //     System.out.print("Enter the first city: ");
    //     String city3 = input.next();
    //     String[] cities = { city1, city2, city3 };
    //     java.util.Arrays.sort(cities);
    //     for(String city : cities)
    //         System.out.println(city);
    //     input.close();
    // }
    /** *4.25 (Generate vehicle plate numbers) Assume that a vehicle plate number consists 
     of three uppercase letters followed by four digits. Write a program to generate a
     plate number */
    // public static void main(String[] args) {
    //     System.out.println(plateString() + " " + plateNumber());
    // }

    // public static String plateString() {
    //     String letters = "";
    //     for (int i = 0; i < 3; i++) {

    //         char aLetter = (char) ((int) (64 + Math.random() * 27));
    //         letters += (String.valueOf(aLetter));
    //     }
    //     return letters;
    // }

    // public static String plateNumber() {
    //     String numbers = "";
    //     for (int i = 0; i < 4; i++) {

    //         byte num =   (byte) (Math.random() * 10);
    //         numbers += String.valueOf(num);
    //     }
    //     return numbers;
    // }

}