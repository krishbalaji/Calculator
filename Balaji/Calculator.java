//Access Modifiers
//      Public - Accessible from outside
//      Protected - Accessible within Package
//      Private - Not Accessible outside the Class
public class Calculator {
    //*************************************/
    //Main method is called Entry Method
    //Program can't run without this method
    public static void main (String[] args) {
        //Basics
        Basics();

        //For Loop
        ForLoopMethod();

        //While Loop
        WhileLoopMethod();

        //Calculator
        CalculatorMethod();
    }

    public static void Basics() {
        System.out.println("Basics Method");

        /*Primitive Data Types
        byte - 1 Byte
        char - 2 Bytes
        short - 2 Bytes
        int - 4 Bytes
        float - 4 Bytes
        long - 8 Bytes
        double - 8 Bytes*/

        int i = 10;
        float j = 10.0f;

        //****************** IF STATEMENT *****************************
        //if statement
        //if - else statement
        //if - else if statement (Note: there is a space between else and if, it is not elseif)
        //if - else if -- else statement

        //******************* IF CONDITIONS ***************************
        //conditions can use >, <, >=, <=, == for primitive data types
        //.equals or .equalsIgnoreCase for String comparison
        //Use && for "AND", || for "OR" logical operators

        //Unary - increment operator
        i++;

        //Unary - decrement operator
        i--;

        //compound operators
        i += 6;
        i *= 10;

        System.out.println("The value of i is " + i + " and the value of j is " + j);
    }

    public static void ForLoopMethod() {
        System.out.println("ForLoop Method");

        //******************for loop has 3 parts: *********************
        //first part is declaration and initialization
        //second part is condition
        //third part is increment, decrement
        //one variable in the for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is " + i);
        }

        //multiple variables in the for loop
        for (int i = 0, j = 10; i < 10 && j > 5; i++, j-=2) {
            System.out.println("The value of i is " + i + " and the value of j is " + j);
        }

        //NOTE: The variables declared inside the for loop method are not accessible after the for loop finishes
    }

    public static void WhileLoopMethod() {
        System.out.println("While Loop Method");

        //NOTE: The variables are declared outside the while loop method, so the variables are accessible after the while loop finishes
        //make sure the condition of the while loop does not result in "infinite" condition
        int i = 0;
        while (i < 10) {
            System.out.println("The value of i is " + i);
            i++;
        }
    }

    public static void CalculatorMethod() {
    }
}
