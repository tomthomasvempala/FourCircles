package org.example;

import processing.core.PApplet;

public class FourCirclesProcedural extends PApplet {
    public static final int  WIDTH= 1080;
    public static final int HEIGHT = 720;

    public static final int RADIUS = 75;

    float x_coordinate = 0;

    public static void main(String[] args) {
            PApplet.main("org.example.FourCirclesProcedural",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup(){
        super.setup();
        System.out.println("Setup");
    }

    @Override
    public void draw(){
        ellipse(x_coordinate, (float) HEIGHT /5, RADIUS, RADIUS);
        ellipse(x_coordinate*2, (float) 2*HEIGHT /5, RADIUS, RADIUS);
        ellipse(x_coordinate*3, (float) 3*HEIGHT /5, RADIUS, RADIUS);
        ellipse(x_coordinate*4, (float) 4*HEIGHT /5, RADIUS, RADIUS);
        x_coordinate+=2;
    }
}