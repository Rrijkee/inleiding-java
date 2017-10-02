package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HighestAndLowest extends Applet {
    Label label;
    TextField tekstvak;
    Button knop1;
    String invulling;
    String text;
    String text2;
    String startgetal;
    String startgetal2;
    int getal;

    public void init() {
        label = new Label("Type hier uw getal: ");
        tekstvak = new TextField("", 10);
        knop1 = new Button("OK");
        tekstvak.addActionListener(new TekstListener());
        knop1.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop1);
        text = "0";
        text2 = "100000";
        startgetal = "";
        startgetal2 = "";

    }
    public class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invulling = tekstvak.getText();
            getal = Integer.parseInt(invulling);
            if ((getal >= Integer.parseInt(text))) {
                text = tekstvak.getText();
                startgetal = text;
                if ((getal <= Integer.parseInt(text2)))
                text2 = tekstvak.getText();
                repaint();
            }
            else if (getal <= Integer.parseInt(text2)&&(getal <= Integer.parseInt(text))){
                text2 = tekstvak.getText();
                startgetal2 = text2;
                repaint();

            }
        }
    }

    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invulling = tekstvak.getText();
            invulling = tekstvak.getText();
            getal = Integer.parseInt(invulling);
            if ((getal >= Integer.parseInt(text))) {
                text = tekstvak.getText();
                startgetal = text;
                if ((getal <= Integer.parseInt(text2)))
                    text2 = tekstvak.getText();
                repaint();
            }
            else if (getal <= Integer.parseInt(text2)&&(getal <= Integer.parseInt(text))){
                text2 = tekstvak.getText();
                startgetal2 = text2;
                repaint();

            }
            }
        }
        public void paint(Graphics g) {
            g.drawString("Het hoogste getal: " + startgetal, 20, 80);
            g.drawString("Het laagste getal: " + startgetal2, 20, 120);

        }
    }
