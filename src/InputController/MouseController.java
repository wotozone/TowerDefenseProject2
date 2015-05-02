/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputController;

/**
 *
 * @author Tae
 */
public class MouseController {
    
    private boolean isBuilding = false;
    
    private int towerID;
    
    private int x;
    private int y;
    
    public static MouseController mc = new MouseController();
    
    public void MouseClicked(int x, int y){
        this.x=x;
        this.y=y;
        switch(getClickedArea()){
            case 0:
                break;
            case 1:
                if(isBuilding)buildTower();
                break;
            case 2:
                selectTower();
                break;
        }
    }
    
    private void selectTower(){
        isBuilding=true;
        towerID = getTowerType();
    }
    
    private void buildTower(){
        get
    }
    
    private int getTowerType(){
        if(x<480){
            if(y<860){
                return 1;
            }else{
                return 2;
            }
        }else if(x<580){
            if(y<860){
                return 3;
            }else{
                return 4;
            }
        }else if(x<680){
            if(y<860){
                return 5;
            }else{
                return 6;
            }
        }else if(x<780){
            if(y<860){
                return 7;
            }else{
                return 8;
            }
        }else if(x<880){
            if(y<860){
                return 9;
            }else{
                return 10;
            }
        }else if(x<980){
            if(y<860){
                return 11;
            }else{
                return 12;
            }
        }else if(x<1080){
            if(y<860){
                return 13;
            }else{
                return 14;
            }
        }else if(x<1180){
            if(y<860){
                return 15;
            }else{
                return 16;
            }
        }
    }
    
    private int getClickedArea(){
        if(y<50){//noti-bar do nothing
            return 0;
        }else if(y<730){//play-area
            return 1;
        }else if(y>760){//info
            if(x<480){//info area do nothing
                return 0;
            }else{//build tower
                return 2;
            }
        }
        //gs.fillRect(0, 50, 1280, 680);//play area
        //gs.fillRect(0, 730, 480, 230);//info area
    }
    
}
