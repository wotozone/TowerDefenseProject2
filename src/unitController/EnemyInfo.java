/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitController;

/**
 *
 * @author minjikim
 */
public class EnemyInfo {
    
    public static EnemyInfo info = new EnemyInfo();
    
    public EnemyData output = new EnemyData();
    
    public EnemyInfo(){
        
    }
    
    public EnemyData GetEnemyData(int level){
        resetOutput();
        switch(level){
            case 1:
                EnemyLv1();
                break;
        }
        return output;
    }
    
    private void resetOutput(){
        output.clearData();
    }
    
    private EnemyData EnemyLv1(){
        output.initEnemy(10, 0, 30);
        return output;
    }
}
