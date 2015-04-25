/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapInfo;

import mainFrame.PathController;

/**
 *
 * @author minjikim
 */
public class MapManager{
    
    public static MapManager map = new MapManager();
    
    public PathController startPath=null;
    public PathController endPath=null;
    
    public void setMapType(int type) throws Exception{
        MapInfo currentMap;
        switch(type){
            default:
                currentMap = new BasicMap();
        }
        startPath=currentMap.getStartPoint();
        endPath=currentMap.getEndPoint();
    }
    
    
}
