package Lesson1;

public class LessonOne {
    public static void  main(String[] args) {

        byte a = -128;
        short b = -32768;
        int c = 2147483647;
        long d;
        d = 922337203;

        float e = 3.1415926535f;
        double f = 3.1415926535;
        char g = 'c';
        boolean h = true;
    }

    int calculation(int a, int b, int c, int d) {
        int e;
        e = a * (b + (c/d));
        return e;
    }

    boolean checkThatSummInRange (int a, int b) {
        boolean bool = false;
        int c = a+b;
        if (10 <= c && c<= 20) {
            bool = true;
        }
        return bool;
    }

    void checkTheNumber (int a) {
        if (a<0) {
            System.out.println("Число " + a + " отрицательное");
        } else {
            System.out.println("Число " + a + " положительное");
        }
    }

    boolean checkThatNumberIsNegative (int a) {
        boolean bool = false;
        if (a<0) {
            bool = true;
        }
        return bool;
    }

    void greetingName (String Name) {
        System.out.println("Привет " + Name + "!");
    }

    void checkThatYearIsBissextile (int year) {

        int a = year%4;
        int b = year%100;
        int c = year%400;

        if (b == 0) {
            if (c==0) {
                System.out.println("Год " + year + " високосный");
            } else {
                System.out.println("Год " + year + " не високосный");
            }
        }else if (a==0) {
            System.out.println("Год " + year + " високосный");
            } else {
            System.out.println("Год " + year + " не високосный");
        }
        }

    }



