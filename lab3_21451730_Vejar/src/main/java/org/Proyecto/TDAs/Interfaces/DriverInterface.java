package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Station;

import java.util.Date;

public interface DriverInterface {

    public int getId();
    public void setId(int id);
    public String getName();
    public void setName(String name);
    public String getTrainMaker();
    public void setTrainMaker(String trainMaker);
    public Date getHoraPartida();
    public void setHoraPartida(Date horaPartida);
    public Station getStationPartida();
    public void setStationPartida(Station stationPartida);
    public Station getStationLlegada();
    public void setStationLlegada(Station stationLlegada);













}
