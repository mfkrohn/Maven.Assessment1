package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

public class Palindrome {

    public Integer countPalindromes(String input) {
        Integer palindromeCount = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length(); j > i; j--) {
                if (input.substring(i, j).equals(BasicStringUtils.reverse(input.substring(i, j)))) {
                    palindromeCount++;
                }
                //System.out.println(input.substring(i,j));
            }


        }
        return palindromeCount;
    }
}
