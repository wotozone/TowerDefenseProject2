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
    
    public EnemyController(){
        initEnemyData();
    }
    
    private void initEnemyData(){
        for(int i=0;i<MAX_ENEMY;i++){
            EnemyData.enemy[i] = new EnemyData();
        }
    }
    
}
