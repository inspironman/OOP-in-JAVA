/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_9;

/**
 *
 * @author Deepak
 */
public class Circle extends Shape{
    public Circle(Coordinate c, double len_or_rad)
    {
        super(c,len_or_rad);
    }

    @Override
    public double area_perimeter_difference()
    {
        double difference = (Math.PI*getLen_or_rad()*getLen_or_rad() - Math.PI*2*getLen_or_rad());
        return difference;
    }
}
