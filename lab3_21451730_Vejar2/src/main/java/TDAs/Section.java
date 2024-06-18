package TDAs;

public class Section {
    Station point1;
    Station point2;
    public int distance;
    public int cost;

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
}



