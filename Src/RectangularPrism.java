package Src;

import java.util.Scanner;

public class RectangularPrism extends Shape {
        public RectangularPrism(int Height, int Width, int Depth){
            super(Height, Width, Depth);
            Volume = Width * Height * Depth;
            SurfaceArea = (2 * Width * Height) + (2 * Depth * Height) + (2 * Width * Depth);
    }
    public String toString(){
        return("\nHeight: " + Height + "\nWidth: " + Width + "\nDepth: " + Depth + "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }

    public static int[] create(){
        Scanner x = new Scanner(System.in);
        String ValueDeclarations[] = {"Height:", "Width:", "Depth:"};
        int[] values = new int[3];
        
        for(int i = 0; i <= 2; i++){
            System.out.println(ValueDeclarations[i]);
            values[i] = x.nextInt();
        }
        System.out.println(values.toString());
        return values;
    }
    
}
