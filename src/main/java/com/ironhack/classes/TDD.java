package com.ironhack.classes;

import java.util.Arrays;
import java.util.List;

public class TDD {
    private static List<String> keywordList = Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case",
            "catch", "char", "class", "continue", "const", "default", "do", "double", "else", "enum", "exports", "extends",
            "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long",
            "module", "native", "new", "package", "private", "protected", "public", "requires", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this", "throw", "transient", "try", "var", "void", "volatile", "while");

    public static int[] oddArray(int n) {
        if (n < 0) {
            return new int[]{};
        }
        int[] oddArray;
        if (n % 2 == 1) {
            oddArray = new int[(n / 2) + 1];
        } else {
            oddArray = new int[n / 2];
        }
        int oddCount = 1;
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = oddCount;
            oddCount += 2;
        }
        return oddArray;
    }

    public static boolean findIfContainsKeywords(String input) {
        String[] words = input.split(" ");
        for (String i : words) {
            if (getKeywordList().contains(i)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> getKeywordList() {
        return keywordList;
    }
}
