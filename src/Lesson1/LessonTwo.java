package Lesson1;

import java.util.Arrays;

public class LessonTwo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (j == 0) {
                j = 1;
            } else {
                j = 0;
            }
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));

        //Можно разкомментировать методы ниже для проверки!

        //taskTwo();
        //taskThree();
        //taskFour();
        taskFive();
    }

    static void taskTwo() {
        int[] arr = new int[8];
        System.out.println(arr.length);
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void taskThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;

            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void taskFour() {
        int[][] arr = new int[5][5];
        int i;
        int j;

        for (i = 0, j = 0; j < 5; j++, i++) {
            arr[i][j] = 1;
        }

        for (i = 0, j = 4; i < 5; i++, j--) {
            arr[i][j] = 1;
        }

        for (int[] a : arr)
            System.out.println(Arrays.toString(a));

    }

    private static void taskFive() {
        int[] arr = {1, 699, 3, 11, 5, 6, 7, 8, 3, 700};
        int max = 0;

        for (int value : arr) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println("Максимальное значение в одномерном массиве = " + max);

        int min = max;
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }

        System.out.println("Минимальное значение в одномерном массиве = " + min);
        System.out.println(Arrays.toString(arr));

    }
}
