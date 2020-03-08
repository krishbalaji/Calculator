public class Homework {
    public static void main(String args[]) {
        double r = Add(10.0, 12.0);
        System.out.println(r);
    }
    public double Calculate(double x, double y) {
        ForLoop.Add(6, 7);
        return 6 % 7;
    }

    public static double Add(double x, double y) {
        return x + y;
    }

    public static double SquareAdd(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2);
    }

    public static double SquareSubtract(double x, double y) {
        return Math.pow(x, 2) - Math.pow(y, 2);
    }

    public static double TriArea(double x, double y) {
        return 0.5 * x * y;
    }

    public static double SphereVolume(double x) {
        return 4 / 3 * Math.PI * Math.pow(x, 3);
    }
}