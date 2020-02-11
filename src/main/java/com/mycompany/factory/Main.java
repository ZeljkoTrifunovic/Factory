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
        fiat.setModel("Fiat Punto");
        fiat.setBuildYear = 2020;
        fiat.color = "blac";
        fiat.consumption = 6;
        fiat.setMaxFuel = 45;
        fiat.maxSpeed = 180;
        
        
        fiat.showDate();
        
        
        
        Car ford = Car();
      //  ford.model = "Ford Fiesta";
        ford.setModel("Ford Fiesta");
        ford.buildYear = 2015;
        
        ford.showDate();
        
        
        
    }
    
}
