package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Subway {
    public int id;
    public String name;
    public List<Train> trainListSubway = new ArrayList<>();
    public List<LineInterface> lineListSubway = new ArrayList<>();
    public List<Driver> driverListSubway = new ArrayList<>();

    public Subway() {
    }

    public Subway(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Train> getTrainList() {
        return trainListSubway;
    }

    public void setTrainList(List<Train> trainList) {
        this.trainListSubway = trainList;
    }

    public List<LineInterface> getLineListSubway() {
        return lineListSubway;
    }

    public void setLineListSubway(List<LineInterface> lineListSubway) {
        this.lineListSubway = lineListSubway;
    }

    public List<Driver> getDriverListSubway() {
        return driverListSubway;
    }

    public void setDriverListSubway(List<Driver> driverListSubway) {
        this.driverListSubway = driverListSubway;
    }

    public Station BuscarStationPorId(int id){
        List<Section> Secciones = new ArrayList<>();

        for(int i= 0;i<lineListSubway.size();i++){
            for(int j = 0; j<lineListSubway.get(i).getSections().size();j++){
                Secciones.add(lineListSubway.get(i).getSections().get(j));
            }
        }
        for(int k=0;k<Secciones.size();k++){
            if(id == Secciones.get(k).getPoint1().getId()){
                return Secciones.get(k).getPoint1();
            }
            if(id == Secciones.get(k).getPoint2().getId()){
                return Secciones.get(k).getPoint2();
            }
            else{
                return null;
            }
        }
        return null;
    }



    public void addTrain(List<Train> trainList) {
        int tamanoArreglo = trainList.size();

        for (int i = 0; i < tamanoArreglo; i++) {
            trainListSubway.add(trainList.get(i));
        }
    }

    public void addLine(List<LineInterface> lineList) {
        int tamanoArreglo = lineList.size();

        for (int i = 0; i < tamanoArreglo; i++) {
            lineListSubway.add(lineList.get(i));
        }
    }

    public void adddriver(List<Driver> driverList) {
        int tamanoArreglo = driverList.size();

        for (int i = 0; i < tamanoArreglo; i++) {
            driverListSubway.add(driverList.get(i));
        }
    }

    public String toString() {
        StringBuilder elString = new StringBuilder();
        int tamano;
        elString = new StringBuilder("Subway" + "\n" + "Id = " + Integer.toString(id) + "\n" + "Nombre = " + name + "\n");
        for (int i = 0; i < lineListSubway.size(); i++) {
            tamano = lineListSubway.get(i).getSections().size();
            elString.append("Linea").append("\n").append("Id = ").append(Integer.toString(lineListSubway.get(i).getId())).append(" Nombre =  ").append(lineListSubway.get(i).getName()).append("\n");
            for (int j = 0; j < tamano; j++) {
                elString.append(lineListSubway.get(i).getSections().get(j).point1.name).append(" --> ");
            }
        }
        for (int k = 0; k < driverListSubway.size(); k++) {
            tamano = driverListSubway.size();
            elString.append("Conductores = ").append("\n");
            for (int n = 0; n < tamano; n++) {
                elString.append(driverListSubway.get(n).name).append(" ");
            }
        }
        return elString.toString();
    }

    public void assignTrainToLine(Train train, LineInterface line){
        line.trains.add(train);
    }



    public void assignDriverToTrain(Train train, Driver driver, Date departureTime, Station departreStation, Station arrivalStation){





    }



}



















