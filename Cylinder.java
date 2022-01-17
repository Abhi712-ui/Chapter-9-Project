public class Cylinder extends Shape {
    public Cylinder(int Height, int Radius){
        super(Height, Radius);
        Volume = Math.PI * (Radius * Radius) *Height;
        SurfaceArea = (2 * Math.PI * Radius * Height) + (2 * Math.PI * (Radius * Radius));
    }

    public String toString(){
        return("\nHeight: " + Height + "\nRadius: " + Radius +  "\nVolume: " + Volume + "\nSurface Area: " + SurfaceArea);
    }
    
}
