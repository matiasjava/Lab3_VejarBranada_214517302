/*
 * Created by JFormDesigner on Mon Jun 24 21:45:39 CLT 2024
 */

 package org.Proyecto;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author WASUPRE
 */
public class mainMenu extends JPanel {
    public mainMenu() {
        initComponents();
    }

    private void button3(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Matias Vejar
        label1 = new JLabel();
        button3 = new JButton();
        button4 = new JButton();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
        setLayout(new MigLayout(
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

        //---- label1 ----
        label1.setText("                  Menu Lab 3");
        add(label1, "cell 4 1");

        //---- button3 ----
        button3.setText(" Cargar informaci\u00f3n del sistema de metro");
        button3.addActionListener(e -> button3(e));
        add(button3, "cell 1 4 11 1");

        //---- button4 ----
        button4.setText("Visualizar estado actual del sistema de metro");
        add(button4, "cell 1 5 11 1");

        //---- button1 ----
        button1.setText("Interactuar con el sistema de metro ");
        add(button1, "cell 1 6 11 1");

        //---- button2 ----
        button2.setText("Salir del programa");
        add(button2, "cell 1 7 11 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Matias Vejar
    private JLabel label1;
    private JButton button3;
    private JButton button4;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
