/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Pocetak");
        
        String mesage = "Ovo je poruka";
        
        Car fiat = new Car();
        fiat.model = "Punto";
        fiat.buildYear = 2020;
        fiat.color = "blac";
        fiat.consumption = 6;
        fiat.maxFuel = 45;
        fiat.maxSpeed = 180;
        
        System.out.println("Model: " + fiat.model);
        
        
        
    }
    
}
