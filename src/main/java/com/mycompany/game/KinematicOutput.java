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
public class KinematicOutput {
    private Vector2D linear;
    private double angular;

    public KinematicOutput() {
    }

    public KinematicOutput(Vector2D linear, double angular) {
        this.linear = linear;
        this.angular = angular;
    }

    public Vector2D getLinear() {
        return linear;
    }

    public void setLinear(Vector2D linear) {
        this.linear = linear;
    }

    public double getAngular() {
        return angular;
    }

    public void setAngular(double angular) {
        this.angular = angular;
    }
    
}
