/* Name: Board
 * Creator: Amantha Kalansooriya
 * Description: The purpose of this class is to create a GUI, which allows a 5x5 grid to be placed on the screen.
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board implements ActionListener {
    
    /** A JFrame was created, and called frame. */
    private JFrame frame;
    
    /** A Jpanel was created, and called grid. */
    private JPanel grid;

    /** A array called square was instantiated, and a new array was created 5x5. */
    private Square[][] squares = new Square[5][5];
    
    /** A integer buttonsClicked was created, to recognise how many buttons were being clicked. */
    private int buttonsClicked = 0;
    
    /** A square was created called selectedSquare, and it was created to find out which square was currently being pressed. */
    private Square selectedSquare;
    
    /** A square was created middleSquare, this was created to find out what the vaule between two squares would be. */
    private Square middleSquare;

    /** An integer x1 was created to represent the co-ordinates of the value of x1. */
    int x1;
    
    /** An integer y1 was created to represent the co-ordinates of the value of y1. */
    int y1;

    /** An integer x2 was created to represent the co-ordinates of the value of x2. */
    int x2;
    
    /** An integer y2 was created to represent the co-ordinates of the value of y2. */
    int y2;
    
    /** An integer i was created to represent the i vaule in my loop, I have kepted it at zero. */
    int i = 0;

    /** An integer j was created to represent the i vaule in my loop, I have kepted it at zero. */
    int j = 0;

    public Board() {
        /** An new instance of JFrame was created, and was named frame. */
        JFrame frame = new JFrame();
        
        /** The frame's title was set to "Hoppers". */
        frame.setTitle("Hoppers");
        
        /** The frame's size was set to 750px x 750px. */
        frame.setSize(750, 750);
        
        /** The frame's was set so that when you close the GUI, it will bring you back to the terminal. */
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /** A new instance of the JPanel was created and called "grid". */
        JPanel grid = new JPanel();
        
        /** This line of code attaches the JPanel to the JFrame. */
        frame.add(grid);
        
        /** I made the JPanel into a gridlayout which was 5x5. */
        grid.setLayout(new GridLayout(5, 5));


        /** This is two for loops that iterate through.  */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                /** This makes all the buttons on the grid set to the water icon, and the other squares lilly pads either plain for with specific frogs.  */
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

                /** This line of code, makes sure the computer listens to any button being clicked in the 5x5 grid.  */
                squares[i][j].bt.addActionListener(this);
                
                /** This line of code adds all the squares to the grid and constantly updates them. */
                grid.add(squares[i][j].bt);

            }

            /** This makes buttons visible on the JFrame. */
            frame.setVisible(true);
        }

    }

    public void actionPerformed(ActionEvent e) {
       
       /** This tells the computer once you press a button make it equal to 1. */
        buttonsClicked += 1;

         /** This line of code, makes sure the computer listens to any button being clicked in the 5x5 grid
          * ,and it is saying if you click the button once register the click and if its a red/green frog change the icons.  */

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++)
                if (buttonsClicked == 1){
                    if (e.getSource().equals(squares[i][j].getButton()) && "green frog".equals(squares[i][j].getName())){
                       // System.out.println( squares[i][j].getX() + " " + squares[i][j].getY() );
                        selectedSquare = squares[i][j];
                        x1 = squares[i][j].getX();
                        y1 = squares[i][j].getY();
                        //System.out.println("BUTTON COUNT " + buttonsClicked);

                        
                        squares[i][j].setSquaretoFrogY();

                    } else if(e.getSource().equals(squares[i][j].getButton()) && "red frog".equals(squares[i][j].getName())){
                        x1 = squares[i][j].getX();
                        y1 = squares[i][j].getY();
                        
                        selectedSquare = squares[i][j];
                        squares[i][j].setSquaretoFrogRY();

                    }
                }
        }

         /** This line of code, makes sure the computer listens and if the users clicks another button it will register the click
          * ,and it is saying if you click the button once register the click and if its a red/green frog change the icons.  */

        if (buttonsClicked == 2){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                
                    
            
                if (e.getSource().equals(squares[i][j].getButton())) {
                        x2 = squares[i][j].getX();
                        y2 = squares[i][j].getY();

                        
                        /**this is the code for the finding out the middle */
                        middleSquare = squares[(x1+x2) / 2][(y1 + y2) / 2];

                        /**if you get the middle sqaure and there is a frog that is a correct move */
                        System.out.println("X1 =  " + x1 + "Y1 =" + y1 + "X2 = " + x2 + "Y2 = " + y2);

                        /**this shows that is between two squares */
                        System.out.println("VALUE OF MIDDLE " + middleSquare.getName());
                        
                        System.out.println("BUTTON COUNT " + buttonsClicked);
                        
                       /**This rule was created to only make the middle frog disapear if */
                        if(rule() && (x1!=x2 && y1!=y2)){ 
                        selectedSquare.moveTo(squares[i][j]);
                        middleSquare.getridofmiddlefrog(squares[i][j]);
                       }else{
                          System.out.println("Wrong move!");
                      }
                      
                    }
                   

                       
            }
        }
}
        /**This rests the buttons clicks to zero after you have clicked twice. */
        if (buttonsClicked == 2){
            buttonsClicked = 0;
            }



    }


    /**This retuns the rule of only letting frogs jump over each other. */
    public boolean rule()
    {
        if("green frog".equals(middleSquare.getName()) || "red frog".equals(middleSquare.getName())){
            return true;
        } else {
            return false;
        }

       
    } 
}