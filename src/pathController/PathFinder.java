/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathController;

import mainFrame.MainPanel;


/**
 *
 * @author Tae
 */
public class PathFinder {
    
    public static PathFinder pf = new PathFinder();
    
    public PathFinder(){
    }
    
    public static final int WINDOW_WIDTH=1280;
    public static final int WINDOW_HEIGHT=960;
    
    //size of tile
    public static final int TILE_WIDTH=40;
    public static final int TILE_HEIGHT=40;
    public static final int BLOCKSIZE=40;
    
    //# of tiles
    public static final int TILE_MAX_X_NUM=32;
    public static final int TILE_MAX_Y_NUM=17;
    
    private PathController findPath(int x, int y){
        if(x<0  ||  x>1280  ||  y<10  || y>690)return null;
        int tileX = x/MainPanel.TILE_WIDTH;
        int tileY = y/MainPanel.TILE_HEIGHT;
        return PathController.path[tileX][tileY];
    }
    
}
