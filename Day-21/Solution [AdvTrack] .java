import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long totalOdds = (n + 1) / 2;
        
        if (k <= totalOdds) {
            System.out.println(2 * k - 1);
        } else {
            long pos = k - totalOdds;
            System.out.println(2 * pos);
        }
    }
}
