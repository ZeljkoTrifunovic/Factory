
package com.mycompany.factory;

/**
 *
 * @author qa
 */
public class Car {
    private final String vehicleType = "car";
   
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    private String getVehicleType;
    int setBuildYear;
    
    public Car() {
    
    this.model = "";
    this.buildYear = 0;
    this.color = "";
    this.maxFuel = 0;
    this.currentFuel = 0;
    this.consumption = 0;
    
    
    }
    
    public String getModel () {
    
     return this.model;
     
    }
    
    public  void setModel(String customModel) {
    
    this.color = customModel;
    }
    
    public int getBuildYear() {
    return this.buildYear;
    
    }
    
    public void setBuildYear(int customBuildYear) {
    
        this.buildYear = customBuildYear;
    
    }
    
    public int getMaxSpeed(){
    return this.maxSpeed;
    }
    
    public void setMaxSpeed(int customMaxSpeed) {
     
    this.maxSpeed = customMaxSpeed;
    }
    
   public String getColor () {
    
     return this.color;
     
    }
    
    public  void setColor(String customColor) {
    
    this.model = customColor;
    }
           
    
    
    
    public void showDate() {
    
    System.out.println("Model: " + this.model);
    System.out.println("Godina proizvodnje: " + this.buildYear);
    System.out.println("Boja: " + this.color);
    }
    
    public String getVehicleType(){
    
    return this.getVehicleType;
    
    }
    
    
     public void showData() {
    System.out.println("Model: " + this.getModel());
    System.out.println("Godina proizvodnje: " + this.getBuildYear());
    System.out.println("Boja: " + this.getColor());
    
    }
    
    
    
    
}
