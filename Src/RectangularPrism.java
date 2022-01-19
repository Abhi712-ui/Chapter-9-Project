package Src;
public class RectangularPrism extends Shape {
        public RectangularPrism(int Height, int Width, int Depth){
            super(Height, Width, Depth);
            Volume = Width * Height * Depth;
            SurfaceArea = (2 * Width * Height) + (2 * Depth * Height) + (2 * Width * Depth);
    }
    public String toString(){
        return("\nHeight: " + Height + "\nWidth: " + Width + "\nDepth: " + Depth + "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
    
}
