package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Station_21451730_VejarBranada;

/**
 * Interfaz donde se nombran los metodos utilizados por Section.
 */
public interface SectionInterface_21451730_VejarBranada {

    /**
     * Retorna la primera estacion
     *
     * @return point1:Station
     */
    public Station_21451730_VejarBranada getPoint1();

    /**
     * Retorna la segunda estacion
     *
     * @return point2:Station
     */
    public Station_21451730_VejarBranada getPoint2();

    /**
     * Retorna la distancia
     *
     * @return Distance:int
     */
    public int getDistance();

    /**
     * Retorna el costo
     *
     * @return Cost:int
     */
    public int getCost();

    /**
     * Coloca la primera estacion
     *
     * @param point1:Station
     */
    public void setPoint1(Station_21451730_VejarBranada point1);

    /**
     * Coloca la segunda estacion
     *
     * @param point2:Station
     */
    public void setPoint2(Station_21451730_VejarBranada point2);

    /**
     * Coloca la distancia
     *
     * @param distance:int
     */
    public void setDistance(int distance);

    /**
     * Coloca el costo
     *
     * @param cost:int
     */
    public void setCost(int cost);

    /**
     * Retorna el tiempo de llegada
     *
     * @return TiempodeLlegada:int
     */
    public int getTiempoDeLlegada();

    /**
     * Coloca el tiempo de llegada
     *
     * @param tiempoDeLlegada:int
     */
    public void setTiempoDeLlegada(int tiempoDeLlegada);

}
