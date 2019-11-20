package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<House> houses = new ArrayList<>();

        houses.add(new House(0, 100, 1, 4, 60000));
        houses.add(new House(1, 180, 2, 7, 120000));
        houses.add(new House(2, 140, 1, 6, 100000));

        SpitogatosRealEstate spitogatos = new SpitogatosRealEstate(houses);


        House theHouseIBought = spitogatos.sellHouse(60000, 0);

        if (theHouseIBought != null)
            System.out.println("YAY ! I bought a house with area : " + theHouseIBought.getArea());

        House theSecondHouseIBought = spitogatos.sellHouse(10000, 1);

        //We have the 2 ways below to protect the sstem from null pointer exception
        try {
            System.out.println("YAY ! I bought a house with area : " + theSecondHouseIBought.getArea());
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
        if (theSecondHouseIBought != null)
            System.out.println("YAY ! I bought a house with area : " + theSecondHouseIBought.getArea());

        House rentedHouse = spitogatos.rentHouse(2333, 12, 12);
        System.out.println("I rented my house from spitogatos: " + rentedHouse.toString());

        System.out.println("This is the GITHUB addition!!! YEAHHHHH");

    }
}
