package Src;

import java.util.Scanner;

public class TriangularPrism extends Shape {
    public TriangularPrism(int Height, int Width, int Depth, int DiagonalOne, int DiagonalTwo){
        super(Height, Width, Depth, DiagonalOne, DiagonalTwo);
        Volume = ((Height * Width)/2) * Depth;
        SurfaceArea = (Height * Width) + (Depth * Width) + (DiagonalOne * Depth) + (DiagonalTwo * Depth);
    }

    public String toString(){
        return("\nHeight: " + Height + "\nDepth: " + Depth + "\nWidth: " + Width + "\nDiagonalOne: " + DiagonalOne + "\nDiagonalTwo: " + DiagonalTwo + "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }

    public static int[] create(){
        Scanner x = new Scanner(System.in);
        String ValueDeclarations[] = {"Height:", "Width:", "Depth:", "First Diagonal:", "Second Diagonal:"};
        int[] values = new int[5];
        
        for(int i = 0; i <= 4; i++){
            System.out.println(ValueDeclarations[i]);
            values[i] = x.nextInt();
        }
        System.out.println(values.toString());
        return values;
    }
}
