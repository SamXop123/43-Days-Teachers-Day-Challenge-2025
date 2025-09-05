import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
 
        int xSum = 0, ySum = 0, zSum = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
 
            xSum += x;
            ySum += y;
            zSum += z;
        }   
 
        if(xSum == 0 &&
           ySum == 0 &&
           zSum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        sc.close();
    }
}
