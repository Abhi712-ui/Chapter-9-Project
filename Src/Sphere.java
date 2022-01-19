package Src;
public class Sphere extends Shape {
    public Sphere(int radius){
        super(radius);
        Volume = (4/3) * Math.PI * (radius * radius * radius);
        SurfaceArea = 4 * Math.PI * (radius * radius);
    }

    public String toString(){
        return("\nRadius: " + Radius +  "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
}
