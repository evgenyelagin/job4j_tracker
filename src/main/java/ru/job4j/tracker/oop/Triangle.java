package ru.job4j.tracker.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double period;
        return period = (a + b + c) / 2;
    }


    public boolean exist(double a, double b, double c) {
        return ((a + c > b) && (a + b > c) && (b + c > a));
    }


    public double area(Point first, Point second, Point third) {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            double area = sqrt(p * (p - ab) * (p - ac) * (p - bc));
            return area;
        }
        return rsl;
    }
}