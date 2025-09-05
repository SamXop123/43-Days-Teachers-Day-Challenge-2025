import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        String first = word.substring(0, 1);
        String next = word.substring(1);
        
        if (word.equals(word.toUpperCase())) {
            System.out.println(word.toLowerCase());
        } 
        else if (first.equals(first.toLowerCase()) && 
                 next.equals(next.toUpperCase()) ) 
        {
            String newFirst = first.toUpperCase();
            String newNext = next.toLowerCase();
            System.out.println(newFirst + newNext);
        } 
        else {
            System.out.println(word);
        }
        
        sc.close();
    }
}
