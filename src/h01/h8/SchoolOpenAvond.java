package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

        public class SchoolOpenAvond extends Applet {
            private Button knop1;
            private Button knop2;
            private Button knop3;
            private Button knop4;
            private int mannen;
            private int vrouwen;
            private int potentiemannen;
            private int potentievrouwen;
            private int totaalaanwezig;
            String m, v, mp, vp, totaal;


            public void init() {
                setSize(400, 400);
                knop1 = new Button("Mannen");
                knop2 = new Button("Vrouwen");
                knop4 = new Button("Mannelijke leerlingen");
                knop3 = new Button("Vrouwlijke leerlingen");

                knop1.addActionListener(new Knoplistener());
                knop2.addActionListener(new Knoplistener1());
                knop3.addActionListener(new Knoplistener2());
                knop4.addActionListener(new Knoplistener3());
                add(knop1);
                add(knop2);
                add(knop3);
                add(knop4);
                mannen = 0;
                vrouwen = 0;
                potentiemannen = 0;
                potentievrouwen = 0;
                totaalaanwezig = mannen + vrouwen + potentiemannen + potentievrouwen;
            }

            public void paint(Graphics g) {
                g.drawString("Aantal mannen: " + mannen, 20, 50);
                g.drawString("Aantal vrouwen:" + vrouwen, 20, 65);
                g.drawString("Aantal potentiële mannelijke leerlingen: " + potentiemannen, 20, 80);
                g.drawString("Aantal potentiële vrouwelijke leerlingen: " + potentievrouwen, 20, 95);
                g.drawString("Totaal aantal: "+totaalaanwezig, 20, 110);
            }

            public class Knoplistener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    mannen++;
                    totaalaanwezig++;
                    repaint();
                }
            }
            public class Knoplistener1 implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    vrouwen++;
                    totaalaanwezig++;
                    repaint();
                }
            }
            public class Knoplistener2 implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    potentiemannen++;
                    totaalaanwezig++;
                    repaint();
                }
            }
            public class Knoplistener3 implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    potentievrouwen++;
                    totaalaanwezig++;
                    repaint();
                }
            }

        }
