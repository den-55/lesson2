package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));

        Room room = new Room(3, 3, 2, "Иван", true);
        Human human = new Human("Василий", 34, 78, 1.79, "программист");
        Giraffe giraffe = new Giraffe(9, 6, 1050, 51, true);
        House house = new House(8, 3, "Нижний Новгород, улица Есенина", "Дмитрий", true);
        Boy boy = new Boy("Костя", 25, true, true, true);
        Girl girl = new Girl("Наташа", 26, false, true, true);
        Animal animal = new Animal(101, true, true, 50, false);

        System.out.println("Что вы хотите посмотреть?");

        String s = read.readLine();

        switch (s) {
            case "посмотреть комнату":
                room.getInfo();
                room.protect(room, human);
                room.giveWarm(room, boy);
                break;
            case "посмотреть жирафа":
                giraffe.getInfo();
                break;
            case "посмотреть человека":
                human.getInfo();
                human.beFriends(boy);
                human.installAlarm(house);
                human.toBeAfraid(giraffe);
                human.toSell(animal);
                human.toSleep(room);
                human.toTeach(girl);
                break;
            case "посмотреть дом":
                house.getInfo();
                house.haveRoom(house, room);
                break;
            case "посмотреть парня":
                boy.getInfo();
                boy.boughtAHouse(house);
                boy.rentARoom(room);
                boy.beFriends(human);
                boy.married(girl);
                boy.lookGiraffe(giraffe);
                boy.trainTheAnimal(animal);
                break;
            case "посмотреть девушку":
                girl.getInfo();
                girl.married(boy);
                girl.getAPet(animal);
                girl.insure(house);
                girl.makeRepairs(room);
                girl.takeCareForGiraffe(giraffe);
                girl.toStudy(human);
                break;
            case "посмотреть животное":
                animal.getInfo();
                animal.hunts(animal, giraffe);
                animal.toHide(animal, room);
                break;
        }
    }
}
