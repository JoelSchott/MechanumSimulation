import javax.swing.*;
import java.awt.*;

public class Display {

    private Robot robot;

    private JFrame frame;
    private RobotPanel robotPanel;
    private ButtonPanel buttonPanel;

    public static void main(String[] args){
        new Display().go();
    }

    public void go(){
        robot = new Robot();
        frame = new JFrame("Simulation");

        robotPanel = new RobotPanel(robot);
        frame.getContentPane().add(BorderLayout.NORTH, robotPanel);

        buttonPanel = new ButtonPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, buttonPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }
}
