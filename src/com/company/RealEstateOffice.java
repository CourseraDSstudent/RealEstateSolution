package com.company;

public interface RealEstateOffice {

    House sellHouse(int money, int houseId);

    House rentHouse(int monthlyRent, int houseId, int numberOfMonths);

}
