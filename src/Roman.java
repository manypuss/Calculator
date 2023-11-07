public class Roman {

    static void calculatingRomanNumerals (String input) {
        int a = 0;
        int b = 0;
        String op = "";

        String[] numerals = input.split("\\W");
        String[] operator = input.split("\\w");
        Calculator.checkingTheLengthOfTheArray(numerals);

        a = RomanNumerals.valueOf(numerals[0]).getI();
        b = RomanNumerals.valueOf(numerals[1]).getI();
        op = operator[operator.length - 1];
        if ((a < 1 | b < 1) | (a > 10 | b > 10)) {
            throw new MyException("Введенные числа выходят за рамки диапазона от I до X");
        }
        int result = Calculator.operation(a, b, op);
        if (result < 0) {
            throw new MyException("В римской системе нет отрицательных чисел");
        } else {
            for (RomanNumerals rm : RomanNumerals.values()){
                if (rm.getI() == result) {
                    String s = rm.toString();
                    System.out.println("Result = " + s);
                }
            }

        }

    }

}
