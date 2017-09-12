package h6;

import java.awt.*;
import java.applet.*;

public class PositiveToNegative extends Applet {
    int firstNumber;
    int secondNumber;
    int uitkomst;


    public void init(){
        firstNumber = 2147483647;
        secondNumber = 2147483647;
        uitkomst = firstNumber + secondNumber;

    }
    public void paint(Graphics g){
        g.drawString("De negatieve waarde is: "+uitkomst,20,20);


    }
}
