/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Ajay Kumar Reddy Arram
 */
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 2 by Ajay Kumar Reddy Arram"); 
        GeometricObject[] GeoArr = new GeometricObject[5];
        GeometricObject go1 = new Square(true, 3.5);
        GeometricObject go2 = new Square(false, 2.0);
        GeometricObject go3 = new Square(true, 2.5);
        GeometricObject go4 = new Square(false, 3.0);
        GeometricObject go5 = new Square(true, 4.0);
        GeoArr[0] = go1;
        GeoArr[1] = go2;
        GeoArr[2] = go3;
        GeoArr[3] = go4;
        GeoArr[4] = go5;

        for (GeometricObject obj : GeoArr) {
            Square s = (Square) (obj);
            if (s.isColorable()) {
                s.howToColor();
            } 
            else {
                System.out.println("This square is not colorable");
                 }
            System.out.println("The Area of square is "
                    + Math.round(s.calculateArea() * 100) / 100.0);
            System.out.println("****************************");
        }

    }

}
