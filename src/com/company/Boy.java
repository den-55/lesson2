package com.company;

public class Boy {

    String name;
    int age;
    boolean child;
    boolean wife;
    boolean work;

    public Boy (String name, int age, boolean child, boolean wife, boolean work) {
        this.name = name;
        this.age = age;
        this.child = child;
        this.wife = wife;
        this.work = work;
    }

    public String sayHello () {
        return "Привет! Меня зовут " + name + ", мне " + age + " лет. ";
    }

    public String hasAWife () {
        if (wife == true) {
            return "У меня есть жена. ";
        }
        return "У меня нет жены. ";
    }

    public String hasAChild () {
        if (child == true) {
            return "У меня есть ребёнок. ";
        }
        return "У меня нет детей. ";
    }

    public String hasAWork () {
        if (work == true) {
            return "Я работаю инженером. ";
        }
        return "У меня нет работы. ";
    }

    public void rentARoom (Room room) {
        System.out.println(name + " арендовал " + room + " площадью " + room.getSquare() + " кв.м.");
    }

    public void boughtAHouse (House house) {
        System.out.println(name + " купил " +  house +  " по адресу: " + house.address);
    }

    public void beFriends (Human human) {
        System.out.println(name + " дружит с " + human.name);
    }

    public void married (Girl girl) {
        System.out.println(name + " женат на " + girl.name);
    }

    public void lookGiraffe (Giraffe giraffe) {
        System.out.println(name + " по выходным ходит в зоопарк смотреть на " + giraffe);
    }

    public void trainTheAnimal (Animal animal) {
        System.out.println(name + " дрессирует " + animal);
    }

    public void getInfo () {
        System.out.println(sayHello() + hasAWife() + hasAChild() + hasAWork());
    }
}
