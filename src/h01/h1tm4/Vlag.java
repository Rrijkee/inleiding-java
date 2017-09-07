package h1tm4;

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        g.setColor(Color.LIGHT_GRAY);
        //Vlaggenstok
        g.fillRoundRect(140,20,10,280,20,20);
        //Vlag
        g.setColor(Color.RED);
        g.fillRect(150,30,150,40);
        g.setColor(Color.WHITE);
        g.fillRect(150,70,150,40);
        g.setColor(Color.blue);
        g.fillRect(150,110,150,40);
        g.setColor(Color.BLACK);
        //
        g.fillOval(138,20,15,15);
    }
}
