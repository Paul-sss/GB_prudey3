package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class GBXO {

    static char[][] map;
    static int SIZE = 3;
    static int DOTS_TO_WIN = 3;

    static char DOT_EMPTY = '.';
    static char DOT_X = 'X';
    static char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }

        }


    }

    static void initMap () {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap () {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i +  " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j< SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void humanTurn () {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        do {
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    static boolean isCellValid (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }

        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    static void aiTurn() {
        Random random = new Random();

        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в " + (x+1) + "" + (y+1));
        map[x][y] = DOT_O;
    }

    static boolean checkWin (char symbol) {
        boolean bool = true;
         for (int i = 0; i < SIZE; i++) {
             for (int j = 0; j < SIZE; j++) {
                 //if (map[i][j] == symbol) {
                     bool = bool & (map[i][j] == symbol);
                     //break;
                 //}
             }
         }
         if (bool) {
             return true;
         }
         for (int i = 0, j = (SIZE - 1); i < SIZE; i++, j--) {

             bool = bool & (map[i][j] == symbol);
         }
             if (bool) {
                 return true;
             }


         for (int i = 0, j = 0; i < SIZE; i++) {
             bool = bool & (map[i][j] == symbol);
         }
        if (bool) {
            return true;
        }

         return false;

    }

    static boolean isMapFull () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
