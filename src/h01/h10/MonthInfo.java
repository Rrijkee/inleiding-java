package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MonthInfo extends Applet{
    TextField tekstvak;
    Label label;
    String invulling;
    String tekst;
    int maandnummer;

    public void init(){
        setSize(500,200);
        tekstvak = new TextField(2);
        label = new Label ("Type het maandnummer in en druk op enter.");
        tekstvak.addActionListener(new TekstListener());
        tekst = "";
        add(label);
        add(tekstvak);


    }
    public void paint(Graphics g){
        g.drawString(tekst,20,50);
    }
    public class TekstListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            invulling = tekstvak.getText();
            maandnummer = Integer.parseInt(invulling);
            switch (maandnummer){
                case 1:
                    tekst = "U heeft het maandnummer van Januari ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "U heeft het maandnummer van Februari ingetypt, deze maand heeft 28 dagen.";
                    break;
                case 3:
                    tekst = "U heeft het maandnummer van Maart ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 4:
                    tekst = "U heeft het maandnummer van April ingetypt, deze maand heeft 30 dagen.";
                    break;
                case 5:
                    tekst = "U heeft het maandnummer van Mei ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 6:
                    tekst = "U heeft het maandnummer van Juni ingetypt, deze maand heef 30 dagen.";
                    break;
                case 7:
                    tekst = "U heeft het maandnummer van Juli ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 8:
                    tekst = "U heeft het maandnummer van Augustus ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 9:
                    tekst = "U heeft het maandnummer van September ingetypt, deze maand heeft 30 dagen.";
                    break;
                case 10:
                    tekst = "U heeft het maandnummer van Oktober ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 11:
                    tekst = "U heeft het maandnummer van November ingetypt, deze maand heeft 30 dagen.";
                    break;
                case 12:
                    tekst = "U heeft het maandnummer van December ingetypt, deze maand heeft 13 dagen.";
                    break;
                default:
                    tekst = "Dit maandnummer bestaat niet.";
                    break;

            }
            repaint();
        }

    }


}
