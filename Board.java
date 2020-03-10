import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener
{
    private JFrame frame;
    private JPanel grid;
    private Square[][] squares= new Square[5][5];
 //test

    public Board()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Hoppers");
        frame.setSize(700,700);

        JPanel grid= new JPanel();
        frame.add(grid);
        grid.setLayout(new GridLayout(5,5));

        for (int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {

                
                if((i+j)%2!=0)
                {
                    squares[i][j]= new Square(i,j,"water");
                }
                else
                {
                    squares[i][j]= new Square(i,j,"lily"); 
                
                    if(i==1 && (j==1 || j== 3) )
                    squares[i][j].setSquaretoFrog();

                    if(i==2 && j==2)
                    squares[i][j].setSquaretoFrog();
                     
                    if(i==4 && (j==0 || j==4))
                    squares[i][j].setSquaretoFrog();

                    if(i==4 && j==2)
                    squares[i][j].setSquaretoFrogR();

                }
                squares[i][j].bt.addActionListener(this);
                grid.add(squares[i][j].bt);
            }
            
          frame.setVisible(true);
        }
               
    }

    public void actionPerformed(ActionEvent e)
    {
        
        
        
        
        
        
        if(e.getSource()== squares[0][0].getButton())
        {
          System.out.println("hi");
        }
    
    
    
    
    
    
    } 
}