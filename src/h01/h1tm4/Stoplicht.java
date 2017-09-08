package h1tm4;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet{

    public void init(){
        setBackground(Color.BLACK);

    }
    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        //base
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(150,20,100,250);
        g.setColor(Color.WHITE);
        g.drawRect(150,20,100,250); //Rand Base
        //Lights
        g.setColor(Color.RED);
        g.fillOval(165,30,70,70);
        g.setColor(Color.ORANGE);
        g.fillOval(165,110,70,70);
        g.setColor(Color.GREEN);
        g.fillOval(165,190,70,70);
        //Rand Lights
        g.setColor(Color.BLACK);
        g.drawOval(165,30,70,70);
        g.drawOval(165,110,70,70);
        g.drawOval(165,190,70,70);

    }
}
