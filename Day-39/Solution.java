import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
 
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
 
        int temp = arr[maxIndex];
        for (int i = maxIndex; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
 
 
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
            }
        }
 
        System.out.println(maxIndex + (n - minIndex - 1));
        sc.close();
    }
}
