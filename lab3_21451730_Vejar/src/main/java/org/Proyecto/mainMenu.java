/*
 * Created by JFormDesigner on Mon Jul 08 11:45:47 CLT 2024
 */

package org.Proyecto;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import com.sun.source.tree.NewArrayTree;
import net.miginfocom.swing.*;
import org.Proyecto.TDAs.Clases.*;
import org.Proyecto.TDAs.Interfaces.LineInterface;

import static org.Proyecto.Main.*;

/**
 * @author WASUPRE
 */


public class mainMenu extends JFrame {
    public mainMenu() {
        initComponents();

    }

    private void CargarInfo(ActionEvent e) {
        frame1.setVisible(true);
        frame.setVisible(false);

    }

    private void DevolverAlMenuDesdeMenu2(ActionEvent e) {
        frame1.setVisible(false);
        frame.setVisible(true);
    }

    private void CargarTxt(ActionEvent e) {
        List<LineInterface> lineas;
        lineas = leerStations();
        setLineastxt(lineas);
        JOptionPane.showMessageDialog(null, "Cargado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        button5.setEnabled(false);
    }

    public List<LineInterface> leerStations() {
        List<LineInterface> listLineas = new ArrayList<>();

        List<Station> stations = new ArrayList<>();

        List<Station> stations2 = new ArrayList<>();

        List<Station> stations3 = new ArrayList<>();

        List<Station> stations4 = new ArrayList<>();

        List<Station> stationsSueltas1 = new ArrayList<>();

        List<Section> sections = new ArrayList<>();

        List<Section> sections2 = new ArrayList<>();

        List<Section> sections3 = new ArrayList<>();

        List<Section> sections4 = new ArrayList<>();

        List<LineRegular> linea4 = new ArrayList<>();
        int i = 0;
        int j = 1;

        try {
            File file = new File("C:\\Users\\WASUPRE\\Desktop\\Lab 3 paradigmas\\Lab3_VejarBranada_214517302\\lab3_21451730_Vejar\\src\\main\\java\\org\\Proyecto\\lineas.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (!linea.startsWith("Sections")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                String name = datos[1].trim();
                String type = datos[2].trim();
                int stopTime = Integer.parseInt(datos[3].trim());
                Station station = new Station(id, name, type, stopTime);
                stations.add(station);
                linea = br.readLine();
            }
            linea = br.readLine();
            while (!linea.startsWith("Lineas")) {
                String[] datos = linea.split(",");
                int distance = Integer.parseInt(datos[0].trim());
                int cost = Integer.parseInt(datos[1].trim());
                Section section = new Section(stations.get(i), stations.get(j), distance, cost);
                sections.add(section);
                i++;
                j++;
                linea = br.readLine();
            }
            linea = br.readLine();
            while (!linea.startsWith("Termino")) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0].trim());
                String name = datos[1].trim();
                String railType = datos[2].trim();
                LineRegular lineaRegular = new LineRegular(id, name, railType, sections);
                listLineas.add(lineaRegular);
                linea = br.readLine();
            }

            // Linea 2
            i = 0;
            j = 1;

            linea = br.readLine();
            while (!linea.startsWith("Sections")) {

                String[] datos2 = linea.split(",");

                int id2 = Integer.parseInt(datos2[0].trim());
                String name2 = datos2[1].trim();
                String type2 = datos2[2].trim();
                int stopTime2 = Integer.parseInt(datos2[3].trim());
                Station station2 = new Station(id2, name2, type2, stopTime2);
                stations2.add(station2);
                linea = br.readLine();

            }

            linea = br.readLine();
            while (!linea.startsWith("Lineas")) {
                String[] datos2 = linea.split(",");
                int distance2 = Integer.parseInt(datos2[0].trim());
                int cost2 = Integer.parseInt(datos2[1].trim());
                Section section2 = new Section(stations2.get(i), stations2.get(j), distance2, cost2);
                sections2.add(section2);
                i++;
                j++;
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Termino")) {
                String[] datos2 = linea.split(",");
                int id2 = Integer.parseInt(datos2[0].trim());
                String name2 = datos2[1].trim();
                String railType2 = datos2[2].trim();
                LineRegular lineaRegular2 = new LineRegular(id2, name2, railType2, sections2);
                listLineas.add(lineaRegular2);
                linea = br.readLine();
            }

            // Linea 3
            i = 0;
            j = 1;

            linea = br.readLine();
            while (!linea.startsWith("Sections")) {

                String[] datos3 = linea.split(",");

                int id3 = Integer.parseInt(datos3[0].trim());
                String name3 = datos3[1].trim();
                String type3 = datos3[2].trim();
                int stopTime3 = Integer.parseInt(datos3[3].trim());
                Station station3 = new Station(id3, name3, type3, stopTime3);
                stations3.add(station3);
                linea = br.readLine();

            }

            linea = br.readLine();
            while (!linea.startsWith("Lineas")) {
                String[] datos3 = linea.split(",");
                int distance3 = Integer.parseInt(datos3[0].trim());
                int cost3 = Integer.parseInt(datos3[1].trim());
                Section section3 = new Section(stations3.get(i), stations3.get(j), distance3, cost3);
                sections3.add(section3);
                i++;
                j++;
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Termino")) {
                String[] datos3 = linea.split(",");
                int id3 = Integer.parseInt(datos3[0].trim());
                String name3 = datos3[1].trim();
                String railType3 = datos3[2].trim();
                LineRegular lineaRegular3 = new LineRegular(id3, name3, railType3, sections3);
                listLineas.add(lineaRegular3);
                linea = br.readLine();
            }

            // Linea 4
            i = 0;
            j = 1;

            linea = br.readLine();
            while (!linea.startsWith("Sections")) {

                String[] datos4 = linea.split(",");

                int id4 = Integer.parseInt(datos4[0].trim());
                String name4 = datos4[1].trim();
                String type4 = datos4[2].trim();
                int stopTime4 = Integer.parseInt(datos4[3].trim());
                Station station4 = new Station(id4, name4, type4, stopTime4);
                stations4.add(station4);
                linea = br.readLine();

            }

            linea = br.readLine();
            while (!linea.startsWith("Lineas")) {
                String[] datos4 = linea.split(",");
                int distance4 = Integer.parseInt(datos4[0].trim());
                int cost4 = Integer.parseInt(datos4[1].trim());
                Section section4 = new Section(stations4.get(i), stations4.get(j), distance4, cost4);
                sections4.add(section4);
                i++;
                j++;
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Termino")) {
                String[] datos4 = linea.split(",");
                int id4 = Integer.parseInt(datos4[0].trim());
                String name4 = datos4[1].trim();
                String railType4 = datos4[2].trim();
                LineCircular lineaCircular = new LineCircular(id4, name4, railType4, sections4);
                setLineaCircular4(lineaCircular);
                linea = br.readLine();
            }
            //Estaciones sueltas

