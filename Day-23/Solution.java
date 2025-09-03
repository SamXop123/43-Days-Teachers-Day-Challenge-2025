import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int x = 0;
 
        int[] steps = {5,4,3,2,1};
        int count = 0;
 
        int i = 0;
        while (x < n && i < steps.length) {
            if(x + steps[i] <= n) {
                x += steps[i];
                count++;
            }
            else{
                i++;
            }
        }   
 
        System.out.println(count);
        sc.close();
    }
}
