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

        boolean running = true;
        while (running){
            frame.repaint();

            robot.setFrontRightMagnitude(buttonPanel.frontRightMagnitude());
            robot.setFrontLeftMagnitude(buttonPanel.frontLeftMagnitude());
            robot.setBackLeftMagnitude(buttonPanel.backLeftMagnitude());
            robot.setBackRightMagnitude(buttonPanel.backRightMagnitude());

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
