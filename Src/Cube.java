package Src;
public class Cube extends Shape{
    public Cube(int Width){
        super(Width);
        Volume = Width * Width * Width;
        SurfaceArea = 6 * Width * Width;
    }
    public String toString(){
        return("\nWidth: " + Width + "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
}
