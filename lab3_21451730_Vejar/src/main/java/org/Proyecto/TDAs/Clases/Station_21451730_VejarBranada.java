package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.StationInterface_21451730_VejarBranada;

/**
 * Esta clase representa una estación en el sistema de trenes.
 * Una estación es un punto dentro de la red donde los trenes se detienen
 * para permitir el embarque y desembarque de pasajeros.
 */
public class Station_21451730_VejarBranada implements StationInterface_21451730_VejarBranada {
    /**
     * Variable: Id.
     */
    public int id;
    /**
     * Variable: Name.
     */
    public String name;
    /**
     * Variable: Type.
     */
    public String type;
    /**
     * Variable: Stop time.
     */
    public int stopTime;

    /**
     * Constructor vacio: Instancia una station sin atributos
     */
    public Station_21451730_VejarBranada() {
    }

    /**
     * Constructor: Instancia una station
     *
     * @param id:int
     * @param name:String
     * @param type:String
     * @param stopTime:int
     */
    public Station_21451730_VejarBranada(int id, String name, String type, int stopTime){
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
     * Retorna el id
     *
     * @return id:int
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna el name
     *
     * @return name:String
     */
    public String getName() {
        return name;
    }

    /**
     * Retorna el type
     *
     * @return type:String
     */
    public String getType() {
        return type;
    }

    /**
     * Retorna StopTime
     *
     * @return stopTime:int
     */
    public int getStopTime() {
        return stopTime;
    }

    /**
     * Coloca el id
     *
     * @param id:int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Coloca name
     *
     * @param name:String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Coloca el Type
     *
     * @param type:int
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Coloca el stoptime
     *
     * @param stopTime:int
     */
    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }
}