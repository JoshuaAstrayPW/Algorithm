/**
 * Created by fangxu on 2017/3/24.
 */
public class ReplaceSpace {


    public String replaceSpace(String iniString, int length) {
        /*iniString.replaceAll(" ", "%");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            char c = iniString.charAt(i);
            if(c == ' ')
                sb.append("%20");
            else
                sb.append(iniString.charAt(i));

        }
        return sb.toString();*/
        char[] c = iniString.toCharArray();
        int cnt = 0;
        for(int i = 0; i < length; i++){
            if(c[i] == ' ')
                cnt++;
        }
        char[] cc = new char[length + cnt * 2];
        int index = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] != ' '){
                cc[index] = c[i];
                index++;
            }
            else {
                cc[index++] = '%';
                cc[index++] = '2';
                cc[index++] = '0';
            }
        }
        return String.valueOf(cc);
    }

}
