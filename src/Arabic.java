public class Arabic {
    static void calculatingArabicNumerals (String input) {
        int a = 0;
        int b = 0;
        String op = "";
        String[] numerals = input.split("\\W");
        String[] operator = input.split("\\w");
        Calculator.checkingTheLengthOfTheArray(numerals);
        a = Integer.parseInt(numerals[0]);
        b = Integer.parseInt(numerals[1]);
        op = operator[operator.length - 1];
        if ((a < 1 | b < 1) | (a > 10 | b > 10)) {
            throw new MyException("Введенные числа выходят за рамки диапазона от 1 до 10");
        } else {
            System.out.println("Result = " + Calculator.operation(a, b, op));
        }

    }
}
