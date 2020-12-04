package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String unknown = "Неизвестное слово. " + eng;
        return unknown;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus("pithon");
        System.out.println(say);
    }
}
