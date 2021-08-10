/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.points;

/**
 *
 * @author EDISSON
 */
public class Points {

//Estas variables son variables de instancia.

//Estas variables están en una clase y no están dentro de ninguna fun int mathsPoints;

int engPoints;

int mathsPoints;

int phyPoints;
}
class PointsDemo
{
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        //Primer Objeto
        Points obj1 = new Points();
        
        obj1.engPoints = 50;

        obj1.mathsPoints = 80;
        
        obj1.phyPoints = 90;

        //Segundo Objeto
        
        Points obj2= new Points();

        obj2.engPoints = 80;

        obj2.mathsPoints = 60;

        obj2.phyPoints = 85;
        
        //Mostrando puntos para el primer objeto
        
        System.out.println("Puntos para el primer objeto: ");
        
        System.out.println(obj1.engPoints);
        
        System.out.println(obj1.mathsPoints);

        System.out.println(obj1.phyPoints);
        
        //mostrando puntos para el segundo objeto
        
        System.out.println("Puntos para el segundo objeto: ");

        System.out.println(obj2.engPoints);

        System.out.println(obj2.mathsPoints);

        System.out.println(obj2.phyPoints);

    }
    
}

