package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijkopdracht extends Applet {

    TextField tekstvak;
    TextField tekstvak2;
    Button vermenigvuldigen;
    Button delen;
    Button optellen;
    Button aftrekken;

    String invulling, invullingEind;
    double invullingDouble;

    String invulling2, invullingEind2;
    double invullingDouble2;

    String keerEind;
    double keerDouble,keerDoubleTussen,keerBerekening;

    String deelEind;
    double deelDouble,deelDoubleTussen,deelBerekening;

    String optelEind;
    double optelDouble,optelDoubleTussen,optelBerekening;

    String aftrekEind;
    double aftrekDouble, aftrekDoubleTussen,aftrekBerekening;

    public void init() {
        setSize(500, 100);
        tekstvak = new TextField(10);
        tekstvak2 = new TextField(10);
        vermenigvuldigen = new Button("*");
        delen = new Button("/");
        optellen = new Button("+");
        aftrekken = new Button("-");
        add(tekstvak);
        add(tekstvak2);
        add(vermenigvuldigen);
        add(delen);
        add(optellen);
        add(aftrekken);
        tekstvak.addActionListener(new TekstListener());
        tekstvak2.addActionListener(new TekstListener2());
        vermenigvuldigen.addActionListener(new KnopListener());
        delen.addActionListener(new KnopListener2());
        optellen.addActionListener(new KnopListener3());
        aftrekken.addActionListener(new KnopListener4());
}

    public class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invulling = tekstvak.getText();
            invullingDouble = Double.parseDouble(invulling);
            invullingEind = String.valueOf(invullingDouble);
            repaint();
        }
    }
    public class TekstListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invulling2 = tekstvak2.getText();
            invullingDouble2 = (Double.parseDouble(invulling2));
            invullingEind2 = String.valueOf(invullingDouble2);
            repaint();
        }
    }
    public class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling = tekstvak.getText();
            invulling2 = tekstvak.getText();
            keerDouble = Double.parseDouble(invulling);
            keerDoubleTussen= Double.parseDouble(invulling2);
            keerBerekening = keerDouble * keerDoubleTussen;
            keerEind = String.valueOf(keerBerekening);
            tekstvak.setText(keerEind);
            tekstvak2.setText("\u0000");
            repaint();
        }
    }
    public class KnopListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling = tekstvak.getText();
            invulling2 = tekstvak.getText();
            deelDouble = Double.parseDouble(invulling);
            deelDoubleTussen= Double.parseDouble(invulling2);
            deelBerekening = deelDouble / deelDoubleTussen;
            deelEind = String.valueOf(deelBerekening);
            tekstvak.setText(deelEind);
            tekstvak2.setText("\u0000");
            repaint();
        }
    }
    public class KnopListener3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling = tekstvak.getText();
            invulling2 = tekstvak.getText();
            optelDouble = Double.parseDouble(invulling);
            optelDoubleTussen= Double.parseDouble(invulling2);
            optelBerekening = optelDouble + optelDoubleTussen;
            optelEind = String.valueOf(optelBerekening);
            tekstvak.setText(deelEind);
            tekstvak2.setText("\u0000");
            repaint();
        }
    }
    public class KnopListener4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            invulling = tekstvak.getText();
            invulling2 = tekstvak.getText();
            aftrekDouble = Double.parseDouble(invulling);
            aftrekDoubleTussen= Double.parseDouble(invulling2);
            aftrekBerekening = aftrekDouble - aftrekDoubleTussen;
            aftrekEind = String.valueOf(aftrekBerekening);
            tekstvak.setText(aftrekEind);
            tekstvak2.setText("\u0000");
            repaint();
        }
    }
}
