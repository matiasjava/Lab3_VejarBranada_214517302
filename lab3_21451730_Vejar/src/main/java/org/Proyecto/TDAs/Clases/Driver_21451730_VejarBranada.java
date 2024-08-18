package org.Proyecto.TDAs.Clases;

import java.util.Date;


/**
 * Esta clase representa un conductor de tren en el sistema.
 * La clase incluye información sobre el conductor, como su
 * nombre, identificación, y otros atributos relacionados.
 */
public class Driver_21451730_VejarBranada {
    /**
     * Atributo: Id: int.
     */
    public int id;
    /**
     * Atributo: Name: String.
     */
    public String name;
    /**
     * Atributo: Trainmaker: String.
     */
    public String trainMaker;
    /**
     * Atributo: Horapartida: Date.
     */
    public Date horaPartida;
    /**
     * Atributo: Station21451730VejarBranadaPartida: Station_21451730_VejarBranada.
     */
    public Station_21451730_VejarBranada station21451730VejarBranadaPartida;
    /**
     * Atributo: Station21451730VejarBranadaLlegada: Station_21451730_VejarBranada.
     */
    public Station_21451730_VejarBranada station21451730VejarBranadaLlegada;

    /**
     * Constructor Vacio: Instancia un Driver sin atributos
     * @return Driver:
     */
    public Driver_21451730_VejarBranada() {
    }

    /**
     * Constructor: Instancia un Driver.
     *
     * @param id         Id del conductor: int
     * @param name       Nombre del conductor: String
     * @param trainMaker Fabricante del constructor: String
     *
     * @return Driver
     */
    public Driver_21451730_VejarBranada(int id, String name, String trainMaker) {
        this.id = id;
        this.name = name;
        this.trainMaker = trainMaker;
    }

    /**
     * Retorna la id
     *
     * @return id:int
     */
    public int getId() {
        return id;
    }

    /**
     * Coloca la id.
     *
     * @param id:int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna el name.
     *
     * @return name:String
     */
    public String getName() {
        return name;
    }

    /**
     * Coloca el name.
     *
     * @param name:String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna el trainmaker.
     *
     * @return trainmaker:String
     */
    public String getTrainMaker() {
        return trainMaker;
    }

    /**
     * Coloca el trainmaker.
     *
     * @param trainMaker:String
     */
    public void setTrainMaker(String trainMaker) {
        this.trainMaker = trainMaker;
    }

    /**
     * Retorna la horapartida.
     *
     * @return horapartida: Date
     */
    public Date getHoraPartida() {
        return horaPartida;
    }

    /**
     * Coloca horapartida.
     *
     * @param horaPartida:Date
     */
    public void setHoraPartida(Date horaPartida) {
        this.horaPartida = horaPartida;
    }

    /**
     * Retorna stationpartida
     *
     * @return station21451730VejarBranadaPartida:Station_21451730_VejarBranada21451730VejarBranada
     */
    public Station_21451730_VejarBranada getStationPartida() {
        return station21451730VejarBranadaPartida;
    }

    /**
     * Coloca stationPartida.
     *
     * @param station21451730VejarBranadaPartida
     */
    public void setStationPartida(Station_21451730_VejarBranada station21451730VejarBranadaPartida) {
        this.station21451730VejarBranadaPartida = station21451730VejarBranadaPartida;
    }

    /**
     * Retorna stationllegada.
     *
     * @return station21451730VejarBranadaLlegada:Station_21451730_VejarBranada21451730VejarBranada
     */
    public Station_21451730_VejarBranada getStationLlegada() {
        return station21451730VejarBranadaLlegada;
    }

    /**
     *  Coloca stationllegada.
     *
     * @param station21451730VejarBranadaLlegada:Station_21451730_VejarBranada21451730VejarBranada
     */
    public void setStationLlegada(Station_21451730_VejarBranada station21451730VejarBranadaLlegada) {
        this.station21451730VejarBranadaLlegada = station21451730VejarBranadaLlegada;
    }
}
