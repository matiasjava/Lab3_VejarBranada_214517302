package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface;

import java.lang.reflect.Array;

public class Line implements LineInterface {
    public int id;
    public String name;
    public String railType;
    public Section[] sections;

    public Line() {
    }

    public Line(int id, String name, String railType, Section[] sections) {
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

    public Section[] getSections() {
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

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public int line_Length() {
        int tamanoLinea = sections.length;
        int tamanoReal = 0;

        for (int i = 0; i < tamanoLinea; i++) {
            tamanoReal = tamanoReal + sections[i].distance;

        }
        return tamanoReal;
    }
    public int line_Section_Length(String station1_Name, String station2_Name) {
        int tamanoLinea = sections.length;
        int distancia = 0;
        boolean bandera = false;

        for (int i = 0; i < sections.length; i++) {
            if (sections[i].point1.name.equals(station1_Name)) {
                bandera = true;
            }
            if(bandera){
                distancia = distancia + sections[i].distance;
                    if (sections[i].point2.name.equals(station2_Name)) {
                        return distancia;
                    }
                }
            }
        System.out.println("Revise si estan bien escritas las estaciones");
        return 0;
        }

    public int line_Cost() {
        int tamanoLinea = sections.length;
        int costoReal = 0;

        for (int i = 0; i < tamanoLinea; i++) {
            costoReal = costoReal + sections[i].cost;

        }
        return costoReal;
    }
    public int line_Section_Cost(String station1_Name, String station2_Name) {
        int tamanoLinea = sections.length;
        int cost = 0;
        boolean bandera = false;

        for (int i = 0; i < sections.length; i++) {
            if (sections[i].point1.name.equals(station1_Name)) {
                bandera = true;
            }
            if(bandera){
                cost = cost + sections[i].cost;
                if (sections[i].point2.name.equals(station2_Name)) {
                    return cost;
                }
            }
        }
        System.out.println("Revise si estan bien escritas las estaciones");
        return 0;
    }
    /**
    public void line_Section_Cost(Section section) {
        sections.add(section);
    } //Revisar  si hay repetidas


    public boolean isLine(Line line) {
        return true;
    }
        **/


}





