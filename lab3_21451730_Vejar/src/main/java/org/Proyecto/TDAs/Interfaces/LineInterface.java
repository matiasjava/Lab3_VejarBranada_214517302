package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Section;

public interface LineInterface {

    public int getId();
    public String getName();
    public String getRailType();
    public Section[] getSections();
    public void setId(int id);
    public void setName(String name);
    public void setRailType(String railType);
    public void setSections(Section[] sections);
}


