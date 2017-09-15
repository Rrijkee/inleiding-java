package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class BTWadder extends Applet {
    Button okKnop;
    TextField tekstvak;
    Label label;
    double btw;
    double percentage;
    String invulling;
    String totaal;
    String btwString;
    Double totaaldouble;

    public void init(){
        tekstvak = new TextField("",10);
        label = new Label ("Typ hier uw bedrag exclusief BTW: ");
        okKnop = new Button("OK");
        invulling = "";
        btwString = "";
        tekstvak.addActionListener(new TekstListener());
        okKnop.addActionListener (new KnopListener());
        add(label);
        add(tekstvak);
        add(okKnop);
        totaal = "";


    }
    public void paint(Graphics g){
        g.drawString("Ingevuld bedrag exclusief BTW: "+invulling,50,50);
        g.drawString("btw: "+btwString ,50,65);
        g.drawString("Totaal bedrag: "+totaal,50,80);

    }
    public class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling = tekstvak.getText();
            btw = (Double.parseDouble(invulling));
            percentage = btw/100*21;
            btwString = Double.toString(percentage);
            totaaldouble = btw + percentage;
            totaal = Double.toString(totaaldouble);
            repaint();

        }

    }
    public class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling = tekstvak.getText();
            btw = (Double.parseDouble(invulling));
            percentage = btw/100*21;
            btwString = Double.toString(percentage);
            totaaldouble = btw + percentage;
            totaal = Double.toString(totaaldouble);
            repaint();

        }
    }

}
