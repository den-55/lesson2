package com.company;

public class Giraffe {
    int age;
    int height;
    int weight;
    int maxRunningSpeed;
    boolean livesInTheWild;

    public Giraffe(int age, int height, int weight, int maxRunningSpeed, boolean livesInTheWild) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.maxRunningSpeed = maxRunningSpeed;
        this.livesInTheWild = livesInTheWild;
    }

    public String run () {
        return "Жираф развивает максимальную скорость в " + maxRunningSpeed + " км/ч. ";
    }

    public String sleep () {
       return "Спит по 2 часа в сутки. ";
    }

    public String eat () {
        return "Жираф питается листвой деревьев. ";
    }

    public String habitatRange() {
        if (livesInTheWild == true) {
            return  "Он живёт на воле, в Африке. ";
        }
        return "Он живёт в зоопарке. ";
    }

    public void getInfo() {
        System.out.println("Это очень высокий жираф. Его рост " + height + " метров, вес " + weight + " килограмм, возраст " + age + " лет. " + run() + sleep() + eat() + habitatRange());
    }

}
