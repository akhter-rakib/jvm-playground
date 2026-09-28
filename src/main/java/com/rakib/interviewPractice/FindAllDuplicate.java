package com.rakib.interviewPractice;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Log4j2
public class FindAllDuplicate {

    /*Brute-Force Version (O(n²))*/
    static List<Integer> findDuplicatesBruteForce(int[] array) {
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !dups.contains(array[i])) {
                    dups.add(array[i]);
                }
            }
        }
        return dups;
    }

    /*HashSet-Based Version (O(n))*/
    static List<Integer> findDuplicates(int[] args) {

        if (args == null || args.length < 2) {
            return Collections.emptyList();
        }
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int arg : args) {
            if (!seen.add(arg)) {
                duplicates.add(arg);
            }
        }
        return new ArrayList<>(duplicates);
    }

    static List<Integer> findDuplicatesUsingStream(int[] args) {

        if (args == null || args.length < 2) {
            return Collections.emptyList();
        }
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(args)
                .boxed()
                .filter(value -> !seen.add(value))
                .distinct()
                .toList();
    }

    private static Set<String> duplicate(List<String> events) {
        if (events.isEmpty() || events.size() < 2) {
            return Collections.emptySet();
        }
        var seen = new HashSet<String>();
        var duplicates = new HashSet<String>();
        for (String event : events) {
            if (!seen.add(event)) {
                duplicates.add(event);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};
        List<Integer> list = findDuplicatesUsingStream(arr);
        /*ArrayList<Integer> list = findAllDuplicate(arr);*/
        System.out.println(list); // Output: [2, 3]

        duplicate(List.of("event1", "event2", "event1", "event3", "event2"))
                .forEach(System.out::println); // Output: event1, event2
    }
}
