package h1tm4;

import java.awt.*;
import java.applet.*;

public class YellowBlueName extends Applet {

    public void init(){
        setBackground(Color.blue);

    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.drawString("Robbin",175,175);
    }
}
