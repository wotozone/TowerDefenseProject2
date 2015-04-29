/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TowerController;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import mainFrame.PathController;

/**
 *
 * @author Tae
 */
public class TowerData {
    
    public int damage=1;
    public int range=1;
    public int splash=0;//Splash is initially unlocked. Do not set splash value if tower attacks only one target
    public int attackSpeed=1000;// attack per 1 sec (ex. 2000=attack per 2sec)
    public int missileSpeed=1;//move 100 pixel per sec
    public String specialSkill="normal";
    
    public boolean homing = true;//Tower fires homing missile initially.
    
    public BufferedImage towerBody;
    public BufferedImage towerHead;
    public BufferedImage towerMissile;
    
    public int towerAngle;//the angle where the tower looks at
    public int particleX;//its all for dummy
    public int particleY;
    public int positionX;
    public int positionY;
    public PathController position;
    
    public static ArrayList<TowerData> tower = new ArrayList<TowerData>();
    
    public void setAttackDamage(int value){
        damage = value;
    }
    
    public void setAttackRange(int value){
        range = value;
    }
    
    public void setAttackSplash(int value){
        splash = value;
    }
    
    public void setAttackSpeed(int value){
        attackSpeed=value;
    }
    
    public void setMissileSpeed(int value){
        missileSpeed=value;
    }
    
    
    
}
