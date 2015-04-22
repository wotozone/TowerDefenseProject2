/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapInfo;

import imageController.ImageManager;
import java.awt.image.BufferedImage;
import towerdefenseproject2.MainPanel;
import towerdefenseproject2.PathController;

/**
 *
 * @author Tae
 */
public class BasicMap {
    
    private ImageManager imageManager;
    
    private PathController startPoint;
    private PathController endPoint;
    
    public BasicMap() throws Exception{
        imageManager = new ImageManager();
        initInfo();
    }
    
    
    private void initInfo(){
        startPoint=PathController.path[1][0];
        endPoint=PathController.path[31][15];
        mapInfo();
    }
    
    private PathController getStartPoint(){
        return startPoint;
    }
    
    private void mapInfo(){
        //Fill grass first
        
        for(int i=0;i<MainPanel.TILE_MAX_X_NUM;i++){
            for(int k=0;k<MainPanel.TILE_MAX_Y_NUM;k++){
                setTileTexture(i, k, 0, getPathImg("GR1"));
            }
        }
        //Path
        setPath(1,0,getPathImg("VT1"),3);
        setPath(1,1,getPathImg("VT1"),3);
        setPath(1,2,getPathImg("VT1"),3);
        setPath(1,3,getPathImg("VT1"),3);
        setPath(1,4,getPathImg("VT1"),3);
        setPath(1,5,getPathImg("VT1"),3);
        setPath(1,6,getPathImg("VT1"),3);
        setPath(1,7,getPathImg("LD"),2);
        setPath(2,7,getPathImg("HZ1"),2);
        setPath(3,7,getPathImg("HZ1"),2);
        setPath(4,7,getPathImg("HZ1"),2);
        setPath(5,7,getPathImg("HZ1"),2);
        setPath(6,7,getPathImg("HZ1"),2);
        setPath(7,7,getPathImg("HZ1"),2);
        setPath(8,7,getPathImg("HZ1"),2);
        setPath(9,7,getPathImg("HZ1"),2);
        setPath(10,7,getPathImg("RU"),3);
        setPath(10,8,getPathImg("VT1"),3);
        setPath(10,9,getPathImg("VT1"),3);
        setPath(10,10,getPathImg("VT1"),3);
        setPath(10,11,getPathImg("VT1"),3);
        setPath(10,12,getPathImg("LD"),2);
        setPath(11,12,getPathImg("HZ1"),2);
        setPath(12,12,getPathImg("HZ1"),2);
        setPath(13,12,getPathImg("HZ1"),2);
        setPath(14,12,getPathImg("HZ1"),2);
        setPath(15,12,getPathImg("HZ1"),2);
        setPath(16,12,getPathImg("HZ1"),2);
        setPath(17,12,getPathImg("HZ1"),2);
        setPath(18,12,getPathImg("HZ1"),2);
        setPath(19,12,getPathImg("HZ1"),2);
        setPath(20,12,getPathImg("HZ1"),2);
        setPath(21,12,getPathImg("HZ1"),2);
        setPath(22,12,getPathImg("HZ1"),2);
        setPath(23,12,getPathImg("HZ1"),2);
        setPath(24,12,getPathImg("HZ1"),2);
        setPath(25,12,getPathImg("HZ1"),2);
        setPath(26,12,getPathImg("HZ1"),2);
        setPath(27,12,getPathImg("HZ1"),2);
        setPath(28,12,getPathImg("HZ1"),2);
        setPath(29,12,getPathImg("HZ1"),2);
        setPath(30,12,getPathImg("RU"),3);
        setPath(30,13,getPathImg("VT1"),3);
        setPath(30,14,getPathImg("VT1"),3);
        setPath(30,15,getPathImg("LD"),2);
        setPath(31,15,getPathImg("HZ1"),2);
        
        //Doodad
        setTileTexture(30, 0, 2, getPathImg("DD1_P1"));
        setTileTexture(30, 1, 2, getPathImg("DD1_P2"));
        setTileTexture(3, 15, 2, getPathImg("DD1_P1"));
        setTileTexture(3, 16, 2, getPathImg("DD1_P2"));
        setTileTexture(10, 3, 2, getPathImg("DD1_P1"));
        setTileTexture(10, 4, 2, getPathImg("DD1_P2"));
        
        
    }
    
    private BufferedImage getPathImg(String str){
        return imageManager.getPathImage(str);
    }
    
    private void setPath(int x, int y, BufferedImage bi, int pathDir){
            System.out.println("sfd");
        PathController.path[x][y].setTilePathway(pathDir);
        PathController.path[x][y].setTileImage(bi);
    }
    
    private void setTileTexture(int x,int y, int type, BufferedImage bi){
        PathController.path[x][y].setTileType(type);
        PathController.path[x][y].setTileImage(bi);
    }
    
}
