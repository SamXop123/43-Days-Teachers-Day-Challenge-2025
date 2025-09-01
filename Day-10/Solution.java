import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int participant = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[participant];
 
        for(int i = 0; i < participant; i++) {
            arr[i] = sc.nextInt();;
        }
 
        int score = arr[k-1];
        int count = 0;
        for(int i = 0; i < participant; i++) {
            if(arr[i] >= score && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
