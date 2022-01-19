package Interface.Inputs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CubeInput extends JFrame {
    static JFrame C;
    static JTextField Width;
    static JButton EnterValues;
    static JLabel Description;

    public static void CubePage(){
        C = new JFrame("Cube");
        Description = new JLabel("Input Values");
        Width = new JTextField("Width");
        EnterValues = new JButton("Enter");
        JPanel j = new JPanel();
        j.add(Description);
        j.add(EnterValues);
        j.add(Width);
        j.setBackground(Color.WHITE);
        C.add(j);
        C.setSize(300, 300);
        C.show();
    }
}
