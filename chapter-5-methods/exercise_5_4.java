
public class exercise_5_4 {

    public static void reverse(int number) {
        String reversedNumber = "";
        while (number != 0) {
            int digitChar = (int) (number % 10);
            reversedNumber += digitChar;
            number = number / 10;
        }
        System.out.println(Integer.parseInt(reversedNumber));
    }

    public static void main(String[] args) {
        reverse(123);
    }
}
