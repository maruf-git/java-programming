

public class exercise_5_5 {

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
            System.out.println(Math.min(num2,num3));
            System.out.println(Math.max(num2,num3));
        }else if(num2<=num1 && num2<=num3){
            System.out.println(num2);
            System.out.println(Math.min(num1,num3));
            System.out.println(Math.max(num1,num3));
        }else{
            System.out.println(num3);
            System.out.println(Math.min(num2,num1));
            System.out.println(Math.max(num2,num1));
        }
    }

    public static void main(String[] args) {
        displaySortedNumbers(25.0, 20, 22);
    }
}
