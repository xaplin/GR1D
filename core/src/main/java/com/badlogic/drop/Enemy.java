/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.badlogic.drop;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Tower superclass that creates a layout used for all tower units.
 * @author jacob
 */
public class Enemy {
    
    int health;
    float speed; //Maybe int? Could call it velocity and make it a vector
    Vector2 velocity;
    
    Vector2 location;
    Vector2 currentTile;
    
    float percentage; // percentage along track
    
    // Default Textures and Sprites
    Texture defaultEnemyTexture;
    Sprite defaultEnemySprite;
    
    
    /**
         * Constructor for the tower superclass, setting default values.
         * @author tdewe
         */
    public Enemy() {
        
        //Setting textures and sprites
        //defaultEnemyTexture = new Texture("whatever.png");
        defaultEnemySprite = new Sprite(defaultEnemyTexture);
        
        //Setting default values for variables
        health = 0;
        speed = 0;
        
        location = new Vector2();
        velocity = new Vector2();
        
    }
    
    // Update Enemy velocity by mulitplying new Velocity by speed
    public void ChangeVelocity(Vector2 newVelocity) {
        velocity.x = speed * newVelocity.x;
        velocity.y = speed * newVelocity.y;
        
    }
    
    /**
     * Subtracts specified damage from health
     * @param damage as int damage taken
     */
    public void TakeDamage(int damage) {
        health -= damage;
        
    }
    
    /**
     * Gets percentage along track
     *
     * @return percentage as a float.
     */
    public float GetPercentage() {
        return percentage;
    }
    
    /**
     * Gets current location
     *
     * @return location as a Vector2.
     */
    public Vector2 GetLocation() {
        return location;
    }
    
    /**
     * Gets current tile that enemy is on
     *
     * @return current tile as a Vector2.
     */
    public Vector2 GetCurrentTile() {
        return currentTile;
    }
    
    
}
