package Lesson5;

public class Employee {
    String FIO;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    Employee () {
        FIO = "Null FIO";
        position = "intern";
        email = "intern@company.com";
        phoneNumber = "+3 (141) 592 65-35";
        salary = 37500;
        age = 18;
    }

    Employee (String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void showInfo() {
        System.out.println();
        System.out.println("ФИО работника: " + FIO);
        System.out.println("Должность работника: " + position);
        System.out.println("E-mail работника: " + email);
        System.out.println("Телефон работника: " + phoneNumber);
        System.out.println("Зарплата работника: " + salary);
        System.out.println("Возраст работника: " + age);
        System.out.println();
    }

    void showInfo(int age) {
        if (this.age>age) {
            showInfo();
        }
    }
}
