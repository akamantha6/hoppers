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

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setIcon(ImageIcon i){
        bt.setIcon(i);


    }

    public String getName(){

        return name;
    }

    public void moveFrog(Square s){

        bt.setIcon(lily);


        //to access the first square clicked use x or y 
        //to access the second square clickued us s.x or s.y
        

        if(name.equals("green frog"))
            s.setIcon(frog);
        if(name.equals("red frog"))
            s.setIcon(frogR);
        
        
        name = "lily";

    }

    public void setSquaretoFrog()
    {
        name = "green frog";
        bt.setIcon(frog);
    }

    public void setSquaretoFrogR()
    {
        name = "red frog";
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
    
    public void rule()
    {
        
    } 
}