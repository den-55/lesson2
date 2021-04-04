package com.company;


public class Room {
    private int length;
    private int height;
    private int width;
    private String owner;
    private boolean window;

    public Room(int length, int heigh, int width, String owner, boolean window) {
        this.length = length;
        this.height = heigh;
        this.width = width;
        this.owner = owner;
        this.window = window;
    }

    public int getSquare() {
        return length * width;
    }

    public int getVolume() {
        return length * height * width;
    }

    public String Owner() {
        return "Владелец комнаты: " + owner;
    }

    public String isThereAWindow() {
        if (window == true) {
            return "В комнате есть окно. ";
        }
        return "В комнате окон нет. ";
    }

    public void getInfo() {
        System.out.println("Эта очень уютная комната. Её длина " + length + "м, ширина " + width + "м, высота " + height + "м. Площадь комнаты: " + getSquare() + " квадратных метра. Объём: " + getVolume() + " кубических метров. " + isThereAWindow() + Owner());
    }

}
