package lesson5;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        performActions(dog, 450, 11, 2);

        Animal cat = new Cat();
        performActions(cat, 300, 1, 1);

        Animal horse = new Horse();
        performActions(horse, 1200, 5, 2);

        Animal bird = new Bird();
        performActions(bird, 1200, 5, 2);
    }

    public static void performActions(Animal animal, double runDistance, double swimDistance, double jumpHeight) {
        animal.run(runDistance);
        animal.swim(swimDistance);
        animal.jumpOver(jumpHeight);
        System.out.println();
    }
}
