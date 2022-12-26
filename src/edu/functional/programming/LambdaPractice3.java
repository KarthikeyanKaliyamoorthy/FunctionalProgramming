package edu.functional.programming;

public class LambdaPractice3 {
    public static void main(String[] args) {

        LenthOfString str = (s) -> s.length();
        int length = str.length("rasaaa");
        System.out.println(length);
    }
}
