package Src;
import java.util.Scanner;

public class Shape implements ShapeInterface {
   protected double Volume;
   protected double SurfaceArea;
   protected int Height;
   protected int Width;
   protected int Depth;
   protected int Radius;
   protected double radius;
   protected int DiagonalOne;
   protected int DiagonalTwo;
   

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
   public int GetRadius(){
       return this.Radius;
   }
   public int GetDiagonalOne(){
       return this.DiagonalOne;
   }
   public int GetDiagonalTwo(){
       return this.DiagonalTwo;
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

   public Shape(int Width){
       this.Width = Width;
   }

   public Shape(double radius){
       this.radius = radius;
   }

   public Shape(int Height, int Width, int Depth, int DiagonalOne, int DiagonalTwo){
       this.Height = Height;
       this.Width = Width;
       this.Depth = Depth;
       this.DiagonalOne = DiagonalOne;
       this.DiagonalTwo = DiagonalTwo;
   }

   
  
}
