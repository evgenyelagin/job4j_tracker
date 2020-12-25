package ru.job4j.tracker.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area(a, b, c);
        assertThat(rsl, closeTo(8, 0.001));
    }
    @Test
    public void period2() {
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area(a, b, c);
        assertThat(rsl, closeTo(1, 0.001));
    }
    @Test
    public void period3() {
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        Point c = new Point(6, 2);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area(a, b, c);
        assertThat(rsl, closeTo(3, 0.001));
    }
}