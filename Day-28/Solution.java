import java.util.Scanner;
 
public class Main {
 
    public static int findMaximum(int n, int[] arr) {
 
        if(n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
 
        int maxWatered = 0;
 
        for (int start = 0; start < n; start++) {
            int count = 1;
 
            int left = start - 1;
            while (left >= 0 && arr[left] <= arr[left + 1]) {
                count++;
                left--;
            }
 
            int right = start + 1;
            while (right < n && arr[right] <= arr[right - 1]) {
                count++;
                right++;
            }
 
            if (count > maxWatered) {
                maxWatered = count;
            }
        }
        
        return maxWatered;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
 
        int result = findMaximum(n, arr);
        System.out.println(result);
        sc.close();
    }
}
