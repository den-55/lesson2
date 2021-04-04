package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader((new InputStreamReader(System.in)));

        Room room = new Room(3, 3, 2, "Иван", true);
        Human human = new Human("Василий", 34, 78, 1.79, "программист");
        Giraffe giraffe = new Giraffe(9, 6, 1050, 51, true);

        System.out.println("Что вы хотите посмотреть?");

        String s = read.readLine();

        switch (s) {
            case "посмотреть комнату":
                room.getInfo();
                break;
            case "посмотреть жирафа":
                giraffe.getInfo();
                break;
            case "посмотреть человека":
                human.getInfo();
                break;
        }
    }
}
