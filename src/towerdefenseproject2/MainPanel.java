/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseproject2;

import imageController.ImageManager;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import mapInfo.*;

/**
 *
 * @author Tae
 */
public class MainPanel extends JFrame implements Runnable{
 
    public ImageManager imageManager;
    public FPSChecker fps;
    public BasicMap map;
    
    //size of window
    public static final int WINDOW_WIDTH=1280;
    public static final int WINDOW_HEIGHT=960;
    
    //size of tile
    public static final int TILE_WIDTH=40;
    public static final int TILE_HEIGHT=40;
    
    //# of tiles
    public static final int TILE_MAX_X_NUM=32;
    public static final int TILE_MAX_Y_NUM=17;
    
    private BufferedImage bi = null;

    private boolean left = false, right = false, down = false;
    
    private int moveDelay;
    private int dropDelay;
    
    private boolean start = false, end = false;


  public MainPanel() {
  
    bi = new BufferedImage(WINDOW_WIDTH, WINDOW_HEIGHT, BufferedImage.TYPE_INT_RGB);

    //this.addKeyListener(this);
    this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
    this.setTitle("121321");
    this.setResizable(false);  
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);  
    this.setLocationRelativeTo(null);
    this.addKeyListener(new KeyHandler());
    
    start=true;
    end=false;
    
    
    fps = new FPSChecker();
    try {
        imageManager = new ImageManager();
        map = new BasicMap();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
 }

 public void run() {

    try {

        
        moveDelay = 0;
        dropDelay = 0;

        while(true) {

            Thread.sleep(1);//optimizing fps

            if(start) {
                if(moveDelay>=100){//move per 0.1sec
                    //keyControl();
                }else{
                    moveDelay+=1;
                }
            }
            draw();
        }  
        }catch(Exception e){
            e.printStackTrace(); 
    } 
}


    public void draw() {

        Graphics gs = bi.getGraphics();
        //gs.drawImage(imageManager.getBackgroundImage(), 0, 0, this);

        //Main gamePanel
        gs.setColor(Color.BLACK);
        gs.fillRect(0, 0, 1280, 960);
        int size=40;
        gs.setColor(Color.WHITE);
        gs.fillRect(0, 50, 1280, 680);
        for(int i=0;i<32;i++){
            for(int k=0;k<17;k++){
                gs.setColor(Color.cyan);
                gs.drawRect(size*i,10+size*(1+k),size-1,size-1);
                gs.drawImage(PathController.path[i][k].getTileImage(), size*i, size*k, this);
            }
        }
        
        //Set Pathway

        
        //When Game has ended
        if(end){
            //gs.setColor(Color.WHITE);
            //gs.drawString("GAME OVER", 25+(35*4), 75+(35*10));//Show GAME OVER
            //gs.drawImage(imageManager.getGameOverImage(), 25, 425, this);
        }
        
        fps.checkFrame();
        fps.setFrame();
        gs.drawString("FPS: "+fps.getFramePerSecond(), 10, 40);//Show Frame Per Second
        
        Graphics ge = this.getGraphics();

        ge.drawImage(bi, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
    }
/*
    public void keyControl() {
        if(left){
        }else if(right){
        }else if(down){
        }
    }

    public void keyPressed(KeyEvent ke) {
        switch(ke.getKeyCode()){
            case KeyEvent.VK_LEFT:  
                left = true;       
                break;
            case KeyEvent.VK_RIGHT: 
                right = true;      
                break;
            case KeyEvent.VK_UP:   
                break;
            case KeyEvent.VK_DOWN:   
                down = true;      
                break;
            case KeyEvent.VK_SPACE:
            } 
   }

    public void keyReleased(KeyEvent ke){
    switch(ke.getKeyCode()) 
        {
            case KeyEvent.VK_LEFT: 
                left = false;  
                break;
            case KeyEvent.VK_RIGHT: 
                right = false; 
                break;
            case KeyEvent.VK_DOWN:
                down = false;  
                break;
        } 
    } 

    public void keyTyped(KeyEvent ke) {

    }
    */
}
