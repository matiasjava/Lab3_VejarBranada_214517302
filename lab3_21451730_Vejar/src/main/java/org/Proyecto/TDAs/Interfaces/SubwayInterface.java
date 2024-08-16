package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Driver;
import org.Proyecto.TDAs.Clases.Station;
import org.Proyecto.TDAs.Clases.Train;

import java.awt.*;
import java.util.Date;

public interface SubwayInterface {
    public int getId();

    public void setId(int id);

    public String getName();

    public void setName(String name);

    public String toString();

    public void assignTrainToLine(Train train, LineInterface line);

    public void assignDriverToTrain(Train train, Driver driver, Date departureTime, Station departureStation, Station arrivalStation);

    public String whereIsTrain(Train train, Date time);

    public Train buscarTrainPorId(int id);

    public Station buscarStationPorId(int id);


}
