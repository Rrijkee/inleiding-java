package JavaChallenges;

        import java.awt.*;
        import java.applet.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class javaChallenge1 extends Applet{
    private TextField tekstvak;
    private int input, london,tokyo,newYork,sydney;
    private int x,y;

    public void init(){
        Label label = new Label("Voer een uur in");
        tekstvak = new TextField(2);
        Button knop = new Button("Toon Tijden");
        add(label);
        add(tekstvak);
        add(knop);
        knop.addActionListener(new KnopListener());
        x = 50;
        y = 70;

    }
    public void paint(Graphics g){
        if(input >= 0 && input <24) {
            g.drawString("Tijd in London: " + london + ":00 uur", x, y);
            g.drawString("Tijd in Tokyo: " + tokyo + ":00 uur", x, y + 20);
            g.drawString("Tijd in New York: " + newYork + ":00 uur", x, y + 40);
            g.drawString("Tijd in Sydney: " + sydney + ":00 uur", x, y + 60);
            }else {
            if (input > 23) {
                g.drawString("Vul een geldig getal in", x, y);
            }
        }
        }
            public class KnopListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        input = Integer.parseInt(tekstvak.getText());
                        london = input - 1;
                        if (london < 0) {
                            london = 24 + london;
                        }
                        tokyo = input + 7;
                        if (tokyo > 23) {
                            tokyo = tokyo - 24;
                        }
                        newYork = input - 6;
                        if (newYork < 0) {
                            newYork = 24 + newYork;
                        }
                        sydney = input + 9;
                        if (sydney > 23) {
                            sydney = sydney - 24;
                        }
                        repaint();
                    }

            }
        }
