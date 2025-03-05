
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        System.out.println("Input in Java");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your age:");
        float age = sc.nextFloat();

        System.out.println("Your name is: ");
        System.out.println(name);
        System.out.println("Your age is: ");
        System.out.println(age);

        System.out.println("Enter one line about your self:");
        String extraLineInput = sc.nextLine();
        String aboutInfo = sc.nextLine();
        System.out.println("About Info:");
        System.out.println(aboutInfo);

    }
}
