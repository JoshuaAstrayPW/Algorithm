import java.util.Random;

/**
 * Created by fangxu on 2017/3/4.
 * 联机算法（在线算法）求最大子列和
 * O(n)
 */
public class Online {

    public static int MaxSubSqueSum(int array[]){
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0; i < array.length; i++){
            currentSum = currentSum + array[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }else if(currentSum < 0){
                currentSum = 0;

            }
        }
        return maxSum;
    }
    public  static  void main(String[] args){
        Random r = new Random();
        int[] array = new int[100000000];
        int f = r.nextInt();
        for(int i = 0; i <array.length; i++ ){
            if(f < 0.5){
                array[i] = r.nextInt()*10;
                f = r.nextInt();
            }else{
                array[i] = r.nextInt()*10*-1;
            }
        }


        long start = System.currentTimeMillis();


        System.out.println(start);
        System.out.println(MaxSubSqueSum(array));
        long end = System.currentTimeMillis();
        System.out.println(end);




    }

}
