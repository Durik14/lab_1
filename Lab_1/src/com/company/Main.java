package com.company;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Xiaomi", 6, 3570, "Бюджетний");
        Mobile mobile1 = new Mobile("Samsung", 4, 8050, "Ігровий");
        GamesPC gamesPC = new GamesPC("GTA 5", "Action", 18, 2052);
        GreenTicket greenTicket = new GreenTicket("California",2,10000);
        System.out.println("name: " + mobile.name + "\nГарантія закінчиться : " + mobile.guarantee + " days" );
        mobile.Actions();


        System.out.println("\nTour: " + greenTicket.ChangeLearn + "\nperiod: " + greenTicket.time+" weeks ");
        greenTicket.howLong();
    }
}
