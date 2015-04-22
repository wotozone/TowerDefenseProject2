/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenseproject2;

/**
 *
 * @author Tae
 */
public class GameStart {
    
    public static void main(String[] args) {
        Thread t = new Thread(new MainPanel());
        t.start();
    }
}
