/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageController;

import java.awt.image.BufferedImage;

/**
 *
 * @author Tae
 */
public class ImageManager{
    
    public ImageLoader imageLoader;
    
    public ImageManager() throws Exception{
        imageLoader=new ImageLoader();
    }
    
    public BufferedImage getPathImage(String path){
        if(path=="LU"){
            System.out.println("sfd");
            return imageLoader.PATH_LU;
        }else if(path=="LD"){
            return imageLoader.PATH_LD;
        }else if(path=="RU"){
            return imageLoader.PATH_RU;
        }else if(path=="RD"){
            return imageLoader.PATH_RD;
        }else if(path=="HZ1"){
            return imageLoader.PATH_HZ1;
        }else if(path=="HZ2"){
            return imageLoader.PATH_HZ2;
        }else if(path=="HZ3"){
            return imageLoader.PATH_HZ3;
        }else if(path=="VT1"){
            System.out.println("1111");
            return imageLoader.PATH_VT1;
        }else if(path=="VT2"){
            return imageLoader.PATH_VT2;
        }else if(path=="VT3"){
            return imageLoader.PATH_VT3;
        }else if(path=="GR1"){
            return imageLoader.GRASS1;
        }else if(path=="DD1_P1"){
            return imageLoader.DOODAD_STONE1_PART1;
        }else if(path=="DD1_P2"){
            return imageLoader.DOODAD_STONE1_PART2;
        }
        System.out.println("No matched image");
        return null;
    }
    
    /*
    public BufferedImage getBlockColorImage(int value){
        switch(value){
            case(0):return imageLoader.SKY_BLOCK;
            case(1):return imageLoader.BLUE_BLOCK;
            case(2):return imageLoader.ORANGE_BLOCK;
            case(3):return imageLoader.GREEN_BLOCK;
            case(4):return imageLoader.RED_BLOCK;
            case(5):return imageLoader.YELLOW_BLOCK;
            case(6):return imageLoader.PURPLE_BLOCK;
            case(7):return imageLoader.EMPTY_BLOCK;
        }
        return imageLoader.EMPTY_BLOCK;
    }
    
    public BufferedImage getBackgroundImage(){
        return imageLoader.BACKGROUND;
    }
    
    public BufferedImage getOutsideFrame(){
        return imageLoader.OUTSIDE_FRAME;
    }
    
    public BufferedImage getGameOverImage(){
        return imageLoader.GAME_OVER;
    }
    */
    
}
