package h5;

import java.awt.*;
import java.applet.*;

public class PraktijkopdrachtRemake extends Applet{

    int Hoogte;
    int Breedte;
    int HoogteOvaal;
    int BreedteOvaal;
    int XfiguresRow1;
    int XfiguresRow2;
    int XfiguresRow3;
    int Xcirkel;
    int Yline;
    int Xline;
    int Yrect;
    int XlineString;
    int YlineString;
    int XrectString;
    int YrectString;
    int XroundrectString;
    int YroundrectString;
    int XfillrectString;
    int YfillrectString;
    int YfillRectOvalShapes;
    int YroundRect;
    int ArcWidthHeight;
    int HoogteFilledOval;
    int BreedteFilledOval;
    int YfilledOval;
    int ArcStartAngle;
    int ArcAngle;
    int XtaartString;
    int YtaartString;
    int Ycirkel;
    int XcirkelString;
    int YcirkelString;
    Color Opvulkleur;
    Color Lijnkleur;




    public void init(){

        Hoogte= 105;
        Breedte= 220;
        HoogteOvaal= 100;
        BreedteOvaal= 100;
        XfiguresRow1= 10;
        XfiguresRow2= 240;
        XfiguresRow3=470;
        Xcirkel= 530;
        Yline= 20;
        Xline= 230;
        XlineString= 110;
        YlineString= 35;
        XrectString= 90;
        YrectString= 160;
        XroundrectString= 60;
        YroundrectString= 285;
        YfillRectOvalShapes= 40;
        YroundRect= 165;
        ArcWidthHeight= 30;
        XfillrectString= 270;
        YfillrectString= 160;
        HoogteFilledOval= 300;
        BreedteFilledOval= 285;
        YfilledOval= 165;
        ArcStartAngle= 0;
        ArcAngle= 45;
        XtaartString= 500;
        YtaartString= 160;
        Ycirkel= 170;
        XcirkelString= 565;
        YcirkelString= 285;
        Opvulkleur = new Color(47, 90, 56);
        Lijnkleur = Color.BLACK;




    }

    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        //lijn
        g.drawLine(XfiguresRow1,Yline,Xline,Yline);
        g.drawString("Lijn",XlineString,YlineString);

        //Rechthoek
        g.drawRect(XfiguresRow1,YfillRectOvalShapes,Breedte,Hoogte);
        g.drawString("Rechthoek",XrectString,YrectString);

        //Afgeronde Rechthoek
        g.drawRoundRect(XfiguresRow1,YroundRect,Breedte,Hoogte,ArcWidthHeight,ArcWidthHeight);
        g.drawString("Afgeronde rechthoek",XroundrectString,YroundrectString);

        //Gevulde rechthoek met ovaal
        g.setColor(Opvulkleur);
        g.fillRect(XfiguresRow2,YfillRectOvalShapes,Breedte,Hoogte);
        g.setColor(Lijnkleur);
        g.drawOval(XfiguresRow2,YfillRectOvalShapes,Breedte,Hoogte);
        g.drawString("Gevulde rechthoek met ovaal",XfillrectString,YfillrectString);

        //Gevulde ovaal
        g.setColor(Opvulkleur);
        g.fillOval(XfiguresRow2,YfilledOval,Breedte,Hoogte);
        g.setColor(Lijnkleur);
        g.drawString("Gevulde ovaal",HoogteFilledOval,BreedteFilledOval);

        //Taartpunt met ovaal eromheen
        g.drawOval(XfiguresRow3,YfillRectOvalShapes,Breedte,Hoogte);
        g.setColor(Opvulkleur);
        g.fillArc(XfiguresRow3,YfillRectOvalShapes,Breedte,Hoogte,ArcStartAngle,ArcAngle);
        g.setColor(Lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen",XtaartString,YtaartString);

        //cirkel
        g.drawOval(Xcirkel,Ycirkel,BreedteOvaal,HoogteOvaal);
        g.drawString("Cirkel",XcirkelString,YcirkelString);
    }
}

