package com.bridgelabz.algorthm;

public class Permutation {
    static void permutate(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permutate(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutate(s, "");
    }
} 
