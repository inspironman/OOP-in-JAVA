/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_9;

/**
 *
 * @author Deepak
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;

public class ShapeArray {
    private  final Map<String, Double> shapes;
    public ShapeArray() {
        shapes =  new HashMap<String, Double>();
    }

    public static String toString(Shape s,String name)
    {
        return  "\n"+"Coordinates are ("+s.getC().x +""+"  "+s.getC().y+") "+" Radius or Length = "+s.getLen_or_rad()+" and Shape is "+name+" with Area and Perimeter difference ";
    }

    public void read(String filename) throws FileNotFoundException, InvalidInputException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
        int num = sc.nextInt();
        while (num > 0) {
            char shp = sc.next().charAt(0);
            switch (shp) {
                case 'C':
                    double cir_x = sc.nextDouble();
                    double cir_y = sc.nextDouble();
                    Coordinate center_cir = new Coordinate(cir_x, cir_y);
                    double rad = sc.nextDouble();
                    Circle circle = new Circle(center_cir, rad);
                    double circle_difference = Math.abs(circle.area_perimeter_difference());
                    shapes.put(toString(circle,"Circle"),circle_difference);
                    break;
                case 'T':
                    double tri_x = sc.nextDouble();
                    double tri_y = sc.nextDouble();
                    Coordinate center_tri = new Coordinate(tri_x, tri_y);
                    double len_tri = sc.nextDouble();
                    Regular_Triangle triangle = new Regular_Triangle(center_tri, len_tri);
                    double triangle_difference = Math.abs(triangle.area_perimeter_difference());
                    shapes.put(toString(triangle,"Triangle"),triangle_difference);
                    break;
                case 'S':
                    double sq_x = sc.nextDouble();
                    double sq_y = sc.nextDouble();
                    Coordinate center_sq = new Coordinate(sq_x, sq_y);
                    double len_sq = sc.nextDouble();
                    Square square = new Square(center_sq, len_sq);
                    double square_difference = Math.abs(square.area_perimeter_difference());
                    shapes.put(toString(square,"Square"),square_difference);
                    break;
                case 'H':
                    double hex_x = sc.nextDouble();
                    double hex_y = sc.nextDouble();
                    Coordinate center_hex = new Coordinate(hex_x, hex_y);
                    double len_hex = sc.nextDouble();
                    Regular_Hexagon hexagon = new Regular_Hexagon(center_hex, len_hex);
                    double hexagon_difference = Math.abs(hexagon.area_perimeter_difference());
                    shapes.put(toString(hexagon,"Hexagon"),hexagon_difference);
                    break;
                default:
                    throw new InvalidInputException();

            }
            num--;
        }

    }
    public void report() {
        System.out.println(Arrays.asList(shapes));
        System.out.println("\n");
        Double min_diff = Collections.min(shapes.values());
        for (Map.Entry<String, Double> entry : shapes.entrySet()
        ) {
            if (entry.getValue() == min_diff) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }

}
