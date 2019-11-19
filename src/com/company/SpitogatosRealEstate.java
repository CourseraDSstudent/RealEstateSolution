package com.company;

import java.util.ArrayList;
import java.util.List;

public class SpitogatosRealEstate implements RealEstateOffice {

    private List<House> housesToSell;
    private List<House> housesToRent;

    public SpitogatosRealEstate(List<House> housesToSell) {
        this.housesToSell = housesToSell;
        housesToRent = new ArrayList<>();
        housesToRent.add(new House(10, 70, 1, 4, 80000));
        housesToRent.add(new House(11, 120, 2, 8, 180000));
        housesToRent.add(new House(12, 180, 3, 18, 280000));
    }

    public List<House> getHousesToSell() {
        return housesToSell;
    }

    public void setHousesToSell(List<House> housesToSell) {
        this.housesToSell = housesToSell;
    }

    public List<House> getHousesToRent() {
        return housesToRent;
    }

    public void setHousesToRent(List<House> housesToRent) {
        this.housesToRent = housesToRent;
    }

    @Override
    public House sellHouse(int money, int houseId) {
        for (int i = 0; i < housesToSell.size(); i++) {
            if (houseId == housesToSell.get(i).getId()) {
                if (money == housesToSell.get(i).getPrice()) {
                    System.out.println("Spitogatos is selling the house with id " + houseId);
                    return housesToSell.get(i);
                } else {
                    System.out.println("The money is no correct");
                    return null;
                }
            }
        }

        System.out.println("Spitogatos does not have the house with id " + houseId);
        return null;
    }

    @Override
    public House rentHouse(int monthlyRent, int houseId, int numberOfMonths) {
        for (int i = 0; i < housesToRent.size(); i++) {
            if (houseId == housesToRent.get(i).getId() && monthlyRent == housesToRent.get(i).getPrice() / 120) {
                System.out.println("Spitogatos is renting the house with id " + houseId);
                return housesToRent.get(i);
            }
        }
        System.out.println("Spitogatos does cannot rent the house with id " + houseId);
        return null;
    }
}
