package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Driver_21451730_VejarBranada;
import org.Proyecto.TDAs.Clases.PassengerCar_21451730_VejarBranada;

/**
 * Interfaz donde se nombran los metodos utilizados por Train.
 */
public interface TrainInterface_21451730_VejarBranada {
    /**
     * Retorna id.
     *
     * @return id:int
     */
    public int getId();

    /**
     * Coloca id.
     *
     * @param id:int
     */
    public void setId(int id);

    /**
     * Retorna train maker.
     *
     * @return trainmaker:String
     */
    public String getTrainMaker();

    /**
     * Coloca train maker.
     *
     * @param trainMaker:String
     */
    public void setTrainMaker(String trainMaker);

    /**
     * Retorna speed.
     *
     * @return speed:int
     */
    public int getSpeed();

    /**
     * Coloca speed.
     *
     * @param speed:int
     */
    public void setSpeed(int speed);

    /**
     * Retorna station staytime.
     *
     * @return stationstaytime:int
     */
    public int getStationStaytime();

    /**
     * Coloca station staytime.
     *
     * @param stationStaytime:int
     */
    public void setStationStaytime(int stationStaytime);

    /**
     * Retorna drivertrain.
     *
     * @return drivertrain:driver
     */
    public Driver_21451730_VejarBranada getDriverTrain();

    /**
     * Coloca drivertrain.
     *
     * @param driverTrain:driver
     */
    public void setDriverTrain(Driver_21451730_VejarBranada driverTrain);

    /**
     * Metodo que añade un carro de pasajeros en un tren en la posición establecida
     *
     * @param carro:Pcar
     * @param position:int
     */
    public void addCar(PassengerCar_21451730_VejarBranada carro, int position);

    /**
     * Metodo que remueve un carro de pasajeros en un tren de la posición establecida
     *
     * @param position:int
     */
    public void removeCar(int position);

    /**
     * Metodo que dado un tren, verifica si este cumple con las especificaciones de los carros de pasajeros para un tren.
     *
     * @return boolean
     */
    public boolean isTrain();

    /**
     * Metodo Dado un tren, entrega como resultado la capacidad máxima de pasajeros de éste.
     *
     * @return int
     */
    public int fetchCapacity();
}
