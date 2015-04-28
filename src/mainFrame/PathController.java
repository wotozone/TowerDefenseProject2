/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainFrame;

import java.awt.image.BufferedImage;

/**
 *
 * @author minjikim
 */
public class PathController {
    
    //Path Image
    private BufferedImage pathImage = null;
    
    
    private int pathStatus=0;
    /*
        PathStatus:
        0 - empty
        1 - tower
        2 - doodad
        3
        ...
        10 - pathway
        11~14 - pathway where enemy moves
    */
    
    private int pathDir=0;
    /*
        Direction(clockwise)
        1 - Up
        2 - Right
        3 - Down
        4 - Left
    */
    private int positionX=0;
    private int positionY=0;
    
    public static PathController[][] path = new PathController[32][17];
    
    public void setTileType(int type){
        switch(type){
            case 0:
                setTileEmpty();
            case 1:
                pathStatus=1;
            case 2:
                pathStatus=2;
            case 11:
                setTilePathway(1);
            case 12:
                setTilePathway(2);
            case 13:
                setTilePathway(3);
            case 14:
                setTilePathway(4);
        }
    }
    
    public void setTilePosition(int x, int y){
        positionX=x;
        positionY=y;
    }
    
    public void setTileEmpty(){
        pathStatus=0;
    }
    
    public void setTilePathway(int dir){
        pathStatus=10;
        pathDir=dir;
    }
    
    public void setTileImage(BufferedImage bi){
            System.out.println("sfd");
        pathImage=bi;
    }
    
    public BufferedImage getTileImage(){
        return pathImage;
    }
    
    public int getPositionX(){
        return positionX;
    }
    
    public int getPositionY(){
        return positionY;
    }
    
    public int getPathDir(){
        return pathDir;
    }
    
}
