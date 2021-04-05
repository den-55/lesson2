package com.company;

public class Animal {

    int weight;
    boolean eatMeat;
    boolean wildAnimal;
    int runningSpeed;
    boolean fly;

    public Animal (int weight, boolean eatMeat, boolean wildAnimal, int runningSpeed, boolean fly) {
        this.weight = weight;
        this.eatMeat = eatMeat;
        this.wildAnimal = wildAnimal;
        this.runningSpeed = runningSpeed;
        this.fly = fly;
    }

    public String animalSize () {
        if (weight < 60) {
            return "Это не крупное животное, вес составляет " + weight + " кг. ";
        }
        return "Это крупное животное, его вес составляет " + weight + " кг. ";
    }

    public String isAPredator () {
        if (eatMeat == true) {
            return "Оно плотоядное. ";
        }
        return "Оно травоядное. ";
    }

    public String isAWildAnimal () {
        if (wildAnimal == true) {
            return "Это животное является диким";
        }
        return "Это животное является домашним";
    }

    public String canFly () {
        if (fly == true) {
            return "Оно умеет летать.";
        }
        return "Оно не умеет летать.";
    }

    public void toHide (Animal animal, Room room) {
        System.out.println(animal + " прячется в " + room);
    }

    public void hunts (Animal animal, Giraffe giraffe) {
        System.out.println(animal + " охотится на " + giraffe);
    }

    public void getInfo () {
        System.out.println(animalSize() + isAPredator() + isAWildAnimal() + ", может развивать скорость в " + runningSpeed + " км/ч. " + canFly());
    }
}
