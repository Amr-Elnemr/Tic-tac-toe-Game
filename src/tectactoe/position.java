/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tectactoe;

/**
 *
 * @author assem
 */
public class position {
    public int x , y;
    
    public position(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "[" + x + "," + y + "]";
    }
    
    public int[] posArray(){
        int[] newPos = new int [2];
        newPos[0] = x;
        newPos[1] = y;
        return newPos;
    }
}
