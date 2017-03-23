import java.util.HashMap;
import java.util.Scanner;
public class Stringfenlwi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int h = 0; h < n; h++)
            s[h] = in.next();

        in.close();


        int c = 1;

        for(int i = 0; i < n; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int k = 0; k < s[i].length(); k++)
               map.put(s[i].charAt(k),1);
            for(int j = i + 1; j < n; j++){
                if(s[j].length() == s[i].length()){
                    String currentj = s[j];
                    for(int m = 0; m < s[j].length(); m++) {
                        int count = 0;
                        while (map.containsKey(s[j].charAt(m)))
                            count++;
                        if(count != m)
                            c++;
                    }


                }


            }

        }
       System.out.println(c);
    }
}

