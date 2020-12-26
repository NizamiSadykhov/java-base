package lesson5;

public abstract class Animal {

    private final double runDistance;
    private final double swimDistance;
    private final double jumpHeight;

    protected String animalName = "Животное";

    public Animal(double runDistance, double swimDistance, double jumpHeight) {
        this.runDistance = runDistance + (runDistance * Math.random());
        this.swimDistance = swimDistance + (swimDistance * Math.random());
        this.jumpHeight = jumpHeight + (swimDistance * Math.random());
    }

    public void run(double distance) {
        String message;
        if (distance <= runDistance) {
            message = animalName + " побежал на дистанцию " + distance + " метров!";
        } else {
            message = animalName + " не побежал! " + animalName + " может бежать не более " + getRunDistance() + " метров!";
        }

        System.out.println(message);
    }

    public void swim(double distance) {
        String message;
        if (distance <= swimDistance) {
            message = animalName + " проплыл дистанцию " + distance + " метров!";
        } else {
            message = animalName + " не поплыл! " + animalName + " может плыть не более " + getSwimDistance() + " метров!";
        }

        System.out.println(message);
    }

    public void jumpOver(double height) {
        String message;
        if (height <= jumpHeight) {
            message = animalName + " прыгнул на дистанцию " + height + " метров!";
        } else {
            message = animalName + " не прыгнул! " + animalName + " может прыгать не выше " + getJumpHeight() + " метров!";
        }

        System.out.println(message);
    }


    public double getRunDistance() {
        return runDistance;
    }


    public double getSwimDistance() {
        return swimDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

}
