import javax.swing.*;
import java.awt.*;

public class RobotPanel extends JPanel {
    private Robot robot;

    public RobotPanel(Robot r){
        robot = r;
        setPreferredSize(new Dimension(400,400));
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawRect(150,150,100,100);
        g.drawOval(130, 150, 20, 40);
        g.drawOval(130, 210, 20, 40);
        g.drawOval(250, 150, 20, 40);
        g.drawOval(250, 210, 20, 40);

        g.setColor(Color.BLUE);
        //draw front left arrow
        double multiplier = 50;
        g.drawLine(140, 170, 140 + (int)(robot.getFrontLeftX() * multiplier), 170 - (int)(robot.getFrontLeftY() * multiplier));
        g.drawLine(140, 230, 140 + (int)(robot.getBackLeftX() * multiplier), 230 - (int)(robot.getBackLeftY() * multiplier));
        g.drawLine(260, 170, 260 + (int)(robot.getFrontRightX() * multiplier), 170 - (int)(robot.getFrontRightY() * multiplier));
        g.drawLine(260, 230, 260 + (int)(robot.getBackRightX() * multiplier), 230 - (int)(robot.getBackRightY() * multiplier));

        g.setColor(Color.BLACK);
        g.drawLine(200,200, 200 + (int)(robot.getTotalXY()[0] * multiplier), 200 - (int)(robot.getTotalXY()[1] * multiplier));
    }
}
