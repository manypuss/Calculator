public class Arabic {
    static void calculateArabicNumerals (String input) {
        int num1 = 0;
        int num2 = 0;
        String operator = "";
        String[] numerals = input.split("\\W");
        String[] arrayWithOperator = input.split("\\w");
        Calculator.checkLengthArray(numerals);
        num1 = Integer.parseInt(numerals[0]);
        num2 = Integer.parseInt(numerals[1]);
        operator = arrayWithOperator[arrayWithOperator.length - 1];
        if ((num1 < 1 | num2 < 1) | (num1 > 10 | num2 > 10)) {
            throw new MyException("Введенные числа выходят за рамки диапазона от 1 до 10");
        } else {
            System.out.println("Result = " + Calculator.calculate(num1, num2, operator));
        }

    }
}
