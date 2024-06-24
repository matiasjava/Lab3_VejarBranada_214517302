package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface;

import java.util.ArrayList;
import java.util.List;

public class Subway {
    public int id;
    public String name;
    public List<Train> trainListSubway = new ArrayList<>();
    public List<LineInterface> lineListSubway = new ArrayList<>();
    public List<Driver> driverListSubway = new ArrayList<>();

    public Subway() {
    }

    public Subway(int id, String name, List<Train> trainListSubway, List<Driver> driverListSubway, List<LineInterface> lineListSubway) {
        this.id = id;
        this.name = name;
        this.trainListSubway = trainListSubway;
        this.driverListSubway = driverListSubway;
        this.lineListSubway = lineListSubway;
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
    public void addTrain(List<Train> trainList){
        int tamanoArreglo = trainList.size();

        for(int i=0;i<tamanoArreglo;i++){
            trainListSubway.add(trainList.get(i));
        }
    }

    public void addLine(List<LineInterface> lineList){
        int tamanoArreglo = lineList.size();

        for(int i=0;i<tamanoArreglo;i++){
            lineListSubway.add(lineList.get(i));
        }
    }

    public void adddriver(List<Driver> driverList){
        int tamanoArreglo = driverList.size();

        for(int i=0;i<tamanoArreglo;i++){
            driverListSubway.add(driverList.get(i));
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id del metro: ").append(id).append("\n");
        sb.append("Nombre del metro: ").append(name).append("\n");
    }



}
