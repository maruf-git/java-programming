
public class Exceptions {

    public static void main(String[] args) {
        // try and catch in exception handling
        int[] marks = {95, 96, 97};
        try {
            System.out.println(marks[3]);
        } catch (Exception e) {
            System.out.println(e); // exception message
        }
        System.out.println("My name is maruf");
    }
}
