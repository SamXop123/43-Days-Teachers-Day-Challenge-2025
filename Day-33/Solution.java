import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++) {
            
            if(a.charAt(i) != b.charAt(i)) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
 
        System.out.println(sb.toString());
 
        sc.close();
    }
}
