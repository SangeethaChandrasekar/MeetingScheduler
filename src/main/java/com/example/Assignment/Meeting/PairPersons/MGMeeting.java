package com.example.Assignment.Meeting.PairPersons;

import java.util.Arrays;

public class MGMeeting {
    static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
            System.out.println("");
        }
        response(arr);
    }

    static void printCombination(int[] arr, int n, int r) {
        int[] data = new int[r];
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int r = 2;
        int n = arr.length;
        printCombination(arr, n, r);
    }

    public static void response(int[] arr) {
        int[] des = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] des2;
        int i;
        for (i = 1; i < arr.length; i++) {
            switch (i) {
                case 1:
                    des2 = Arrays.copyOfRange(des, 0, arr.length - i);
                    printMessage(des2);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    des2 = Arrays.copyOfRange(des, i - 1, arr.length);
                    printMessage(des2);
                    break;
                default:
                    System.out.println("Get out");
                    break;
            }
        }
    }

    private static void printMessage(int[] des2) {
        System.out.println(Arrays.toString(des2));
    }
}

