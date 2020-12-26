package lesson5;

public class Bird extends Animal {

    public Bird() {
        super(5, 0, 0.2);
        super.animalName = "Птица";
    }

    @Override
    public void swim(double distance) {
        System.out.println(animalName + " не умеет плавать!");
    }
}
