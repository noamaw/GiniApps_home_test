package com.example.giniappshometest.logic;

public class Helper {
    public static boolean[] findPairs(int[] array) {
        boolean[] result = new boolean[array.length];
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if ((current + array[j]) == 0) {
                    result[i] = true;
                    result[j] = true;
                }
            }
        }
        return result;
    }
}
