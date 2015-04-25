/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitController;

/**
 *
 * @author TaeYoun Kim
 */

//USE "OBJECT ARRAY" TO USE THIS STRUCTURE//

public class EnemyData {
    
    private int maxHp=0;// Maximum hp of an object; it must has to be declared first.
    private int shieldHp=0;//special hp
    private int currentHp=0;// hp that object currently have
    private int unitType=0; // 0=ground, 1=air
    private int unitGold=0;
    private int unitSpeed=0;
    
    private String enemyName=null;
    
    public static EnemyData[] enemy = new EnemyData[EnemyController.MAX_ENEMY];
    
    public void initEnemy(int hp, int maxhp, int shieldhp, int type, int gold, int speed){//when an enemy has shield
        initializer(hp,maxhp,shieldhp,type,gold,speed);
    }
    public void initEnemy(int hp, int maxhp, int type, int gold, int speed){// when hp and maxhp are different
        initializer(hp,maxhp,0,type,gold,speed);
    }
    public void initEnemy(int hp, int type, int gold, int speed){//when hp = maxhp
        initializer(hp,hp,0,type,gold,speed);
    }
    
    private void initializer(int hp, int maxhp, int shieldhp, int type, int gold, int speed){
        initHp(maxhp);
        setHp(hp);
        if(shieldhp>0)healHp(true,shieldhp);
        setType(type);
        setReward(gold);
        setSpeed(speed);
    }
    
    public void setHp(int value){//use to init. object's max. hp
        if(value==0){
            if(maxHp==0)initHp(1);//this avoids that developer declares object's hp as zero.
            return;
        }
        if(maxHp!=0){ //avoid bugs when developer delcares setHp once more
            if(value>=maxHp){ //when increasing max. value
                maxHp=value;
            }else{//when decreasing max. value
                if(value<=currentHp){//when current hp is higher than new max. hp
                    initHp(value);//set both max. and current hp as new value.
                }else{//current hp is lower than
                    maxHp=value;
                }
            }
        }else{
            initHp(value);//first time to declare its value
        }
    }
    
    public void initHp(int value){//child method of setHp
        maxHp=value;
        currentHp=value;
    }
    
    public void dmgHp(int dmg){//when unit gets dmg.
        if(isDead(dmg)==false){
            if(dmg>=shieldHp){
                dmg-=shieldHp;
                shieldHp=0;
                currentHp-=dmg;
            }else{
                shieldHp-=dmg;
            }
        }else{
            //Dead //need method for dying event; might be in a child class
        }
    }
    
    public void healHp(boolean shield, int value){//to heal or shield an object
        if(shield==true){
            shieldHp+=value;
        }else{
            if((value+currentHp)>=maxHp){
                currentHp=maxHp;
            }else{
                currentHp+=value;
            }
        }
    }
    
    public void setType(int type){//set type of unit
        unitType=type;
    }
    
    public void setSpeed(int speed){
        unitSpeed=speed;
    }
    
    public void setReward(int value){//set its reward gold
        unitGold=value;
    }
    
    public boolean isDead(int dmg){//to check unit is dying or not
        boolean dead=false;
        if(dmg>=(currentHp+shieldHp))dead=true;
        return dead;
    }
    
    public void clearData(){
    maxHp=0;
    shieldHp=0;
    currentHp=0;
    unitType=0;
    unitGold=0;
    unitSpeed=0;
    }
    
    //-----------------------------------------------------------------------------//
    // methods for getting information
    
    
    public int getHp(){
        return currentHp;
    }
    
    public int getMaxHp(){
        return maxHp;
    }
    
    public int getShieldHp(){
        return shieldHp;
    }
    
    public int getReward(){
        return unitGold;
    }
    
    public int getUnitType(){// 0-ground 1-air
        return unitType;
    }
    
    public int getUnitSpeed(){
        return unitSpeed;
    }
    
}
