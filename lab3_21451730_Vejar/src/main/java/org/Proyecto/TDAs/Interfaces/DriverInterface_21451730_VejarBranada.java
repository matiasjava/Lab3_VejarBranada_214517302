package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Station_21451730_VejarBranada;

import java.util.Date;

/**
 * Interfaz donde se nombran los metodos utilizados por Driver
 */
public interface DriverInterface_21451730_VejarBranada {

    /**
     * Retorna la id
     *
     * @return id:int
     */
    public int getId();

    /**
     * Coloca la id.
     *
     * @param id:int
     */
    public void setId(int id);

    /**
     * Retorna el name.
     *
     * @return name:String
     */
    public String getName();

    /**
     * Coloca el name.
     *
     * @param name:String
     */
    public void setName(String name);

    /**
     * Retorna el trainmaker.
     *
     * @return trainmaker:String
     */
    public String getTrainMaker();

    /**
     * Coloca el trainmaker.
     *
     * @param trainMaker:String
     */
    public void setTrainMaker(String trainMaker);

    /**
     * Retorna la horapartida.
     *
     * @return horapartida: Date
     */
    public Date getHoraPartida();

    /**
     * Coloca horapartida.
     *
     * @param horaPartida:Date
     */
    public void setHoraPartida(Date horaPartida);

    /**
     * Retorna station partida.
     *
     * @return the station partida
     */
    public Station_21451730_VejarBranada getStationPartida();

    /**
     * Retorna stationpartida
     *
     * @return station21451730VejarBranadaPartida:Station_21451730_VejarBranada21451730VejarBranada
     */
    public void setStationPartida(Station_21451730_VejarBranada station21451730VejarBranadaPartida);

    /**
     * Retorna stationllegada.
     *
     * @return station21451730VejarBranadaLlegada:Station_21451730_VejarBranada21451730VejarBranada
     */
    public Station_21451730_VejarBranada getStationLlegada();

    /**
     *  Coloca stationllegada.
     *
     * @param station21451730VejarBranadaLlegada:Station_21451730_VejarBranada21451730VejarBranada
     */
    public void setStationLlegada(Station_21451730_VejarBranada station21451730VejarBranadaLlegada);













}
