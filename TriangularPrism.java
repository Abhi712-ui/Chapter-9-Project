public class TriangularPrism extends Shape {
    public TriangularPrism(int Height, int Width, int Depth, int DiagonalOne, int DiagonalTwo){
        super(Height, Width, Depth, DiagonalOne, DiagonalTwo);
        Volume = ((Height * Width)/2) * Depth;
        SurfaceArea = (Height * Width) + (Depth * Width) + (DiagonalOne * Depth) + (DiagonalTwo * Depth);
    }

    public String toString(){
        return("\nHeight: " + Height + "\nDepth: " + Depth + "\nWidth: " + Width + "\nDiagonalOne: " + DiagonalOne + "\nDiagonalTwo: " + DiagonalTwo + "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
}
