package lab6ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> circlesList = new ArrayList<>(); //<Shape> shapeList
        circlesList.add(new Circle(2));
        //shapesList.add(new Rectangle(1, 3));//
        circlesList.add(new Circle(1));

        double totalArea = 0;
        for (Circle circle : circlesList) {
            totalArea += circle.getArea();
        }

        System.out.println("Total Area of Circles: " + totalArea);
    }
}


/*
 * 
 * double totalArea = computeTotalArea(shapesList);
        System.out.println("Total Area: " + totalArea);
    }

    public static double computeTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
        
        metoda computeTotalArea
 */

/*
 * 
 * Investigate how to approach this in a language without using pointers.
 * ? se refera la accesul datelor din clase? java are deja referinte. poate se refera la range based for
 * am inlocuit while-ul precedent cu un for
 * urmeaza principiul ocd 
 * se pot adauga si alte forme fara sa modific codul
Refactor Exemplul 2. 3 Sum the areas of various shapes in such a way that a method should compute the
areas sum.


Folosim o listă special pentru cercuri în loc de <Shape>

(for (Circle circle : circlesList)) ne permite să accesăm fiecare cerc direct fara pointeri.
 */



/*
*/