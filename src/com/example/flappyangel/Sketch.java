package com.example.flappyangel;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Sketch extends PApplet {
    float xpos = 200f;
    float ypos = 50f;
    float vy = 0f;
    float gravity = 0.98f;

    public void settings() { size(800, 600); }
    public void setup(){
        smooth();
        noStroke();
    }

    public void draw() {
        background(0);
        fill(255);
        rect(xpos, ypos, 40, 40);
        vy += gravity;
        ypos += vy;
    }
}