            linea = br.readLine();
            while (!linea.startsWith("Sections")) {

                String[] datos5 = linea.split(",");

                int id5 = Integer.parseInt(datos5[0].trim());
                String name5 = datos5[1].trim();
                String type5 = datos5[2].trim();
                int stopTime5 = Integer.parseInt(datos5[3].trim());
                Station station5 = new Station(id5, name5, type5, stopTime5);
                stationsSueltas1.add(station5);
                linea = br.readLine();
            }
            setStationsSueltas(stationsSueltas1);

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLineas;
    }

    private void LineLengthMenu(ActionEvent e) {
        frame7.setVisible(true);
        frame3.setVisible(false);
    }

    private void button3(ActionEvent e) {
        // TODO add your code here
    }

    private void InteractuarMetro(ActionEvent e) {
        frame3.setVisible(true);
        frame.setVisible(false);
    }

    private void OperacionTren(ActionEvent e) {
        frame4.setVisible(true);
        frame3.setVisible(false);
        frame5.setVisible(false);
    }

    private void Button54(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Cargado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        button6.setEnabled(false);
    }


    private void DevolverDesdeInteraccion(ActionEvent e) {
        frame3.setVisible(false);
        frame.setVisible(true);
    }

    private void SalirDelPrograma(ActionEvent e) {
        System.exit(0);
    }

    private void CambiarARegulares(ActionEvent e) {
        frame3.setVisible(true);
        frame5.setVisible(false);
    }

    private void CambiarACirculares(ActionEvent e) {
        frame5.setVisible(true);
        frame3.setVisible(false);
    }

    private void DevolverDesdeCirculares(ActionEvent e) {
        frame5.setVisible(false);
        frame.setVisible(true);
    }

    private void VolverDesdeTrains(ActionEvent e) {
        frame3.setVisible(true);
        frame4.setVisible(false);
    }

    private void OpSubway(ActionEvent e) {
        frame6.setVisible(true);
        frame3.setVisible(false);
        frame5.setVisible(false);
    }

    private void OpsubwayCircular(ActionEvent e) {
        frame6.setVisible(true);
        frame3.setVisible(false);
        frame5.setVisible(false);
    }

    private void VolverDesdeLargoRegular(ActionEvent e) {
        frame7.setVisible(false);
        frame3.setVisible(true);
    }

    private void LargoLinea1(ActionEvent e) {
        int largo1;
        largo1 = lineastxt.get(0).line_Length();
        JOptionPane.showMessageDialog(null, "el largo es " + largo1, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LargoLinea2(ActionEvent e) {
        int largo2;
        largo2 = lineastxt.get(1).line_Length();
        JOptionPane.showMessageDialog(null, "el largo es " + largo2, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LargoLinea3(ActionEvent e) {
        int largo3;
        largo3 = lineastxt.get(2).line_Length();
        JOptionPane.showMessageDialog(null, "el largo es " + largo3, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LineCost1(ActionEvent e) {
        int costo1;
        costo1 = lineastxt.get(0).line_Cost();
        JOptionPane.showMessageDialog(null, "el largo es " + costo1, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LineCost2(ActionEvent e) {
        int costo2;
        costo2 = lineastxt.get(1).line_Cost();
        JOptionPane.showMessageDialog(null, "el largo es " + costo2, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LineCost3(ActionEvent e) {
        int costo3;
        costo3 = lineastxt.get(2).line_Cost();
        JOptionPane.showMessageDialog(null, "el largo es " + costo3, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void VolverDesdeCostoRegular(ActionEvent e) {
        frame8.setVisible(false);
        frame3.setVisible(true);
    }

    private void LinecostRegulares(ActionEvent e) {
        frame8.setVisible(true);
        frame3.setVisible(false);
    }

    private void IsLine1(ActionEvent e) {
        boolean indicador1 = lineastxt.get(0).isLine();
        if (indicador1) {
            JOptionPane.showMessageDialog(null, "La linea es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La linea no es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void isLinepanel(ActionEvent e) {
        frame9.setVisible(true);
        frame3.setVisible(false);
    }

    private void VolverDesdeIsLine(ActionEvent e) {
        frame9.setVisible(false);
        frame3.setVisible(true);
    }

    private void IsLine2(ActionEvent e) {
        boolean indicador2 = lineastxt.get(1).isLine();
        if (indicador2) {
            JOptionPane.showMessageDialog(null, "La linea es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La linea no es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void IsLine3(ActionEvent e) {
        boolean indicador3 = lineastxt.get(2).isLine();
        if (indicador3) {
            JOptionPane.showMessageDialog(null, "La linea es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La linea no es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void LineLength4(ActionEvent e) {
        int largo4;
        largo4 = LineaCircular4.line_Length();
        JOptionPane.showMessageDialog(null, "el largo es " + largo4, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LineCost4(ActionEvent e) {
        int costo4;
        costo4 = LineaCircular4.line_Cost();
        JOptionPane.showMessageDialog(null, "el largo es " + costo4, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void IsLine4(ActionEvent e) {
        boolean banderita;
        banderita = LineaCircular4.isLine();
        if (banderita) {
            JOptionPane.showMessageDialog(null, "La linea es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La linea no es valida", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void VisualizarEstado(ActionEvent e) {
        frame.setVisible(false);
        frame2.setVisible(true);
    }

    private void RetornoMenuDesdeVisualizar(ActionEvent e) {
        frame.setVisible(true);
        frame2.setVisible(false);
    }

    private void isTrainmenu(ActionEvent e) {
        frame10.setVisible(true);
        frame4.setVisible(false);
    }

    private void VolverDesdeIstrain(ActionEvent e) {
        frame10.setVisible(false);
        frame4.setVisible(true);
    }

    private void Fetchcapacyr(ActionEvent e) {
        frame11.setVisible(true);
        frame4.setVisible(false);
    }

    private void VolverdesdeFetch(ActionEvent e) {
        frame11.setVisible(false);
        frame4.setVisible(true);
    }


    private void LineSectionLenthRegular(ActionEvent e) {
        frame12.setVisible(true);
        frame3.setVisible(false);
    }


    private void VolverDesdeSectionle(ActionEvent e) {
        frame12.setVisible(false);
        frame3.setVisible(true);
    }

    private void button63(ActionEvent e) {
        // TODO add your code here
    }

    private void SeleccionarEstaciones(ActionEvent e) {
        String Estacion1Name = (String) comboBox2.getSelectedItem();
        String Estacion2Name = (String) comboBox3.getSelectedItem();
        int largo6;
        largo6 = lineastxt.get(0).line_Section_Length(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El largo es " + largo6, "Información", JOptionPane.INFORMATION_MESSAGE);

    }

    private void ConfirmarEstaciones2(ActionEvent e) {
        String Estacion1Name = (String) comboBox4.getSelectedItem();
        String Estacion2Name = (String) comboBox5.getSelectedItem();
        int largo6;
        largo6 = lineastxt.get(1).line_Section_Length(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El largo es " + largo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void Volverdesde2Estaciones(ActionEvent e) {
        frame13.setVisible(false);
        frame3.setVisible(true);
    }

    private void Linea1desdeSectionLeng(ActionEvent e) {
        frame13.setVisible(false);
        frame12.setVisible(true);
    }

    private void ConfirmarLinea3(ActionEvent e) {
        String Estacion1Name = (String) comboBox6.getSelectedItem();
        String Estacion2Name = (String) comboBox7.getSelectedItem();
        int largo6;
        largo6 = lineastxt.get(2).line_Section_Length(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El largo es " + largo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void VolverDesde3(ActionEvent e) {
        frame14.setVisible(false);
        frame3.setVisible(true);
    }

    private void CambiarALinea2(ActionEvent e) {
        frame12.setVisible(false);
        frame13.setVisible(true);
    }

    private void VolverALinea3(ActionEvent e) {
        frame12.setVisible(false);
        frame14.setVisible(true);
    }

    private void Linea3Section(ActionEvent e) {
        frame13.setVisible(false);
        frame14.setVisible(true);
    }

    private void CambiarALinea1(ActionEvent e) {
        frame12.setVisible(true);
        frame14.setVisible(false);
    }

    private void button72(ActionEvent e) {
        frame13.setVisible(true);
        frame14.setVisible(false);
    }

    private void ConfirmarLinea4(ActionEvent e) {
        String Estacion1Name = (String) comboBox8.getSelectedItem();
        String Estacion2Name = (String) comboBox9.getSelectedItem();
        int largo6;
        largo6 = getLineaCircular4().line_Section_Length(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El largo es " + largo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void VolverLinea4(ActionEvent e) {
        frame15.setVisible(false);
        frame5.setVisible(true);
    }

    private void LineSectiopnLegnth4(ActionEvent e) {
        frame15.setVisible(true);
        frame5.setVisible(false);
    }

    private void ConfirmarCost4(ActionEvent e) {
        String Estacion1Name = (String) comboBox10.getSelectedItem();
        String Estacion2Name = (String) comboBox11.getSelectedItem();
        int costo6;
        costo6 = getLineaCircular4().line_Section_Cost(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El costo es " + costo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LineCOst4(ActionEvent e) {
        frame16.setVisible(true);
        frame5.setVisible(false);
    }

    private void Vovler57(ActionEvent e) {
        frame16.setVisible(false);
        frame5.setVisible(true);
    }

    private void ConfirmarLineCost1(ActionEvent e) {
        String Estacion1Name = (String) comboBox12.getSelectedItem();
        String Estacion2Name = (String) comboBox13.getSelectedItem();
        int costo6;
        costo6 = lineastxt.get(0).line_Section_Cost(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El costo es " + costo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LineSectionCost1(ActionEvent e) {
        frame3.setVisible(false);
        frame17.setVisible(true);
    }

    private void VolverDesdeCost1(ActionEvent e) {
        frame3.setVisible(true);
        frame17.setVisible(false);
    }

    private void VolverDesdecost3(ActionEvent e) {
        frame3.setVisible(true);
        frame18.setVisible(false);

    }

    private void ConfirmarLinea2cost(ActionEvent e) {
        String Estacion1Name = (String) comboBox14.getSelectedItem();
        String Estacion2Name = (String) comboBox15.getSelectedItem();
        int costo6;
        costo6 = lineastxt.get(1).line_Section_Cost(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El costo es " + costo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void CambiarAlinea2Cost(ActionEvent e) {
        frame17.setVisible(false);
        frame18.setVisible(true);
    }

    private void CambiarALinea1Cost(ActionEvent e) {
        frame17.setVisible(true);
        frame18.setVisible(false);
    }

    private void Conriamrlinea3Cost(ActionEvent e) {
        String Estacion1Name = (String) comboBox16.getSelectedItem();
        String Estacion2Name = (String) comboBox17.getSelectedItem();
        int costo6;
        costo6 = lineastxt.get(2).line_Section_Cost(Estacion1Name, Estacion2Name);

        JOptionPane.showMessageDialog(null, "El costo es " + costo6, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void VolverLinea3Cost(ActionEvent e) {
        frame3.setVisible(true);
        frame19.setVisible(false);
    }

    private void CambiarLinea2cost(ActionEvent e) {
        frame18.setVisible(true);
        frame19.setVisible(false);
    }

    private void CambiarLinea1Cost(ActionEvent e) {
        frame17.setVisible(true);
        frame19.setVisible(false);
    }

    private void CambiarLinea3Costr(ActionEvent e) {
        frame18.setVisible(false);
        frame19.setVisible(true);
    }

    private void CambiarlInea3C(ActionEvent e) {
        frame17.setVisible(false);
        frame19.setVisible(true);
    }


    public List<Train> leerTrenes() {

        List<Train> trains = new ArrayList<>();


        List<PassengerCar> lista1 = new ArrayList<>();

        List<PassengerCar> lista2 = new ArrayList<>();

        List<PassengerCar> lista3 = new ArrayList<>();

        List<PassengerCar> lista4 = new ArrayList<>();

        List<PassengerCar> pcarsSueltos1 = new ArrayList<>();

        int i =0;
        int j =1;

        try {
            File file = new File("C:\\Users\\WASUPRE\\Desktop\\Lab 3 paradigmas\\Lab3_VejarBranada_214517302\\lab3_21451730_Vejar\\src\\main\\java\\org\\Proyecto\\trenes.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (!linea.startsWith("Tren")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                int passengerCapacity = Integer.parseInt(datos[1].trim());
                String model = datos[2].trim();
                String trainMaker = datos[3].trim();
                String carType = datos[4].trim();
                PassengerCar passengerCar = new PassengerCar(id, passengerCapacity, model, trainMaker, carType);
                lista1.add(passengerCar);
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Carros")) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0].trim());
                String trainMaker = datos[1].trim();
                int speed = Integer.parseInt(datos[2].trim());
                int stationStaytime = Integer.parseInt((datos[3]));
                Train train1 = new Train(id, trainMaker, speed, stationStaytime, lista1);
                trains.add(train1);
                linea = br.readLine();
            }

            //Tren 2

            linea = br.readLine();
            while (!linea.startsWith("Tren")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                int passengerCapacity = Integer.parseInt(datos[1].trim());
                String model = datos[2].trim();
                String trainMaker = datos[3].trim();
                String carType = datos[4].trim();
                PassengerCar passengerCar = new PassengerCar(id, passengerCapacity, model, trainMaker, carType);
                lista2.add(passengerCar);
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Carros")) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0].trim());
                String trainMaker = datos[1].trim();
                int speed = Integer.parseInt(datos[2].trim());
                int stationStaytime = Integer.parseInt((datos[3]));
                Train train2 = new Train(id, trainMaker, speed, stationStaytime, lista2);
                trains.add(train2);
                linea = br.readLine();
            }
            //Tren 3
            linea = br.readLine();
            while (!linea.startsWith("Tren")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                int passengerCapacity = Integer.parseInt(datos[1].trim());
                String model = datos[2].trim();
                String trainMaker = datos[3].trim();
                String carType = datos[4].trim();
                PassengerCar passengerCar = new PassengerCar(id, passengerCapacity, model, trainMaker, carType);
                lista3.add(passengerCar);
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Carros")) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0].trim());
                String trainMaker = datos[1].trim();
                int speed = Integer.parseInt(datos[2].trim());
                int stationStaytime = Integer.parseInt((datos[3]));
                Train train3 = new Train(id, trainMaker, speed, stationStaytime, lista3);
                trains.add(train3);
                linea = br.readLine();
            }
            //Tren 4
            linea = br.readLine();
            while (!linea.startsWith("Tren")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                int passengerCapacity = Integer.parseInt(datos[1].trim());
                String model = datos[2].trim();
                String trainMaker = datos[3].trim();
                String carType = datos[4].trim();
                PassengerCar passengerCar = new PassengerCar(id, passengerCapacity, model, trainMaker, carType);
                lista4.add(passengerCar);
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Carros")) {
                String[] datos = linea.split(",");
                int id = Integer.parseInt(datos[0].trim());
                String trainMaker = datos[1].trim();
                int speed = Integer.parseInt(datos[2].trim());
                int stationStaytime = Integer.parseInt((datos[3]));
                Train train4 = new Train(id, trainMaker, speed, stationStaytime, lista4);
                trains.add(train4);
                linea = br.readLine();
            }

            linea = br.readLine();
            while (!linea.startsWith("Tren")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                int passengerCapacity = Integer.parseInt(datos[1].trim());
                String model = datos[2].trim();
                String trainMaker = datos[3].trim();
                String carType = datos[4].trim();
                PassengerCar passengerCar = new PassengerCar(id, passengerCapacity, model, trainMaker, carType);
                pcarsSueltos1.add(passengerCar);
                linea = br.readLine();
            }
            setPcarsSueltos(pcarsSueltos1);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return trains;
    }

    private void TrenesCargar(ActionEvent e) {
        List<Train> trenesLista;
        trenesLista = leerTrenes();
        setTrenestxt(trenesLista);
        JOptionPane.showMessageDialog(null, "Cargado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        button7.setEnabled(false);


    }

    private void AgregarEstacion(ActionEvent e) {
        int Estacion = comboBox1.getSelectedIndex();
        int Linea = comboBox18.getSelectedIndex();
        if(Linea == 3 && stationsSueltas.get(Estacion).getType().equals("t")){
            JOptionPane.showMessageDialog(null, "No se puede agregar una estacion tipo T a la linea 4 circular", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        if(Linea == 3 && !stationsSueltas.get(Estacion).getType().equals("t")){
            frame22.setVisible(true);
        }
        else{
            if(stationsSueltas.get(Estacion).getType().equals("t")){
                lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2().setType("r");
                Section section2 = new Section(lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2(),stationsSueltas.get(Estacion), 60, 60);
                lineastxt.get(Linea).line_Add_Section(section2);
                JOptionPane.showMessageDialog(null, "Agregada Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2().getName());
            }
            else{
                lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2().setType("r");
                Station station1 = new Station();
                station1 = stationsSueltas.get(Estacion);
                Section section3 = new Section(lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2(),station1, 60, 60);
                lineastxt.get(Linea).line_Add_Section(section3);
                lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2().setType("t");
                JOptionPane.showMessageDialog(null, "Agregada Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(lineastxt.get(Linea).getSections().get(lineastxt.get(Linea).getSections().size()-1).getPoint2().getName());
            }
        }
    }

    private void lineAddSectiopden(ActionEvent e) {
        frame21.setVisible(false);
        frame20.setVisible(true);
    }

    private void volver3fdas(ActionEvent e) {
        frame21.setVisible(true);
        frame20.setVisible(false);
    }

    private void modificar(ActionEvent e) {
        frame1.setVisible(false);
        frame21.setVisible(true);
    }

    private void Confirmar32(ActionEvent e) {
        int Estacion = comboBox1.getSelectedIndex();
        int Linea = comboBox18.getSelectedIndex();
        Section section2 = new Section(LineaCircular4.getSections().get(LineaCircular4.getSections().size()-1).getPoint2(),stationsSueltas.get(Estacion), 60, 60);
        LineaCircular4.line_Add_Section(section2);
        JOptionPane.showMessageDialog(null, "Agregada Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        frame22.setVisible(false);
    }

    private void Rechazarcircular(ActionEvent e) {
        frame22.setVisible(false);
    }

    private void VolverAEditar(ActionEvent e) {
        frame21.setVisible(false);
        frame1.setVisible(true);
    }

    private void Train1Is(ActionEvent e) {
        if(trenestxt.get(0).isTrain()){
        JOptionPane.showMessageDialog(null, "El tren es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El tren no es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void isTrain2d(ActionEvent e) {
        if(trenestxt.get(1).isTrain()){
            JOptionPane.showMessageDialog(null, "El tren es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El tren no es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void IsLine3e(ActionEvent e) {
        if(trenestxt.get(2).isTrain()){
            JOptionPane.showMessageDialog(null, "El tren es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El tren no es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void isTrain4d(ActionEvent e) {
        if(trenestxt.get(3).isTrain()){
            JOptionPane.showMessageDialog(null, "El tren es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El tren no es valido", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void LargoTren1(ActionEvent e) {
        int largo = trenestxt.get(0).fetchCapacity();
        JOptionPane.showMessageDialog(null, "La capacidad del tren es:" + largo, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LargoTren2(ActionEvent e) {
        int largo = trenestxt.get(1).fetchCapacity();
        JOptionPane.showMessageDialog(null, "La capacidad del tren es:" + largo, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LargoTren3(ActionEvent e) {
        int largo = trenestxt.get(2).fetchCapacity();
        JOptionPane.showMessageDialog(null, "La capacidad del tren es:" + largo, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void LargoTren4(ActionEvent e) {
        int largo = trenestxt.get(3).fetchCapacity();
        JOptionPane.showMessageDialog(null, "La capacidad del tren es:" + largo, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void Volver23(ActionEvent e) {
        frame23.setVisible(false);
        frame4.setVisible(true);
    }

    private void AddCare(ActionEvent e) {
        frame23.setVisible(true);
        frame4.setVisible(false);
    }

    private void AgregarPcar(ActionEvent e) {
        int pcarSelect = comboBox19.getSelectedIndex();
        int trenSelect = comboBox20.getSelectedIndex();
        int posicion = comboBox21.getSelectedIndex();
        if(posicion > trenestxt.get(trenSelect).getCarlist().size()){
            JOptionPane.showMessageDialog(null, "Estas removiendo una posicion inexistente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if(trenestxt.get(trenSelect).getCarlist().contains(pcarsSueltos.get(pcarSelect))){
                JOptionPane.showMessageDialog(null, "El carro esta repetido", "Información", JOptionPane.INFORMATION_MESSAGE);

            }
            trenestxt.get(trenSelect).addCar(pcarsSueltos.get(pcarSelect), posicion);
            JOptionPane.showMessageDialog(null, "Agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Remove(ActionEvent e) {
        int opcion = comboBox22.getSelectedIndex();
        int trenSelect2 = comboBox23.getSelectedIndex();
        if(opcion > trenestxt.get(trenSelect2).getCarlist().size()){
            JOptionPane.showMessageDialog(null, "Estas removiendo una posicion inexistente", "Información", JOptionPane.INFORMATION_MESSAGE);

        }
        else {
            trenestxt.get(trenSelect2).removeCar(opcion);
            JOptionPane.showMessageDialog(null, "Se ha removido correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void VolverRemove(ActionEvent e) {
        frame24.setVisible(false);
        frame4.setVisible(true);
    }

    private void RemoveCar32(ActionEvent e) {
        frame4.setVisible(false);
        frame24.setVisible(true);
    }


    private void ConductoresAsignadosTXT(ActionEvent e) {

        if(trenestxt == null){
            JOptionPane.showMessageDialog(null, "Tienes que cargar los trenes primero", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            List<Driver> driversFinal;
            driversFinal = CargarTxt();
            setDriverstxt(driversFinal);
            JOptionPane.showMessageDialog(null, "Cargado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            button8.setEnabled(false);
        }
    }

    public List<Driver> CargarTxt(){

        List<Driver> driverList = new ArrayList<>();
        List<Driver> driverListSueltos = new ArrayList<>();

        try {
            File file = new File("C:\\Users\\WASUPRE\\Desktop\\Lab 3 paradigmas\\Lab3_VejarBranada_214517302\\lab3_21451730_Vejar\\src\\main\\java\\org\\Proyecto\\conductores.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            while (!linea.startsWith("Sueltos")){

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                String name = datos[1].trim();
                String trainMaker = datos[2].trim();
                Driver conductor = new Driver(id, name, trainMaker);
                driverList.add(conductor);
                linea = br.readLine();
            }
            //Estaciones sueltas
            linea = br.readLine();
            while (!linea.startsWith("Termino")) {

                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0].trim());
                String name = datos[1].trim();
                String trainMaker = datos[2].trim();
                Driver conductor = new Driver(id, name, trainMaker);
                driverListSueltos.add(conductor);
                linea = br.readLine();
            }
            setDriversSueltos(driverListSueltos);
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return driverList;
    }

    private void CrearMetro(ActionEvent e) {
        if(lineastxt == null){
            JOptionPane.showMessageDialog(null, "Falta cargar la creacion de la linea basica", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        if(trenestxt == null){
            JOptionPane.showMessageDialog(null, "Falta cargar la definicion de trenes", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        if(driverstxt == null){
            JOptionPane.showMessageDialog(null, "Falta cargar los conductores asignados a una linea", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            subway1 = new Subway(0,"Metro de santiago modificado y reducido");
            subway1.addLine(lineastxt);
            List<LineInterface> listCircular = new ArrayList<>();
            listCircular.add(LineaCircular4);
            subway1.addLine(listCircular);
            JOptionPane.showMessageDialog(null, "Creado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            button54.setEnabled(false);

        }
    }

    private void SubwayToStringmenu(ActionEvent e) {
        if(subway1 == null){
            JOptionPane.showMessageDialog(null, "Tienes que crear el subway primero", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String datos = subway1.toString();
            JOptionPane.showMessageDialog(null, "Datos: " + datos, "Información", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void AssignTrainMenu(ActionEvent e) {
        if(subway1 == null){
            JOptionPane.showMessageDialog(null, "Tienes que crear el subway primero", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            frame21.setVisible(false);
            frame25.setVisible(true);
        }
    }

    private void ConfirmarAssignTrain(ActionEvent e) {
        int selectTrain = comboBox24.getSelectedIndex();
        int selectLine = comboBox25.getSelectedIndex();
        if(selectLine == 3){
            subway1.assignTrainToLine(trenestxt.get(selectTrain),LineaCircular4);
            JOptionPane.showMessageDialog(null, "Agregado Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            comboBox24.removeItemAt(selectTrain);
        }
        else{
            subway1.assignTrainToLine(trenestxt.get(selectTrain),lineastxt.get(selectLine));
            JOptionPane.showMessageDialog(null, "Agregado Correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            comboBox24.removeItemAt(selectTrain);
        }
        if(comboBox24.getItemCount() == 0) {
            button94.setEnabled(false);
        }
    }

    private void VolverAModificar3(ActionEvent e) {
        frame21.setVisible(true);
        frame25.setVisible(false);
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - matias vejar
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        frame1 = new JFrame();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button54 = new JButton();
        button90 = new JButton();
        button12 = new JButton();
        frame2 = new JFrame();
        button10 = new JButton();
        button11 = new JButton();
        frame3 = new JFrame();
        label1 = new JLabel();
        button19 = new JButton();
        button13 = new JButton();
        button17 = new JButton();
        button9 = new JButton();
        button28 = new JButton();
        button14 = new JButton();
        button18 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        frame4 = new JFrame();
        label3 = new JLabel();
        button30 = new JButton();
        button31 = new JButton();
        button32 = new JButton();
        button33 = new JButton();
        button34 = new JButton();
        frame5 = new JFrame();
        label2 = new JLabel();
        button20 = new JButton();
        button21 = new JButton();
        button22 = new JButton();
        button23 = new JButton();
        button29 = new JButton();
        button25 = new JButton();
        button24 = new JButton();
        button26 = new JButton();
        button27 = new JButton();
        frame6 = new JFrame();
        button35 = new JButton();
        button36 = new JButton();
        button37 = new JButton();
        frame7 = new JFrame();
        label4 = new JLabel();
        button38 = new JButton();
        button39 = new JButton();
        button41 = new JButton();
        button40 = new JButton();
        frame8 = new JFrame();
        label5 = new JLabel();
        button42 = new JButton();
        button43 = new JButton();
        button44 = new JButton();
        button45 = new JButton();
        frame9 = new JFrame();
        label6 = new JLabel();
        button46 = new JButton();
        button47 = new JButton();
        button48 = new JButton();
        button49 = new JButton();
        frame10 = new JFrame();
        label7 = new JLabel();
        button50 = new JButton();
        button51 = new JButton();
        button52 = new JButton();
        button53 = new JButton();
        button60 = new JButton();
        frame11 = new JFrame();
        label8 = new JLabel();
        button55 = new JButton();
        button56 = new JButton();
        button57 = new JButton();
        button58 = new JButton();
        button61 = new JButton();
        frame12 = new JFrame();
        label9 = new JLabel();
        label10 = new JLabel();
        comboBox2 = new JComboBox<>();
        button64 = new JButton();
        comboBox3 = new JComboBox<>();
        button65 = new JButton();
        button62 = new JButton();
        button63 = new JButton();
        frame13 = new JFrame();
        label11 = new JLabel();
        label12 = new JLabel();
        comboBox4 = new JComboBox<>();
        button68 = new JButton();
        comboBox5 = new JComboBox<>();
        button69 = new JButton();
        button66 = new JButton();
        button67 = new JButton();
        frame14 = new JFrame();
        label13 = new JLabel();
        label14 = new JLabel();
        comboBox6 = new JComboBox<>();
        button72 = new JButton();
        comboBox7 = new JComboBox<>();
        button73 = new JButton();
        button70 = new JButton();
        button71 = new JButton();
        frame15 = new JFrame();
        label15 = new JLabel();
        label16 = new JLabel();
        comboBox8 = new JComboBox<>();
        comboBox9 = new JComboBox<>();
        button74 = new JButton();
        button75 = new JButton();
        frame16 = new JFrame();
        label17 = new JLabel();
        label18 = new JLabel();
        comboBox10 = new JComboBox<>();
        comboBox11 = new JComboBox<>();
        button76 = new JButton();
        button77 = new JButton();
        frame17 = new JFrame();
        label19 = new JLabel();
        label20 = new JLabel();
        comboBox12 = new JComboBox<>();
        button82 = new JButton();
        comboBox13 = new JComboBox<>();
        button89 = new JButton();
        button78 = new JButton();
        button79 = new JButton();
        frame18 = new JFrame();
        label21 = new JLabel();
        label22 = new JLabel();
        comboBox14 = new JComboBox<>();
        button83 = new JButton();
        comboBox15 = new JComboBox<>();
        button88 = new JButton();
        button81 = new JButton();
        button80 = new JButton();
        frame19 = new JFrame();
        label23 = new JLabel();
        label24 = new JLabel();
        comboBox16 = new JComboBox<>();
        button86 = new JButton();
        comboBox17 = new JComboBox<>();
        button87 = new JButton();
        button84 = new JButton();
        button85 = new JButton();
        frame20 = new JFrame();
        label25 = new JLabel();
        label26 = new JLabel();
        label27 = new JLabel();
        comboBox1 = new JComboBox<>();
        comboBox18 = new JComboBox<>();
        button91 = new JButton();
        button92 = new JButton();
        frame21 = new JFrame();
        label32 = new JLabel();
        button93 = new JButton();
        button59 = new JButton();
        button96 = new JButton();
        button100 = new JButton();
        frame22 = new JFrame();
        label28 = new JLabel();
        label29 = new JLabel();
        button98 = new JButton();
        button99 = new JButton();
        frame23 = new JFrame();
        label30 = new JLabel();
        comboBox19 = new JComboBox<>();
        comboBox20 = new JComboBox<>();
        comboBox21 = new JComboBox<>();
        button101 = new JButton();
        button102 = new JButton();
        frame24 = new JFrame();
        label31 = new JLabel();
        comboBox22 = new JComboBox<>();
        comboBox23 = new JComboBox<>();
        button103 = new JButton();
        button104 = new JButton();
        frame25 = new JFrame();
        label33 = new JLabel();
        comboBox24 = new JComboBox<>();
        comboBox25 = new JComboBox<>();
        button94 = new JButton();
        button95 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- button1 ----
        button1.setText("Cargar informaci\u00f3n del sistema de metro");
        button1.addActionListener(e -> CargarInfo(e));
        contentPane.add(button1, "cell 1 1");

        //---- button2 ----
        button2.setText("Visualizar estado actual del sistema de metro");
        button2.addActionListener(e -> VisualizarEstado(e));
        contentPane.add(button2, "cell 1 2");

        //---- button3 ----
        button3.setText("Interactuar con el sistema de metro");
        button3.addActionListener(e -> {
			button3(e);
			InteractuarMetro(e);
		});
        contentPane.add(button3, "cell 1 3");

        //---- button4 ----
        button4.setText("Salir del programa");
        button4.addActionListener(e -> SalirDelPrograma(e));
        contentPane.add(button4, "cell 1 4");
        pack();
        setLocationRelativeTo(getOwner());

        //======== frame1 ========
        {
            var frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button5 ----
            button5.setText("Creaci\u00f3n de una l\u00ednea de metro b\u00e1sica");
            button5.addActionListener(e -> CargarTxt(e));
            frame1ContentPane.add(button5, "cell 2 1");

            //---- button6 ----
            button6.setText("Combinaciones entre estaciones entre L\u00edneas");
            button6.addActionListener(e -> Button54(e));
            frame1ContentPane.add(button6, "cell 2 2");

            //---- button7 ----
            button7.setText("Definici\u00f3n de trenes con distintos n\u00famero de carros");
            button7.addActionListener(e -> TrenesCargar(e));
            frame1ContentPane.add(button7, "cell 2 3");

            //---- button8 ----
            button8.setText("Conductores asignados a una L\u00ednea");
            button8.addActionListener(e -> ConductoresAsignadosTXT(e));
            frame1ContentPane.add(button8, "cell 2 4");

            //---- button54 ----
            button54.setText("Crear Metro");
            button54.addActionListener(e -> CrearMetro(e));
            frame1ContentPane.add(button54, "cell 2 5");

            //---- button90 ----
            button90.setText("Modificar sistema de metro");
            button90.addActionListener(e -> modificar(e));
            frame1ContentPane.add(button90, "cell 2 7");

            //---- button12 ----
            button12.setText("Retorno al men\u00fa de Inicio");
            button12.addActionListener(e -> DevolverAlMenuDesdeMenu2(e));
            frame1ContentPane.add(button12, "cell 2 8");
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }

        //======== frame2 ========
        {
            var frame2ContentPane = frame2.getContentPane();
            frame2ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button10 ----
            button10.setText("Desplegar en pantalla el estado actual de la red de metros.");
            button10.addActionListener(e -> SubwayToStringmenu(e));
            frame2ContentPane.add(button10, "cell 2 2");

            //---- button11 ----
            button11.setText("Retorno al men\u00fa de Inicio");
            button11.addActionListener(e -> RetornoMenuDesdeVisualizar(e));
            frame2ContentPane.add(button11, "cell 2 3");
            frame2.pack();
            frame2.setLocationRelativeTo(frame2.getOwner());
        }

        //======== frame3 ========
        {
            var frame3ContentPane = frame3.getContentPane();
            frame3ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("         OPERACIONES CON LINEAS REGULARES");
            frame3ContentPane.add(label1, "cell 0 0");

            //---- button19 ----
            button19.setText("Cambiar a circulares");
            button19.addActionListener(e -> CambiarACirculares(e));
            frame3ContentPane.add(button19, "cell 1 0");

            //---- button13 ----
            button13.setText("lineLength");
            button13.addActionListener(e -> LineLengthMenu(e));
            frame3ContentPane.add(button13, "cell 0 2");

            //---- button17 ----
            button17.setText("Operaciones con trenes");
            button17.addActionListener(e -> OperacionTren(e));
            frame3ContentPane.add(button17, "cell 1 2");

            //---- button9 ----
            button9.setText("lineSectionLength");
            button9.addActionListener(e -> LineSectionLenthRegular(e));
            frame3ContentPane.add(button9, "cell 0 3");

            //---- button28 ----
            button28.setText("Operaciones con Subway");
            button28.addActionListener(e -> OpSubway(e));
            frame3ContentPane.add(button28, "cell 1 3");

            //---- button14 ----
            button14.setText("lineCost");
            button14.addActionListener(e -> LinecostRegulares(e));
            frame3ContentPane.add(button14, "cell 0 4");

            //---- button18 ----
            button18.setText("Retorno al men\u00fa de Inicio");
            button18.addActionListener(e -> DevolverDesdeInteraccion(e));
            frame3ContentPane.add(button18, "cell 1 4");

            //---- button15 ----
            button15.setText("lineSectionCost");
            button15.addActionListener(e -> LineSectionCost1(e));
            frame3ContentPane.add(button15, "cell 0 5");

            //---- button16 ----
            button16.setText("isLine");
            button16.addActionListener(e -> isLinepanel(e));
            frame3ContentPane.add(button16, "cell 0 6");
            frame3.pack();
            frame3.setLocationRelativeTo(frame3.getOwner());
        }

        //======== frame4 ========
        {
            var frame4ContentPane = frame4.getContentPane();
            frame4ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label3 ----
            label3.setText("Operaciones de trains");
            frame4ContentPane.add(label3, "cell 1 0");

            //---- button30 ----
            button30.setText("addCar");
            button30.addActionListener(e -> AddCare(e));
            frame4ContentPane.add(button30, "cell 1 2");

            //---- button31 ----
            button31.setText("removeCar");
            button31.addActionListener(e -> RemoveCar32(e));
            frame4ContentPane.add(button31, "cell 1 3");

            //---- button32 ----
            button32.setText("isTrain");
            button32.addActionListener(e -> isTrainmenu(e));
            frame4ContentPane.add(button32, "cell 1 4");

            //---- button33 ----
            button33.setText("fetchCapacity");
            button33.addActionListener(e -> Fetchcapacyr(e));
            frame4ContentPane.add(button33, "cell 1 5");

            //---- button34 ----
            button34.setText("Volver");
            button34.addActionListener(e -> VolverDesdeTrains(e));
            frame4ContentPane.add(button34, "cell 7 6");
            frame4.pack();
            frame4.setLocationRelativeTo(frame4.getOwner());
        }

        //======== frame5 ========
        {
            var frame5ContentPane = frame5.getContentPane();
            frame5ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label2 ----
            label2.setText("         OPERACIONES CON LINEAS CIRCULARES");
            frame5ContentPane.add(label2, "cell 0 0");

            //---- button20 ----
            button20.setText("Cambiar a regulares");
            button20.addActionListener(e -> CambiarARegulares(e));
            frame5ContentPane.add(button20, "cell 1 0");

            //---- button21 ----
            button21.setText("LineLength");
            button21.addActionListener(e -> LineLength4(e));
            frame5ContentPane.add(button21, "cell 0 2");

            //---- button22 ----
            button22.setText("Operaciones con trenes");
            button22.addActionListener(e -> OperacionTren(e));
            frame5ContentPane.add(button22, "cell 1 2");

            //---- button23 ----
            button23.setText("LineSectionLength");
            button23.addActionListener(e -> LineSectiopnLegnth4(e));
            frame5ContentPane.add(button23, "cell 0 3");

            //---- button29 ----
            button29.setText("Operaciones con Subway");
            button29.addActionListener(e -> OpsubwayCircular(e));
            frame5ContentPane.add(button29, "cell 1 3");

            //---- button25 ----
            button25.setText("LineCost");
            button25.addActionListener(e -> LineCost4(e));
            frame5ContentPane.add(button25, "cell 0 4");

            //---- button24 ----
            button24.setText("Retorno al men\u00fa de Inicio");
            button24.addActionListener(e -> {
			DevolverDesdeInteraccion(e);
			DevolverDesdeCirculares(e);
		});
            frame5ContentPane.add(button24, "cell 1 4");

            //---- button26 ----
            button26.setText("lineSectionCost");
            button26.addActionListener(e -> LineCOst4(e));
            frame5ContentPane.add(button26, "cell 0 5");

            //---- button27 ----
            button27.setText("isLine");
            button27.addActionListener(e -> IsLine4(e));
            frame5ContentPane.add(button27, "cell 0 6");
            frame5.pack();
            frame5.setLocationRelativeTo(frame5.getOwner());
        }

        //======== frame6 ========
        {
            var frame6ContentPane = frame6.getContentPane();
            frame6ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- button35 ----
            button35.setText("whereIsTrain");
            frame6ContentPane.add(button35, "cell 1 2 3 2");

            //---- button36 ----
            button36.setText("trainPath");
            frame6ContentPane.add(button36, "cell 1 4 3 2");

            //---- button37 ----
            button37.setText("Volver");
            button37.addActionListener(e -> VolverDesdeTrains(e));
            frame6ContentPane.add(button37, "cell 7 5");
            frame6.pack();
            frame6.setLocationRelativeTo(frame6.getOwner());
        }

        //======== frame7 ========
        {
            var frame7ContentPane = frame7.getContentPane();
            frame7ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label4 ----
            label4.setText("lineLength: Determina el largo de la linea");
            frame7ContentPane.add(label4, "cell 2 0");

            //---- button38 ----
            button38.setText("Linea 1");
            button38.addActionListener(e -> LargoLinea1(e));
            frame7ContentPane.add(button38, "cell 1 3");

            //---- button39 ----
            button39.setText("Linea 2");
            button39.addActionListener(e -> LargoLinea2(e));
            frame7ContentPane.add(button39, "cell 1 4");

            //---- button41 ----
            button41.setText("Linea 3");
            button41.addActionListener(e -> LargoLinea3(e));
            frame7ContentPane.add(button41, "cell 1 5");

            //---- button40 ----
            button40.setText("Volver");
            button40.addActionListener(e -> VolverDesdeLargoRegular(e));
            frame7ContentPane.add(button40, "cell 3 5");
            frame7.pack();
            frame7.setLocationRelativeTo(frame7.getOwner());
        }

        //======== frame8 ========
        {
            var frame8ContentPane = frame8.getContentPane();
            frame8ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label5 ----
            label5.setText("lineCost: Determina del costo total de la linea");
            frame8ContentPane.add(label5, "cell 5 0");

            //---- button42 ----
            button42.setText("Linea 1");
            button42.addActionListener(e -> LineCost1(e));
            frame8ContentPane.add(button42, "cell 2 1");

            //---- button43 ----
            button43.setText("Linea 2");
            button43.addActionListener(e -> LineCost2(e));
            frame8ContentPane.add(button43, "cell 2 2");

            //---- button44 ----
            button44.setText("Linea 3");
            button44.addActionListener(e -> LineCost3(e));
            frame8ContentPane.add(button44, "cell 2 3");

            //---- button45 ----
            button45.setText("Volver");
            button45.addActionListener(e -> VolverDesdeCostoRegular(e));
            frame8ContentPane.add(button45, "cell 2 5");
            frame8.pack();
            frame8.setLocationRelativeTo(frame8.getOwner());
        }

        //======== frame9 ========
        {
            var frame9ContentPane = frame9.getContentPane();
            frame9ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label6 ----
            label6.setText("isLine: Determina si es linea");
            frame9ContentPane.add(label6, "cell 2 0");

            //---- button46 ----
            button46.setText("Linea 1");
            button46.addActionListener(e -> IsLine1(e));
            frame9ContentPane.add(button46, "cell 1 1");

            //---- button47 ----
            button47.setText("Linea 2");
            button47.addActionListener(e -> IsLine2(e));
            frame9ContentPane.add(button47, "cell 1 2");

            //---- button48 ----
            button48.setText("Linea 3");
            button48.addActionListener(e -> IsLine3(e));
            frame9ContentPane.add(button48, "cell 1 3");

            //---- button49 ----
            button49.setText("Volver");
            button49.addActionListener(e -> VolverDesdeIsLine(e));
            frame9ContentPane.add(button49, "cell 1 5");
            frame9.pack();
            frame9.setLocationRelativeTo(frame9.getOwner());
        }

        //======== frame10 ========
        {
            var frame10ContentPane = frame10.getContentPane();
            frame10ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label7 ----
            label7.setText("IsTrain: Determina si es tren");
            frame10ContentPane.add(label7, "cell 1 1");

            //---- button50 ----
            button50.setText("Train 1");
            button50.addActionListener(e -> Train1Is(e));
            frame10ContentPane.add(button50, "cell 1 2");

            //---- button51 ----
            button51.setText("Train 2");
            button51.addActionListener(e -> isTrain2d(e));
            frame10ContentPane.add(button51, "cell 1 3");

            //---- button52 ----
            button52.setText("Train 3");
            button52.addActionListener(e -> IsLine3e(e));
            frame10ContentPane.add(button52, "cell 1 4");

            //---- button53 ----
            button53.setText("Train 4");
            button53.addActionListener(e -> isTrain4d(e));
            frame10ContentPane.add(button53, "cell 1 5");

            //---- button60 ----
            button60.setText("Volver");
            button60.addActionListener(e -> VolverDesdeIstrain(e));
            frame10ContentPane.add(button60, "cell 1 7");
            frame10.pack();
            frame10.setLocationRelativeTo(frame10.getOwner());
        }

        //======== frame11 ========
        {
            var frame11ContentPane = frame11.getContentPane();
            frame11ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label8 ----
            label8.setText("fetchCapacity: Determina el tama\u00f1o total del tren");
            frame11ContentPane.add(label8, "cell 1 0");

            //---- button55 ----
            button55.setText("Train 1");
            button55.addActionListener(e -> LargoTren1(e));
            frame11ContentPane.add(button55, "cell 1 1");

            //---- button56 ----
            button56.setText("Train 2");
            button56.addActionListener(e -> LargoTren2(e));
            frame11ContentPane.add(button56, "cell 1 2");

            //---- button57 ----
            button57.setText("Train 3");
            button57.addActionListener(e -> LargoTren3(e));
            frame11ContentPane.add(button57, "cell 1 3");

            //---- button58 ----
            button58.setText("Train 4");
            button58.addActionListener(e -> LargoTren4(e));
            frame11ContentPane.add(button58, "cell 1 4");

            //---- button61 ----
            button61.setText("Volver");
            button61.addActionListener(e -> VolverdesdeFetch(e));
            frame11ContentPane.add(button61, "cell 1 5");
            frame11.pack();
            frame11.setLocationRelativeTo(frame11.getOwner());
        }

        //======== frame12 ========
        {
            var frame12ContentPane = frame12.getContentPane();
            frame12ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label9 ----
            label9.setText("lineSectionLength: Determina el largo entre dos estaciones");
            frame12ContentPane.add(label9, "cell 2 0");

            //---- label10 ----
            label10.setText("Linea 1");
            frame12ContentPane.add(label10, "cell 2 1");

            //---- comboBox2 ----
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                "San pablo",
                "Neptuno",
                "Pajaritos",
                "Las Rejas",
                "Ecuador",
                "San Alberto Hurtado",
                "Universidad de Santiago de Chile",
                "Estacion Central",
                "ULA",
                "Republica",
                "Los heroes",
                "La moneda",
                "Universidad de Chile",
                "Santa lucia",
                "Universidad Catolica",
                "Baquedano",
                "Salvador",
                "Manuel Montt",
                "Pedro de Valdivia",
                "Los Leones",
                "Tobalaba",
                "El Golf",
                "Alcantara",
                "Escuela Militar",
                "Manquehue",
                "Hernando de Magallanes",
                "Los Dominicos"
            }));
            frame12ContentPane.add(comboBox2, "cell 2 2,aligny baseline,growy 0");

            //---- button64 ----
            button64.setText("Cambiar a linea 2");
            button64.addActionListener(e -> CambiarALinea2(e));
            frame12ContentPane.add(button64, "cell 3 2 1 2");

            //---- comboBox3 ----
            comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                "San pablo",
                "Neptuno",
                "Pajaritos",
                "Las Rejas",
                "Ecuador",
                "San Alberto Hurtado",
                "Universidad de Santiago de Chile",
                "Estacion Central",
                "ULA",
                "Republica",
                "Los heroes",
                "La moneda",
                "Universidad de Chile",
                "Santa lucia",
                "Universidad Catolica",
                "Baquedano",
                "Salvador",
                "Manuel Montt",
                "Pedro de Valdivia",
                "Los Leones",
                "Tobalaba",
                "El Golf",
                "Alcantara",
                "Escuela Militar",
                "Manquehue",
                "Hernando de Magallanes",
                "Los Dominicos"
            }));
            comboBox3.setSelectedIndex(2);
            frame12ContentPane.add(comboBox3, "cell 2 4");

            //---- button65 ----
            button65.setText("Cambiar a linea 3");
            button65.addActionListener(e -> VolverALinea3(e));
            frame12ContentPane.add(button65, "cell 3 4");

            //---- button62 ----
            button62.setText("Confirmar");
            button62.addActionListener(e -> SeleccionarEstaciones(e));
            frame12ContentPane.add(button62, "cell 2 6");

            //---- button63 ----
            button63.setText("Volver");
            button63.addActionListener(e -> {
			VolverDesdeSectionle(e);
			button63(e);
		});
            frame12ContentPane.add(button63, "cell 2 7");
            frame12.pack();
            frame12.setLocationRelativeTo(frame12.getOwner());
        }

        //======== frame13 ========
        {
            var frame13ContentPane = frame13.getContentPane();
            frame13ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label11 ----
            label11.setText("lineSectionLength: Determina el largo entre dos estaciones");
            frame13ContentPane.add(label11, "cell 0 0");

            //---- label12 ----
            label12.setText("Linea 2");
            frame13ContentPane.add(label12, "cell 0 1");

            //---- comboBox4 ----
            comboBox4.setModel(new DefaultComboBoxModel<>(new String[] {
                "Vespucio Norte",
                "Zapadores",
                "Dorsal",
                "Einstein",
                "Cementerios",
                "Cerro Blanco",
                "Patronato",
                "Puente Cal y Canto",
                "Santa Ana",
                "Los H\u00e9roes",
                "Toesca",
                "Parque O Higgins",
                "Rondizzoni",
                "Franklin",
                "El Llano",
                "San Miguel",
                "Lo Vial",
                "Departamental",
                "Ciudad del Nino",
                "Lo Ovalle",
                "El Parron",
                "La Cisterna",
                "Lo Espejo",
                "Observatorio",
                "Lo Martinez",
                "Hospital El Pino"
            }));
            frame13ContentPane.add(comboBox4, "cell 0 2");

            //---- button68 ----
            button68.setText("Cambiar a linea 1");
            button68.addActionListener(e -> Linea1desdeSectionLeng(e));
            frame13ContentPane.add(button68, "cell 2 2");

            //---- comboBox5 ----
            comboBox5.setModel(new DefaultComboBoxModel<>(new String[] {
                "Vespucio Norte",
                "Zapadores",
                "Dorsal",
                "Einstein",
                "Cementerios",
                "Cerro Blanco",
                "Patronato",
                "Puente Cal y Canto",
                "Santa Ana",
                "Los H\u00e9roes",
                "Toesca",
                "Parque O Higgins",
                "Rondizzoni",
                "Franklin",
                "El Llano",
                "San Miguel",
                "Lo Vial",
                "Departamental",
                "Ciudad del Nino",
                "Lo Ovalle",
                "El Parron",
                "La Cisterna",
                "Lo Espejo",
                "Observatorio",
                "Lo Martinez",
                "Hospital El Pino"
            }));
            frame13ContentPane.add(comboBox5, "cell 0 3");

            //---- button69 ----
            button69.setText("Cambiar a linea 3");
            button69.addActionListener(e -> Linea3Section(e));
            frame13ContentPane.add(button69, "cell 2 3");

            //---- button66 ----
            button66.setText("Confirmar");
            button66.addActionListener(e -> ConfirmarEstaciones2(e));
            frame13ContentPane.add(button66, "cell 0 4");

            //---- button67 ----
            button67.setText("Volver");
            button67.addActionListener(e -> Volverdesde2Estaciones(e));
            frame13ContentPane.add(button67, "cell 0 5");
            frame13.pack();
            frame13.setLocationRelativeTo(frame13.getOwner());
        }

        //======== frame14 ========
        {
            var frame14ContentPane = frame14.getContentPane();
            frame14ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label13 ----
            label13.setText("lineSectionLength: Determina el largo entre dos estaciones");
            frame14ContentPane.add(label13, "cell 0 0");

            //---- label14 ----
            label14.setText("Linea 3");
            frame14ContentPane.add(label14, "cell 0 1");

            //---- comboBox6 ----
            comboBox6.setModel(new DefaultComboBoxModel<>(new String[] {
                "Plaza Quilicura",
                "Lo Cruzat",
                "Ferrocarril",
                "Los Libertadores",
                "Cardenal Caro",
                "Vivaceta",
                "Conchali",
                "Plaza Chacabuco",
                "Hospitales",
                "Puente Cal y Canto",
                "Plaza de Armas",
                "Universidad de Chile",
                "Parque Almagro",
                "Matta",
                "Irarrazaval",
                "Monsenor Eyzaguirre",
                "Nunoa",
                "Chile Espana",
                "Villa Frei",
                "Plaza Egana",
                "Fernando Castillo Velasco"
            }));
            frame14ContentPane.add(comboBox6, "cell 0 2");

            //---- button72 ----
            button72.setText("Cambiar a linea 2");
            button72.addActionListener(e -> button72(e));
            frame14ContentPane.add(button72, "cell 1 2");

            //---- comboBox7 ----
            comboBox7.setModel(new DefaultComboBoxModel<>(new String[] {
                "Plaza Quilicura",
                "Lo Cruzat",
                "Ferrocarril",
                "Los Libertadores",
                "Cardenal Caro",
                "Vivaceta",
                "Conchali",
                "Plaza Chacabuco",
                "Hospitales",
                "Puente Cal y Canto",
                "Plaza de Armas",
                "Universidad de Chile",
                "Parque Almagro",
                "Matta",
                "Irarrazaval",
                "Monsenor Eyzaguirre",
                "Nunoa",
                "Chile Espana",
                "Villa Frei",
                "Plaza Egana",
                "Fernando Castillo Velasco"
            }));
            frame14ContentPane.add(comboBox7, "cell 0 3");

            //---- button73 ----
            button73.setText("Cambiar a linea 1");
            button73.addActionListener(e -> CambiarALinea1(e));
            frame14ContentPane.add(button73, "cell 1 3");

            //---- button70 ----
            button70.setText("Confirmar");
            button70.addActionListener(e -> ConfirmarLinea3(e));
            frame14ContentPane.add(button70, "cell 0 4");

            //---- button71 ----
            button71.setText("Volver");
            button71.addActionListener(e -> VolverDesde3(e));
            frame14ContentPane.add(button71, "cell 0 5");
            frame14.pack();
            frame14.setLocationRelativeTo(frame14.getOwner());
        }

        //======== frame15 ========
        {
            var frame15ContentPane = frame15.getContentPane();
            frame15ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label15 ----
            label15.setText("lineSectionLength: Determina el largo entre dos estaciones");
            frame15ContentPane.add(label15, "cell 2 0");

            //---- label16 ----
            label16.setText("Linea 4");
            frame15ContentPane.add(label16, "cell 2 1");

            //---- comboBox8 ----
            comboBox8.setModel(new DefaultComboBoxModel<>(new String[] {
                "San Ramon",
                "Santa Rosa",
                "La Granja",
                "Santa Julia",
                "Vicuna Mackenna",
                "Walker Martinez",
                "Rojas Magallanes",
                "Trinidad",
                "Portales",
                "Mall Plaza Tobalaba",
                "El penon",
                "Plaza Viva",
                "Las Vizcachas",
                "La Laja",
                "Ejercito Libertador",
                "Valle Central",
                "Hospital Karol Wojtyla",
                "Nos",
                "Cinco Pinos",
                "San Bernardo",
                "Lo Blanco",
                "Monsenor Larrain",
                "El Bosque",
                "San Ramon(Termino)"
            }));
            frame15ContentPane.add(comboBox8, "cell 2 2,aligny baseline,growy 0");

            //---- comboBox9 ----
            comboBox9.setModel(new DefaultComboBoxModel<>(new String[] {
                "San Ramon",
                "Santa Rosa",
                "La Granja",
                "Santa Julia",
                "Vicuna Mackenna",
                "Walker Martinez",
                "Rojas Magallanes",
                "Trinidad",
                "Portales",
                "Mall Plaza Tobalaba",
                "El penon",
                "Plaza Viva",
                "Las Vizcachas",
                "La Laja",
                "Ejercito Libertador",
                "Valle Central",
                "Hospital Karol Wojtyla",
                "Nos",
                "Cinco Pinos",
                "San Bernardo",
                "Lo Blanco",
                "Monsenor Larrain",
                "El Bosque",
                "San Ramon(Termino)"
            }));
            comboBox9.setSelectedIndex(2);
            frame15ContentPane.add(comboBox9, "cell 2 4");

            //---- button74 ----
            button74.setText("Confirmar");
            button74.addActionListener(e -> ConfirmarLinea4(e));
            frame15ContentPane.add(button74, "cell 2 6");

            //---- button75 ----
            button75.setText("Volver");
            button75.addActionListener(e -> VolverLinea4(e));
            frame15ContentPane.add(button75, "cell 2 7");
            frame15.pack();
            frame15.setLocationRelativeTo(frame15.getOwner());
        }

        //======== frame16 ========
        {
            var frame16ContentPane = frame16.getContentPane();
            frame16ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label17 ----
            label17.setText("lineSectionCost: Determina el costo entre dos estaciones");
            frame16ContentPane.add(label17, "cell 2 0");

            //---- label18 ----
            label18.setText("Linea 4");
            frame16ContentPane.add(label18, "cell 2 1");

            //---- comboBox10 ----
            comboBox10.setModel(new DefaultComboBoxModel<>(new String[] {
                "San Ramon",
                "Santa Rosa",
                "La Granja",
                "Santa Julia",
                "Vicu\u00f1a Mackenna",
                "Walker Martinez",
                "Rojas Magallanes",
                "Trinidad",
                "Portales",
                "Mall Plaza Tobalaba",
                "El pe\u00f1on",
                "Plaza Viva",
                "Las Vizcachas",
                "La Laja",
                "Ejercito Libertador",
                "Valle Central",
                "Hospital Karol Wojtyla",
                "Nos",
                "Cinco Pinos",
                "San Bernardo",
                "Lo Blanco",
                "Monse\u00f1or Larrain",
                "El Bosque",
                "San Ramon(Termino)"
            }));
            frame16ContentPane.add(comboBox10, "cell 2 2,aligny baseline,growy 0");

            //---- comboBox11 ----
            comboBox11.setModel(new DefaultComboBoxModel<>(new String[] {
                "San Ramon",
                "Santa Rosa",
                "La Granja",
                "Santa Julia",
                "Vicu\u00f1a Mackenna",
                "Walker Martinez",
                "Rojas Magallanes",
                "Trinidad",
                "Portales",
                "Mall Plaza Tobalaba",
                "El pe\u00f1on",
                "Plaza Viva",
                "Las Vizcachas",
                "La Laja",
                "Ejercito Libertador",
                "Valle Central",
                "Hospital Karol Wojtyla",
                "Nos",
                "Cinco Pinos",
                "San Bernardo",
                "Lo Blanco",
                "Monse\u00f1or Larrain",
                "El Bosque",
                "San Ramon(Termino)"
            }));
            comboBox11.setSelectedIndex(2);
            frame16ContentPane.add(comboBox11, "cell 2 4");

            //---- button76 ----
            button76.setText("Confirmar");
            button76.addActionListener(e -> ConfirmarCost4(e));
            frame16ContentPane.add(button76, "cell 2 7");

            //---- button77 ----
            button77.setText("Volver");
            button77.addActionListener(e -> Vovler57(e));
            frame16ContentPane.add(button77, "cell 2 8");
            frame16.pack();
            frame16.setLocationRelativeTo(frame16.getOwner());
        }

        //======== frame17 ========
        {
            var frame17ContentPane = frame17.getContentPane();
            frame17ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label19 ----
            label19.setText("lineSectionCost: Determina el costo entre dos estaciones");
            frame17ContentPane.add(label19, "cell 2 0");

            //---- label20 ----
            label20.setText("Linea 1");
            frame17ContentPane.add(label20, "cell 2 1");

            //---- comboBox12 ----
            comboBox12.setModel(new DefaultComboBoxModel<>(new String[] {
                "San pablo",
                "Neptuno",
                "Pajaritos",
                "Las Rejas",
                "Ecuador",
                "San Alberto Hurtado",
                "Universidad de Santiago de Chile",
                "Estacion Central",
                "ULA",
                "Republica",
                "Los heroes",
                "La moneda",
                "Universidad de Chile",
                "Santa lucia",
                "Universidad Catolica",
                "Baquedano",
                "Salvador",
                "Manuel Montt",
                "Pedro de Valdivia",
                "Los Leones",
                "Tobalaba",
                "El Golf",
                "Alcantara",
                "Escuela Militar",
                "Manquehue",
                "Hernando de Magallanes",
                "Los Dominicos"
            }));
            frame17ContentPane.add(comboBox12, "cell 2 2,aligny baseline,growy 0");

            //---- button82 ----
            button82.setText("Cambiar a Linea 2");
            button82.addActionListener(e -> CambiarAlinea2Cost(e));
            frame17ContentPane.add(button82, "cell 3 2");

            //---- comboBox13 ----
            comboBox13.setModel(new DefaultComboBoxModel<>(new String[] {
                "San pablo",
                "Neptuno",
                "Pajaritos",
                "Las Rejas",
                "Ecuador",
                "San Alberto Hurtado",
                "Universidad de Santiago de Chile",
                "Estacion Central",
                "ULA",
                "Republica",
                "Los heroes",
                "La moneda",
                "Universidad de Chile",
                "Santa lucia",
                "Universidad Catolica",
                "Baquedano",
                "Salvador",
                "Manuel Montt",
                "Pedro de Valdivia",
                "Los Leones",
                "Tobalaba",
                "El Golf",
                "Alcantara",
                "Escuela Militar",
                "Manquehue",
                "Hernando de Magallanes",
                "Los Dominicos"
            }));
            comboBox13.setSelectedIndex(2);
            frame17ContentPane.add(comboBox13, "cell 2 4");

            //---- button89 ----
            button89.setText("Cambiar a Linea 3");
            button89.addActionListener(e -> CambiarlInea3C(e));
            frame17ContentPane.add(button89, "cell 3 4");

            //---- button78 ----
            button78.setText("Confirmar");
            button78.addActionListener(e -> ConfirmarLineCost1(e));
            frame17ContentPane.add(button78, "cell 2 6");

            //---- button79 ----
            button79.setText("Volver");
            button79.addActionListener(e -> VolverDesdeCost1(e));
            frame17ContentPane.add(button79, "cell 2 8");
            frame17.pack();
            frame17.setLocationRelativeTo(frame17.getOwner());
        }

        //======== frame18 ========
        {
            var frame18ContentPane = frame18.getContentPane();
            frame18ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label21 ----
            label21.setText("lineSectionCost: Determina el costo entre dos estaciones");
            frame18ContentPane.add(label21, "cell 0 0");

            //---- label22 ----
            label22.setText("Linea 2");
            frame18ContentPane.add(label22, "cell 0 1");

            //---- comboBox14 ----
            comboBox14.setModel(new DefaultComboBoxModel<>(new String[] {
                "Vespucio Norte",
                "Zapadores",
                "Dorsal",
                "Einstein",
                "Cementerios",
                "Cerro Blanco",
                "Patronato",
                "Puente Cal y Canto",
                "Santa Ana",
                "Los H\u00e9roes",
                "Toesca",
                "Parque O Higgins",
                "Rondizzoni",
                "Franklin",
                "El Llano",
                "San Miguel",
                "Lo Vial",
                "Departamental",
                "Ciudad del Nino",
                "Lo Ovalle",
                "El Parron",
                "La Cisterna",
                "Lo Espejo",
                "Observatorio",
                "Lo Martinez",
                "Hospital El Pino"
            }));
            frame18ContentPane.add(comboBox14, "cell 0 2");

            //---- button83 ----
            button83.setText("Cambiar a linea 1");
            button83.addActionListener(e -> CambiarALinea1Cost(e));
            frame18ContentPane.add(button83, "cell 1 2");

            //---- comboBox15 ----
            comboBox15.setModel(new DefaultComboBoxModel<>(new String[] {
                "Vespucio Norte",
                "Zapadores",
                "Dorsal",
                "Einstein",
                "Cementerios",
                "Cerro Blanco",
                "Patronato",
                "Puente Cal y Canto",
                "Santa Ana",
                "Los H\u00e9roes",
                "Toesca",
                "Parque O Higgins",
                "Rondizzoni",
                "Franklin",
                "El Llano",
                "San Miguel",
                "Lo Vial",
                "Departamental",
                "Ciudad del Nino",
                "Lo Ovalle",
                "El Parron",
                "La Cisterna",
                "Lo Espejo",
                "Observatorio",
                "Lo Martinez",
                "Hospital El Pino"
            }));
            frame18ContentPane.add(comboBox15, "cell 0 3");

            //---- button88 ----
            button88.setText("Cambiar a linea 3");
            button88.addActionListener(e -> CambiarLinea3Costr(e));
            frame18ContentPane.add(button88, "cell 1 3");

            //---- button81 ----
            button81.setText("Confirmar");
            button81.addActionListener(e -> ConfirmarLinea2cost(e));
            frame18ContentPane.add(button81, "cell 0 4");

            //---- button80 ----
            button80.setText("Volver");
            button80.addActionListener(e -> VolverDesdecost3(e));
            frame18ContentPane.add(button80, "cell 0 5");
            frame18.pack();
            frame18.setLocationRelativeTo(frame18.getOwner());
        }

        //======== frame19 ========
        {
            var frame19ContentPane = frame19.getContentPane();
            frame19ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label23 ----
            label23.setText("lineSectionCost: Determina el costo entre dos estaciones");
            frame19ContentPane.add(label23, "cell 0 0");

            //---- label24 ----
            label24.setText("Linea 3");
            frame19ContentPane.add(label24, "cell 0 1");

            //---- comboBox16 ----
            comboBox16.setModel(new DefaultComboBoxModel<>(new String[] {
                "Plaza Quilicura",
                "Lo Cruzat",
                "Ferrocarril",
                "Los Libertadores",
                "Cardenal Caro",
                "Vivaceta",
                "Conchali",
                "Plaza Chacabuco",
                "Hospitales",
                "Puente Cal y Canto",
                "Plaza de Armas",
                "Universidad de Chile",
                "Parque Almagro",
                "Matta",
                "Irarrazaval",
                "Monsenor Eyzaguirre",
                "Nunoa",
                "Chile Espana",
                "Villa Frei",
                "Plaza Egana",
                "Fernando Castillo Velasco"
            }));
            frame19ContentPane.add(comboBox16, "cell 0 2");

            //---- button86 ----
            button86.setText("Cambiar a linea 2");
            button86.addActionListener(e -> CambiarLinea2cost(e));
            frame19ContentPane.add(button86, "cell 1 2");

            //---- comboBox17 ----
            comboBox17.setModel(new DefaultComboBoxModel<>(new String[] {
                "Plaza Quilicura",
                "Lo Cruzat",
                "Ferrocarril",
                "Los Libertadores",
                "Cardenal Caro",
                "Vivaceta",
                "Conchali",
                "Plaza Chacabuco",
                "Hospitales",
                "Puente Cal y Canto",
                "Plaza de Armas",
                "Universidad de Chile",
                "Parque Almagro",
                "Matta",
                "Irarrazaval",
                "Monsenor Eyzaguirre",
                "Nunoa",
                "Chile Espana",
                "Villa Frei",
                "Plaza Egana",
                "Fernando Castillo Velasco"
            }));
            frame19ContentPane.add(comboBox17, "cell 0 3");

            //---- button87 ----
            button87.setText("Cambiar a linea 1");
            button87.addActionListener(e -> CambiarLinea1Cost(e));
            frame19ContentPane.add(button87, "cell 1 3");

            //---- button84 ----
            button84.setText("Confirmar");
            button84.addActionListener(e -> Conriamrlinea3Cost(e));
            frame19ContentPane.add(button84, "cell 0 4");

            //---- button85 ----
            button85.setText("Volver");
            button85.addActionListener(e -> VolverLinea3Cost(e));
            frame19ContentPane.add(button85, "cell 0 5");
            frame19.pack();
            frame19.setLocationRelativeTo(frame19.getOwner());
        }

        //======== frame20 ========
        {
            var frame20ContentPane = frame20.getContentPane();
            frame20ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label25 ----
            label25.setText("LineAddSection: Agrega 1 o mas secciones a la linea");
            frame20ContentPane.add(label25, "cell 0 0");

            //---- label26 ----
            label26.setText("Toda estacion se agregara al final de la linea");
            frame20ContentPane.add(label26, "cell 0 1,align label top,grow 0 0");

            //---- label27 ----
            label27.setText("si la ultima estacion es tipo \"t\", se cambiara a \"r\" y la agregada sera la nueva terminal");
            frame20ContentPane.add(label27, "cell 0 2");

            //---- comboBox1 ----
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                "ID: 97, Nombre: Terminal Sur, Tipo: t, StopTime: 30",
                "ID: 98, Nombre: Vespucio Oeste, Tipo: t, StopTime: 55",
                "ID: 99, Nombre: Indonesia, Tipo: t, StopTime: 45",
                "ID: 100, Nombre: Lecheria, Tipo: t, StopTime: 70",
                "ID: 101, Nombre: Taborga, Tipo: r, StopTime: 35",
                "ID: 102, Nombre: Zocalo, Tipo: r, StopTime: 35",
                "ID: 103, Nombre: Atocha, Tipo: r, StopTime: 35",
                "ID: 104, Nombre: Catedral, Tipo: m, StopTime: 35",
                "ID: 105, Nombre: Palermo, Tipo: m, StopTime: 45",
                "ID: 106, Nombre: Bastille, Tipo: c, StopTime: 50",
                "ID: 107, Nombre: Ciudad de la bicicleta, Tipo: c, StopTime: 35"
            }));
            frame20ContentPane.add(comboBox1, "cell 0 3");

            //---- comboBox18 ----
            comboBox18.setModel(new DefaultComboBoxModel<>(new String[] {
                "Linea 1 Regular",
                "Linea 2 Regular",
                "Linea 3 Regular",
                "Linea 4 Circular"
            }));
            frame20ContentPane.add(comboBox18, "cell 0 5");

            //---- button91 ----
            button91.setText("Agregar");
            button91.addActionListener(e -> AgregarEstacion(e));
            frame20ContentPane.add(button91, "cell 0 7");

            //---- button92 ----
            button92.setText("Volver");
            button92.addActionListener(e -> volver3fdas(e));
            frame20ContentPane.add(button92, "cell 0 9");
            frame20.pack();
            frame20.setLocationRelativeTo(frame20.getOwner());
        }

        //======== frame21 ========
        {
            var frame21ContentPane = frame21.getContentPane();
            frame21ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label32 ----
            label32.setText("Operaciones");
            frame21ContentPane.add(label32, "cell 1 0,alignx center,growx 0");

            //---- button93 ----
            button93.setText("lineAddSection");
            button93.addActionListener(e -> lineAddSectiopden(e));
            frame21ContentPane.add(button93, "cell 1 1");

            //---- button59 ----
            button59.setText("AssignTrainToLine");
            button59.addActionListener(e -> AssignTrainMenu(e));
            frame21ContentPane.add(button59, "cell 1 2");

            //---- button96 ----
            button96.setText("AssignDriverToTrain");
            frame21ContentPane.add(button96, "cell 1 3");

            //---- button100 ----
            button100.setText("Volver");
            button100.addActionListener(e -> VolverAEditar(e));
            frame21ContentPane.add(button100, "cell 1 4");
            frame21.pack();
            frame21.setLocationRelativeTo(frame21.getOwner());
        }

        //======== frame22 ========
        {
            var frame22ContentPane = frame22.getContentPane();
            frame22ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label28 ----
            label28.setText("Si agrega una estacion, la linea dejara de ser circular");
            frame22ContentPane.add(label28, "cell 0 0");

            //---- label29 ----
            label29.setText("\u00bfEst\u00e1 seguro?");
            frame22ContentPane.add(label29, "cell 0 1,alignx center,growx 0");

            //---- button98 ----
            button98.setText("Si");
            button98.addActionListener(e -> Confirmar32(e));
            frame22ContentPane.add(button98, "cell 0 2");

            //---- button99 ----
            button99.setText("No");
            button99.addActionListener(e -> Rechazarcircular(e));
            frame22ContentPane.add(button99, "cell 0 3");
            frame22.pack();
            frame22.setLocationRelativeTo(frame22.getOwner());
        }

        //======== frame23 ========
        {
            var frame23ContentPane = frame23.getContentPane();
            frame23ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label30 ----
            label30.setText("AddCar: Agrega 1 o mas carros a un tren");
            frame23ContentPane.add(label30, "cell 0 0");

            //---- comboBox19 ----
            comboBox19.setModel(new DefaultComboBoxModel<>(new String[] {
                "ID: 33, Capacidad: 100, Modelo: NS-76, Empresa: AFUSA, Tipo: tr",
                "ID: 34, Capacidad: 70, Modelo: NS-77, Empresa: AFUSA, Tipo: ct",
                "ID: 35, Capacidad: 80, Modelo: NS-73, Empresa: AFUSA, Tipo: tr",
                "ID: 36, Capacidad: 120, Modelo: NS-73, Empresa: AFUSA, Tipo: ct",
                "ID: 37, Capacidad: 90, Modelo: NS-77, Empresa: AFUSA, Tipo: ct",
                "ID: 38, Capacidad: 110, Modelo: NS-74, Empresa: AFUSA, Tipo: tr",
                "ID: 39, Capacidad: 130, Modelo: NS-73, Empresa: AFUSA, Tipo: ct",
                "ID: 40, Capacidad: 120, Modelo: NS-74, Empresa: AFUSA, Tipo: tr",
                "ID: 41, Capacidad: 100, Modelo: NS-76, Empresa: AFUSA, Tipo: ct",
                "ID: 42, Capacidad: 120, Modelo: NS-74, Empresa: AFUSA, Tipo: ct"
            }));
            frame23ContentPane.add(comboBox19, "cell 0 1");

            //---- comboBox20 ----
            comboBox20.setModel(new DefaultComboBoxModel<>(new String[] {
                "Train 1",
                "Train 2",
                "Train 3",
                "Train 4"
            }));
            frame23ContentPane.add(comboBox20, "cell 0 2");

            //---- comboBox21 ----
            comboBox21.setModel(new DefaultComboBoxModel<>(new String[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "18",
                "19",
                "20",
                "21",
                "22",
                "23",
                "24",
                "25",
                "26",
                "27",
                "28",
                "29",
                "30"
            }));
            frame23ContentPane.add(comboBox21, "cell 0 3");

            //---- button101 ----
            button101.setText("Agregar");
            button101.addActionListener(e -> AgregarPcar(e));
            frame23ContentPane.add(button101, "cell 0 4");

            //---- button102 ----
            button102.setText("Volver");
            button102.addActionListener(e -> Volver23(e));
            frame23ContentPane.add(button102, "cell 0 5");
            frame23.pack();
            frame23.setLocationRelativeTo(frame23.getOwner());
        }

        //======== frame24 ========
        {
            var frame24ContentPane = frame24.getContentPane();
            frame24ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label31 ----
            label31.setText("RemoveCar: Remueve 1 o mas carros de un tren");
            frame24ContentPane.add(label31, "cell 0 0");

            //---- comboBox22 ----
            comboBox22.setModel(new DefaultComboBoxModel<>(new String[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "18",
                "19",
                "20",
                "21",
                "22",
                "23",
                "24",
                "25",
                "26",
                "27",
                "28",
                "29",
                "30"
            }));
            frame24ContentPane.add(comboBox22, "cell 0 1");

            //---- comboBox23 ----
            comboBox23.setModel(new DefaultComboBoxModel<>(new String[] {
                "Train 1",
                "Train 2",
                "Train 3",
                "Train 4"
            }));
            frame24ContentPane.add(comboBox23, "cell 0 2");

            //---- button103 ----
            button103.setText("Remover");
            button103.addActionListener(e -> Remove(e));
            frame24ContentPane.add(button103, "cell 0 4");

            //---- button104 ----
            button104.setText("Volver");
            button104.addActionListener(e -> VolverRemove(e));
            frame24ContentPane.add(button104, "cell 0 5");
            frame24.pack();
            frame24.setLocationRelativeTo(frame24.getOwner());
        }

        //======== frame25 ========
        {
            var frame25ContentPane = frame25.getContentPane();
            frame25ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label33 ----
            label33.setText("Asignar un tren o mas a una linea");
            frame25ContentPane.add(label33, "cell 0 0");

            //---- comboBox24 ----
            comboBox24.setModel(new DefaultComboBoxModel<>(new String[] {
                "Tren 1",
                "Tren 2",
                "Tren 3",
                "Tren 4"
            }));
            frame25ContentPane.add(comboBox24, "cell 0 1");

            //---- comboBox25 ----
            comboBox25.setModel(new DefaultComboBoxModel<>(new String[] {
                "Linea 1 Regular",
                "Linea 2 Regular",
                "Linea 3 Regular",
                "Linea 4 Circular"
            }));
            frame25ContentPane.add(comboBox25, "cell 0 2");

            //---- button94 ----
            button94.setText("Confirmar");
            button94.addActionListener(e -> ConfirmarAssignTrain(e));
            frame25ContentPane.add(button94, "cell 0 3");

            //---- button95 ----
            button95.setText("Volver");
            button95.addActionListener(e -> VolverAModificar3(e));
            frame25ContentPane.add(button95, "cell 0 4");
            frame25.pack();
            frame25.setLocationRelativeTo(frame25.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - matias vejar
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JFrame frame1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button54;
    private JButton button90;
    private JButton button12;
    private JFrame frame2;
    private JButton button10;
    private JButton button11;
    private JFrame frame3;
    private JLabel label1;
    private JButton button19;
    private JButton button13;
    private JButton button17;
    private JButton button9;
    private JButton button28;
    private JButton button14;
    private JButton button18;
    private JButton button15;
    private JButton button16;
    private JFrame frame4;
    private JLabel label3;
    private JButton button30;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JFrame frame5;
    private JLabel label2;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button29;
    private JButton button25;
    private JButton button24;
    private JButton button26;
    private JButton button27;
    private JFrame frame6;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JFrame frame7;
    private JLabel label4;
    private JButton button38;
    private JButton button39;
    private JButton button41;
    private JButton button40;
    private JFrame frame8;
    private JLabel label5;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JFrame frame9;
    private JLabel label6;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button49;
    private JFrame frame10;
    private JLabel label7;
    private JButton button50;
    private JButton button51;
    private JButton button52;
    private JButton button53;
    private JButton button60;
    private JFrame frame11;
    private JLabel label8;
    private JButton button55;
    private JButton button56;
    private JButton button57;
    private JButton button58;
    private JButton button61;
    private JFrame frame12;
    private JLabel label9;
    private JLabel label10;
    private JComboBox<String> comboBox2;
    private JButton button64;
    private JComboBox<String> comboBox3;
    private JButton button65;
    private JButton button62;
    private JButton button63;
    private JFrame frame13;
    private JLabel label11;
    private JLabel label12;
    private JComboBox<String> comboBox4;
    private JButton button68;
    private JComboBox<String> comboBox5;
    private JButton button69;
    private JButton button66;
    private JButton button67;
    private JFrame frame14;
    private JLabel label13;
    private JLabel label14;
    private JComboBox<String> comboBox6;
    private JButton button72;
    private JComboBox<String> comboBox7;
    private JButton button73;
    private JButton button70;
    private JButton button71;
    private JFrame frame15;
    private JLabel label15;
    private JLabel label16;
    private JComboBox<String> comboBox8;
    private JComboBox<String> comboBox9;
    private JButton button74;
    private JButton button75;
    private JFrame frame16;
    private JLabel label17;
    private JLabel label18;
    private JComboBox<String> comboBox10;
    private JComboBox<String> comboBox11;
    private JButton button76;
    private JButton button77;
    private JFrame frame17;
    private JLabel label19;
    private JLabel label20;
    private JComboBox<String> comboBox12;
    private JButton button82;
    private JComboBox<String> comboBox13;
    private JButton button89;
    private JButton button78;
    private JButton button79;
    private JFrame frame18;
    private JLabel label21;
    private JLabel label22;
    private JComboBox<String> comboBox14;
    private JButton button83;
    private JComboBox<String> comboBox15;
    private JButton button88;
    private JButton button81;
    private JButton button80;
    private JFrame frame19;
    private JLabel label23;
    private JLabel label24;
    private JComboBox<String> comboBox16;
    private JButton button86;
    private JComboBox<String> comboBox17;
    private JButton button87;
    private JButton button84;
    private JButton button85;
    private JFrame frame20;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox18;
    private JButton button91;
    private JButton button92;
    private JFrame frame21;
    private JLabel label32;
    private JButton button93;
    private JButton button59;
    private JButton button96;
    private JButton button100;
    private JFrame frame22;
    private JLabel label28;
    private JLabel label29;
    private JButton button98;
    private JButton button99;
    private JFrame frame23;
    private JLabel label30;
    private JComboBox<String> comboBox19;
    private JComboBox<String> comboBox20;
    private JComboBox<String> comboBox21;
    private JButton button101;
    private JButton button102;
    private JFrame frame24;
    private JLabel label31;
    private JComboBox<String> comboBox22;
    private JComboBox<String> comboBox23;
    private JButton button103;
    private JButton button104;
    private JFrame frame25;
    private JLabel label33;
    private JComboBox<String> comboBox24;
    private JComboBox<String> comboBox25;
    private JButton button94;
    private JButton button95;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
