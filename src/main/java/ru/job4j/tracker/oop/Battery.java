package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(100);
        Battery secondBattery = new Battery(65);
        System.out.println("first battery : " + firstBattery.load + ". second battery: " + secondBattery.load);
        firstBattery.exchange(secondBattery);
        System.out.println("first battery after exchange : " + firstBattery.load + ". second battery: " + secondBattery.load);
    }
}
