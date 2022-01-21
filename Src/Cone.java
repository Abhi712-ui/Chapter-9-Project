package Src;

import java.util.Scanner;

public class Cone extends Shape {
    public Cone(int Height, int Radius){
        super(Height, Radius);
        Volume = Math.PI * (Radius * Radius) * (Height/3);
        SurfaceArea = Math.PI * Radius * (Radius + (Math.sqrt((Height * Height) + (Radius * Radius))));
    }
    public String toString(){
        return("\nHeight: " + Height + "\nRadius: " + Radius +  "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
    
    public static int[] create(){
        Scanner x = new Scanner(System.in);
        String ValueDeclarations[] = {"Height:", "Radius:"};
        int[] values = new int[2];
        
        for(int i = 0; i <= 1; i++){
            System.out.println(ValueDeclarations[i]);
            values[i] = x.nextInt();
        }
        System.out.println(values.toString());
        return values;
    }
    
}
