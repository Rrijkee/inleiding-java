package h6;

import java.awt.*;
import java.applet.*;

public class GeldVerdeling extends Applet{

    double totaalbedrag;
    double jan,ali,jeannette,robbin,eindbedrag;
    Color background;
    Color startColor;
    Color endColor;
    int startX, startY,endX,endY;

    public void init(){
        background = new Color(69, 129, 93);
        totaalbedrag = 133;
        jan = eindbedrag;
        ali = eindbedrag;
        jeannette = eindbedrag;
        robbin = eindbedrag;
        eindbedrag = totaalbedrag /4;
        startColor = new Color(224, 224, 224);
        endColor= new Color(96, 96, 96);
        startX = 0; startY = 0; endX = 400; endY = 400;




    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(startX, startY, startColor, endX, endY, endColor);
        g2d.setPaint(gradient);
        g.fillRect(0,0, endX, endY);
        g.setColor(Color.BLACK);
        g.drawString("Jan, Ali, Jeannette en Robbin moeten 113 euro eerlijk verdelen.", 20,20);
        g.drawString("Jan krijgt: €" + eindbedrag,20,60);
        g.drawString("Ali krijgt: €" + eindbedrag, 20,75);
        g.drawString("Jeannette krijgt: €" + eindbedrag, 20,90);
        g.drawString("Robbin krijgt: €" + eindbedrag, 20,105);
        g.drawString("Iedereen krijgt dus: €" + eindbedrag,20,145);
    }
}
