package com.company;

public class GreenTicket {
    String ChangeLearn;      //Навчання по обміну
    double time;
    double price;


    public GreenTicket(String ChangeLearn, double time, double price) {
        this.ChangeLearn = ChangeLearn;
        this.time = time;
        this.price = price;
    }

    void howLong(){
        if (time == 1){
            price=price;
            System.out.println(" " + price + "  UAH");}
        else if (time > 1 ^ time <= 3){
            price-=500;
            System.out.println("навчання тривалістю менше одного тижня : " + price + "  UAH");}
        else{
            price-=1000;
            System.out.println("навчання тривалістю менше одного тижня : " + price + "  UAH");}
    }
    double bestChange(){
        double e = price/2;
        return e;}
}

