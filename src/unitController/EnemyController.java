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
    
    public static final int MAX_ENEMY=300;
    
    public EnemyInfo info = new EnemyInfo();
    
    public EnemyData enemyData = null;
    
    public int enemyLevel = 0;//Enemy level starts as 1
    public int enemyAmount = 0;//How many enemy will be loaded
    
    public EnemyController(){
        initEnemyData();
    }
    
    private void initEnemyData(){
        for(int i=0;i<MAX_ENEMY;i++){
            EnemyData.enemy[i] = new EnemyData();
        }
    }
    
    private void getNextLevelEnemy(){
        enemyLevel++;
        enemyData= info.GetEnemyData(enemyLevel);
        
    }
    
    private void loadEnemyInField(){
        if(enemyAmount>MAX_ENEMY)enemyAmount=MAX_ENEMY;
        for(int i=0;i<enemyAmount;i++){
            EnemyData.enemy[i]=enemyData;
        }
    }
    
    private void setEnemyLevel(int lv){//Use only for test or unfindable bugs
        enemyLevel=lv;
    }
    
}
