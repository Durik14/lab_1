package com.company;

public class Mobile {
    String name;
    double guarantee;      // гарантія
    double price;
    String type;


    public Mobile(String name, double guarantee, double price, String type) {
        this.name = name;
        this.guarantee = guarantee;
        this.price = price;
        this.type = type;
    }

    void Actions() {
        if (guarantee == 1) {
            price -= 170;
            System.out.println("Ціна мобільного пристрою: " + price + "  UAH");
        } else if (guarantee >= 2 && guarantee < 5) {
            price -= 35;
            System.out.println("Ціна мобільного пристрою: " + price + "  UAH");
        } else if (guarantee >= 5 && guarantee < 4) {
            price -= 20;
            System.out.println("Ціна мобільного пристрою: " + price + "  UAH");
        } else {
            System.out.println("Ціна мобільного пристрою: " + price + "  UAH");
        }
    }


}

