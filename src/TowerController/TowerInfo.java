/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TowerController;

import imageController.ImageManager;
import pathController.PathController;

/**
 *
 * @author Tae
 */
public class TowerInfo {
    
    public static TowerInfo info = new TowerInfo();
    private ImageManager im;
    
    private TowerData output;
    
    public TowerData tempImg=new TowerData();
    
    public TowerInfo(){
        initImageManager();
    }
    
    private void initImageManager(){
        try {
            im = new ImageManager();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public TowerData getTempTowerImg(int towerID){//DO NOT TOUCH THIS PART. IT IS NOT WORKING
        resetOutput(tempImg);
        getTowerImage(towerID,true);
    }
    
    public TowerData getTowerData(int towerID,PathController path){
        output=new TowerData();
        resetOutput(output);
        getTowerStat(towerID);
        getTowerImage(towerID,false);
        getTowerPosition(path);
    }
    
    private void getTowerImage(int towerID, boolean temp){
        TowerData td=output;
        if(temp)td=tempImg;
        td.setTowerImage(im.getTowerImage(towerID, false), im.getTowerImage(towerID, true), im.getMissileImage(towerID), false);
    }
    
    private void getTowerStat(int towerID){
        switch(towerID){
            case 1:
                output.initTowerData(5, 500, 500, 1);
        }
    }
    
    private void getTowerPosition(PathController path){
        output.setTowerPosition(path);
    }
    
    private void resetOutput(TowerData td){
        td.clearData();
    }
}
