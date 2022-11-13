package com.company;

public class GamesPC {
        String name;
        String type;
        double allowedForUse;        //З якого віку рекомендується
        double price;

        public GamesPC (String name, String type, double allowedForUse, double price) {
            this.name = name;
            this.type = type;
            this.allowedForUse = allowedForUse;
            this.price = price;
        }

        double lycky() {
            double luck = price * 0.7;
            return luck;
        }

        void discaunted() {
            switch (type) {
                case "Action": {
                    price -= 40;
                    System.out.println("Ціна зі знижкою: " + price + " грн");
                }
                case "Strategy": {
                    price -= 65;
                    System.out.println("Ціна зі знижкою: " + price + " грн");
                }
                case "Пригоди":{
                    price -= 20;
                    System.out.println("Ціна зі знижкою: " + price + " грн");
                }
                default:
                    System.out.println("Знижки на даний товар немає");
            }
        }
    }

