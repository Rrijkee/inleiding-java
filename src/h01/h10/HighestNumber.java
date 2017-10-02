package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HighestNumber extends Applet {
    Label label;
    TextField tekstvak;
    Button knop1;
    String invulling;
    String text;
    String text2;
    String text3;
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
        text2= "";
        text3="zero";

    }

    public class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invulling = tekstvak.getText();
            getal = Integer.parseInt(invulling);
            if ((getal >= Integer.parseInt(text))) {
                text = tekstvak.getText();
                repaint();
            }


        }
    }

    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invulling = tekstvak.getText();
            getal = Integer.parseInt(invulling);
            if ((getal >= Integer.parseInt(text))) {
                text = invulling;
                text2= "";

            }
            else text2 = "vul een hoger getal in.";

            repaint();
        }
    }


        public void paint(Graphics g) {
            g.drawString ("het hoogste getal: "+text, 20, 80);
            g.drawString(text2,20,100);


        }
}
