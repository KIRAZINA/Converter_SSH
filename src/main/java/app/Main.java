package app;

public class Main {
    private static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App - Miles/Kilometers");
        System.out.println("Version: 1.0");
        System.out.println("Author: Kirilo");

        double miles = 10;
        double km = convertMilesToKm(miles);
        System.out.println(miles + " miles = " + km + " km");
    }

    private static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }
}