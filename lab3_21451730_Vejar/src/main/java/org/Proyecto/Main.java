package org.Proyecto;

import java.util.List;


import org.Proyecto.TDAs.Clases.*;
import org.Proyecto.TDAs.Interfaces.LineInterface;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public static Boolean banderaTrain = false;

    public static Subway subway1;

    public static List<Driver> driverstxt;

    public static List<Driver> driversSueltos;

    public static List<Train> trenestxt;

    public static List<PassengerCar> pcarsSueltos;

    public static List<Station> stationsSueltas;

    public static List<LineInterface> lineastxt;

    public static LineCircular LineaCircular4;

    public static void main(String[] args) {
        LineRegular lineastxt;
        frame = new mainMenu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(335, 188);
        frame.setVisible(true);
    }

    public static List<LineInterface> getLineastxt() {
        return lineastxt;
    }

    public static void setLineastxt(List<LineInterface> nuevaVariable) {
        lineastxt = nuevaVariable;
    }

    public static LineCircular getLineaCircular4() {
        return LineaCircular4;
    }

    public static void setLineaCircular4(LineCircular nuevaVariable) {
        LineaCircular4 = nuevaVariable;
    }

    public static List<Station> getStationsSueltas() {
        return stationsSueltas;
    }

    public static void setStationsSueltas(List<Station> nuevaVariable) {
        stationsSueltas = nuevaVariable;
    }

    public static List<PassengerCar> getPcarsSueltos() {
        return pcarsSueltos;
    }

    public static void setPcarsSueltos(List<PassengerCar> nuevaVariable) {
        pcarsSueltos = nuevaVariable;
    }

    public static List<Train> getTrenestxt() {
        return trenestxt;
    }

    public static void setTrenestxt(List<Train> nuevaVariable) {
        trenestxt = nuevaVariable;
    }

    public static List<Driver> getDriverstxt() {
        return driverstxt;
    }

    public static void setDriverstxt(List<Driver> nuevaVariable) {
        driverstxt = nuevaVariable;
    }

    public static List<Driver> getDriversSueltos() {
        return driversSueltos;
    }

    public static void setDriversSueltos(List<Driver> nuevaVariable) {
        driversSueltos = nuevaVariable;
    }




}




