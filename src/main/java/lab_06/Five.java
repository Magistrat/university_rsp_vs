package lab_06;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Five {
    public static void main(String[] args){

        // 5. Даны радиус вращения и высота конуса, вычислить объем конуса.

        double radiusOfCone = 8;
        double heightOfCone = 14;

        double volumeOfCone;

        volumeOfCone = (1.0 / 3.0) * PI * pow(radiusOfCone, 2) * heightOfCone;

        System.out.println("Объем конуса: " + volumeOfCone);
        System.out.println("Объем конуса (округленное значение): " + round(volumeOfCone));
    }
}
