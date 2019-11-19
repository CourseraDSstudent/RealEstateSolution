package com.company;

public class KleftogatosRealEstate implements RealEstateOffice {

    SpitogatosRealEstate spitogatos;

    public KleftogatosRealEstate(SpitogatosRealEstate spitogatos) {
        this.spitogatos = spitogatos;
    }

    @Override
    public House sellHouse(int money, int houseId) {
        for(House house : spitogatos.getHousesToSell()) {
            if(house.getId() == houseId && house.getPrice() + 10000 == money) {
                System.out.println("Kleftogatos scammed the client and sells the house: " + house.toString());
                return house;
            }
        }
        System.out.println("cannot sell the house with id : " + houseId);
        return null;
    }


    @Override
    public House rentHouse(int monthlyRent, int houseId, int numberOfMonths) {
        return null;
    }
}
