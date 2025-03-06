public class exercise_5_2 {
    public static int sumDigits(long n){
        int sum=0;
        while(n!=0)
        {
            sum +=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
    }
}
