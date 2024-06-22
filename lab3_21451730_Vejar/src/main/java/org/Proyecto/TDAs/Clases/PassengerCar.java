package org.Proyecto.TDAs.Clases;

public class PassengerCar {
    public int id;
    public int passengerCapacity;
    public String model;
    public String trainMaker;
    public String carType;


    public PassengerCar() {
    }

    public PassengerCar(int id, int passengerCapacity, String model, String trainMaker, String carType) {
        this.id = id;
        this.passengerCapacity = passengerCapacity;
        this.model = model;
        this.trainMaker = trainMaker;
        //Verificación carType
        if (!carType.equals("ct") && !carType.equals("tr")) {
            throw new IllegalArgumentException("El valor de cartype tiene que ser obligatoriamente: 'ct' o 'tr'");
        }
        this.carType = carType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrainMaker() {
        return trainMaker;
    }

    public void setTrainMaker(String trainMaker) {
        this.trainMaker = trainMaker;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

