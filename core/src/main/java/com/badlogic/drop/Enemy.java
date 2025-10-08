/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.badlogic.drop;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author tdewe
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
    
    // Subtract Damage from Health
    public void TakeDamage(int damage) {
        health -= damage;
        
    }
    
    // Return Percentage
    public float GetPercentage() {
        return percentage;
    }
    
     // Return Location
    public Vector2 GetLocation() {
        return location;
    }
    
    // Return Current Tile
    public Vector2 GetCurrentTile() {
        return currentTile;
    }
    
    
}
