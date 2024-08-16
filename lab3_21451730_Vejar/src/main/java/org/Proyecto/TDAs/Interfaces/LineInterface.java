package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.*;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public interface LineInterface {
    public List<Train> trains = new ArrayList<>();

    public int getId();
    public String getName();
    public String getRailType();
    public List<Section> getSections();
    public void setId(int id);
    public void setName(String name);
    public void setRailType(String railType);
    public void setSections(List<Section> sections);
    public int line_Length();
    public int line_Section_Length(String station1_Name, String station2_Name);
    public int line_Cost();
    public int line_Section_Cost(String station1_Name, String station2_Name);
    public void line_Add_Section(Section section);
    public boolean isLine();
    public List<Driver> getDrivers();
    public List<Train> getTrains();
    public void setTrains(List<Train> trains);
    public boolean tieneRepetidos(List<Integer> lista);

}


