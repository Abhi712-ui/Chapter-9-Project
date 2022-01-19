package Interface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UI extends JFrame {
    static JFrame f;
    static JButton Cone, Cube, Cylinder, RectangularPrism, Sphere, TriangularPrism;
    static JLabel l;

    public static void main(String[] args){
        f = new JFrame("panel");
        l = new JLabel("Shape Volume and Surface Area Calculator");
        Cone = new JButton("Cone");
        Cube = new JButton("Cube");
        Cylinder = new JButton("Cylinder");
        RectangularPrism = new JButton("Rectangular Prism");
        Sphere = new JButton("Sphere");
        TriangularPrism = new JButton("Triangular Prism");
        JPanel p = new JPanel();
        p.add(Cone);
        p.add(Cube);
        p.add(Cylinder);
        p.add(RectangularPrism);
        p.add(Sphere);
        p.add(TriangularPrism);
        p.add(l);
        p.setBackground(Color.LIGHT_GRAY);
        f.add(p);
        f.setSize(300, 300);
        f.show();
    }
}


