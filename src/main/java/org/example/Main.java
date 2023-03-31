package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void removeDuplicates(String[] line) {
        String str = Arrays.stream(line)
                .distinct()
                .collect(Collectors.joining());
        System.out.println(str);
    }

    public static void main(String[] args) {
        String[] line = {"Привет ", "Привет ", "меня ", "зовут ", "зовут ", "Женя"};
        removeDuplicates(line);
    }

}