import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length();
        StringBuilder result = new StringBuilder();
 
        int one[] = new int[n];
        int two[] = new int[n];
        int three[] = new int[n];
 
        int i = 0;
        int j = 0;
        int k = 0;
        for(char c: input.toCharArray()) {
            if (Character.isDigit(c)) { 
                int num = Character.getNumericValue(c);
                if (num == 1) {
                    one[i] = num;
                    i++;
                } else if (num == 2) {
                    two[j] = num;
                    j++;
                } else if (num == 3) {
                    three[k] = num;
                    k++;
                }
            }
        }
        
        for(int m = 0; m < n; m++) {
            if(one[m] != 0) {
                result.append(one[m]);
                result.append("+");
            }
        }
        for(int m = 0; m < n; m++) {
            if(two[m] != 0) {
                result.append(two[m]);
                result.append("+");
            }
        }
        for(int m = 0; m < n; m++) {
            if(three[m] != 0) {
                result.append(three[m]);
                result.append("+");
            }
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1); 
        }
 
        System.out.println(result.toString());
        sc.close();
    }
