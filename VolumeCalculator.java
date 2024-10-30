
/*public class VolumeCalculator {
    public static double calculateVolume(double side) {
        // Calculate volume of cube
        return Math.pow(side, 3);
    }

    public static double calculateVolume(double length, double width, double height) {
        // Calculate volume of cuboid
        return length * width * height;
    }

    public static double calculateVolume(double radius) {
        // Calculate volume of sphere
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        double cubeSide = 5;
        double cuboidLength = 3;
        double cuboidWidth = 4;
        double cuboidHeight = 5;
        double sphereRadius = 2;

        System.out.println("Volume of cube: " + calculateVolume(cubeSide));
        System.out.println("Volume of cuboid: " + calculateVolume(cuboidLength, cuboidWidth, cuboidHeight));
        System.out.println("Volume of sphere: " + calculateVolume(sphereRadius));
    }
}*/
import java.util.*;

public class VolumeCalculator {
    public static void Volume(double side) {
        System.out.println("Volume of cube: " + Math.pow(side, 3));
    }

    public static void Volume(double length, double width, double height) {
        System.out.println("Volume of cuboid: " + length * width * height);
    }

    public static void Volume(int radius) {
        System.out.println("Volume of sphere: " + (4 / 3) * Math.PI * Math.pow(radius, 3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of cube: ");
        double side = sc.nextDouble();
        Volume(side);
        System.out.println("Enter the length of cuboid: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of cuboid: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of cuboid: ");
        double height = sc.nextDouble();
        Volume(length, width, height);
        System.out.println("Enter the radius of sphere: ");
        int radius = sc.nextInt();
        Volume(radius);
        sc.close();
    }
}
