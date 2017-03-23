/**
 * Created by fangxu on 2017/3/20.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxSum = 0;
        int currentSum = 0;


        int[] a = new int[n];
        for(int k = 0; k < n; k++){
            a[k] = in.nextInt();
        }
        int i = 0, j = 0;
        int maxI = 0; int maxJ = 0;
        while(j < a.length ){
            currentSum += a[j];
            if(currentSum > maxSum){
                maxSum = currentSum;
                maxJ = j;
            }
            if(currentSum < 0){
                currentSum = 0;
                if(maxSum == 0){
                    maxI++;
                    maxJ++;
                }
            }
            j++;

        }
        if(maxSum == 0)
            System.out.println(0+a[0]+a[n-1]);
        else
            System.out.println(maxSum+" "+ a[maxI] +" "+a[maxJ]);

    }
}