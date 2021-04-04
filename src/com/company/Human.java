package com.company;

public class Human {
    private String name;
    private int age;
    private int weight;
    private double height;
    private String profession;

    public Human(String name, int age, int weight, double height, String profession) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.profession = profession;
    }

    public String sayHello() {
        return "Привет! Меня зовут " + name + ". ";
    }

    public String sayAge() {
        return "Мне " + age + ". ";
    }

    public String professionDescription() {
        return "По профессии я " + profession + ". ";
    }

    public int getBodyMassIndex() {
        return (int) (weight / Math.pow(height, 2));
    }

    public String bodyMassIndexDescription() {
        int bmi = getBodyMassIndex();
        if (bmi < 17) {
            return " (Выраженный дефицит массы тела). ";
        } else if (17 < bmi && bmi < 19) {
            return " (Недостаточная (дефицит) масса тела). ";
        } else if (19 <= bmi && bmi < 25) {
            return " (Норма). ";
        } else if (25 <= bmi && bmi < 30) {
            return " (Избыточная масса тела (предожирение)). ";
        } else if (30 <= bmi && bmi < 35) {
            return " (Ожирение). ";
        } else if (35 <= bmi && bmi < 40) {
            return " (Ожирение резкое). ";
        } else {
            return " (Очень резкое ожирение). ";
        }
    }

    public void getInfo() {
        System.out.println(sayHello() + sayAge() + "Мой рост - " + height + " м, вес " + weight + " кг. " + "Мой индекс массы тела - " + getBodyMassIndex() + bodyMassIndexDescription() + professionDescription());
    }
}
