package org.example;

import processing.core.PApplet;

public class MyCircle {
    public float x;
    public float y;
    public float radius;
    public float speed;
    public PApplet pAppletInstance;

    public MyCircle(PApplet pAppletInstance,int initialX,int constantY, float radius, float speed){
        this.x = initialX;
        this.y = constantY;
        this.radius = radius;
        this.speed = speed;
        this.pAppletInstance = pAppletInstance;
    }

    public void drawMyCircle(){
        pAppletInstance.ellipse(x,y,radius,radius);
        push_coordinate();
    }

    private void push_coordinate(){
        this.x += speed;
    }
}
