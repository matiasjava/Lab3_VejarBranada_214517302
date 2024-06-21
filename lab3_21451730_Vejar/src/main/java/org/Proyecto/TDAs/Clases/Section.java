package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.SectionInterface;

public class Section implements SectionInterface {
    Station point1;
    Station point2;
    public int distance;
    public int cost;


    public Section() {
    }

    public Section(Station point1, Station point2, int distance, int cost) {
        this.point1 = point1;
        this.point2 = point2;
        this.distance = distance;
        this.cost = cost;
    }

    public Station getPoint1() {
        return point1;
    }

    public Station getPoint2() {
        return point2;
    }

    public int getDistance() {
        return distance;
    }

    public int getCost() {
        return cost;
    }

    public void setPoint1(Station point1) {
        this.point1 = point1;
    }

    public void setPoint2(Station point2) {
        this.point2 = point2;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
