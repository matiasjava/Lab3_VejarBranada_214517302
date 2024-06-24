package org.Proyecto.TDAs.Clases;

import java.util.ArrayList;
import java.util.List;

public class Train {
    public int id;
    public String trainMaker;
    public int speed;
    public int stationStaytime;
    public List<PassengerCar> carlist;

    public Train() {
    }

    public Train(int id, String trainMaker, int speed, int stationStaytime, List<PassengerCar> carlist) {
        this.id = id;
        this.trainMaker = trainMaker;
        this.speed = speed;
        this.stationStaytime = stationStaytime;
        this.carlist = carlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainMaker() {
        return trainMaker;
    }

    public void setTrainMaker(String trainMaker) {
        this.trainMaker = trainMaker;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStationStaytime() {
        return stationStaytime;
    }

    public void setStationStaytime(int stationStaytime) {
        this.stationStaytime = stationStaytime;
    }

    public List<PassengerCar> getCarlist() {
        return carlist;
    }

    public void setCarlist(List<PassengerCar> carlist) {
        this.carlist = carlist;
    }

    public void addCar(PassengerCar carro, int position){
        if(carlist.contains(carro)){
            System.out.println("El carro esta repetido");
        }
        else {
            carlist.add(position, carro);
        }
    }

    public void removeCar(int position){
        int tamanoReal = carlist.size();
        if(tamanoReal-1<position){
            System.out.println("No es posible agregar en esa posicion");
        }
        else {
            carlist.remove(position);
        }
    }
    public boolean isTrain(){

        if(carlist.size()<2){
            return false;
        }
        if(carlist.isEmpty()){
            return false;
        }
        if(!carlist.get(0).carType.equals("t")){
            return false;
        }
        if(!carlist.get(carlist.size()-1).carType.equals("t")){
            return false;
        }

        List<PassengerCar> listaRevisar = new ArrayList<>();

        for(int i=1;i<carlist.size()-1;i++){
            listaRevisar.add(carlist.get(i));
        }

        String primerElemento = carlist.get(0).carType;

        for (PassengerCar elemento : carlist) {
            if (!elemento.carType.equals(primerElemento)) {
                return false;
            }
        }
        return true;
    }

    public int fetchCapacity(){
        int tamanoArreglo = carlist.size();
        int capacidadMaxima = 0;

        for(int i=0; i<tamanoArreglo; i++){
            capacidadMaxima = capacidadMaxima + carlist.get(i).passengerCapacity;

        }
        return capacidadMaxima;
    }
}
