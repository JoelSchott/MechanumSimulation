import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JPanel leftPanel;
    private JPanel rightPanel;

    private JLabel frontRightLabel;
    private JTextField frontRightTextField;
    private JLabel frontLeftLabel;
    private JTextField frontLeftTextField;
    private JLabel backLeftLabel;
    private JTextField backLeftTextField;
    private JLabel backRightLabel;
    private JTextField backRightTextField;

    public ButtonPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(Color.GREEN);
        frontLeftLabel = new JLabel("Front Left Magnitude");
        frontLeftTextField = new JTextField("1", 5);
        backLeftLabel = new JLabel("Back Left Magnitude");
        backLeftTextField = new JTextField("1", 5);
        frontRightLabel = new JLabel("Front Right Magnitude");
        frontRightTextField = new JTextField("1", 5);
        backRightLabel = new JLabel("Back Right Magnitude");
        backRightTextField = new JTextField("1", 5);

        leftPanel = new JPanel();
        leftPanel.setPreferredSize(new Dimension(200, 200));
        leftPanel.add(frontLeftLabel);
        leftPanel.add(frontLeftTextField);
        leftPanel.add(backLeftLabel);
        leftPanel.add(backLeftTextField);
        this.add(leftPanel);

        rightPanel = new JPanel();
        rightPanel.setPreferredSize(new Dimension(200, 200));
        rightPanel.add(frontRightLabel);
        rightPanel.add(frontRightTextField);
        rightPanel.add(backRightLabel);
        rightPanel.add(backRightTextField);
        this.add(rightPanel);
        this.setPreferredSize(new Dimension(400, 200));
    }

    private double getMagnitude(JTextField text){
        double number = 0;
        try{
            number = Double.parseDouble(text.getText());
        }
        catch(Exception e){
            //invalid input
        }
        if (number > 1){
            return 1;
        }
        else if (number < -1){
            return -1;
        }
        else{
            return number;
        }
    }

    public double frontRightMagnitude(){
        return getMagnitude(frontRightTextField);
    }
    public double frontLeftMagnitude(){
        return getMagnitude(frontLeftTextField);
    }
    public double backLeftMagnitude(){
        return getMagnitude(backLeftTextField);
    }
    public double backRightMagnitude(){
        return getMagnitude(backRightTextField);
    }
}
