package Interface.Inputs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RectangularPrismInput extends JFrame{
    static JFrame C;
    static JTextField Height;
    static JTextField Width;
    static JTextField Depth;
    static JButton EnterValues;
    static JLabel Description;

    public static void RectangularPrismPage(){
        C = new JFrame("Rectangular Prism");
        Description = new JLabel("Input Values");
        Height = new JTextField("Height");
        Width = new JTextField("Width");
        Depth = new JTextField("Depth");
        EnterValues = new JButton("Enter");
        JPanel j = new JPanel();
        j.add(Description);
        j.add(Height);
        j.add(Width);
        j.add(Depth);
        j.add(EnterValues);
        j.setBackground(Color.WHITE);
        C.add(j);
        C.setSize(300, 300);
        C.show();
    }
}
