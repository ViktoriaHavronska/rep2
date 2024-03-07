package src;

import java.util.Scanner;

public class Arrays {
    void showArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.println("   ");
    }

    void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please sort this numbers: ");
        char num = scanner.next().charAt(0);
    }

    void showArr2(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
            System.out.print(arr[i] + "; ");
        }
    }
}

