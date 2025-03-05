public class DataTypes {
    public static void main(String[] args) {
        // primitive data types:
        // byte - 1 [-128 to 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2
        // boolean - 1 true/false

        byte age = 30;
        System.err.println(age);

        int phone = 1234567890;
        long phone2=12345678900L;
        float pi = 3.14F;
        char letter='A';
        boolean isAdult=true;


        // non-primitive data types/reference data types:
        String name = new String("Maruf");
        System.out.println(name);
        String surname = new String("Ur Rahman");
        System.out.println("Ur Rahman");

        System.out.println(name.length());

    }
}
