package Src;

import static Interface.UI.display;

public class Test {
    public static void main(String[] args){
        int[] Conevalues = Cone.create();
        Cone ConeSample = new Cone(Conevalues[0], Conevalues[1]);
        display(ConeSample.toString());

    }
}
