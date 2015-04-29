/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitController;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Tae
 */
public class EnemyController {
    
    //public static final int MAX_ENEMY=300;
    
    public EnemyInfo info = new EnemyInfo();
    
    public ArrayList<EnemyData> spawnQueue = new ArrayList<EnemyData>();
    
    public EnemyData enemyData = null;
    
    public int enemyLevel = 0;//Enemy level starts as 1
    public int enemyAmount = 10;//How many enemy will be loaded
    
    
    public EnemyController(){
    }
    
    public void getNextLevelEnemy(){
        enemyLevel++;
        summonEnemyInField();
    }
    
    private void summonEnemyInField(){
        for(int i=0;i<enemyAmount;i++){
            enemyData= info.getEnemyData(enemyLevel);
            spawnQueue.add(enemyData);
            System.out.println(enemyData.hashCode());
        }
    }
    
    private void setEnemyLevel(int lv){//Use only for test or unfindable bugs
        enemyLevel=lv;
    }
    
}
