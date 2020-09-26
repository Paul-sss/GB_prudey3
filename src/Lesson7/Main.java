package Lesson7;

public class Main {
    public static void main(String[] args) {

        /*
        1. Расширить задачу про котов и тарелки с едой
         */

        Cat cat = new Cat("Tom", 25);
        Plate plate = new Plate(30);

        Cat cat2 = new Cat("Barsik", 30);
        Plate plate2 = new Plate(50);

        System.out.println("--Task 1--");

        plate.showInfo();
        cat.eat(plate);
        plate.showInfo();
        System.out.println();

        plate2.showInfo();
        cat2.eat(plate2);
        plate2.showInfo();
        System.out.println("----------------");
        System.out.println();

        /*
        2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
         */

        System.out.println("--Task 2--");

        Cat cat3 = new Cat("Sashka", 40);
        Plate plate3 = new Plate(35);

        plate3.showInfo();
        cat3.eat(plate3);
        plate3.showInfo();
        System.out.println("----------------");
        System.out.println();

        /*
        3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
        4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
         */

        System.out.println("--Task 3,4--");
        Cat cat4 = new Cat("Sashka", 30);
        Plate plate4 = new Plate(40);
        Cat cat5 = new Cat("Sashka", 25);

        plate4.showInfo();
        cat4.eat(plate4);
        cat5.eat(plate4);
        cat4.showInfo();
        cat5.showInfo();

        System.out.println("----------------");
        System.out.println();

        /*
        5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
         */

        System.out.println("--Task 5--");
        Plate plate5 = new Plate(140);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Tima", 45);
        cats[1] = new Cat("Tuzik", 50);
        cats[2] = new Cat("Murzik", 35);
        cats[3] = new Cat("Sonya", 40);
        cats[4] = new Cat("Ksysha", 5);

        for (Cat value : cats) {
            value.eat(plate5);
            value.showInfo();
        }
        System.out.println("----------------");
        System.out.println();

        /*
        6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
         */

        System.out.println("--Task 6--");

        plate5.showInfo();
        plate5.addSomeFood(20);
        plate5.showInfo();

        System.out.println("----------------");

    }

}
