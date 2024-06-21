package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.StationInterface;

public class Station implements StationInterface {
    public int id;
    public String name;
    public String type;
    public int stopTime;

    public Station() {
    }

    public Station(int id, String name, String type, int stopTime){
        this.id = id;
        this.name = name;
        this.stopTime = stopTime;

        //Verificación type
        if (!type.equals("r") && !type.equals("c") && !type.equals("m") && !type.equals("t")) {
            throw new IllegalArgumentException("El valor de type tiene que ser obligatoriamente: 'r', 'c', 'm' o 't'");
        }
        this.type = type;

    }

    /**
     *
     * @return int
     */
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }
}