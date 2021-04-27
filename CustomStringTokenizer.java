package lab9;

import java.util.StringTokenizer;

public class CustomStringTokenizer extends StringTokenizer {
    protected String y;
    public CustomStringTokenizer(String y){
        super(y);
        this.y=y;
    }
    public boolean isNumber(String s) {
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') x++;
        }
        if (x == s.length()) return true;
        else return false;
    }
    public int CountTokens(){
        String[]z=y.split(" ");
        int token=0;
        for(String i:z){
            if(!isNumber(i)) token++;
        }
        return token;
    }
}

