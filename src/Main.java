
public class Main {
    public static void main(String args[]) {
        double num1 = 50.0d;
        double num2 = 50.0d;
        double result = 0.0d;
        char value  = 'm';

        if ( value  == 'a') {
            result = num1 + num2;
        } else if ( value  == 's') {
            result = num1 - num2;
        } else if ( value == 'm') {
            result = num1 * num2;
        } else if  (value == 'd') {
            result = num1 / num2;
        } else {
            result = 0.0d;
        }

        System.out.println(result);
    }
}


