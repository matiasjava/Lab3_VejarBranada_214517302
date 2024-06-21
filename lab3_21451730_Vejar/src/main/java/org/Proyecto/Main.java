package org.Proyecto;


import org.Proyecto.TDAs.Clases.Section;
import org.Proyecto.TDAs.Clases.Station;
import org.Proyecto.TDAs.Clases.Line;

public class Main {
    public static void main(String[] args) {
        Station ST1 = new Station(0,"Estacion central","t",15);
        Station ST2 = new Station(1,"ULA", "m", 40);
        Station ST3 = new Station(2,"Republica", "r", 45);
        Station ST4 = new Station(3,"Los heroes", "t", 30);
        Section S1 = new Section(ST1,ST2,50, 20);
        Section S2 = new Section(ST2,ST3, 40, 40);
        Section[] lista = {S1,S2};
        Line L1 = new Line(0,"Linea 1", "BCS-43",lista);
        int largo = L1.line_Length();
        int costo = L1.line_Cost();



        System.out.println(largo);
        System.out.println(costo);
    }
}