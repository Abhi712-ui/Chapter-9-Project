package Interface.Inputs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TriangularPrismInput extends JFrame{
    static JFrame C;
    static JTextField Height;
    static JTextField Width;
    static JTextField Depth;
    static JTextField DiagonalOne;
    static JTextField DiagonalTwo;
    static JButton EnterValues;
    static JLabel Description;

    public static void TriangularPrismPage(){
        C = new JFrame("Triangular Prism");
        Description = new JLabel("Input Values");
        Height = new JTextField("Height");
        Width = new JTextField("Width");
        Depth = new JTextField("Depth");
        DiagonalOne = new JTextField("Diagonal One");
        DiagonalTwo = new JTextField("Diagonal Two");
        EnterValues = new JButton("Enter");
        JPanel j = new JPanel();
        j.add(Description);
        j.add(Height);
        j.add(Width);
        j.add(Depth);
        j.add(DiagonalOne);
        j.add(DiagonalTwo);
        j.add(EnterValues);
        j.setBackground(Color.WHITE);
        C.add(j);
        C.setSize(300, 300);
        C.show();
    }
}
