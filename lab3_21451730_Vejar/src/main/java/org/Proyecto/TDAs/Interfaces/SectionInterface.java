package org.Proyecto.TDAs.Interfaces;

import org.Proyecto.TDAs.Clases.Station;

public interface SectionInterface {

    public Station getPoint1();
    public Station getPoint2();
    public int getDistance();
    public int getCost();
    public void setPoint1(Station point1);
    public void setPoint2(Station point2);
    public void setDistance(int distance);
    public void setCost(int cost);
    public int getTiempoDeLlegada();
    public void setTiempoDeLlegada(int tiempoDeLlegada);

}
