package Lesson5;

public class Main {



    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Mily Alexeyevich Balakirev", "pianist", "balakirev@mightyhandful.com", "+21121836", 21837, 73);
        empArray[1] = new Employee("Modest Petrovich Mussorgsky", "composer", "mussorgsky@mightyhandful.com", "+21041839", 281881, 42);
        empArray[2] = new Employee("Alexander Porfiryevich Borodin", "composer", "borodin@mightyhandful.com", "+12111833", 271887, 53);
        empArray[3] = new Employee("Nikolai Andreyevich Rimsky-Korsakov", "composer", "korsakov@mightyhandful.com", "+18041844", 211908, 64);
        empArray[4] = new Employee("César Antonovich Cui", "music critic", "cui@mightyhandful.com", "+18011835", 261918, 83);

        for (Employee employee : empArray) {
            employee.showInfo(40);
        }

    }
}
