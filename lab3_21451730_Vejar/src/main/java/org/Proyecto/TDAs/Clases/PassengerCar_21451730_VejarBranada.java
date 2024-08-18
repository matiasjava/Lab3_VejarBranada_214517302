package org.Proyecto.TDAs.Clases;

/**
 * Esta clase representa un vagon de pasajeros en el sistema de trenes.
 * Un vagon de pasajeros es una unidad diseñada para transportar personas
 * y puede incluir atributos como la capacidad máxima, el nivel de confort,
 * y los servicios disponibles a bordo.
 */
public class PassengerCar_21451730_VejarBranada {
    /**
     * Variable: Id.
     */
    public int id;
    /**
     * Variable: Passenger capacity.
     */
    public int passengerCapacity;
    /**
     * Variable: Model.
     */
    public String model;
    /**
     * Variable: Train maker.
     */
    public String trainMaker;
    /**
     * Variable: Car type.
     */
    public String carType;


    /**
     * Constructor vacio: Instancia un PassengerCar sin atributos
     * return PassengerCar
     */
    public PassengerCar_21451730_VejarBranada() {
    }

    /**
     * Constructor: Instancia un PassengerCar.
     *
     * @param id:int
     * @param passengerCapacity:int
     * @param model:String
     * @param trainMaker:String
     * @param carType:String
     * return PassengerCar
     */
    public PassengerCar_21451730_VejarBranada(int id, int passengerCapacity, String model, String trainMaker, String carType) {
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
     * Retorna passengercapacity.
     *
     * @return passengercapacity:int
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Coloca passengercapacity.
     *
     * @param passengerCapacity:int
     */
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    /**
     * Retorna model.
     *
     * @return model:String
     */
    public String getModel() {
        return model;
    }

    /**
     * Coloca model.
     *
     * @param model:String
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retorna trainmaker.
     *
     * @return trainmaker:String
     */
    public String getTrainMaker() {
        return trainMaker;
    }

    /**
     * Coloca trainmaker.
     *
     * @param trainMaker:String
     */
    public void setTrainMaker(String trainMaker) {
        this.trainMaker = trainMaker;
    }

    /**
     * Retorna cartype.
     *
     * @return cartype:String
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Coloca cartype.
     *
     * @param carType:String
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }
}

