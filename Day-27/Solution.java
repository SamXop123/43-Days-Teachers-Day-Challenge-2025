import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += scanner.nextInt();
        }
        double result = (double) total / n;
        System.out.printf("%.12f%n", result);
    }
}
