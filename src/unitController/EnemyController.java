/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitController;

/**
 *
 * @author Tae
 */
public class EnemyController {
    
    //public static final int MAX_ENEMY=300;
    
    public EnemyInfo info = new EnemyInfo();
    
    public EnemyData enemyData = null;
    
    public int enemyLevel = 0;//Enemy level starts as 1
    public int enemyAmount = 0;//How many enemy will be loaded
    
    public EnemyController(){
    }
    
    private void getNextLevelEnemy(){
        enemyLevel++;
        enemyData= info.getEnemyData(enemyLevel);
        summonEnemyInField();
    }
    
    private void summonEnemyInField(){
        for(int i=0;i<enemyAmount;i++){
            EnemyData.enemy.add(enemyData);
        }
    }
    
    private void setEnemyLevel(int lv){//Use only for test or unfindable bugs
        enemyLevel=lv;
    }
    
}
