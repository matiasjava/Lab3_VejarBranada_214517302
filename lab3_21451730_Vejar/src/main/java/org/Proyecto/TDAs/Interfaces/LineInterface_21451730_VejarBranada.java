package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz donde se nombran los metodos utilizados por Line
 */
public interface LineInterface_21451730_VejarBranada {

    public List<Train_21451730_VejarBranada> TRAIN_21451730_VEJAR_BRANADAS = new ArrayList<>();

    /**
     * Retorna el id
     * @return id:int
     */
    public int getId();

    /**
     * Obtiene el nombre
     * @return name:String
     */
    public String getName();

    /**
     * Obtiene el railType
     * @return railType:String
     */
    public String getRailType();

    /**
     * Obtiene la lista de Sections
     * @return Lista de sections
     */
    public List<Section_21451730_VejarBranada> getSections();

    /**
     * Coloca el id
     *
     * @param id:int
     */
    public void setId(int id);

    /**
     * Coloca el name
     *
     * @param name:String
     */
    public void setName(String name);
    /**
     * Coloca el RailType
     *
     * @param railType:String
     */
    public void setRailType(String railType);
    /** Coloca las sections
     *
     * @param section21451730VejarBranadas:Section_21451730_VejarBranada
     */
    public void setSections(List<Section_21451730_VejarBranada> section21451730VejarBranadas);

    /**
     * Método que permite determinar el largo total de una línea
     *
     * @return int
     */
    public int line_Length();

    /**
     * Método que permite determinar el trayecto entre una estación origen y una final (largo total entre una estación origen y una estación destino).
     * @param station1_Name:String
     * @param station2_Name:String
     * @return int
     */
    public int line_Section_Length(String station1_Name, String station2_Name);

    /**
     * Función que permite determinar el costo total (monetario) de recorrer una línea
     *
     * @return int
     */
    public int line_Cost();
    /**
     * Método que permite determinar el costo de un trayecto entre una estación origen y una final.
     * @param station1_Name:String
     * @param station2_Name:String
     * @return int
     */
    public int line_Section_Cost(String station1_Name, String station2_Name);
    /**
     * Método que permite añadir tramos a una línea.
     * @param section21451730VejarBranada:Section_21451730_VejarBranada
     */
    public void line_Add_Section(Section_21451730_VejarBranada section21451730VejarBranada);

    /** Método que permite determinar si un elemento cumple con las
     * restricciones señaladas en apartados anteriores en relación a las estaciones y tramos para poder conformar una línea.
     *
     *
     *
     *
     * @return Boolean
     */
    public boolean isLine();

    /**
     * Retorna los Drivers
     *
     * @return drivers:List<Driver_21451730_VejarBranada>
     */
    public List<Driver_21451730_VejarBranada> getDrivers();
    /**
     * Retorna los trenes
     *
     * @return train21451730VejarBranadas:List<Train_21451730_VejarBranada>
     */
    public List<Train_21451730_VejarBranada> getTrains();

    /**
     * Coloca los trenes
     *
     * @param train21451730VejarBranadas:List<Train_21451730_VejarBranada>
     */
    public void setTrains(List<Train_21451730_VejarBranada> train21451730VejarBranadas);

    /**
     * Tiene repetidos boolean.
     *
     * @param lista the lista
     * @return the boolean
     */
    public boolean tieneRepetidos(List<Integer> lista);

}


