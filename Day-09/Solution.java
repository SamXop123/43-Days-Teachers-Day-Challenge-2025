import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int count = 0;
 
        for(int i = 0; i < row; i++) {
            int p = sc.nextInt();
            int v = sc.nextInt();
            int t = sc.nextInt();
 
            int sum = p + v + t;
            if (sum >= 2) { 
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
