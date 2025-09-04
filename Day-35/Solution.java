import java.util.Scanner;
 
public class Main {
 
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= value/2; i++) {
            if (value%i == 0) {
                return false;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(!isPrime(m)) {
            System.out.println("NO");
        } else {
            for(int i = n+1; i <= m; i++) {
                if(isPrime(i)) {
                    if(i != m) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
            System.out.println("YES");
        }
    }
}
