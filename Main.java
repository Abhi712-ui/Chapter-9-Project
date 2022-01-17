public class Main {
    public static void main(String[] args){
        RectangularPrism Test = new RectangularPrism(5, 6, 7);
        System.out.println(Test.toString());
        System.out.println(Test.GetVolume());
        Cylinder Sample = new Cylinder(5, 5);
        System.out.println(Sample.toString());
        System.out.println(Sample.GetVolume());
    }
}
