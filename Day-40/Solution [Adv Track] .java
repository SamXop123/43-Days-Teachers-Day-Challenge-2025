import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            if (a % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - (a % b));
            }
        }
        
        scanner.close();
    }
}
