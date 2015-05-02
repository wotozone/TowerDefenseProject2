/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapInfo;

import imageController.ImageManager;
import java.awt.image.BufferedImage;
import mainFrame.MainPanel;
import pathController.PathController;

/**
 *
 * @author Tae
 */
public class BasicMap extends MapInfo{
    
    protected int startX = 1;
    protected int startY = 0;
    protected int endX = 31;
    protected int endY = 15;
    
    public BasicMap() throws Exception{
        super.imageManager = new ImageManager();
        super.startX=this.startX;
        super.startY=this.startY;
        super.endX=this.endX;
        super.endY=this.endY;
        super.initInfo();
    }
    
    @Override
    protected void pathInfo(){
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
    
}
