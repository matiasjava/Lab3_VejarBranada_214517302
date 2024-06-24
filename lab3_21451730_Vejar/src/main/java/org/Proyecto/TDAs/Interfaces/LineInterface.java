package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Section;
import org.Proyecto.TDAs.Clases.Station;
import org.Proyecto.TDAs.Clases.LineRegular;
import org.Proyecto.TDAs.Clases.LineCircular;

import javax.sound.sampled.Line;
import java.util.List;

public interface LineInterface {

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
}


