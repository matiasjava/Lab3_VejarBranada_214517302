package org.Proyecto;

import java.util.ArrayList;
import java.util.List;


import org.Proyecto.TDAs.Clases.LineRegular;
import org.Proyecto.TDAs.Clases.Section;
import org.Proyecto.TDAs.Clases.Station;
import org.Proyecto.TDAs.Interfaces.LineInterface;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Station ST1 = new Station(0,"Estacion central","t",15);
        Station ST2 = new Station(1,"ULA", "m", 40);
        Station ST3 = new Station(2,"Republica", "r", 45);
        Station ST4 = new Station(3,"Los heroes", "c", 30);
        Station ST5 = new Station(4,"La moneda", "m", 20);
        Station ST6 = new Station(5,"Universidad de Chile", "r", 30);
        Station ST7 = new Station(6,"Santa lucia", "t", 40);

        Section S1 = new Section(ST1,ST2,50, 20);
        Section S2 = new Section(ST2,ST3, 40, 40);
        Section S3 = new Section(ST3,ST4, 50, 60);
        Section S4 = new Section(ST4,ST5, 65, 45);
        Section S5 = new Section(ST5,ST6, 55, 35);
        Section S6 = new Section(ST6,ST7, 45, 15);

        List<Section> lista = new ArrayList<>();
        lista.add(S1);
        lista.add(S2);
        lista.add(S3);
        lista.add(S4);
        lista.add(S5);
        lista.add(S6);

        LineRegular L1 = new LineRegular(0,"Linea 1", "BCS-43",lista);
        int largo = L1.line_Length();
        int costo = L1.line_Cost();
        int distancia = L1.line_Section_Length("ULA", "Santa lucia");
        int costo2 = L1.line_Section_Cost("ULA", "Santa lucia");


        System.out.println(largo);
        System.out.println(costo);
        System.out.println(distancia);
        System.out.println(costo2);
        System.out.println(L1.toString());


        mainMenu menu = new mainMenu();
        JFrame frame = new JFrame("Menu lab 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(menu);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        /**

        MainWindow mw = new MainWindow();
        mw.setVisible(true);
        */


    }




}