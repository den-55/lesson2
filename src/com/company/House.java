package com.company;

public class House {

    int numberOfRooms;
    int numberOfFloors;
    String address;
    String owner;
    Boolean insurancePolicy;

    public House (int numberOfRooms, int numberOfFloors, String address, String owner, Boolean insurancePolicy) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
        this.owner = owner;
        this.insurancePolicy = insurancePolicy;
    }

    public String takeOwner () {
        return "Владелец дома: " + owner + ". ";
    }

    public String takeAddress() {
        return "Дом находится по адресу: " + address + ". ";
    }

    public String alarmSystem () {
        if (insurancePolicy == true) {
            return "и у него имеется сигнализация. ";
        }
        return "но у него имеется сигнализация. ";
    }

    public String houseInsurance () {
        if (insurancePolicy == true) {
            return "Дом застрахован ";
        }
        return "Дом не застрахован ";
    }

    public void haveRoom (House house, Room room) {
        System.out.println(house + " имеет " + room + " площадью " + room.getSquare() + " кв.м.");
    }

    public void getInfo () {
        System.out.println("Это большой дом, в нём " + numberOfFloors + " этажа и " + numberOfRooms + " комнат. " + takeOwner() + takeAddress() + houseInsurance() + alarmSystem());
    }
}
