package edu.functional.programming;

public class LambdaPractice4 {
    public static void main(String[] args) {

        LenthOfString str = (s) -> {
            int l = s.length();
            System.out.println("string length: "+l);
            return l;
        };
        str.length("rasaaa");
    }
}
