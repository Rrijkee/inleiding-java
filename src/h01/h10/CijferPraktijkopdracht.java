package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CijferPraktijkopdracht extends Applet{
    TextField tekstvak;
    Label label;
    Button knop;
    String cijfer, tekst;
    int cijferint;


    public void init(){
        tekstvak = new TextField(2);
        label = new Label("Vul hier uw cijfer in.");
        knop = new Button("OK");
        cijfer = "";
        tekst = "";
        add (label);
        add (tekstvak);
        add (knop);
        tekstvak.addActionListener(new TekstvakListener());
        //knop.addActionListener(new KnopListener);


    }
    public void paint (Graphics g){
        g.drawString(tekst, 20,120);

    }
    public class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cijferint = Integer.parseInt(tekstvak.getText());
            switch (cijferint){
                case 1:
                    tekst = "Dit cijfer is slecht";
                    break;
                case 2:
                    tekst = "Dit cijfer is slecht";
                    break;
                case 3:
                    tekst = "Dit cijfer is slecht";
                    break;
                case 4:
                    tekst = "Dit cijfer is onvoldoende";
                    break;
                case 5:
                    tekst = "Dit cijfer is matig";
                    break;
                case 6:
                    tekst = "Dit cijfer is voldoende";
                    break;
                case 7:
                    tekst = "Dit cijfer is voldoende";
                    break;
                case  8:
                    tekst = "Dit cijfer is goed";
                    break;
                case 9:
                    tekst = "Dit cijfer is goed";
                    break;
                case 10:
                    tekst = "Dit cijfer is goed";
                    break;
                default:
                    tekst = "Vul een geldig cijfer in";
            }
            repaint();

        }
    }

}
