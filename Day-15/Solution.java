import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                count++;
            }
        }
        
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        sc.close();
    }
}
