import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = invert(str.charAt(i), true);

            } else {
                arr[i] = invert(str.charAt(i), false);

            }

        }

        System.out.println(String.valueOf(arr));

    }

    public static char invert(char c, boolean isfirst) {
        int digit = c - 48;
        char returnchar;
        if (digit == 9 && isfirst) {
            returnchar = 48 + 9;

        } else {
            if ((9 - digit) < digit) {
                returnchar = (char) (48 + (9 - digit));

            } else {
                returnchar = c;

            }
        }

        return returnchar;

    }
}
