
public class exercise_5_3 {

    public static int reverse(int number) {
        String reversedNumber = "";
        while (number != 0) {
            int digitChar = (int) (number % 10);
            reversedNumber += digitChar;
            number = number / 10;
        }
        return Integer.parseInt(reversedNumber);
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);
        return number == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
