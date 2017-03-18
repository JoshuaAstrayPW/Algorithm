/**
 * Created by fangxu on 2017/3/14.
 */
public class multiply {
    public int[] multiplys(int[] A) {
        int[] B = new int[A.length];
        if(A.length <= 0 || A == null)
            return B;
        for(int i = 0; i < A.length; i++)
            B[i] = mutiplyss(i,A);
        return B;
    }
    public int mutiplyss(int a, int[] A  ){
        int b = A[0];
        for(int i = 1; i < A.length && i != a; i++ )
            b *= A[i];
        return b;
    }
    public static  void main(String[] argv){
        multiply m = new multiply();
        int[] a= {1,2,3,4,5};
        System.out.println(m.multiplys(a));
    }
}
