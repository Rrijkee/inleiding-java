package h1tm4;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet{

    public void init(){

    }
    public void paint(Graphics g){
        //Front
       g.drawLine(125,280,250,280);
       g.drawLine(125,280,100,155);
       g.drawLine(100,155,225,155);
       g.drawLine(250,280,225,155);
       // top
        g.drawLine(100,155,150,50);
        g.drawLine(150,50,275,50);
        g.drawLine(275,50,225,155);
        //side
        g.drawLine(250,280,300,165);
        g.drawLine(300,165,275,50);

        //Number 4
        g.fillOval(130,250,15,15);
        g.fillOval(115,170,15,15);
        g.fillOval(190,170,15,15);
        g.fillOval(205,250,15,15);
        //number 2
        g.fillOval(150,60,15,15);
        g.fillOval(200,120,15,15);
        //number 5
        g.fillOval(230,150,15,15);
        g.fillOval(265,80,15,15);
        g.fillOval(260,155,15,15);
        g.fillOval(245,240,15,15);
        g.fillOval(285,155,15,15);

    }
}
