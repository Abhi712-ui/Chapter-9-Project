package Src;

import java.util.Scanner;

public class Sphere extends Shape {
    public Sphere(int radius){
        super(radius);
        Volume = (4/3) * Math.PI * (radius * radius * radius);
        SurfaceArea = 4 * Math.PI * (radius * radius);
    }

    public String toString(){
        return("\nRadius: " + Radius +  "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }

    public static int[] create(){
        Scanner x = new Scanner(System.in);
        String ValueDeclarations[] = {"Radius:"};
        int[] values = new int[1];
        
        for(int i = 0; i <= 0; i++){
            System.out.println(ValueDeclarations[i]);
            values[i] = x.nextInt();
        }
        System.out.println(values.toString());
        return values;
    }
}
