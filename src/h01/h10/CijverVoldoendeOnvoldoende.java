package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CijverVoldoendeOnvoldoende extends Applet {
    TextField tekstvak;
    Label label;
    Label knoplabel;
    Button knop;
    double invullingDouble, gemiddeldeDouble, gemiddeldeAantal, gemiddeldeInvulling;
    String invulling, uitkomst, uitkomstGemiddelde;


    public void init() {
        label = new Label("Vul hier uw cijfer in.");
        knoplabel = new Label("OK");
        tekstvak = new TextField(2);
        knop = new Button("OK");
        gemiddeldeAantal = 0;
        invullingDouble = 0;
        gemiddeldeDouble = 0;
        uitkomst = "";
        add(label);
        add(tekstvak);
        add(knop);
        // knop.addActionListener (new KnopListener());
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak.addActionListener(new TekstvakListener1());
        knop.addActionListener(new KnopListener());
        knop.addActionListener(new KnopListener1());

    }

    public void paint(Graphics g) {
        g.drawString(uitkomst, 20, 100);
        g.drawString(String.valueOf(gemiddeldeDouble), 20, 120);
        g.drawString(uitkomstGemiddelde,20,140);

    }

    public class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invullingDouble = Double.parseDouble(tekstvak.getText());
            invulling = String.valueOf(invullingDouble);
            gemiddeldeAantal++;
            gemiddeldeInvulling = gemiddeldeInvulling + invullingDouble;

            if ((invullingDouble < 5.5)) {
                uitkomst = "Dit cijfer is onvoldoende";

            } else
                uitkomst = "Dit cijfer is voldoende";
            gemiddeldeDouble = gemiddeldeInvulling / gemiddeldeAantal;
            repaint();

        }

    }

    public class TekstvakListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((gemiddeldeDouble >= 5.5)) {
                uitkomstGemiddelde = "Geslaagd";

            } else
                uitkomstGemiddelde = "Niet Geslaagd";
            repaint();
        }

    }
    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invullingDouble = Double.parseDouble(tekstvak.getText());
            invulling = String.valueOf(invullingDouble);
            gemiddeldeAantal++;
            gemiddeldeInvulling = gemiddeldeInvulling + invullingDouble;

            if ((invullingDouble < 5.5)) {
                uitkomst = "Dit cijfer is onvoldoende";

            } else
                uitkomst = "Dit cijfer is voldoende";
            gemiddeldeDouble = gemiddeldeInvulling / gemiddeldeAantal;
            repaint();

        }

    }

    public class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((gemiddeldeDouble >= 5.5)) {
                uitkomstGemiddelde = "Geslaagd";

            } else
                uitkomstGemiddelde = "Niet Geslaagd";
            repaint();
        }

    }
}