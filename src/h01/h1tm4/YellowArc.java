package h1tm4;

import java.awt.*;
import java.applet.*;

public class YellowArc extends Applet{

    public void init(){
        setBackground(Color.BLUE);

    }
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillArc(100,30,200,250,0,360);


    }
}
