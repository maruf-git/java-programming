public class JavaStrings {
    public static void main(String[] args) {
        String firstName="Maruf";
        String lastName="Ur Rahman";
        String finalName=firstName+" "+lastName;
        System.out.println(finalName);

        System.out.println(finalName.length());

        System.out.println(finalName.charAt(0));

        String newName = finalName.replace('M','m' );
        System.out.println(newName); 
        // strings are immutable in java as like python
        System.out.println(finalName.substring(0,5));
    }
}
