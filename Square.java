import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square
{
    private int x;
    private int y;
    JButton bt = new JButton();
    private String name;
    private ImageIcon lily= new ImageIcon("LilyPad.png");
    private ImageIcon water= new ImageIcon("Water.png");
    private ImageIcon frog=new ImageIcon("GreenFrog.png");
    private ImageIcon frogR=new ImageIcon("RedFrog.png");
    private ImageIcon frogY=new ImageIcon("GreenFrog2.png");
    private ImageIcon frogRY=new ImageIcon("RedFrog2.png");


    public Square(int xc, int yc, String d)
    {
        x=xc;
        y=yc;
        name=d;
        bt.setSize(5,5);
        
        if(name.equals("lily"))
        {
            bt.setIcon(lily);
        }
        if(name.equals("water"))
        {
            bt.setIcon(water);
        }

    }
    public JButton getButton()
    {
        return bt;
    }

    public void setSquaretoFrog()
    {
        bt.setIcon(frog);
    }

    public void setSquaretoFrogR()
    {
        bt.setIcon(frogR);
    }

    public void setSquaretoFrogY()
    {
        bt.setIcon(frogY);
    }

    public void setSquaretoFrogRY()
    {
        bt.setIcon(frogRY);
    }
}