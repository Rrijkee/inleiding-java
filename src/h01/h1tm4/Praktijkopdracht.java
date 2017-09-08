package h1tm4;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet{

    public void init(){

    }
    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        //lijn
        g.drawLine(10,20,230,20);
        g.drawString("Lijn",110,35);
        //Rechthoek

        g.drawRect(10,40,220,105);
        g.drawString("Rechthoek",90,160);

        //Afgeronde Rechthoek
        g.drawRoundRect(10,165,220,105,30,30);
        g.drawString("Afgeronde rechthoek",60,285);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.MAGENTA);
        g.fillRect(240,40,220,105);
        g.setColor(Color.BLACK);
        g.drawOval(240,40,220,105);
        g.drawString("Gevulde rechthoek met ovaal",270,160);

        //Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(240,165,220,105);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",300,285);

        //Taartpunt met ovaal eromheen
        g.drawOval(470,40,220,105);
        g.setColor(Color.MAGENTA);
        g.fillArc(470,40,220,105,0,45);
        g.setColor(Color.BLACK);

        g.drawString("Taartpunt met ovaal eromheen",500,160);
        //cirkwl
        g.drawOval(530,170,100,100);
        g.drawString("Cirkel",565,285);
    }
}

