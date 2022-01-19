package Interface.Inputs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SphereInput extends JFrame{
    static JFrame C;
    static JTextField Radius;
    static JButton EnterValues;
    static JLabel Description;

    public static void SpherePage(){
        C = new JFrame("Cylinder");
        Description = new JLabel("Input Values");
        Radius = new JTextField("Radius");
        EnterValues = new JButton("Enter");
        JPanel j = new JPanel();
        j.add(Description);
        j.add(Radius);
        j.add(EnterValues);
        j.setBackground(Color.WHITE);
        C.add(j);
        C.setSize(300, 300);
        C.show();
    }
}
