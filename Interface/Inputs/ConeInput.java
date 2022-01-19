package Interface.Inputs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ConeInput extends JFrame{
    static JFrame C;
    static JTextField Height;
    static JTextField Radius;
    static JButton EnterValues;
    static JLabel Description;

    public static void ConePage(){
        C = new JFrame("Cone");
        Description = new JLabel("Input Values");
        Height = new JTextField("Height");
        Radius = new JTextField("Radius");
        EnterValues = new JButton("Enter");
        JPanel j = new JPanel();
        j.add(Description);
        j.add(Height);
        j.add(Radius);
        j.add(EnterValues);
        j.setBackground(Color.WHITE);
        C.add(j);
        C.setSize(300, 300);
        C.show();
}


}
