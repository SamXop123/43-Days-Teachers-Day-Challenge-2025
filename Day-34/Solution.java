import java.util.Scanner;
 
public class TempCodeRunner {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] answer = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            int receiver = sc.nextInt();
            answer[receiver] = i;
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.print(answer[i] + " ");
        }
        
        sc.close();
    }
}
