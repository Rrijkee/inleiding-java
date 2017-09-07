package h1tm4;

import java.awt.*;
import java.applet.*;

public class Huis extends Applet{

    public void init(){
        setBackground(Color.LIGHT_GRAY);

    }
    public void paint(Graphics g){
        //mainframe
        g.drawRect(60,140,150,150);
        g.drawLine(210,140,280,100);
        g.drawLine(210,290,280,250);
        g.drawLine(280,250,280,100);
        /*g.drawLine(60,140,135,100);
        g.drawLine(135,100,280,100);*/
        //dak
        g.drawLine(60,140,165,40);
        g.drawLine(165,40,210,140);
        g.drawLine(165,40,280,100);
        //Ramen en deuren
        g.drawRect(115,240,30,50);
        g.drawRect(80,180,30,30);
        g.drawRect(160,180,30,30);
        //zijraam
        g.drawLine(225,230,270,200);
        g.drawLine(225,230,225,250);
        g.drawLine(225,250,270,220);
        g.drawLine(270,200,270,220);
    }
}