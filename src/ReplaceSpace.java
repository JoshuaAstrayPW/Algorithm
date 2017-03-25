/**
 * Created by fangxu on 2017/3/24.
 */
public class ReplaceSpace {


    public String replaceSpace(String iniString, int length) {
        iniString.replaceAll(" ", "%");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            char c = iniString.charAt(i);
            if(c == ' ')
                sb.append("%20");
            else
                sb.append(iniString.charAt(i));

        }
        return sb.toString();
    }

}
