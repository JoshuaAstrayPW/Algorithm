public class HelloB {
    public static void main(String[] args) {
        HelloB inc = new HelloB();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);

    }
    void fermin(int i){
        i++;
    }
}