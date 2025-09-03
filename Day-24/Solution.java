import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
 
        int sum = k;
        int j = 2;
        for(int i = 1; i < w; i++) {
            sum += k*j;
            j++;
        }
 
        if(sum < n) {
            System.out.println("0");
        } else {
            System.out.println(sum-n);
        }
 
        sc.close();
    }
}
