package org.veta.tests;

import java.util.Arrays;

public class EqualStrings {
    public static void main(String[] args) {
        String[] arr = new String[]{};
        findSameStrings(arr);
    }

    public static String findSameStrings(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            String current = array[i];
            char[] charArr = current.toCharArray();
            Arrays.sort(charArr);
            String sortedChars = String.valueOf(charArr);

            for (int j = array.length - 1; j > i; j--) {
                if (hasSameCharacters(array[j], sortedChars)) {
                    System.out.print(sortedChars + " = " + i + ", " + j + " ");
                }
            }
        }
        return null;
    }

    private static boolean hasSameCharacters(String charSet1, String charSet2) {
        char[] char1 = charSet1.toCharArray();
        char[] char2 = charSet2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2) && checkCase(char1) && checkCase(char2);
    }

    private static boolean checkCase(char[] chars) {
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar))
                return true;
        }
        return false;
    }
}

/* Исходя из примера вывода, сделала перебор массива в обратном порядке;
Q и QQ - разные наборы, это вытекает из первого условия задания,
т.к. количество символов в наборах Q и QQ разное,
добавила проверку на нижний регистр)*/