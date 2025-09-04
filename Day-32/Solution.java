import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        int count = 0;
        for (char c : num.toCharArray()) {
            if (c == '7' || c == '4') {
                count++;
            }
        }
      
        String luckyNum = Integer.toString(count);
        boolean isLucky = true;
 
        for (char c : luckyNum.toCharArray()) {
            if (c != '7' && c != '4') {
                isLucky = false;
                break;
            }
        }
 
        if (count == 0) {
            isLucky = false;
        }
 
        System.out.println(isLucky ? "YES" : "NO");
        sc.close();
    }
}
