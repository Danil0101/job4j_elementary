package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private float fuel;
    private float fuelPrice = 10f;

    @Override
    public void go() {
        System.out.println("The bus is going");
    }

    @Override
    public void passengers(int num) {
        this.passengers = num;
    }

    @Override
    public float refuel(float fuel) {
        this.fuel += fuel;
        return fuel * fuelPrice;
    }
}
