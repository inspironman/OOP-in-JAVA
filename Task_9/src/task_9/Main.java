/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_9;

/**
 *
 * @author Deepak
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        ShapeArray sa = new ShapeArray();
        try {
             sa.read("E:\\PT_NB\\Task_9\\src\\task_9\\test5.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(-1);
        } catch (InvalidInputException ex) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }
        sa.report();
    }
}


