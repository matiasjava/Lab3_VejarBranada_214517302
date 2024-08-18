package org.Proyecto.TDAs.Clases;

import org.Proyecto.TDAs.Interfaces.LineInterface_21451730_VejarBranada;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

/**
 * Esta clase representa un sistema de metro en la red de transporte.
 */
public class Subway_21451730_VejarBranada {
    /**
     * Variable: Id.
     */
    public int id;
    /**
     * Variable: Name.
     */
    public String name;
    /**
     * Variable: Train 21451730 vejar branada list subway.
     */
    public List<Train_21451730_VejarBranada> train21451730VejarBranadaListSubway = new ArrayList<>();
    /**
     * Variable: Line list subway.
     */
    public List<LineInterface_21451730_VejarBranada> lineListSubway = new ArrayList<>();
    /**
     * Variable: Driver list subway.
     */
    public List<Driver_21451730_VejarBranada> driverListSubway = new ArrayList<>();

    /**
     * Constructor vacio: instancia un subway sin atributos
     */
    public Subway_21451730_VejarBranada() {
    }

    /**
     * Constructor vacio: instancia un subway sin atributos
     *
     * @param id:int
     * @param name:String
     */
    public Subway_21451730_VejarBranada(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Retorna id.
     *
     * @return id:int
     */
    public int getId() {
        return id;
    }

    /**
     * Coloca id.
     *
     * @param id:int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna name.
     *
     * @return name:String
     */
    public String getName() {
        return name;
    }

    /**
     * Coloca name.
     *
     * @param name:String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna trainlist.
     *
     * @return trainlist:List<Train_21451730_VejarBranada>
     */
    public List<Train_21451730_VejarBranada> getTrainList() {
        return train21451730VejarBranadaListSubway;
    }

    /**
     * Coloca train list.
     *
     * @param train21451730VejarBranadaList:List<Train_21451730_VejarBranada>
     */
    public void setTrainList(List<Train_21451730_VejarBranada> train21451730VejarBranadaList) {
        this.train21451730VejarBranadaListSubway = train21451730VejarBranadaList;
    }

    /**
     * Retorna line list subway.
     *
     * @return linelistsubway:List<LineInterface_21451730_VejarBranada>
     */
    public List<LineInterface_21451730_VejarBranada> getLineListSubway() {
        return lineListSubway;
    }

    /**
     * Coloca line list subway.
     *
     * @param lineListSubway:List<LineInterface_21451730_VejarBranada>
     */
    public void setLineListSubway(List<LineInterface_21451730_VejarBranada> lineListSubway) {
        this.lineListSubway = lineListSubway;
    }

    /**
     * Retorna driverlistsubway.
     *
     * @return driverlistsubway:List<Driver_21451730_VejarBranada>
     */
    public List<Driver_21451730_VejarBranada> getDriverListSubway() {
        return driverListSubway;
    }

    /**
     * Coloca driver list subway.
     *
     * @param driverListSubway:List<Driver_21451730_VejarBranada>
     */
    public void setDriverListSubway(List<Driver_21451730_VejarBranada> driverListSubway) {
        this.driverListSubway = driverListSubway;
    }

    /**
     * Metodo que añade uno o más trenes a una red de metro.
     *
     * @param train21451730VejarBranadaList:List<Train_21451730_VejarBranada>
     */
    public void addTrain(List<Train_21451730_VejarBranada> train21451730VejarBranadaList) {
        int tamanoArreglo = train21451730VejarBranadaList.size();

        for (int i = 0; i < tamanoArreglo; i++) {
            train21451730VejarBranadaListSubway.add(train21451730VejarBranadaList.get(i));
        }
    }

    /**
     * Metodo que añade una o más líneas a una red de metro.
     *
     * @param lineList:List<LineInterface_21451730_VejarBranada>
     */
    public void addLine(List<LineInterface_21451730_VejarBranada> lineList) {
        int tamanoArreglo = lineList.size();

        for (int i = 0; i < tamanoArreglo; i++) {
            lineListSubway.add(lineList.get(i));
        }
    }

    /**
     * Metodo que añade uno o más conductores a una red de metro.
     *
     * @param driverList:List<Driver_21451730_VejarBranada>
     */
    public void adddriver(List<Driver_21451730_VejarBranada> driverList) {
        int tamanoArreglo = driverList.size();

        for (int i = 0; i < tamanoArreglo; i++) {
            driverListSubway.add(driverList.get(i));
        }
    }

    /**
     * Método que permite expresar una red de metro en formato String (para ser posteriormente impresa por pantalla con métodos como System.out.println)
     * @return String
     */
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

    /**
     * Metodo que asigna un tren a una línea.
     *
     * @param train21451730VejarBranada:Train_21451730_VejarBranada
     * @param line:LineInterface_21451730_VejarBranada
     */
    public void assignTrainToLine(Train_21451730_VejarBranada train21451730VejarBranada, LineInterface_21451730_VejarBranada line) {
        int guia = -5;
        for(int i = 0; i<lineListSubway.size();i++){
            if(lineListSubway.get(i).equals(line)){
                guia = i;
            }
        }
        if(lineListSubway.get(guia).getTrains().contains(train21451730VejarBranada)){
            System.out.println("El tren esta repetido");

        }else{
            lineListSubway.get(guia).getTrains().add(train21451730VejarBranada);
        }

    }


    /**
     * Metodo que asigna un conductor a un tren considerando un tiempo de partida. una estación de partida y una de llegada.
     *
     * @param train21451730VejarBranada:Train
     * @param driver:Driver
     * @param departureTime:Date
     * @param departreStation21451730VejarBranada:Station
     * @param arrivalStation21451730VejarBranada:Station
     */
    public void assignDriverToTrain(Train_21451730_VejarBranada train21451730VejarBranada, Driver_21451730_VejarBranada driver, Date departureTime, Station_21451730_VejarBranada departreStation21451730VejarBranada, Station_21451730_VejarBranada arrivalStation21451730VejarBranada) {
        int guiaTrain = -5;
        int guiaTrain2 = -4;
        int lineGuia = -5;
        for(int i = 0; i<driverListSubway.size();i++){
            if(driverListSubway.get(i).equals(driver)){
                guiaTrain = i;
            }
        }
        driverListSubway.get(guiaTrain).setStationPartida(departreStation21451730VejarBranada);
        driverListSubway.get(guiaTrain).setStationLlegada(arrivalStation21451730VejarBranada);
        driverListSubway.get(guiaTrain).setHoraPartida(departureTime);
        for(int j = 0; j<lineListSubway.size();j++){
            for(int k = 0; k <lineListSubway.get(j).getTrains().size(); k++){
                if(lineListSubway.get(j).getTrains().get(k).equals(train21451730VejarBranada)){
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

    /**
     * Método que permite determinar dónde se encuentra un tren a partir de una hora indicada del día
     *
     * @param train21451730VejarBranada:Train
     * @param time:Date
     * @return String
     */
    public String whereIsTrain(Train_21451730_VejarBranada train21451730VejarBranada, Date time) {
        int numeroGuia = -6;
        Boolean bandera = true;

        for (int i = 0; i < lineListSubway.size(); i++) {
            if (lineListSubway.get(i).getTrains().contains(train21451730VejarBranada)) {
                numeroGuia = i;

            }
        }
        int calculo = 0;
        for (int j = 0; j < lineListSubway.get(numeroGuia).getSections().size(); j++) {
            calculo = calculo + (lineListSubway.get(numeroGuia).getSections().get(j).getDistance()/ train21451730VejarBranada.getSpeed()) + lineListSubway.get(numeroGuia).getSections().get(j).getPoint1().getStopTime() + train21451730VejarBranada.getStationStaytime();
            lineListSubway.get(numeroGuia).getSections().get(j).setTiempoDeLlegada(calculo);

        }
        Date horaCalculo = time;
        Calendar aux = Calendar.getInstance();
        aux.setTime(horaCalculo);
        Date horaConductor = train21451730VejarBranada.getDriverTrain().getHoraPartida();
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
                    if(lineListSubway.get(inicioNumero1).getTrains().get(inicioNumero2).getId() == train21451730VejarBranada.getId()){
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
        int llegada = train21451730VejarBranada.getDriverTrain().getStationLlegada().getId();
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


    /**
     * Método que permite ir armando el recorrido del tren a partir de una hora especificada y que retorna la lista de estaciones futuras por recorrer.
     *
     * @param train21451730VejarBranada:Train
     * @param time:Date
     * @return List<Station_21451730_VejarBranada>
     */
    public List<Station_21451730_VejarBranada> trainPath(Train_21451730_VejarBranada train21451730VejarBranada, Date time) {

        List<Station_21451730_VejarBranada> listaRestantes = new ArrayList<>();

        int numeroGuia2 = -5;

        Boolean bandera = true;

        for (int i = 0; i < lineListSubway.size(); i++) {
            if (lineListSubway.get(i).getTrains().contains(train21451730VejarBranada)) {
                numeroGuia2 = i;
            }
        }
        int calculo = 0;
        for (int j = 0; j < lineListSubway.get(numeroGuia2).getSections().size(); j++) {
            calculo = calculo + (lineListSubway.get(numeroGuia2).getSections().get(j).getDistance()/ train21451730VejarBranada.getSpeed()) + lineListSubway.get(numeroGuia2).getSections().get(j).getPoint1().getStopTime() + train21451730VejarBranada.getStationStaytime();
            lineListSubway.get(numeroGuia2).getSections().get(j).setTiempoDeLlegada(calculo);
        }
        Date horaCalculo = time;
        Calendar aux = Calendar.getInstance();
        aux.setTime(horaCalculo);
        Date horaConductor = train21451730VejarBranada.getDriverTrain().getHoraPartida();
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
        int inicio = train21451730VejarBranada.getDriverTrain().getStationPartida().getId();
        for(int p = 0;p<lineListSubway.get(numeroGuia2).getSections().size();p++)
            if(inicio == lineListSubway.get(numeroGuia2).getSections().get(p).getPoint1().getId() || inicio == lineListSubway.get(numeroGuia2).getSections().get(p).getPoint2().getId()){
                partida2 = p;
            }
        int llegada = train21451730VejarBranada.getDriverTrain().getStationLlegada().getId();
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

    /**
     * Buscar station por id
     *
     * @param id:int
     * @return Station
     */
    public Station_21451730_VejarBranada BuscarStationPorId(int id) {
        List<Section_21451730_VejarBranada> Secciones = new ArrayList<>();

        for (int i = 0; i < lineListSubway.size(); i++) {
            for (int j = 0; j < lineListSubway.get(i).getSections().size(); j++) {
                Secciones.add(lineListSubway.get(i).getSections().get(j));
            }
        }
        for (int contador = 0; contador < Secciones.size(); contador++) {
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

























