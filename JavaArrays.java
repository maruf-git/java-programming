import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 95;
        marks[1] = 90;
        marks[2] = 99;

        System.out.println(marks[0]); 

        System.out.println(marks.length); // property
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] scores={95,97,96};
        System.out.println(scores[0]);

        // 2d arrays
        int[][] finalMarks={
            {97,95,96},
            {99,94,95}
        };
        System.out.println(finalMarks[0][2]);
    }
}
