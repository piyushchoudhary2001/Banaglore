import java.awt.*;

public class Goa extends Panel {

    int x=0,y=100;
    int speed=1;


    @Override

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.drawOval(x,y,50,50);


        if(x>=300-50 || x<0)
        {
            speed=-speed;
        }
        x+=speed;

        repaint();


    }
}
