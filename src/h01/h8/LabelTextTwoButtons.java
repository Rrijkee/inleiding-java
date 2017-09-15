package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class LabelTextTwoButtons extends Applet {
    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;
    String reset;
    String invulling;

    public void init() {
        setSize(400,400);
        tekstvak = new TextField("", 30);
        label = new Label("Type hier iets:");
        knop1 = new Button("OK");
        knop2 = new Button("Reset");
        tekstvak.addActionListener(new TekstListener());
        knop1.addActionListener(new KnopListener());
        knop2.addActionListener(new KnopListener1());
        add(label);
        add(tekstvak);
        add(knop1);
        add(knop2);
        reset = "";
        invulling = "";
    }

    public void paint(Graphics g) {

        g.drawString(invulling, 50, 100);
    }
    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling= tekstvak.getText();
            repaint();
        }
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            invulling = tekstvak.getText();
            repaint();
        }
        }
        class KnopListener1 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                tekstvak.setText("\u0000");
                invulling = reset;
                repaint();

            }
        }

}


