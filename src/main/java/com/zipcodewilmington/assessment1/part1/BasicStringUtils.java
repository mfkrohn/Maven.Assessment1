package com.zipcodewilmington.assessment1.part1;
import java.lang.String;
import java.lang.Character;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        StringBuilder rev = new StringBuilder();
        rev.append(str);
        rev = rev.reverse();

        return rev.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        
        for (int i = 0; i < str.length()-1; i++) {
            Character currentChar = str.charAt(i);
            if(Character.isUpperCase(currentChar)){

                str.replace(currentChar,Character.toLowerCase(currentChar));
            }
            else if(Character.isLowerCase(currentChar)){
                str.replace(currentChar,Character.toUpperCase(currentChar));
            }
        }

        return str;
    }
}
