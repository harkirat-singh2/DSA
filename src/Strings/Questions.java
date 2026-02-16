package Strings;

import java.util.Arrays;

public class Questions {

    public static boolean anagram(String s,String t){
        if (s.length()!=t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
    public static int mostFrequentCharacterMehod1(String s){
        char ans=s.charAt(0);
        int maxFreq=-1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    maxFreq++;
                    ans=s.charAt(maxFreq);
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(anagram("race","rcer"));
    }
}
