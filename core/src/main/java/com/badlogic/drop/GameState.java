/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.badlogic.drop;
//import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author jacob
 */
public class GameState {
    
    Tower[][] grid = new Tower[3][3];
    
    int currentRound;
    int money;
    
    public GameState() {
        // TODO implement GameState constructor
        
    }
    
    // increase the currrent round to the next
    public void NextRound() {
        // TODO implement NextRound method
    }
    
   
    /*
    BuyTower will see if spot on grid is available
    If yes, then place tower in grid
    Then subtract Tower price from money
    */
    public void BuyTower(Tower newTower, int x, int y) {
        // TODO implement BuyTower method
    }
    
    // return tower at specific location
    public Tower GetTower(int x, int y) {
        // TODO implement GetTower method
    }

    // return currentRound
    public int GetCurrentRound() {
        // TODO implement GetCurrentRound method
    }
    
    // return money
    public int GetMoney() {
        // TODO implement GetMoney method
    }
    
}
