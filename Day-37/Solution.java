import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String input = sc.next();
 
        if (input.matches(".*[HQ9].*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        sc.close();
    }
}
