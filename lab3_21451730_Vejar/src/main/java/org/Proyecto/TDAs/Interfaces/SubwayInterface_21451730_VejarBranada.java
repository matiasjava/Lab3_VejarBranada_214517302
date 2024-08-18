package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Driver_21451730_VejarBranada;
import org.Proyecto.TDAs.Clases.Station_21451730_VejarBranada;
import org.Proyecto.TDAs.Clases.Train_21451730_VejarBranada;

import java.util.Date;
import java.util.List;

/**
 * Interfaz donde se nombran los metodos utilizados por Subway.
 */
public interface SubwayInterface_21451730_VejarBranada {
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
     * Retorna name.
     *
     * @return name:String
     */
    public String getName();

    /**
     * Coloca name.
     *
     * @param name:String
     */
    public void setName(String name);
    /**
     * Método que permite expresar una red de metro en formato String (para ser posteriormente impresa por pantalla con métodos como System.out.println)
     * @return String
     */
    public String toString();

    /**
     * Metodo que asigna un tren a una línea.
     *
     * @param train21451730VejarBranada:Train_21451730_VejarBranada
     * @param line:LineInterface_21451730_VejarBranada
     */
    public void assignTrainToLine(Train_21451730_VejarBranada train21451730VejarBranada, LineInterface_21451730_VejarBranada line);

    /**
     * Metodo que asigna un conductor a un tren considerando un tiempo de partida. una estación de partida y una de llegada.
     *
     * @param train21451730VejarBranada:Train
     * @param driver:Driver
     * @param departureTime:Date
     * @param departureStation21451730VejarBranada:Station
     * @param arrivalStation21451730VejarBranada:Station
     */
    public void assignDriverToTrain(Train_21451730_VejarBranada train21451730VejarBranada, Driver_21451730_VejarBranada driver, Date departureTime, Station_21451730_VejarBranada departureStation21451730VejarBranada, Station_21451730_VejarBranada arrivalStation21451730VejarBranada);

    /**
     * Método que permite determinar dónde se encuentra un tren a partir de una hora indicada del día
     *
     * @param train21451730VejarBranada:Train
     * @param time:Date
     * @return String
     */
    public String whereIsTrain(Train_21451730_VejarBranada train21451730VejarBranada, Date time);

    /**
     * Método que permite ir armando el recorrido del tren a partir de una hora especificada y que retorna la lista de estaciones futuras por recorrer.
     *
     * @param train21451730VejarBranada:Train
     * @param time:Date
     * @return List<Station_21451730_VejarBranada>
     */
    public List<Station_21451730_VejarBranada> trainPath(Train_21451730_VejarBranada train21451730VejarBranada, Date time);


    /**
     * Buscar station por id station 21451730 vejar branada 21451730 vejar branada.
     *
     * @param id the id
     * @return the station 21451730 vejar branada 21451730 vejar branada
     */
    public Station_21451730_VejarBranada buscarStationPorId(int id);


}
