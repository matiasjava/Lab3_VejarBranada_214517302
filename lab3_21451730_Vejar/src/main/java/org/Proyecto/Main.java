package org.Proyecto;
import org.Proyecto.TDAs.Station;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Station hola = new Station(24304320,"hola","g",54);
        int youtube = hola.getId();
        System.out.println(youtube);
    }
}