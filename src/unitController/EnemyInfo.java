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
                output.initEnemy(10, 0, 30, 20);//(HP,TYPE,GOLD,SPEED)
                break;
            case 2:
                output.initEnemy(30, 0, 50, 30);
                break;
            case 4:
                output.initEnemy(70, 0, 70, 30);
                break;
            case 5:
                output.initEnemy(100, 0, 90, 30);
                break;
            case 6:
                output.initEnemy(200, 0, 110, 15);
                break;
            case 7:
                output.initEnemy(150, 0, 140, 40);
                break;
            case 8:
                output.initEnemy(200, 0, 170, 40);
                break;
            case 9:
                output.initEnemy(100, 0, 200, 80);
                break;
            case 10:
                output.initEnemy(300, 0, 240, 40);
                break;
            case 11:
                output.initEnemy(400, 0, 280, 40);
                break;
            case 12:
                output.initEnemy(600, 0, 320, 30);
                break;
            case 13:
                output.initEnemy(600, 0, 360, 40);
                break;
            case 14:
                output.initEnemy(1000, 0, 400, 20);
                break;
        }
        return output;
    }
    
    public int getEnemyAmount(int level){
        int amount=30;
        switch(level){
            case 9:
                amount=20;
                break;
        }
        return amount;
    }
    
    private void resetOutput(){
        output.clearData();
    }
    
}
