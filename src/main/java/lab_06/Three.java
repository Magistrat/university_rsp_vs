package lab_06;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Three {
    public static void main(String[] args) {

        // 3. Известны катеты прямоугольного треугольника, найти его площадь и периметр.

        double legOneOfTriangle = 3;
        double legTwoOfTriangle = 4;

        double hypotenuseOfTriangle;
        hypotenuseOfTriangle = sqrt(pow(legOneOfTriangle, 2) + pow(legTwoOfTriangle, 2));
        System.out.println("Гипотенуза треугольника: " + hypotenuseOfTriangle);

        double perimeterOfTriangle = legOneOfTriangle + legTwoOfTriangle + hypotenuseOfTriangle;
        System.out.println("Периметр треугольника: " + perimeterOfTriangle);


        double squareOfTriangle;
        squareOfTriangle = (0.5) * legOneOfTriangle * legTwoOfTriangle;
        System.out.println("Площадь треугольника: " + squareOfTriangle);
    }
}
