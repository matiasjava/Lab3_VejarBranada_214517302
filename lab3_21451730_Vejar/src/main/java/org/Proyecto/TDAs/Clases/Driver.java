package org.Proyecto.TDAs.Clases;

import java.util.Date;

public class Driver {
    public int id;
    public String name;
    public String trainMaker;
    public Date horaPartida;
    public Station stationPartida;
    public Station stationLlegada;

    public Driver() {
    }

    public Driver(int id, String name, String trainMaker) {
        this.id = id;
        this.name = name;
        this.trainMaker = trainMaker;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrainMaker() {
        return trainMaker;
    }

    public void setTrainMaker(String trainMaker) {
        this.trainMaker = trainMaker;
    }

    public Date getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(Date horaPartida) {
        this.horaPartida = horaPartida;
    }

    public Station getStationPartida() {
        return stationPartida;
    }

    public void setStationPartida(Station stationPartida) {
        this.stationPartida = stationPartida;
    }

    public Station getStationLlegada() {
        return stationLlegada;
    }

    public void setStationLlegada(Station stationLlegada) {
        this.stationLlegada = stationLlegada;
    }
}
