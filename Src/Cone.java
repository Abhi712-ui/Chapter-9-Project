package Src;
public class Cone extends Shape {
    public Cone(int Height, int Radius){
        super(Height, Radius);
        Volume = Math.PI * (Radius * Radius) * (Height/3);
        SurfaceArea = Math.PI * Radius * (Radius + (Math.sqrt((Height * Height) + (Radius * Radius))));
    }
    public String toString(){
        return("\nHeight: " + Height + "\nRadius: " + Radius +  "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
    
}
