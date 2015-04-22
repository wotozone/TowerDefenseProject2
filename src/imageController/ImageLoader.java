/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageController;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

/**
 *
 * @author Tae
 */
public class ImageLoader{
    
    //FRAMES&BACKGROUNDS
    //public final BufferedImage BACKGROUND;
    //public final BufferedImage OUTSIDE_FRAME;
    
    //INTERFACES
    //public final BufferedImage GAME_OVER;
    
    //PATH
    public final BufferedImage PATH_LU;
    public final BufferedImage PATH_LD;
    public final BufferedImage PATH_RU;
    public final BufferedImage PATH_RD;
    public final BufferedImage PATH_HZ1;
    public final BufferedImage PATH_HZ2;
    public final BufferedImage PATH_HZ3;
    public final BufferedImage PATH_VT1;
    public final BufferedImage PATH_VT2;
    public final BufferedImage PATH_VT3;
    
    //DOODAD&GRASS
    public final BufferedImage GRASS1;
    public final BufferedImage DOODAD_STONE1_PART1;
    public final BufferedImage DOODAD_STONE1_PART2;
    
    
    public ImageLoader() throws Exception{
        //FRAMES
        //BACKGROUND = ImageIO.read(new FileInputStream("Images/BACKGROUND.jpg"));
        //OUTSIDE_FRAME = ImageIO.read(new FileInputStream("Images/OUTSIDEFRAME.jpg"));
        
        //PATH
        PATH_LU= ImageIO.read(new FileInputStream("Resources/Path_Left_Up.png"));
        PATH_LD= ImageIO.read(new FileInputStream("Resources/Path_Left_Down.png"));
        PATH_RU= ImageIO.read(new FileInputStream("Resources/Path_Right_Up.png"));
        PATH_RD= ImageIO.read(new FileInputStream("Resources/Path_Right_Down.png"));
        PATH_HZ1= ImageIO.read(new FileInputStream("Resources/Path_Horizontal1.png"));
        PATH_HZ2= ImageIO.read(new FileInputStream("Resources/Path_Horizontal2.png"));
        PATH_HZ3= ImageIO.read(new FileInputStream("Resources/Path_Horizontal3.png"));
        PATH_VT1= ImageIO.read(new FileInputStream("Resources/Path_Vertical1.png"));
        PATH_VT2= ImageIO.read(new FileInputStream("Resources/Path_Vertical2.png"));
        PATH_VT3= ImageIO.read(new FileInputStream("Resources/Path_Vertical3.png"));
        
        //DOODAD & GRASS
        GRASS1= ImageIO.read(new FileInputStream("Resources/Grass1.png"));
        DOODAD_STONE1_PART1= ImageIO.read(new FileInputStream("Resources/Doodad_Stone1_Part1.png"));
        DOODAD_STONE1_PART2= ImageIO.read(new FileInputStream("Resources/Doodad_Stone1_Part2.png"));
        
        //UNITS
        
        //INTERFACES
        
        /*
        */
    }
    
}
