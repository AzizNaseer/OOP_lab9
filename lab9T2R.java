package lab9;

import java.util.StringTokenizer;

public class lab9T2R {
    public static void main(String[] args) {
        StringTokenizer St = new StringTokenizer("My name is aziz ");//using built in class
        System.out.println(St.countTokens());
        CustomStringTokenizer ct=new CustomStringTokenizer("My name is aziz ");
        System.out.println(ct.CountTokens());
    }
}
