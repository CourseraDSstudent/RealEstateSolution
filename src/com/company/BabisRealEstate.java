package com.company;

public class BabisRealEstate implements RealEstateOffice {

    public BabisRealEstate() {
    }

    private House myOnlyHouseToSell = new House(100, 90, 1, 5, 80000);

    private House myOnlyHouseToRent = new House(101, 200, 3, 9, 200000);

    @Override
    public House sellHouse(int money, int houseId) {
        if (money == myOnlyHouseToSell.getPrice() && houseId == myOnlyHouseToSell.getId()) {
            return myOnlyHouseToSell;
        } else {
            return null;
        }
    }

    @Override
    public House rentHouse(int monthlyRent, int houseId, int numberOfMonths) {
        if (houseId == myOnlyHouseToRent.getId() && monthlyRent == myOnlyHouseToRent.getPrice() / 120)
            return myOnlyHouseToRent;
        else
            return null;
    }
}
