import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bangalore implements ActionListener {


    JFrame shayam;

    JButton button;
    JButton button2;

    Goa p1,p2,p3;
    Bangalore(){
        shayam=new JFrame("Sapling");
        shayam.setLayout(null);
        shayam.getContentPane().setBackground(Color.blue);
        shayam.setSize(900,500);

        button=new JButton("Hit Me!");
        button.setSize(100,50);
        button.addActionListener(this);

        button2=new JButton("Hit Me2!");
        button2.setSize(100,50);
        button2.setLocation(0,0);
        button2.addActionListener(this);


        p1=new Goa();
        p1.setSize(300,500);
        p1.setLocation(0,0);
        p1.setLayout(null);
        p1.setBackground(Color.yellow);


        p2=new Goa();
        p2.setSize(300,500);
        p2.setLocation(600,0);
        p2.setBackground(Color.RED);
        p2.setLayout(null);


        p3=new Goa();
        p3.setSize(300,500);
        p3.setLocation(300,0);
        p3.setBackground(Color.blue);
        p3.setLayout(null);


        p1.add(button);
        p2.add(button2);

        shayam.add(p1);
        shayam.add(p2);
        shayam.add(p3);






        shayam.setVisible(true);
    }

    public static void main(String[] args) {

    Bangalore obj=new Bangalore();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("Hit Me!"))
        {
            shayam.getContentPane().setBackground(Color.yellow);
        }else if(s.equals("Hit Me2!"))
        {
            shayam.getContentPane().setBackground(Color.blue);
        }
    }
}
