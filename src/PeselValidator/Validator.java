package PeselValidator;

public class Validator {
    public static boolean validate(String PESEL) {
        if (PESEL.length() != 11) {
            return false;
        }
        int[] number = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(PESEL.substring(i, i + 1)) * number[i];
        }

        int w = 0;

        int checkNumber = Integer.parseInt(PESEL.substring(10, 11));

//        sum %= 10;
        sum = sum % 10;
        sum = 10 - sum;
//        sum %= 10;
        sum = sum % 10;


        return sum == checkNumber;
    }
}
