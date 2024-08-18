package org.Proyecto.TDAs.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa un tren en el sistema ferroviario.
 * Un tren es un conjunto de vagones conectados diseñado para transportar pasajeros o carga a lo largo de la red.
 */
public class Train_21451730_VejarBranada {
    /**
     * Variable: Id.
     */
    public int id;
    /**
     * Variable: Train maker.
     */
    public String trainMaker;
    /**
     * Variable: Speed.
     */
    public int speed;
    /**
     * Variable: Station staytime.
     */
    public int stationStaytime;
    /**
     * Variable: Carlist.
     */
    public List<PassengerCar_21451730_VejarBranada> carlist;
    /**
     * Variable: Driver train.
     */
    public Driver_21451730_VejarBranada driverTrain;

    /**
     * Constructor vacio: Instancia un train sin atributos
     */
    public Train_21451730_VejarBranada() {
    }

    /**
     * Constructor: Instancia un train
     *
     * @param id:int
     * @param trainMaker:String
     * @param speed:int
     * @param stationStaytime:int
     * @param carlist:List<PassengerCar_21451730_VejarBranada>
     */
    public Train_21451730_VejarBranada(int id, String trainMaker, int speed, int stationStaytime, List<PassengerCar_21451730_VejarBranada> carlist) {
        this.id = id;
        this.trainMaker = trainMaker;
        this.speed = speed;
        this.stationStaytime = stationStaytime;
        this.carlist = carlist;
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
     * Retorna train maker.
     *
     * @return trainmaker:String
     */
    public String getTrainMaker() {
        return trainMaker;
    }

    /**
     * Coloca train maker.
     *
     * @param trainMaker:String
     */
    public void setTrainMaker(String trainMaker) {
        this.trainMaker = trainMaker;
    }

    /**
     * Retorna speed.
     *
     * @return speed:int
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Coloca speed.
     *
     * @param speed:int
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Retorna station staytime.
     *
     * @return stationstaytime:int
     */
    public int getStationStaytime() {
        return stationStaytime;
    }

    /**
     * Coloca station staytime.
     *
     * @param stationStaytime:int
     */
    public void setStationStaytime(int stationStaytime) {
        this.stationStaytime = stationStaytime;
    }

    /**
     * Retorna carlist.
     *
     * @return carlist:List<PassengerCar_21451730_VejarBranada>
     */
    public List<PassengerCar_21451730_VejarBranada> getCarlist() {
        return carlist;
    }

    /**
     * Coloca carlist.
     *
     * @param carlist:List<PassengerCar_21451730_VejarBranada>
     */
    public void setCarlist(List<PassengerCar_21451730_VejarBranada> carlist) {
        this.carlist = carlist;
    }

    /**
     * Retorna drivertrain.
     *
     * @return drivertrain:driver
     */
    public Driver_21451730_VejarBranada getDriverTrain() {
        return driverTrain;
    }

    /**
     * Coloca drivertrain.
     *
     * @param driverTrain:driver
     */
    public void setDriverTrain(Driver_21451730_VejarBranada driverTrain) {
        this.driverTrain = driverTrain;
    }

    /**
     * Metodo que añade un carro de pasajeros en un tren en la posición establecida
     *
     * @param carro:Pcar
     * @param position:int
     */
    public void addCar(PassengerCar_21451730_VejarBranada carro, int position){
        if(carlist.contains(carro)){
            System.out.println("El carro esta repetido");
        }
        else {
            carlist.add(position, carro);
        }
    }

    /**
     * Metodo que remueve un carro de pasajeros en un tren de la posición establecida
     *
     * @param position:int
     */
    public void removeCar(int position){
        int tamanoReal = carlist.size();
        if(tamanoReal-1<position){
            System.out.println("No es posible agregar en esa posicion");
        }
        else {
            carlist.remove(position);
        }
    }

    /**
     * Metodo que dado un tren, verifica si este cumple con las especificaciones de los carros de pasajeros para un tren.
     *
     * @return boolean
     */
    public boolean isTrain(){

        if(carlist.size()<2){
            return false;
        }
        if(!carlist.get(0).carType.equals("tr")){
            return false;
        }
        if(!carlist.get(carlist.size()-1).carType.equals("tr")){
            return false;
        }

        List<PassengerCar_21451730_VejarBranada> listaRevisar = new ArrayList<>();

        for(int i=1;i<carlist.size()-1;i++){
            listaRevisar.add(carlist.get(i));
        }

        String primerElemento = listaRevisar.get(0).getCarType();

        for(int j=0;j<listaRevisar.size();j++) {
            if (!listaRevisar.get(j).getCarType().equals("ct")) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo Dado un tren, entrega como resultado la capacidad máxima de pasajeros de éste.
     *
     * @return int
     */
    public int fetchCapacity(){
        int tamanoArreglo = carlist.size();
        int capacidadMaxima = 0;

        for(int i=0; i<tamanoArreglo; i++){
            capacidadMaxima = capacidadMaxima + carlist.get(i).passengerCapacity;

        }
        return capacidadMaxima;
    }
}
