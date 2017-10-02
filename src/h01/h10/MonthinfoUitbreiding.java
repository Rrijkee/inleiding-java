package h10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MonthinfoUitbreiding extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label label2;
    String invulling;
    String invullingJaartal;
    String tekst;
    String schrikkeljaar;
    int maandnummer;
    int jaarnummer;
    int februariNormaal;
    int februariSchrikkel;
    Button knop1;

    public void init() {
        setSize(500, 200);
        tekstvak = new TextField(2);
        label = new Label("Maandnummer:");
        tekstvak2 = new TextField(4);
        label2 = new Label("Jaartal: ");
        knop1 = new Button("OK");
        knop1.addActionListener(new KnopListener());
        //tekstvak.addActionListener(new TekstListener());
        //tekstvak2.addActionListener(new TekstListener2());
        tekst = "";
        add(label);
        add(tekstvak);
        add(label2);
        add(tekstvak2);
        add(knop1);
        invullingJaartal = "";
        invulling = "";
        februariNormaal = 28;
        februariSchrikkel = 29;
        schrikkeljaar = "";


    }

    public void paint(Graphics g) {
        g.drawString(tekst, 20, 100);
        g.drawString(schrikkeljaar,20,120);
    }
    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                    invulling = tekstvak.getText();
                    maandnummer = Integer.parseInt(invulling);
                    invullingJaartal = tekstvak2.getText();
                    jaarnummer = Integer.parseInt(invullingJaartal);
                    if ((jaarnummer % 4 == 0 && !(jaarnummer % 100 == 0) || jaarnummer % 400 == 0)) {
                        februariNormaal = februariSchrikkel;
                        schrikkeljaar = "Dit is een schrikkeljaar";
repaint();
                        }
                        else{
                        februariNormaal = 28;
                        schrikkeljaar = "";
                        repaint();
            }
            switch (maandnummer) {
                case 1:
                    tekst = "U heeft het maandnummer van Januari ingetypt, deze maand heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "U heeft het maandnummer van Februari ingetypt, deze maand heeft " + februariNormaal + " dagen.";
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
                    tekst = "U heeft het maandnummer van December ingetypt, deze maand heeft 31 dagen.";
                    break;
                default:
                    tekst = "Dit maandnummer bestaat niet.";
                    break;

            }
            repaint();
        }


    }

}
