Nitin code goes here
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class TheRealCalc1JOP {
    public static void main(String args[]){

        Object[] array1 = {"+", "-", "÷", "x"};
        double result = 0.0;

        String number1 = JOptionPane.showInputDialog(null, "First Number: ");
        String operator = (String) JOptionPane.showInputDialog(null, "Operator?",
                "Calculator", JOptionPane.QUESTION_MESSAGE, null, array1, array1[0]);
        String number2 = JOptionPane.showInputDialog(null, "Second Number: ");



        if ((operator.toString()).equals("+")) {
            JOptionPane.showMessageDialog(null, add(Double.parseDouble(number1), Double.parseDouble(number2)));
            result = add(Double.parseDouble(number1), Double.parseDouble(number2));
        }
        else if ((operator.toString()).equals("-")){
            JOptionPane.showMessageDialog(null, sub(Double.parseDouble(number1), Double.parseDouble(number2)));
            result = sub(Double.parseDouble(number1), Double.parseDouble(number2));
        }
        else if ((operator.toString()).equals("x")){
            JOptionPane.showMessageDialog(null, mult(Double.parseDouble(number1), Double.parseDouble(number2)));
            result = mult(Double.parseDouble(number1), Double.parseDouble(number2));
        }
        else{
            JOptionPane.showMessageDialog(null, div(Double.parseDouble(number1), Double.parseDouble(number2)));
            result = div(Double.parseDouble(number1), Double.parseDouble(number2));
        }




        while (true){
            operator = (String) JOptionPane.showInputDialog(null, "Operator?",
                    "Calculator", JOptionPane.QUESTION_MESSAGE, null, array1, array1[0]);
            String nextNumber = JOptionPane.showInputDialog(null, "Next Number: ");


            if ((operator.toString()).equals("+")) {
                JOptionPane.showMessageDialog(null, add(result, Double.parseDouble(nextNumber)));
                result = add(result, Double.parseDouble(nextNumber));
            }
            else if ((operator.toString()).equals("-")){
                JOptionPane.showMessageDialog(null, sub(result, Double.parseDouble(nextNumber)));
                result = sub(result, Double.parseDouble(nextNumber));
            }
            else if ((operator.toString()).equals("x")){
                JOptionPane.showMessageDialog(null, mult(result, Double.parseDouble(nextNumber)));
                result = mult(result, Double.parseDouble(nextNumber));
            }
            else{
                JOptionPane.showMessageDialog(null, div(result, Double.parseDouble(nextNumber)));
                result = div(result, Double.parseDouble(nextNumber));
            }
        }

    }


    public static double add(double x, double y){
        return x + y;
    }

    public static double sub(double x, double y){
        return x - y;
    }

    public static double mult(double x, double y){
        return x * y;
    }

    public static double div(double x, double y){
        return x / y;
    }
}

