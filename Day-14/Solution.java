import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder word = new StringBuilder(input);
        
        word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
 
        System.out.println(word.toString());
        sc.close();
    }
}
