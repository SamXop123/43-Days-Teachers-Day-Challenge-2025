import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n+1];
        
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int x = sc.nextInt();
            arr[x] = true;
        }
        
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int y = sc.nextInt();
            arr[y] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (!arr[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        
        System.out.println("I become the guy.");
    }
}
