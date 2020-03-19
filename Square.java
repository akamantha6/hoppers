/* Name: Square
 * Creator: Amantha Kalansooriya
 * Description: The purpose of this class is to create different versions of the square.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square
{
    /** An integer x was created to represent the co-ordinates of the value of x. */
    private int x;
    
    /** An integer y was created to represent the co-ordinates of the value of y. */
    private int y;
    
    /** A new instance of a button was created called "bt". */
    JButton bt = new JButton();
    
    /** A string was created called "name". */
    private String name;
    
    /** All the images that was required for the game, was created. */
    private ImageIcon lily= new ImageIcon("LilyPad.png");
    private ImageIcon water= new ImageIcon("Water.png");
    private ImageIcon frog=new ImageIcon("GreenFrog.png");
    private ImageIcon frogR=new ImageIcon("RedFrog.png");
    private ImageIcon frogY=new ImageIcon("GreenFrog2.png");
    private ImageIcon frogRY=new ImageIcon("RedFrog2.png");

    
    /**
	 * This is the constructor of my Square class. This passes the values of x,y, and the name of the image.
	 * 
	 * @param xc	the x-coordinate of square.
	 * @param yc	the y-coordinate of square.
	 * @param d	    the string of what name the square will be.
	 */


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
    
    
    /**
	 * This is my getButton method
	 * @return this returns the button.
	 */
    public JButton getButton()
    {
        return bt;
    }

    /**
	 * This is my getX method
	 * @return this returns the x co-ordinate.
	 */
    public int getX(){
        return x;
    }

    /**
	 * This is my getY method
	 * @return this returns the y co-ordinate.
	 */
    public int getY(){
        return y;
    }

    
    public void setIcon(ImageIcon i){
        bt.setIcon(i);


    }

    
    
    
    
     /**
	 * This is my getName method
	 * @return this returns the name.
	 */
    public String getName(){ 

        return name;
    }

    
    
    
    
     /**
	 * This is my moveTo method
	 * @param s	swaps icons from the lilly to the frogs.
	 */

    
    public void moveTo(Square s){

        bt.setIcon(lily); // button that you click first is gunna be this

 // swap for finial
        //to access the first square clicked use x or y 
        //to access the second square clickued us s.x or s.y
        

        if(name.equals("green frog")) // 
            s.setIcon(frog);
        if(name.equals("red frog"))
            s.setIcon(frogR);
        
        
        s.name = "green frog";
        s.name = "red frog";
}






    /**
	 * Changes the middle Icon from a frog to a lily pad
	 * @param s	swaps the icons.
	 */



public void getridofmiddlefrog(Square s){

    bt.setIcon(lily); // button that you click first is gunna be this


    if(name.equals("green frog")) 
        s.setIcon(frog);
    
    
    name = "lily";
}


    
    // sets the name to red frog and Icon
    public void setSquaretoFrog()
    {
        name = "green frog";
        bt.setIcon(frog);
    }

    // sets the name to red frog and Icon
    public void setSquaretoFrogR()
    {
        name = "red frog";
        bt.setIcon(frogR);
    }

    // sets the frog Icon that is highlighted
    public void setSquaretoFrogY()
    {
        bt.setIcon(frogY);
    }

    // sets the frog Icon that is highlighted
    public void setSquaretoFrogRY()
    {
        bt.setIcon(frogRY);
    }
    
    
}