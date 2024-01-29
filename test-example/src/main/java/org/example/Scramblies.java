package org.example;

import java.util.HashMap;

public class Scramblies {

    // Метод, который возвращает true, если часть символов str1 можно переставить так,
    // чтобы она соответствовала str2, в противном случае возвращает false
    public static boolean scramble(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char symbol : str1.toCharArray()) {
            if (map.containsKey(symbol)) map.put(symbol, map.get(symbol) + 1);
            else {
                map.put(symbol, 1);
            }
        }

        for (char symbol : str2.toCharArray()) {
            if (!map.containsKey(symbol) || map.get(symbol) == 0) return false;
            else map.put(symbol, map.get(symbol) - 1);
        }
        return true;
    }
}
