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
    }
}
