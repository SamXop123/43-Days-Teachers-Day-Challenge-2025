import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String colors = sc.next();
        StringBuilder sb = new StringBuilder(colors);
        int count = 0;
 
        for(int i = 0; i < sb.length()-1;) {
            if(sb.charAt(i) == sb.charAt(i+1)) {
                sb.deleteCharAt(i+1);
                count++;
            } else {
                i++;
            }
        }
 
        System.out.println(count);
        sc.close();
    }
}
