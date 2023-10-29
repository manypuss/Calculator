public class Arabic {
    static void arabic (String input) {
        int a = 0;
        int b = 0;
        String op = "";
        String[] strings = input.split("\\W");
        String[] operator = input.split("\\w");
        Calculator.DataVerificationArrays(strings);
        a = Integer.parseInt(strings[0]);
        b = Integer.parseInt(strings[1]);
        op = operator[operator.length - 1];
        if ((a < 1 | b < 1) | (a > 10 | b > 10)) {
            throw new MyException("Введенные числа выходят за рамки диапазона от 1 до 10");
        } else {
            System.out.println("Result = " + Calculator.operation(a, b, op));
        }

    }
}
