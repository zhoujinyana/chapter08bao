package com.zjy.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {1,-1,10,20,4};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("xixi");
    }
}
