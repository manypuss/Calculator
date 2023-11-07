
import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Введите числа от 1 до 10:\nДля выхода введите 'Выход'");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!input.equals("Выход")) {
            if(isAlphaNumeric(input)) {
                throw new MyException("т.к. используются одновременно разные системы счисления");
            }

            if (input.matches(".*\\d.*")) {
                Arabic.calculatingArabicNumerals(input);
            } else if (input.matches(".*\\D.*")) {
                Roman.calculatingRomanNumerals(input);
            }
            input = sc.next();
        }

    }

    static int calculate (int num1, int num2, String operator) {
        switch (operator) {
            case "*":
                return num1 * num2;
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    static void checkingTheLengthOfTheArray(String[] array) {
        if (array.length <= 1) {
            throw new MyException("т.к. строка не является математической операцией");
        } else if (array.length > 2) {
            throw new MyException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

    }

    static boolean isAlphaNumeric(String s) {
        return s.matches("(([A-Z].*[0-9])|([0-9].*[A-Z]))");
    }
}




