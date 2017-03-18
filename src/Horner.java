/**
 * Created by fangxu on 2017/3/4.
 * Horner法则用于计算多项式
 * 定义一个多项式求和 ai(下标）xi（上标）
 */
public class Horner {
    public static int HornerSum(int[] array, int x){
        int poly = 0;
        System.out.println(array.length);
        for(int i = array.length - 1; i >= 0; i--)
            poly = x * poly + array[i];
        return  poly;

    }
    public  static void main(String[] args){
        int[] a = {1,2,3,4} ;
        System.out.print(HornerSum(a,3));


    }

}
