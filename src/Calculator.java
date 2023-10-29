/*import java.util.*;
public class Calculate {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        String input = scan.nextLine();
        String[] strings = input.split("\\W");
        String[] operator = input.split("\\w");
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(operator));


    }

}*/
import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Введите числа от 1 до 10:\nДля выхода введите 'Выход'");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!input.equals("Выход")) {
            DataVerification(input);
            if (input.matches(".*\\d.*")) {
                Arabic.arabic(input);
            } else if (input.matches(".*\\D.*")) {
                Roman.roman(input);
            }
            input = sc.next();
        }

    }

    static int operation(int a, int b, String op) {
        switch (op) {
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    static void DataVerificationArrays(String[] verification) {
        if (verification.length <= 1) {
            throw new MyException("т.к. строка не является математической операцией");
        } else if (verification.length > 2) {
            throw new MyException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

    }

    static void DataVerification(String verification) {

        if (isAlphaNumeric(verification)) {
            throw new MyException("т.к. используются одновременно разные системы счисления");
        }

    }

    static boolean isAlphaNumeric(String s) {
        return s.matches("(([A-Z].*[0-9])|([0-9].*[A-Z]))");
    }
}




