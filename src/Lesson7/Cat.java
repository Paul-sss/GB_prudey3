package Lesson7;

class Cat {
    private String name;
    private int appetite;
    private String hunger;
    private boolean hunger2;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    void eat(Plate p) {
        p.decreaseFood(appetite);
        hunger2 = p.catIsFull();
    }

    void showInfo() {
        hunger = hunger();
        System.out.println("Cat " + name + " is " + hunger);
    }

    private String hunger () {
        if (hunger2) {
            return "full";
        } else {
            return "hungry";
        }
    }
}
