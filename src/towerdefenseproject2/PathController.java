/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseproject2;

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
        9 - pathway where enemy moves
    */
    
    
    
        public static PathController[][] path = new PathController[32][17];
    
    public void setTileType(int type){
        switch(type){
            case 0:
                setTileEmpty();
            case 1:
                pathStatus=1;
            case 2:
                pathStatus=2;
            case 9:
                setTilePathway();
        }
    }
    
    public void setTileEmpty(){
        pathStatus=0;
    }
    
    public void setTilePathway(){
        pathStatus=9;
    }
    
    public void setTileImage(BufferedImage bi){
        pathImage=bi;
    }
    
    public BufferedImage getTileImage(){
        return pathImage;
    }
    
}
