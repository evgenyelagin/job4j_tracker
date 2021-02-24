package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[items.length];
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                namesWithoutNull[count] = items[i];
                count++;
            }
        }
        return Arrays.copyOf(namesWithoutNull, count);
    }

    public Item findByName(String key) {
        Item rsl = null;
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item id = items[i];
            if (id.equals(key));
            rsl = id;
            size++;
        }
        return rsl;
    }
}
