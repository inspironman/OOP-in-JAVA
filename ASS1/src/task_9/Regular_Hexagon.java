/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_9;

/**
 *
 * @author Deepak
 */
public class Regular_Hexagon extends Shape{
    public Regular_Hexagon(Coordinate c, double len_or_rad)
    {
        super(c,len_or_rad);
    }

    @Override
    public double area_perimeter_difference()
    {
        double difference = (((3*(Math.sqrt(3))/2.00))*getLen_or_rad()*getLen_or_rad() - 6.00*getLen_or_rad());
        return difference;
    }



}