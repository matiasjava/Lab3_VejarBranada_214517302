package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface;

import java.util.ArrayList;
import java.util.List;

public class LineCircular implements LineInterface {
    public int id;
    public String name;
    public String railType;
    public List<Section> sections;
    public List<Train> trains;
    public List<Driver> drivers;

    public LineCircular() {
    }

    public LineCircular(int id, String name, String railType, List<Section> sections) {
        this.id = id;
        this.name = name;
        this.railType = railType;
        this.sections = sections;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRailType() {
        return railType;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRailType(String railType) {
        this.railType = railType;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public int line_Length() {
        int tamanoLinea = sections.size();
        int tamanoReal = 0;

        for (int i = 0; i < tamanoLinea; i++) {
            tamanoReal = tamanoReal + sections.get(i).distance;

        }
        return tamanoReal;
    }

    public int line_Section_Length(String station1_Name, String station2_Name) {
        int tamanoLinea = sections.size();
        int distancia = 0;
        boolean bandera = false;

        for (int i = 0; i < sections.size(); i++) {
            if (sections.get(i).point1.name.equals(station1_Name)) {
                bandera = true;
            }
            if (bandera) {
                distancia = distancia + sections.get(i).distance;
                if (sections.get(i).point2.name.equals(station2_Name)) {
                    return distancia;
                }
            }
        }
        System.out.println("Revise si estan bien escritas las estaciones");
        return 0;
    }

    public int line_Cost() {
        int tamanoLinea = sections.size();
        int costoReal = 0;

        for (int i = 0; i < tamanoLinea; i++) {
            costoReal = costoReal + sections.get(i).cost;

        }
        return costoReal;
    }

    public int line_Section_Cost(String station1_Name, String station2_Name) {
        int tamanoLinea = sections.size();
        int cost = 0;
        boolean bandera = false;

        for (int i = 0; i < sections.size(); i++) {
            if (sections.get(i).point1.name.equals(station1_Name)) {
                bandera = true;
            }
            if (bandera) {
                cost = cost + sections.get(i).cost;
                if (sections.get(i).point2.name.equals(station2_Name)) {
                    return cost;
                }
            }
        }
        System.out.println("Revise si estan bien escritas las estaciones");
        return 0;
    }

    public void line_Add_Section(Section section){
        if(sections.contains(section)){
            System.out.println("La seccion esta repetida");
        }
        else{
            sections.add(section);
        }
    }

    public boolean isLine() {
        int j = 2;
        int tamanoArreglo = sections.size();
        for (int i = 1; i < tamanoArreglo - 1; i++) {
            if (!sections.get(i).point2.equals(sections.get(j).point1)) {
                return false;
            }
            j += 1;
        }

        List<Integer> listaPrimerasIds = new ArrayList<>();
        List<Integer> listasegundasIds = new ArrayList<>();

        for(int g = 0; g<tamanoArreglo;g++){
            if(sections.get(g).point1.type.equals("t")){
                return false;
            }
            if(sections.get(g).point2.type.equals("t")){
                return false;
            }

        }
        for(int x = 0;x<tamanoArreglo;x++){
            listaPrimerasIds.add(sections.get(x).point1.id);
        }
        for(int y = 0;y<tamanoArreglo-1;y++){
            listasegundasIds.add(sections.get(y).point2.id);
        }
        if(tieneRepetidos(listaPrimerasIds)){
            return false;
        }
        if(tieneRepetidos(listasegundasIds)){
            return false;
        }
        return true;
    }

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
