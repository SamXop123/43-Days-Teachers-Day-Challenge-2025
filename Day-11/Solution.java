import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        StringBuilder sb = new StringBuilder();
 
        for(char c : word.toCharArray()) {
            if(!"aeiouy".contains(String.valueOf(c))) {
                sb.append(".");
                sb.append(c);
            }
            
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
