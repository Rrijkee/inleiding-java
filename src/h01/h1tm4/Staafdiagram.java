package h1tm4;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet {

    public void init(){

    }
    public void paint(Graphics g){

        //DiagramBase
        g.drawLine(50,240,320,240);
        g.drawLine(50,240,50,20);

        //Verdeling
        g.drawString("0",30,250);
        g.drawLine(50,220,60,220);
        g.drawString("20",30,220);
        g.drawLine(50,180,60,180);
;        g.drawString("40", 30,180);
        g.drawLine(50,140,60,140);
        g.drawString("60",30,140);
        g.drawLine(50,100,60,100);
        g.drawString("80",30,100);
        g.drawLine(50,60,60,60);
        g.drawString("100",28,60);
        g.drawLine(50,20,60,20);
        g.drawString("120",28,20);

        //InhoudDiagram
        g.setColor(Color.RED);
        g.fillRect(80,180,40,60);
        g.setColor(Color.BLUE);
        g.fillRect(160,100,40,140);
        g.setColor(Color.YELLOW);
        g.fillRect(240,60,40,180);
        //namen
        g.setColor(Color.BLACK );
        g.drawString("Valerie",80,260 );
        g.drawString("Hans",160,260);
        g.drawString("Jeroen",240,260);


    }

}