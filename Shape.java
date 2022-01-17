import java.util.Scanner;

public class Shape implements ShapeInterface {
   protected double Volume;
   protected double SurfaceArea;
   protected int Height;
   protected int Width;
   protected int Depth;
   protected int Radius;
   private int Diameter;

   public Shape(double Volume, int SurfaceArea, int Height, int Width, int Depth){
       this.Volume = Volume;
       this.SurfaceArea = SurfaceArea;
       this.Height = Height;
       this.Width = Width;
       this.Depth = Depth;
   }

   public double GetVolume(){
       return this.Volume;
   }
   public double GetSurfaceArea(){
       return this.SurfaceArea;
   }
   public int GetHeight(){
       return this.Height;
   }
   public int GetWidth(){
       return this.Width;
   }
   public int GetDepth(){
       return this.Depth;
   }

   public Shape(int Height, int Width, int Depth){
       this.Height = Height;
       this.Width = Width;
       this.Depth = Depth;
   }

   public Shape(int Height, int Radius){
       this.Height = Height;
       this.Radius = Radius;
   }
}
