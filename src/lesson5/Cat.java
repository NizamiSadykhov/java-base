package lesson5;

public class Cat extends Animal {

    public Cat() {
        super(200, 0, 10);
        super.animalName = "Кот";
    }

    @Override
    public void swim(double distance) {
        System.out.println(animalName + " не умеет плавать!");
    }
}
