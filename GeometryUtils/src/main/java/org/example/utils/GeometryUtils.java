package org.example.utils;

public class GeometryUtils {
    public static double convertToSquareMeters(double value, String unit) {
        switch (unit.toLowerCase()) {
            case "square centimeters":
                return value / 10000;
            case "square millimeters":
                return value / 1000000;
            default:
                return value;
        }
    }

    public static boolean compareAreas(double area1, double area2) {
        return Double.compare(area1, area2) == 0;
    }

    public static boolean comparePerimeters(double perimeter1, double perimeter2) {
        return Double.compare(perimeter1, perimeter2) == 0;
    }
}