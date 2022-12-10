/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task_9;

/**
 *
 * @author Deepak
 */
public abstract class Shape {
    private Coordinate c;
    private double len_or_rad;

    public Shape(Coordinate c, double len_or_rad) {
        this.c = c;
        this.len_or_rad = len_or_rad;
    }

    public Coordinate getC() {
        return c;
    }

    public void setC(Coordinate c) {
        this.c = c;
    }

    public double getLen_or_rad() {
        return len_or_rad;
    }

    public void setLen_or_rad(double len_or_rad) {
        this.len_or_rad = len_or_rad;
    }

    public double area_perimeter_difference()
    {
        double a = 0;
        return a;
    }

}
