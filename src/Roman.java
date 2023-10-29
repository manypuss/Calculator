public class Roman {

    static void roman (String input) {
        int a = 0;
        int b = 0;
        String op = "";

        String[] strings = input.split("\\W");
        String[] operator = input.split("\\w");
        Calculator.DataVerificationArrays(strings);

        a = RomanNumerals.valueOf(strings[0]).getI();
        b = RomanNumerals.valueOf(strings[1]).getI();
        op = operator[operator.length - 1];
        if ((a < 1 | b < 1) | (a > 10 | b > 10)) {
            throw new MyException("Введенные числа выходят за рамки диапазона от I до X");
        }
        int result = Calculator.operation(a, b, op);
        if (result < 0) {
            throw new MyException("В римской системе нет отрицательных чисел");
        } else {
            for (RomanNumerals rm:RomanNumerals.values()){
                if (rm.getI() == result) {
                    String s = rm.toString();
                    System.out.println("Result = " + s);
                }
            }

        }

    }

}
