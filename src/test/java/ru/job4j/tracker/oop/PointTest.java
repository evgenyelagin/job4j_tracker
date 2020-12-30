package ru.job4j.tracker.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance3dFirst() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(4, 0, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(4, 0.001));
    }
    @Test
    public void distance3dSecond() {
        Point a = new Point(4, 0, 1);
        Point b = new Point(4, 0, 1);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(0, 0.001));
    }
    @Test
    public void distance3dThree() {
        Point a = new Point(4, 2, 2);
        Point b = new Point(2, 0, 1);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(3, 0.001));
    }
}