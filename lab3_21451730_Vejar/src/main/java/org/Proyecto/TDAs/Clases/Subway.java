package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface;

import java.util.ArrayList;
import java.util.Calendar;
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
        elString = new StringBuilder("Subway" + "\n" + "Id = " + Integer.toString(id) + "\n" + "Nombre = " + name + "\n" + "\n");
        elString.append("Lineas:").append("\n");
        for (int i = 0; i < lineListSubway.size(); i++) {
            tamano = lineListSubway.get(i).getSections().size();
            elString.append("\n").append("Id = ").append(Integer.toString(lineListSubway.get(i).getId())).append(" Nombre =  ").append(lineListSubway.get(i).getName()).append("\n");
            for (int j = 0; j < tamano; j++) {
                elString.append(lineListSubway.get(i).getSections().get(j).point1.name).append(" --> ");
            }
            elString.append("\n");
        }
            tamano = driverListSubway.size();
            elString.append("Conductores = ").append("\n");
            for (int n = 0; n < tamano; n++) {
                elString.append(driverListSubway.get(n).name).append(", ");
            }
        return elString.toString();
    }

    public void assignTrainToLine(Train train, LineInterface line) {
        int guia = -5;
        for(int i = 0; i<lineListSubway.size();i++){
            if(lineListSubway.get(i).equals(line)){
                guia = i;
            }
        }
        if(lineListSubway.get(guia).getTrains().contains(train)){
            System.out.println("El tren esta repetido");

        }else{
            lineListSubway.get(guia).getTrains().add(train);
        }

    }


    public void assignDriverToTrain(Train train, Driver driver, Date departureTime, Station departreStation, Station arrivalStation) {
        int guiaTrain = -5;
        int guiaTrain2 = -4;
        int lineGuia = -5;
        for(int i = 0; i<driverListSubway.size();i++){
            if(driverListSubway.get(i).equals(driver)){
                guiaTrain = i;
            }
        }
        driverListSubway.get(guiaTrain).setStationPartida(departreStation);
        driverListSubway.get(guiaTrain).setStationLlegada(arrivalStation);
        driverListSubway.get(guiaTrain).setHoraPartida(departureTime);
        for(int j = 0; j<lineListSubway.size();j++){
            for(int k = 0; k <lineListSubway.get(j).getTrains().size(); k++){
                if(lineListSubway.get(j).getTrains().get(k).equals(train)){
                    lineGuia = j;
                    guiaTrain2 = k;
                }
            }
        }
        if(lineListSubway.get(lineGuia).getTrains().get(guiaTrain2).getDriverTrain() == null){
            lineListSubway.get(lineGuia).getTrains().get(guiaTrain2).setDriverTrain(driverListSubway.get(guiaTrain));
        }
        else{
            System.out.println("Ya tiene conductor asignado");
        }

    }

    public String whereIsTrain(Train train, Date time) {
        int numeroGuia = -6;
        Boolean bandera = true;

        for (int i = 0; i < lineListSubway.size(); i++) {
            if (lineListSubway.get(i).getTrains().contains(train)) {
                numeroGuia = i;

            }
        }
        int calculo = 0;
        for (int j = 0; j < lineListSubway.get(numeroGuia).getSections().size(); j++) {
            calculo = calculo + (lineListSubway.get(numeroGuia).getSections().get(j).getDistance()/train.getSpeed()) + lineListSubway.get(numeroGuia).getSections().get(j).getPoint1().getStopTime() + train.getStationStaytime();
            lineListSubway.get(numeroGuia).getSections().get(j).setTiempoDeLlegada(calculo);

        }
        Date horaCalculo = time;
        Calendar aux = Calendar.getInstance();
        aux.setTime(horaCalculo);
        Date horaConductor = train.getDriverTrain().getHoraPartida();
        Calendar aux2 = Calendar.getInstance();
        aux2.setTime(horaConductor);


        int hour1 = aux.get(Calendar.HOUR_OF_DAY);
        int minute1 = aux.get(Calendar.MINUTE);
        int hour2 = aux2.get(Calendar.HOUR_OF_DAY);
        int minute2 = aux2.get(Calendar.MINUTE);


        if(hour1 < hour2 || (hour1 == hour2 && minute1 < minute2)){
            return null;
        }

        int llegada2 = 0;
        int partida2 = 0;

        int numeroTren = -7;
        int numeroLinea = -7;

        for(int inicioNumero1 = 0; inicioNumero1 < lineListSubway.size();inicioNumero1++){
            for(int inicioNumero2 = 0; inicioNumero2 < lineListSubway.get(inicioNumero1).getTrains().size();inicioNumero2++){
                    if(lineListSubway.get(inicioNumero1).getTrains().get(inicioNumero2).getId() == train.getId()){
                        numeroLinea = inicioNumero1;
                        numeroTren = inicioNumero2;

                    }
            }
        }


        int inicio = lineListSubway.get(numeroLinea).getTrains().get(numeroTren).getDriverTrain().getStationPartida().getId();

        for(int p = 0;p<lineListSubway.get(numeroGuia).getSections().size();p++)
            if(inicio == lineListSubway.get(numeroGuia).getSections().get(p).getPoint1().getId() || inicio == lineListSubway.get(numeroGuia).getSections().get(p).getPoint2().getId()){
                partida2 = p;
            }
        int llegada = train.getDriverTrain().getStationLlegada().getId();
        for(int o = 0;o<lineListSubway.get(numeroGuia).getSections().size();o++)
            if(llegada == lineListSubway.get(numeroGuia).getSections().get(o).getPoint1().getId() || llegada == lineListSubway.get(numeroGuia).getSections().get(o).getPoint2().getId()){
                llegada2 = o;
            }
        int hastaDonde = 0;
        for(int k = partida2;bandera = true;k++){
            hastaDonde = lineListSubway.get(numeroGuia).getSections().get(k).getTiempoDeLlegada();
            aux2.add(Calendar.MINUTE,hastaDonde);

            hour1 = aux.get(Calendar.HOUR_OF_DAY);
            minute1 = aux.get(Calendar.MINUTE);
            hour2 = aux2.get(Calendar.HOUR_OF_DAY);
            minute2 = aux2.get(Calendar.MINUTE);

            if(hour1 < hour2 || (hour1 == hour2 && minute1 < minute2)){
                return lineListSubway.get(numeroGuia).getSections().get(k).getPoint2().getName();
            }


            if(k == llegada2){
                k = partida2;
            }
        }
        return null;
    }



    public List<Station> trainPath(Train train, Date time) {

        List<Station> listaRestantes = new ArrayList<>();

        int numeroGuia2 = -5;

        Boolean bandera = true;

        for (int i = 0; i < lineListSubway.size(); i++) {
            if (lineListSubway.get(i).getTrains().contains(train)) {
                numeroGuia2 = i;
            }
        }
        int calculo = 0;
        for (int j = 0; j < lineListSubway.get(numeroGuia2).getSections().size(); j++) {
            calculo = calculo + (lineListSubway.get(numeroGuia2).getSections().get(j).getDistance()/train.getSpeed()) + lineListSubway.get(numeroGuia2).getSections().get(j).getPoint1().getStopTime() + train.getStationStaytime();
            lineListSubway.get(numeroGuia2).getSections().get(j).setTiempoDeLlegada(calculo);
        }
        Date horaCalculo = time;
        Calendar aux = Calendar.getInstance();
        aux.setTime(horaCalculo);
        Date horaConductor = train.getDriverTrain().getHoraPartida();
        Calendar aux2 = Calendar.getInstance();
        aux2.setTime(horaConductor);

        int hour1 = aux.get(Calendar.HOUR_OF_DAY);
        int minute1 = aux.get(Calendar.MINUTE);
        int hour2 = aux2.get(Calendar.HOUR_OF_DAY);
        int minute2 = aux2.get(Calendar.MINUTE);

        if(hour1 < hour2 || (hour1 == hour2 && minute1 < minute2)){
            return null;
        }

        int llegada2 = 0;
        int partida2 = 0;
        int inicio = train.getDriverTrain().getStationPartida().getId();
        for(int p = 0;p<lineListSubway.get(numeroGuia2).getSections().size();p++)
            if(inicio == lineListSubway.get(numeroGuia2).getSections().get(p).getPoint1().getId() || inicio == lineListSubway.get(numeroGuia2).getSections().get(p).getPoint2().getId()){
                partida2 = p;
            }
        int llegada = train.getDriverTrain().getStationLlegada().getId();
        for(int o = 0;o<lineListSubway.get(numeroGuia2).getSections().size();o++)
            if(llegada == lineListSubway.get(numeroGuia2).getSections().get(o).getPoint1().getId() || llegada == lineListSubway.get(numeroGuia2).getSections().get(o).getPoint2().getId()){
                llegada2 = o;
            }
        int hastaDonde = 0;
        for(int k = partida2;bandera = true;k++){
            hastaDonde = hastaDonde + lineListSubway.get(numeroGuia2).getSections().get(k).getTiempoDeLlegada();
            aux2.add(Calendar.MINUTE,hastaDonde);

            hour1 = aux.get(Calendar.HOUR_OF_DAY);
            minute1 = aux.get(Calendar.MINUTE);
            hour2 = aux2.get(Calendar.HOUR_OF_DAY);
            minute2 = aux2.get(Calendar.MINUTE);

            if(hour1 < hour2 || (hour1 == hour2 && minute1 < minute2)){
                listaRestantes.add(lineListSubway.get(numeroGuia2).getSections().get(k).getPoint1());
                for(int n = k+1;n < llegada2;n++){
                    listaRestantes.add(lineListSubway.get(numeroGuia2).getSections().get(n).getPoint2());
                }
                return listaRestantes;
            }

            if(k == llegada2){
                k = partida2;
            }
        }
        return listaRestantes;

    }

    public Train buscarTrainPorId(int id) {
        for (int i = 0; i < trainListSubway.size(); i++) {
            if (trainListSubway.get(i).getId() == id) {
                return trainListSubway.get(i);
            } else {
                return null;
            }

        }
        return null;
    }


    public Station BuscarStationPorId(int id) {
        List<Section> Secciones = new ArrayList<>();

        for (int i = 0; i < lineListSubway.size(); i++) {
            for (int j = 0; j < lineListSubway.get(i).getSections().size(); j++) {
                Secciones.add(lineListSubway.get(i).getSections().get(j));
            }
        }
        for (int contador = 0; contador < Secciones.size(); contador++) {
            System.out.println(Secciones.get(contador).getPoint1().getId());
            if (id == Secciones.get(contador).getPoint1().getId()) {
                return Secciones.get(contador).getPoint1();
            }
            if (id == Secciones.get(contador).getPoint2().getId()) {
                return Secciones.get(contador).getPoint2();

            }
        }
        return null;
    }





}

























