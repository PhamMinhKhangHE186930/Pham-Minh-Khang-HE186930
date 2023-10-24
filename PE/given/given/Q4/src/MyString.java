
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class MyString implements IString{

    public int checkPrime(String str){
        char[] c = str.toCharArray();
        int count=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]=='3'||c[i]=='5'||c[i]=='2'||c[i]=='7'){
                count ++;
            }
        }
        return count;
    }
    
    @Override
    public int f1(String str) {
        int count = checkPrime(str);
        return count;
    }

    public String revese(String str){
        String[] s = str.split("\\s+");
        for (int i = 0; i < s.length/2; i++) {
            String temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    @Override
    public String f2(String str) {
        String s = revese(str);
        return s;
    }
    
}
