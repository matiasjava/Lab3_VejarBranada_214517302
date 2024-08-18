package org.Proyecto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import org.Proyecto.TDAs.Clases.*;
import org.Proyecto.TDAs.Interfaces.LineInterface_21451730_VejarBranada;

import javax.swing.*;
import java.awt.*;


public class Main_21451730_VejarBranada {
    public static JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;


    //Bloque de Variables Globales utilizadas para la interfaz grafica
    public static int count = 0;
    public static List<Station_21451730_VejarBranada> listaStations1 = new ArrayList<>();
    public static List<Station_21451730_VejarBranada> listaStations2 = new ArrayList<>();
    public static List<Station_21451730_VejarBranada> listaStations3 = new ArrayList<>();
    public static List<Station_21451730_VejarBranada> listaStations4 = new ArrayList<>();
    public static SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    public static Subway_21451730_VejarBranada subway21451730VejarBranada1;
    public static List<Driver_21451730_VejarBranada> driverstxt;
    public static List<Driver_21451730_VejarBranada> driversSueltos;
    public static List<Train_21451730_VejarBranada> trenestxt;
    public static List<PassengerCar_21451730_VejarBranada> pcarsSueltos;
    public static List<Station_21451730_VejarBranada> stationsSueltas;
    public static List<LineInterface_21451730_VejarBranada> lineastxt;
    public static LineCircular_21451730_VejarBranada LineaCircular4;
    //Termino de bloque de Variables Globales utilizadas para la interfaz grafica

    //Bloque de metodos para interfaz grafica
    public static List<LineInterface_21451730_VejarBranada> getLineastxt() {
        return lineastxt;
    }

    public static void setLineastxt(List<LineInterface_21451730_VejarBranada> nuevaVariable) {
        lineastxt = nuevaVariable;
    }

    public static LineCircular_21451730_VejarBranada getLineaCircular4() {
        return LineaCircular4;
    }

    public static void setLineaCircular4(LineCircular_21451730_VejarBranada nuevaVariable) {
        LineaCircular4 = nuevaVariable;
    }

    public static List<Station_21451730_VejarBranada> getStationsSueltas() {
        return stationsSueltas;
    }

    public static void setStationsSueltas(List<Station_21451730_VejarBranada> nuevaVariable) {
        stationsSueltas = nuevaVariable;
    }

    public static List<PassengerCar_21451730_VejarBranada> getPcarsSueltos() {
        return pcarsSueltos;
    }

    public static void setPcarsSueltos(List<PassengerCar_21451730_VejarBranada> nuevaVariable) {
        pcarsSueltos = nuevaVariable;
    }

    public static List<Train_21451730_VejarBranada> getTrenestxt() {
        return trenestxt;
    }

    public static void setTrenestxt(List<Train_21451730_VejarBranada> nuevaVariable) {
        trenestxt = nuevaVariable;
    }

    public static List<Driver_21451730_VejarBranada> getDriverstxt() {
        return driverstxt;
    }

    public static void setDriverstxt(List<Driver_21451730_VejarBranada> nuevaVariable) {
        driverstxt = nuevaVariable;
    }

    public static List<Driver_21451730_VejarBranada> getDriversSueltos() {
        return driversSueltos;
    }

    public static void setDriversSueltos(List<Driver_21451730_VejarBranada> nuevaVariable) {
        driversSueltos = nuevaVariable;
    }

    public static List<Station_21451730_VejarBranada> getListaStations1() {
        return listaStations1;
    }

    public static void setListaStations1(List<Station_21451730_VejarBranada> nuevaVariable) {
        listaStations1 = nuevaVariable;
    }

    public static List<Station_21451730_VejarBranada> getListaStations2() {
        return listaStations2;
    }

    public static void setListaStations2(List<Station_21451730_VejarBranada> nuevaVariable) {
        listaStations2 = nuevaVariable;
    }

    public static List<Station_21451730_VejarBranada> getListaStations3() {
        return listaStations3;
    }

    public static void setListaStations3(List<Station_21451730_VejarBranada> nuevaVariable) {
        listaStations3 = nuevaVariable;
    }

    public static List<Station_21451730_VejarBranada> getListaStations4() {
        return listaStations4;
    }

    public static void setListaStations4(List<Station_21451730_VejarBranada> nuevaVariable) {
        listaStations4 = nuevaVariable;
    }
    //Termino de Bloque de metodos para interfaz grafica





    //Menu principal, Este se ejecuta y se abrira la interfaz grafica
    public static void main(String[] args) {
        LineRegular_21451730_VejarBranada lineastxt;
        frame = new mainMenu_21451730_VejarBranada();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(335, 188);
        frame.setVisible(true);
    }






}




