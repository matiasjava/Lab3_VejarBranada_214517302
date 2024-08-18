package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface_21451730_VejarBranada;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa una línea regular en el sistema de transporte.
 *  * Implementa la interfaz LineInterface_21451730_VejarBranada,
 *  * proporcionando la funcionalidad específica para las líneas que forman un
 *  * recorrido regular.
 */
public class LineRegular_21451730_VejarBranada implements LineInterface_21451730_VejarBranada {
    /**
     * Variable: Id.
     */
    public int id;
    /**
     * Variable: Name.
     */
    public String name;
    /**
     * Variable: Rail type.
     */
    public String railType;
    /**
     * Variable: Section 21451730 vejar branadas.
     */
    public List<Section_21451730_VejarBranada> section21451730VejarBranadas = new ArrayList<>();
    /**
     * Variable: Train 21451730 vejar branadas.
     */
    public List<Train_21451730_VejarBranada> train21451730VejarBranadas = new ArrayList<>();
    /**
     * Variable: Drivers.
     */
    public List<Driver_21451730_VejarBranada> drivers = new ArrayList<>();

    /**
     * Instantiates a new Line regular 21451730 vejar branada.
     */
    public LineRegular_21451730_VejarBranada() {
    }

    /**
     * Instantiates a new Line regular 21451730 vejar branada.
     *
     * @param id                           the id
     * @param name                         the name
     * @param railType                     the rail type
     * @param section21451730VejarBranadas the section 21451730 vejar branadas
     */
    public LineRegular_21451730_VejarBranada(int id, String name, String railType, List<Section_21451730_VejarBranada> section21451730VejarBranadas) {
        this.id = id;
        this.name = name;
        this.railType = railType;
        this.section21451730VejarBranadas = section21451730VejarBranadas;
    }

    /**
     * Retorna el id
     * @return id:int
     */
    public int getId() {
        return id;
    }
    /**
     * Obtiene el nombre
     * @return name:String
     */
    public String getName() {
        return name;
    }
    /**
     * Obtiene el railType
     * @return railType:String
     */

