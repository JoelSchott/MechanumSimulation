import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JPanel leftPanel;
    private JPanel rightPanel;

    private JButton frontRightButton;
    private JButton frontLeftButton;
    private JButton backLeftButton;
    private JButton backRightButton;

    public ButtonPanel(){
        this.setPreferredSize(new Dimension(400, 200));
        this.setBackground(Color.GREEN);
        leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 200));
        this.add(leftPanel);
        rightPanel = new JPanel();
    }
}
