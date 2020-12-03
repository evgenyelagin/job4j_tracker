package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item point) {
        point.setId(ids++);
        items[size++] = point;
        return point;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item element = items[index];
            if (element.getId() == id) {
                rsl = element;
                break;
            }
        }
        return rsl;
    }
}