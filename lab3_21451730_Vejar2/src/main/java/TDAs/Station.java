package TDAs;

public class Station {
    public int id;
    public String name;
    public String type;
    public int stopTime;

    public Station() {
    }

    public Station(int id, String name, String type, int stopTime){
        this.id = id;
        this.name = name;
        this.type = type;
        this.stopTime = stopTime;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getStopTime() {
        return stopTime;
    }
}

