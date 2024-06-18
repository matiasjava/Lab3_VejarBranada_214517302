package TDAs;

public class Section extends Station {
    Station point1;
    Station point2;
    int distance;
    int cost;

    public Section(int id, String name, String type, int stopTime) {
        super(id, name, type, stopTime);
    }

    public Section(int id, String name, String type, int stopTime, Station point1, Station point2, int distance, int cost) {
        super(id, name, type, stopTime);
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
