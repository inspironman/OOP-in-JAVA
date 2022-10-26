/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_9;

/**
 *
 * @author Deepak
 */
public class Regular_Triangle extends Shape {

    public Regular_Triangle(Coordinate c, double len_or_rad)
    {
        super(c,len_or_rad);
    }

    @Override
    public double area_perimeter_difference()
    {
        double difference = (((Math.sqrt(3))/4.00)*getLen_or_rad()*getLen_or_rad() - 3.00*getLen_or_rad());
        return difference;
    }
}