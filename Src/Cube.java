package Src;

import java.util.Scanner;

public class Cube extends Shape{
    public Cube(int Width){
        super(Width);
        Volume = Width * Width * Width;
        SurfaceArea = 6 * Width * Width;
    }
    public String toString(){
        return("\nWidth: " + Width + "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }

    public static int[] create(){
        Scanner x = new Scanner(System.in);
        String ValueDeclarations[] = {"Width:"};
        int[] values = new int[1];
        
        for(int i = 0; i <= 0; i++){
            System.out.println(ValueDeclarations[i]);
            values[i] = x.nextInt();
        }
        System.out.println(values.toString());
        return values;
    }
}
