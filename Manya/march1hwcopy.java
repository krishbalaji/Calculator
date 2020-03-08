import java.util.Scanner;
public class march1hwcopy {

    public static double Add(double x, double y) {
        return x + y;
    }

    public static double Subtract(double x, double y) {
        return x - y;
    }

    public static double Multiply(double x, double y) {
        return x * y;
    }

    public static double Divide(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {

        String operator = null;
        double u = 0, w = 0;

        int i = 0;
        double result = 0;


        while (true) {

            Scanner keyboard = new Scanner(System.in);


            if (i >= 0) {
                System.out.print("\nEnter a mathematical operation (eg. +, -. *, /) --> ");
                operator = keyboard.nextLine();
            }

            if (i == 0) { //first value
                System.out.print("\nEnter the first value --> ");
                u = keyboard.nextDouble();
            }

            if (i >= 0) {
                System.out.print("\nEnter the second value --> ");
                w = keyboard.nextDouble();
            }


                if (operator.equals("+")) {
                    result = Add(u, w);
                    System.out.print("\n" + u + " + " + w + " = " + result);

                } else if (operator.equals("-")) {
                    result = Subtract(u, w);
                    System.out.print("\n" + u + " - " + w + " = " + result);

                } else if (operator.equals("*")) {
                    result = Multiply(u, w);
                    System.out.print("\n" + u + " * " + w + " = " + result);

                } else if (operator.equals("/")) {
                    result = Divide(u, w);
                    System.out.print("\n" + u + " / " + w + " = " + result);
                }

            i++;
            u = result;
        }
    }
}