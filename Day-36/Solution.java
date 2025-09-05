import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        
        int[] arr = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        boolean isLucky = false;
        for(int a : arr) {
            if(num%a == 0) {
                isLucky = true;
                break;
            }
        }
 
        System.out.println(isLucky ? "YES" : "NO");
        sc.close();
    }
}
