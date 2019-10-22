/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.game;

/**
 *
 * @author hodachung
 */
public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public Vector2D mul(double cons){
        this.x *= cons;
        this.y *= cons;
        
        return this;
    }
    
    public Vector2D mul(Vector2D oldVector, double cons){
       Vector2D newVector = new Vector2D();
       
       newVector.setX(oldVector.getX()*cons);
       newVector.setY(oldVector.getY()*cons);
       
       return newVector;
     
    }
    
    public static Vector2D asVector2D(double angle){
        return new Vector2D(Math.sin(angle), Math.cos(angle));
    }
    
    
    
}
