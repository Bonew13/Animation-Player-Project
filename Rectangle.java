

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minaawad
 */
public class Rectangle extends Shape{
    
    int length;
    int width;

    Rectangle(int length, int width, int x, int y, int border) {
        
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColour(int r, int g, int b){
        this.colour = new Color(r,g,b);
    }

    public void setBorderColor(int r, int g, int b) {
        this.borderColor = new Color(r,g,b);
    }

    public void setBorderthickness(double borderthickness) {
        this.borderthickness = borderthickness;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    Rectangle()
    {
        
    }
    public void Rectangle()
    {
        
    }
}
