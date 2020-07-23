package Lesson7;

class Plate {
    private int food;
    private boolean catIsFull;
    Plate (int food) {
        this.food = food;
    }

    void decreaseFood(int a) {

        if (isFoodEnough(a)) {
            food -= a;
            catIsFull = true;
            System.out.println("Котик покушал");
        } else {
            System.out.println("Еды в тарелке недостаточно");
            catIsFull= false;
        }
    }

    void showInfo() {
        System.out.println("Plate: " + food);
    }

    private boolean isFoodEnough (int a) {
        return food >= a;
    }

    boolean catIsFull() {
        return catIsFull;
    }

    void addSomeFood(int food) {
        this.food += food;
        System.out.println("Ура! В тарелку добавлена еда!");
    }
}
