public class SecondsOfTheYear {
    public static void main(String[] args) {
        int daysInYear = 365;
        int secondsInMinute = 60;
        int minutesInHour = 60*secondsInMinute;
        int hoursInDay = 24*minutesInHour;
        int secondsInYear = daysInYear * hoursInDay;
        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}
