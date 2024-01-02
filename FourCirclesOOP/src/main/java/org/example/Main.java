package org.example;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Main extends PApplet{
    public static final int  WIDTH= 1080;
    public static final int HEIGHT = 720;
    public static final int RADIUS = 75;
    public static List<MyCircle> circles = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("org.example.Main",args);
    }

    public Main(){
        circles.add(new MyCircle(this,0, HEIGHT/5, RADIUS, 2));
        circles.add(new MyCircle(this,0, 2*HEIGHT/5, RADIUS, 4));
        circles.add(new MyCircle(this,0, 3*HEIGHT/5, RADIUS, 6));
        circles.add(new MyCircle(this,0, 4*HEIGHT/5, RADIUS, 8));
    }

    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    public void draw(){
        for(MyCircle circle: circles){
            circle.drawMyCircle();
        }
    }
}