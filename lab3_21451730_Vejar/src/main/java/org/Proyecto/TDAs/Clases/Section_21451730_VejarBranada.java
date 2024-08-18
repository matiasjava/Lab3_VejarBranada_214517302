package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.SectionInterface_21451730_VejarBranada;

/**
 * Esta clase representa una sección de una línea en el sistema de trenes.
 * Una sección es un segmento de la vía que conecta dos estaciones y puede incluir
 * detalles como la distancia, la velocidad permitida, y el tipo de vía.
 */
public class Section_21451730_VejarBranada implements SectionInterface_21451730_VejarBranada {
    /**
     * Variable: Point 1.
     */
    Station_21451730_VejarBranada point1;
    /**
     * Variable: Point 2.
     */
    Station_21451730_VejarBranada point2;
    /**
     * Variable: Distance.
     */
    public int distance;
    /**
     * Variable: Cost.
     */
    public int cost;
    /**
     * Variable: Tiempo de llegada.
     */
    public int tiempoDeLlegada;


    /**
     * Constructor vacio: Instancia un Section sin atributos
     */
    public Section_21451730_VejarBranada() {
    }

    /**
     * Constructor: Instancia un Section
     *
     * @param point1:Station
     * @param point2:Station
     * @param distance:int
     * @param cost:int
     */
    public Section_21451730_VejarBranada(Station_21451730_VejarBranada point1, Station_21451730_VejarBranada point2, int distance, int cost) {
        this.point1 = point1;
        this.point2 = point2;
        this.distance = distance;
        this.cost = cost;
    }



    /**
     * Retorna la primera estacion
     *
     * @return point1:Station
     */

    public Station_21451730_VejarBranada getPoint1() {
        return point1;
    }
    /**
     * Retorna la segunda estacion
     *
     * @return point2:Station
     */
    public Station_21451730_VejarBranada getPoint2() {
        return point2;
    }

    /**
     * Retorna la distancia
     *
     * @return Distance:int
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Retorna el costo
     *
     * @return Cost:int
     */
    public int getCost() {
        return cost;
    }
    /**
     * Coloca la primera estacion
     *
     * @param point1:Station
     */
    public void setPoint1(Station_21451730_VejarBranada point1) {
        this.point1 = point1;
    }
    /**
     * Coloca la segunda estacion
     *
     * @param point2:Station
     */
    public void setPoint2(Station_21451730_VejarBranada point2) {
        this.point2 = point2;
    }
    /**
     * Coloca la distancia
     *
     * @param distance:int
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
    /**
     * Coloca el costo
     *
     * @param cost:int
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    /**
     * Retorna el tiempo de llegada
     *
     * @return TiempodeLlegada:int
     */
    public int getTiempoDeLlegada() {
        return tiempoDeLlegada;
    }
    /**
     * Coloca el tiempo de llegada
     *
     * @param tiempoDeLlegada:int
     */
    public void setTiempoDeLlegada(int tiempoDeLlegada) {
        this.tiempoDeLlegada = tiempoDeLlegada;
    }

}
