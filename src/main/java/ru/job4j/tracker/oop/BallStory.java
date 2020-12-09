package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball colobok = new Ball();
        Hare kosoy = new Hare();
        Fox rusty = new Fox();
        Wolf seriy = new Wolf();
        colobok.goOutFromHome();
        kosoy.tryEat(colobok);
        rusty.tryEat(colobok);
        seriy.tryEat(colobok);
    }
}
