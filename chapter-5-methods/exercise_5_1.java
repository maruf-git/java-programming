
public class exercise_5_1 {

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1) / 2);
    }

    public static void displayFirst100PentagonalNumbers() {
        for (int i = 1; i <= 100; i++) {
            int num = getPentagonalNumber(i);
            System.out.print(num);
            if (i % 10 != 0) {
                System.out.print(", ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getPentagonalNumber(3));
        displayFirst100PentagonalNumbers();
    }
}
