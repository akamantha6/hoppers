import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener {
    private JFrame frame;
    private JPanel grid;
    private Square[][] squares = new Square[5][5];
    private int buttonsClicked = 0;
    private Square selectedSquare;
    private Square middleSquare;

    int x1;
    int y1;
    int x2;
    int y2;
    int i = 0;
    int j = 0;

    public Board() {
        JFrame frame = new JFrame();
        frame.setTitle("Hoppers");
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel grid = new JPanel();
        frame.add(grid);
        grid.setLayout(new GridLayout(5, 5));

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if ((i + j) % 2 != 0) {
                    squares[i][j] = new Square(i, j, "water");
                } else {
                    squares[i][j] = new Square(i, j, "lily");

                    if (i == 1 && (j == 1 || j == 3))
                        squares[i][j].setSquaretoFrog();

                    if (i == 2 && j == 2)
                        squares[i][j].setSquaretoFrog();

                    if (i == 4 && (j == 0 || j == 4))
                        squares[i][j].setSquaretoFrog();

                    if (i == 4 && j == 2)
                        squares[i][j].setSquaretoFrogR();

                }

                squares[i][j].bt.addActionListener(this);
                grid.add(squares[i][j].bt);

            }

            frame.setVisible(true);
        }

    }

    public void actionPerformed(ActionEvent e) {
        buttonsClicked += 1;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (buttonsClicked == 1)
                    if (e.getSource().equals(squares[i][j].getButton()) && "green frog".equals(squares[i][j].getName())){
                        System.out.println( squares[i][j].getX() + " " + squares[i][j].getY() );
                        selectedSquare = squares[i][j];
                        x1 = squares[i][j].getX();
                        y1 = squares[i][j].getY();
                        System.out.println("BUTTON COUNT " + buttonsClicked);

                        
                        squares[i][j].setSquaretoFrogY();

                    } else if(e.getSource().equals(squares[i][j].getButton()) && "red frog".equals(squares[i][j].getName())){
                        x1 = squares[i][j].getX();
                        y1 = squares[i][j].getY();
                        
                        selectedSquare = squares[i][j];
                        squares[i][j].setSquaretoFrogRY();

                    }
if (buttonsClicked == 2)
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                
                    if (e.getSource().equals(squares[i][j].getButton()))
                        x2 = squares[i][j].getX();
                        y2 = squares[i][j].getY();
                        middleSquare = squares[(x1+x2) / 2][(y1 + y2) / 2];
                        System.out.println("X1 =  " + x1 + "Y1 =" + y1 + "X2 = " + x2 + "Y2 = " + y2);

                        System.out.println("VALUE OF MIDDLE " + middleSquare.getName());
                      
                      
                      // if()
                       // only happen if frog is in the middle (greenf or redF)
                       // selectedSquare.moveFrog(squares[i][j]);

        if (buttonsClicked == 2)
            buttonsClicked = 0;


    }
}