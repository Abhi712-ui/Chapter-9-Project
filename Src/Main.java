package Src;
import java.util.Scanner;

import Interface.*;
import Src.TypesOfShapes;
public class Main {
    public static void main(String[] args){
        Scanner z = new Scanner(System.in);
        System.out.println("Choose a shape");
        String b = z.nextLine();
        String c = b.toUpperCase();
        String d = c.trim();
        UI.choose("CONE");
    }
    public static void Opening(){

    }
}
