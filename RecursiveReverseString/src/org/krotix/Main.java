package org.krotix;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("test"));
    }
    public static String reverseString(String s){
        if(s.length() == 1){
            return s;
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
