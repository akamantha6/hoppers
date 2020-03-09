import javax.swing.*;
import java.awt.*;

public class Square
{
    private int x;
    private int y;
    JButton bt = new JButton();
    private String color;
    private ImageIcon lily= new ImageIcon("LilyPad.png");
    private ImageIcon water= new ImageIcon("Water.png");
    private ImageIcon frog=new ImageIcon("GreenFrog.png");
    private ImageIcon frogR=new ImageIcon("RedFrog.png");


    public Square(int a, int b, JButton c, String d)
    {
        x=a;
        y=b;
        bt=c;
        color=d;
        bt.setSize(5,5);
        
        if(color.equals("lily"))
        {
            bt.setIcon(lily);
        }
        if(color.equals("water"))
        {
            bt.setIcon(water);
        }

    }

    public void setSquaretoFrog()
    {
        bt.setIcon(frog);
    }

    public void setSquaretoFrogR()
    {
        bt.setIcon(frogR);
    }
}