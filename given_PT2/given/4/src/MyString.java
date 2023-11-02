
import java.util.HashMap;


public class MyString implements IString{
    
    public boolean checkPal_2char(String str){
        char[] c = str.toCharArray();
        boolean check = false;
        for (int i = 0; i < c.length/2; i++) {
            if(c.length>=2&& c[i]!=c[c.length-i-1]){
                check = true;
            }
        }
        return check;
    }

    @Override
    public int f1(String str) {
        String[] s = str.split("\\s+");
        int sum=0;
        for (int i = 0; i < s.length; i++) {
            if(checkPal_2char(s[i])){
                char[] c = s[i].toCharArray();
                sum += c.length;
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        int[] arr = new int[999];
        for (int i = 0; i < str.length(); i++) {
            arr[(int)str.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(arr[(int)str.charAt(i)]>0){
                sb.append(str.charAt(i));
                arr[(int)str.charAt(i)]=0;
            }
        }
        return sb.toString();
    }
    
}
