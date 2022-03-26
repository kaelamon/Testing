package SeaBattle.Ships.models;

import SeaBattle.Ships.interfaces.Damager;
import SeaBattle.Ships.interfaces.Sailable;

import java.awt.*;


public class Vessel {
    Point[] points = new Point[8];
    Damager damager;

    Sailable sail;
    public void attack(){
        damager.damage();
    }
}
