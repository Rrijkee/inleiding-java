package h5;

import java.awt.*;
import java.applet.*;

    public class StaafdiagramRemake extends Applet {

        private int nullijn;
        private int valerie;
        private int hans;
        private int jeroen;
        private int schaal;


        public void init(){

            nullijn = 240;
            schaal = 2;
            valerie = 40;
            hans = 80;
            jeroen = 100;
        }
        public void paint(Graphics g){

            //DiagramBase
            g.drawLine(50,nullijn,320,nullijn);
            g.drawLine(50,240,50,20);

            //Verdeling
            g.drawString("0",30,nullijn);

            g.drawLine(50,nullijn - 20*schaal,60,nullijn - 20*schaal);
            g.drawString("20",30,nullijn - 20*schaal);
            g.drawLine(50,nullijn - 40*schaal,60,nullijn - 40*schaal);
            g.drawString("40", 30,nullijn - 40*schaal);
            g.drawLine(50, nullijn - 60*schaal,60,nullijn - 60*schaal);
            g.drawString("60",30,nullijn - 60*schaal);
            g.drawLine(50,nullijn - 80*schaal,60,nullijn - 80*schaal);
            g.drawString("80",30,nullijn - 80*schaal);
            g.drawLine(50,nullijn - 100*schaal,60,nullijn - 100*schaal);
            g.drawString("100",25,nullijn - 100*schaal);


            //InhoudDiagram
            g.setColor(Color.RED);
            g.fillRect(80,nullijn - valerie *2,40,valerie *2);
            g.setColor(Color.BLUE);
            g.fillRect(160,nullijn - hans *2,40,hans *2);
            g.setColor(Color.YELLOW);
            g.fillRect(240,nullijn - jeroen *2,40,jeroen *2);
            //namen
            g.setColor(Color.BLACK );
            g.drawString("Valerie",80,260 );
            g.drawString("Hans",160,260);
            g.drawString("Jeroen",240,260);


        }

    }

