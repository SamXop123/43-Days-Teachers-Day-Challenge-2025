import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
 
        for (int time = 0; time < t; time++) {
            boolean swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (sb.charAt(i) == 'B' && sb.charAt(i + 1) == 'G') {
                    sb.setCharAt(i, 'G');
                    sb.setCharAt(i + 1, 'B');
                    i++; 
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
 
        System.out.println(sb.toString());
        sc.close();
    }
}
