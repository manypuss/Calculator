public class Roman {

    static void calculatingRomanNumerals (String input) {
        int num1 = 0;
        int num2 = 0;
        String operator = "";

        String[] numerals = input.split("\\W");
        String[] arrayWithOperator = input.split("\\w");
        Calculator.checkingTheLengthOfTheArray(numerals);

        num1 = RomanNumerals.valueOf(numerals[0]).getI();
        num2 = RomanNumerals.valueOf(numerals[1]).getI();
        operator = arrayWithOperator[arrayWithOperator.length - 1];
        if ((num1 < 1 | num2 < 1) | (num1 > 10 | num2 > 10)) {
            throw new MyException("Введенные числа выходят за рамки диапазона от I до X");
        }
        int result = Calculator.calculate(num1, num2, operator);
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
