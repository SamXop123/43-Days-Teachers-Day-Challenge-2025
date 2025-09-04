import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] magnets = new String[n];
        for (int i = 0; i < n; i++) {
            magnets[i] = sc.nextLine();
        }
        
        int groups = 1;
        for (int i = 1; i < n; i++) {
            if (magnets[i].charAt(0) == magnets[i-1].charAt(1)) {
                groups++;
            }
        }
        
        System.out.println(groups);
        sc.close();
    }
}
 
