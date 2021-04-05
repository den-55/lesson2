package com.company;

public class Girl {

    String name;
    int age;
    boolean child;
    boolean husband;
    boolean work;

    public Girl (String name, int age, boolean child, boolean husband, boolean work) {
        this.name = name;
        this.age = age;
        this.child = child;
        this.husband = husband;
        this.work = work;
    }

    public String sayHello () {
        return "Привет! Меня зовут " + name + ", мне " + age + " лет. ";
    }

    public String hasAHusband () {
        if (husband == true) {
            return "У меня есть муж. ";
        }
        return "У меня нет мужа. ";
    }

    public String hasAChild () {
        if (child == true) {
            return "У меня есть ребёнок. ";
        }
        return "У меня нет детей. ";
    }

    public String hasAwork () {
        if (work == true) {
            return "Я работаю дизайнером. ";
        }
        return "У меня нет работы. ";
    }

    public void makeRepairs (Room room) {
        System.out.println(name + " поклеила обои в " + room + " объёмом " + room.getVolume() + " куб.м.");
    }

    public void insure (House house) {
        System.out.println(name + " оформила страховку на " +  house +  " по адресу: " + house.address);
    }

    public void toStudy (Human human) {
        System.out.println(name + " учится у " + human.name);
    }

    public void married (Boy boy) {
        System.out.println(name + " замужем за " + boy.name);
    }

    public void takeCareForGiraffe (Giraffe giraffe) {
        System.out.println(name + " гладит " + giraffe);
    }

    public void getAPet (Animal animal) {
        System.out.println(name + " хочет завести " + animal);
    }

    public void getInfo () {
        System.out.println(sayHello() + hasAHusband() + hasAChild() + hasAwork());
    }
}
