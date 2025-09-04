import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int countA = 0;
        int countD = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
            } else if (c == 'D') {
                countD++;
            }
        }
        
        if (countA > countD) {
            System.out.println("Anton");
        } else if (countD > countA) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
