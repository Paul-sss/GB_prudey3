package Lesson1;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        do {
            scanConsole();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            b = sc.nextInt();
        } while (b==1);
        sc.close();
    }

    private static int randomNumber() {
        int max = 9;
        return (int) (Math.random() * ++max);
    }

    private static void scanConsole() {
        Scanner sc = new Scanner(System.in);
        int ran = randomNumber();
        System.out.println("Введите число от 0 до 9 включительно: ");
        for (int i =1, j = 2; i<4; i++, j--) {
            int a = sc.nextInt();
            if (ran == a) {
                System.out.println("Вы угадали с " + i + " попытки! Поздравляю! Загаданное число действительно: " + ran);
                break;
            } else if (j==0) {
                System.out.println("К сожалению вы не угдали. У вас больше нет попыток! Загаданное число было: " + ran);
                break;
            }else{
                System.out.println("Не верно, У вас осталось еще " + j + " попытки");
                if (a>ran) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }

    }
}
