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
    private boolean seperated=false;
    
    private int x;
    private int y;
    
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
        return tempImg;
    }
    
    public TowerData getTowerData(int towerID,PathController path){
        output=new TowerData();
        resetOutput(output);
        getTowerStat(towerID);
        getTowerImage(towerID,false);
        getTowerPosition(path);
        return output;
    }
    
    private void getTowerImage(int towerID, boolean temp){
        TowerData td=output;
        if(temp)td=tempImg;
        if(seperated){
            td.setTowerImage(im.getTowerImage(towerID, false), im.getTowerImage(towerID, true), im.getMissileImage(towerID), false);
        }else{
            td.setTowerImage(im.getTowerImage(towerID), im.getMissileImage(towerID));
        }
    }
    
    private void getTowerStat(int towerID){
        switch(towerID){
            case 1:
                output.initTowerData(2, 125, 50, 3, getTowerPrice(1));//(damage,range.atkspeed,missilespeed,price)
                x=0;
                y=0;
                seperated=false;
                break;
        }
    }
    
    public int getTowerPrice(int towerID){
        switch(towerID){
            case 1:
                return 100;
            default:
                return 10;
        }
    }
    
    private void getTowerPosition(PathController path){
        output.setTowerPosition(path,x,y);
    }
    
    private void resetOutput(TowerData td){
        td.clearData();
    }
}
