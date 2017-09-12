package h6;

import java.awt.*;
import java.applet.*;

public class GemiddeldeBerekenen extends Applet{
    double doubleGemiddelde;
    double doubleGemiddeldeVermenigvuldigd;
    double eindGemiddelde;
    double cijfer_1;
    double cijfer_2;
    double cijfer_3;
    int intGemiddelde;


    public void init(){
        cijfer_1 = 5.9;
        cijfer_2 = 6.3;
        cijfer_3 = 6.9;
        doubleGemiddelde = (cijfer_1 + cijfer_2 + cijfer_3) / 3;
        doubleGemiddeldeVermenigvuldigd = doubleGemiddelde *10;
        intGemiddelde = (int)doubleGemiddeldeVermenigvuldigd;
        eindGemiddelde = (double)intGemiddelde/10;




    }
    public void paint(Graphics g){
        g.drawString("Het gemiddelde: " +eindGemiddelde,20,20);

    }
}
