package com.DesignPatterns.ar.Bridge1;

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
       this.drawAPI = drawAPI;
    }
    public abstract void draw();  
 }