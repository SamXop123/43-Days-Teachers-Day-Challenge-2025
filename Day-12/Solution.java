import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name1 = sc.next().toLowerCase();
        String name2 = sc.next().toLowerCase();
 
        int comparison = name1.compareTo(name2);
        
        if(comparison > 0) {
            System.out.println("1");
        } else if (comparison < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
 
        sc.close();
    }
}
