package com.company;

public class House {

    private int id;
    private int area;
    private int numberOfFloors;
    private int numberOfRooms;
    private int price;

    public House(int id, int area, int numberOfFloors, int numberOfRooms, int price) {
        this.id = id;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getArea() {
        return area;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", area=" + area +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfRooms=" + numberOfRooms +
                ", price=" + price +
                '}';
    }
}