    public String getRailType() {
        return railType;
    }
    /**
     * Obtiene la lista de Sections
     * @return Lista de sections
     */
    public List<Section_21451730_VejarBranada> getSections() {
        return section21451730VejarBranadas;
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
     * Coloca el name
     *
     * @param name:String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Coloca el RailType
     *
     * @param railType:String
     */
    public void setRailType(String railType) {
        this.railType = railType;
    }
    /** Coloca las sections
     *
     * @param section21451730VejarBranadas:Section_21451730_VejarBranada
     */
    public void setSections(List<Section_21451730_VejarBranada> section21451730VejarBranadas) {
        this.section21451730VejarBranadas = section21451730VejarBranadas;
    }
    /**
     * Retorna los trenes
     *
     * @return train21451730VejarBranadas:List<Train_21451730_VejarBranada>
     */
    public List<Train_21451730_VejarBranada> getTrains() {
        return train21451730VejarBranadas;
    }
    /**
     * Coloca los trenes
     *
     * @param train21451730VejarBranadas:List<Train_21451730_VejarBranada>
     */
    public void setTrains(List<Train_21451730_VejarBranada> train21451730VejarBranadas) {
        this.train21451730VejarBranadas = train21451730VejarBranadas;
    }
    /**
     * Retorna los Drivers
     *
     * @return drivers:List<Driver_21451730_VejarBranada>
     */
    public List<Driver_21451730_VejarBranada> getDrivers() {
        return drivers;
    }

    /**
     * Coloca los drivers.
     *
     * @param drivers:List<Driver_21451730_VejarBranada>
     */
    public void setDrivers(List<Driver_21451730_VejarBranada> drivers) {
        this.drivers = drivers;
    }
    /**
     * Método que permite determinar el largo total de una línea
     *
     * @return int
     */
    public int line_Length() {
        int tamanoLinea = section21451730VejarBranadas.size();
        int tamanoReal = 0;

        for (int i = 0; i < tamanoLinea; i++) {
            tamanoReal = tamanoReal + section21451730VejarBranadas.get(i).distance;

        }
        return tamanoReal;
    }
    /**
     * Método que permite determinar el trayecto entre una estación origen y una final (largo total entre una estación origen y una estación destino).
     * @param station1_Name:String
     * @param station2_Name:String
     * @return int
     */
    public int line_Section_Length(String station1_Name, String station2_Name) {
        int tamanoLinea = section21451730VejarBranadas.size();
        int distancia = 0;
        boolean bandera = false;

        for (int i = 0; i < section21451730VejarBranadas.size(); i++) {
            if (section21451730VejarBranadas.get(i).point1.name.equals(station1_Name)) {
                bandera = true;
            }
            if (bandera) {
                distancia = distancia + section21451730VejarBranadas.get(i).distance;
                if (section21451730VejarBranadas.get(i).point2.name.equals(station2_Name)) {
                    return distancia;
                }
            }
        }
        System.out.println("Revise si estan bien escritas las estaciones");
        return 0;
    }
    /**
     * Función que permite determinar el costo total (monetario) de recorrer una línea
     *
     * @return int
     */
    public int line_Cost() {
        int tamanoLinea = section21451730VejarBranadas.size();
        int costoReal = 0;

        for (int i = 0; i < tamanoLinea; i++) {
            costoReal = costoReal + section21451730VejarBranadas.get(i).cost;

        }
        return costoReal;
    }
    /**
     * Método que permite determinar el costo de un trayecto entre una estación origen y una final.
     * @param station1_Name:String
     * @param station2_Name:String
     * @return int
     */
    public int line_Section_Cost(String station1_Name, String station2_Name) {
        int tamanoLinea = section21451730VejarBranadas.size();
        int cost = 0;
        boolean bandera = false;

        for (int i = 0; i < section21451730VejarBranadas.size(); i++) {
            if (section21451730VejarBranadas.get(i).point1.name.equals(station1_Name)) {
                bandera = true;
            }
            if (bandera) {
                cost = cost + section21451730VejarBranadas.get(i).cost;
                if (section21451730VejarBranadas.get(i).point2.name.equals(station2_Name)) {
                    return cost;
                }
            }
        }
        System.out.println("Revise si estan bien escritas las estaciones");
        return 0;
    }
    /**
     * Método que permite añadir tramos a una línea.
     * @param section21451730VejarBranada:Section_21451730_VejarBranada
     */
    public void line_Add_Section(Section_21451730_VejarBranada section21451730VejarBranada){
        if(section21451730VejarBranadas.contains(section21451730VejarBranada)){
            System.out.println("La seccion esta repetida");
        }
        else{
            section21451730VejarBranadas.add(section21451730VejarBranada);
        }
    }
    /** Método que permite determinar si un elemento cumple con las
     * restricciones señaladas en apartados anteriores en relación a las estaciones y tramos para poder conformar una línea.
     *
     *
     *
     *
     * @return Boolean
     */
    public boolean isLine() {
        int j = 2;
        int tamanoArreglo = section21451730VejarBranadas.size();
        for (int i = 1; i < tamanoArreglo - 1; i++) {
            if (!section21451730VejarBranadas.get(i).point2.equals(section21451730VejarBranadas.get(j).point1)) {
                return false;
            }
            j += 1;
        }
        if (!section21451730VejarBranadas.get(0).point1.type.equals("t")) {
            return false;
        }
        if (!section21451730VejarBranadas.get(tamanoArreglo - 1).point2.type.equals("t")) {
            return false;
        }
        List<Integer> listaPrimerasIds = new ArrayList<>();
        List<Integer> listasegundasIds = new ArrayList<>();

        for(int x = 0;x<tamanoArreglo;x++){
            listaPrimerasIds.add(section21451730VejarBranadas.get(x).point1.id);
        }
        for(int y = 0;y<tamanoArreglo;y++){
            listasegundasIds.add(section21451730VejarBranadas.get(y).point2.id);
        }
        if(tieneRepetidos(listaPrimerasIds)){
            return false;
        }
        if(tieneRepetidos(listasegundasIds)){
            return false;
        }
        return true;
    }
    /** Metodo que permite revisar si una lista tiene elementos repetidos
     *
     * @param lista
     * @return Boolean
     */
    public boolean tieneRepetidos(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    return true;
                }

            }
        }
        return false;
    }
}



















