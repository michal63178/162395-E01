package com.company.Z1;

import java.time.LocalTime;
import java.lang.Comparable;

public class Z1 {

    public static void main(String[] args) {
        Integer[] isSortedInt = new Integer[] {6, 5, 3};
        Integer[] isunSortedInt = new Integer[] {3, 5, 6};
        LocalTime[] isSortedLocalTime = new LocalTime[] {
                LocalTime.of(13, 00),
                LocalTime.of(11, 15),
                LocalTime.of(9, 45)

        };

    }

    static class ArrayUtil {
        public static <T extends Comparable<T>>
        boolean isSorted(T[]array) {
            for(int i=0; i<array.length-1; i++)
                if(array[i+1].compareTo(array[i]) > 0) {
                    return false;

                }
            return true;

        }

    }
}
