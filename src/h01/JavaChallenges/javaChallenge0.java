package JavaChallenges;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaChallenge0 extends Applet {
    private TextField inputValerie, inputHans, inputJeroen;
    private int input1, input2, input3;
    private int nullijn;
    private int valerie;
    private int hans;
    private int jeroen;
    private int schaal;


    public void init() {
        input1 = 0;
        input2 = 0;
        input3 = 0;
        inputValerie = new TextField();
        inputHans = new TextField();
        inputJeroen = new TextField();
        Button knop = new Button("Toon");
        Label labelValerie = new Label("Valerie");
        Label labelHans = new Label("Hans");
        Label labelJeroen = new Label("Jeroen");
        add(labelValerie);
        add(inputValerie);
        add(labelHans);
        add(inputHans);
        add(labelJeroen);
        add(inputJeroen);
        add(knop);
        knop.addActionListener(new KnopListener());
        nullijn = 240;
        schaal = 2;
        valerie = 40;
        hans = 80;
        jeroen = 100;
    }

    public void paint(Graphics g) {

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        //DiagramBase
        g.drawLine(50, nullijn, 320, nullijn);
        g.drawLine(50, 240, 50, 20);

        //Verdeling
        g.drawString("0", 30, nullijn);

        g.drawLine(50, nullijn - 20 * schaal, 60, nullijn - 20 * schaal);
        g.drawString("20", 30, nullijn - 20 * schaal);
        g.drawLine(50, nullijn - 40 * schaal, 60, nullijn - 40 * schaal);
        g.drawString("40", 30, nullijn - 40 * schaal);
        g.drawLine(50, nullijn - 60 * schaal, 60, nullijn - 60 * schaal);
        g.drawString("60", 30, nullijn - 60 * schaal);
        g.drawLine(50, nullijn - 80 * schaal, 60, nullijn - 80 * schaal);
        g.drawString("80", 30, nullijn - 80 * schaal);
        g.drawLine(50, nullijn - 100 * schaal, 60, nullijn - 100 * schaal);
        g.drawString("100", 25, nullijn - 100 * schaal);


        //InhoudDiagram
        g.setColor(Color.RED);
        g.fillRect(80, nullijn - valerie * schaal, 40, valerie * schaal);
        g.setColor(Color.BLUE);
        g.fillRect(160, nullijn - hans * schaal, 40, hans * schaal);
        g.setColor(Color.YELLOW);
        g.fillRect(240, nullijn - jeroen * schaal, 40, jeroen * schaal);
        //namen
        g.setColor(Color.BLACK);
        g.drawString("Valerie", 80, 260);
        g.drawString("Hans", 160, 260);
        g.drawString("Jeroen", 240, 260);


    }

    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //inputValerie
            input1 = 0;
            input1 = valerie;
            inputValerie.getText();
            input1 = Integer.parseInt(inputValerie.getText());
            valerie = input1;

            input2 = 0;
            input2 = hans;
            inputHans.getText();
            input2 = Integer.parseInt(inputHans.getText());
            hans = input2;

            input2 = 0;
            input3 = jeroen;
            inputJeroen.getText();
            input3 = Integer.parseInt(inputJeroen.getText());
            jeroen = input3;
            repaint();
        }
    }
    }

