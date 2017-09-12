package h6;

import java.awt.*;
import java.applet.*;

public class SecondenBerekenen extends Applet {
    int secondsPminute;
    int secondsPhour;
    int secondsPday;
    int secondsPyear;


    public void init(){
        secondsPminute = 60;
        secondsPhour = secondsPminute *60;
        secondsPday = secondsPhour *24;
        secondsPyear = secondsPday *365;


        }
        public void paint(Graphics g){
        g.drawString("Hoeveel seconden zitten er in een uur, dag en jaar?",20, 20);
        g.drawString("Seconden in een uur: "+secondsPhour,20,60);
        g.drawString("Seconden in een dag: "+secondsPday,20,80);
        g.drawString("Seconden in een jaar: "+secondsPyear,20,100);





    }
}
