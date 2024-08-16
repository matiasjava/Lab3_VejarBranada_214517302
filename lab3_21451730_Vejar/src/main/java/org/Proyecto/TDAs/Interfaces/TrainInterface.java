package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Driver;
import org.Proyecto.TDAs.Clases.PassengerCar;

import java.awt.*;

public interface TrainInterface {
    public int getId();

    public void setId(int id);

    public String getTrainMaker();

    public void setTrainMaker(String trainMaker);

    public int getSpeed();

    public void setSpeed(int speed);

    public int getStationStaytime();

    public void setStationStaytime(int stationStaytime);

    public Driver getDriverTrain();

    public void setDriverTrain(Driver driverTrain);

    public void addCar(PassengerCar carro, int position);

    public void removeCar(int position);

    public boolean isTrain();

    public int fetchCapacity();
}
