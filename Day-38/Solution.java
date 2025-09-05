import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        
        int first = sc.nextInt();
        int min = first;
        int max = first;
        int count = 0;
        for(int i = 1; i < n; i++) {
            int current = sc.nextInt();
            
            if(current > max) {
                max = current;
                count++;
            } else if(current < min) {
                min = current;
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
