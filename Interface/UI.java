package Interface;
import Interface.DrawingPanel;
import java.awt.*;
import java.util.Scanner;

import Src.Cone;
import Src.Cube;
import Src.Cylinder;
import Src.RectangularPrism;
import Src.Sphere;
import Src.TriangularPrism;
import Src.TypesOfShapes;

public class UI {
    public static void display(String Solution){
        DrawingPanel a = new DrawingPanel(500, 500);
        Graphics B = a.getGraphics();
        B.setColor(Color.LIGHT_GRAY);
        a.setBackground(Color.BLACK);
        B.drawString(Solution, 50, 50);
    }

    public static void choose(String a){
        TypesOfShapes shape = TypesOfShapes.valueOf(a);
        switch (shape){
            case CONE:  a.equals("CONE");
                     int[] Conevalues = Cone.create();
                     Cone ConeSample = new Cone(Conevalues[0], Conevalues[1]);
                     display(ConeSample.toString());
                     break;
            case CUBE:  a = TypesOfShapes.CUBE.toString();
                     int[] Cubevalues = Cube.create();
                     Cube CubeSample = new Cube(Cubevalues[0]);
                     display(CubeSample.toString());
                     break;
            case CYLINDER:  a = TypesOfShapes.CYLINDER.toString();
                     int[] CylinderValues = Cylinder.create();
                     Cylinder CylinderSample = new Cylinder(CylinderValues[0], CylinderValues[1]);
                     display(CylinderSample.toString());
                     break;
            case RECTANGULARPRISM:  a = TypesOfShapes.RECTANGULARPRISM.toString();
                     int[] RectangularPrismValues = RectangularPrism.create();
                     RectangularPrism RectangularPrismSample = new RectangularPrism(RectangularPrismValues[0], RectangularPrismValues[1], RectangularPrismValues[2]);
                     display(RectangularPrismSample.toString());
                     break;
            case SPHERE:  a = TypesOfShapes.SPHERE.toString();
                     int[] SphereValues = Sphere.create();
                     Sphere SphereSample = new Sphere(SphereValues[0]);
                     display(SphereSample.toString());
                     break;
            case TRIANGULARPRISM:  a = TypesOfShapes.TRIANGULARPRISM.toString();
                     int[] TriangularPrismValues = TriangularPrism.create();
                     TriangularPrism TriangularPrismSample = new TriangularPrism(TriangularPrismValues[0], TriangularPrismValues[1], TriangularPrismValues[2], 
                     TriangularPrismValues[3], TriangularPrismValues[4]);
                     display(TriangularPrismSample.toString());
                     break;
            default:
            System.out.println("Invalid values, please provide an available shape");
            break;
        }
    }
}


