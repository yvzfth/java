/**
 * ■ The data fields hour, minute, and second that represent a time.
 * ■ A no-arg constructor that creates a Time object for the current time. (The
 * values of the data fields will represent the current time.)
 * ■ A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * ■ A constructor that constructs a Time object with the specified hour, minute,
 * and second.
 * ■ Three getter methods for the data fields hour, minute, and second,
 * respectively.
 * ■ A method named setTime(long elapseTime) that sets a new time for the
 * object using the elapsed time. For example, if the elapsed time is 555550000
 * milliseconds, the hour is 10, the minute is 19, and the second is 10.
 * Draw the UML diagram for the class then implement the class. Write a
 * test program that creates three Time objects (using new Time(), new
 * Time(555550000), and new Time(5, 23, 55)) and displays their hour,
 * minute, and second in the format hour:minute:second.
 * (Hint: The first two constructors will extract the hour, minute, and second
 * from the elapsed time. For the no-arg constructor, the current time can be
 * obtained using System.currentTimeMillis(), as shown in Listing 2.7,
 * ShowCurrentTime.java. Assume the time is in GMT.)
 */
public class Time {
    long milliseconds;
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.milliseconds = System.currentTimeMillis();
        this.hours = hours(this.milliseconds);
        this.minutes = minutes(this.milliseconds);
        this.seconds = seconds(this.milliseconds);
    }

    public Time(long millisec) {
        this.milliseconds = millisec;
        this.hours = hours(this.milliseconds);
        this.minutes = minutes(this.milliseconds);
        this.seconds = seconds(this.milliseconds);
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setTime(long millisec) {
        this.milliseconds = millisec;
        this.hours = hours(this.milliseconds);
        this.minutes = minutes(this.milliseconds);
        this.seconds = seconds(this.milliseconds);
    }


    public static int hours(long milliseconds) {
        int hours = (int) ((milliseconds / 3600000) % 24);
        return hours;
    }

    public static int minutes(long milliseconds) {
        int minutes = (int) ((milliseconds / 60000) % 60);
        return minutes;
    }

    public static int seconds(long milliseconds) {
        int seconds = (int) ((milliseconds / 1000) % 60);
        return seconds;
    }

    public static void main(String[] args) {
        Time time = new Time();
        Time time1 = new Time(555550000);
        Time time2 = new Time(5, 23, 39);
        Time time3 = new Time();
        time3.setTime(555550000);
        System.out.println(time.hours + ":" + time.minutes + ":" + time.seconds);
        System.out.println(time1.hours + ":" + time1.minutes + ":" + time1.seconds);
        System.out.println(time2.hours + ":" + time2.minutes + ":" + time2.seconds);
        System.out.println(time3.hours + ":" + time3.minutes + ":" + time3.seconds);
    }
}