/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.badlogic.drop;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 *
 * @author tdewe
 */
public class Minigun extends Tower{
    /**
     * Minigun class is a tower subclass that creates and manages minigun units
     * @author tdewe
     */
    Texture minigunTexture;
    Sprite minigunSprite;
    
    public Minigun() {
        /**
         * Minigun() is the constructor for the Minigun class
         * @author tdewe
         */
        minigunTexture = new Texture("minigun.png");
        minigunSprite = new Sprite(minigunTexture);
    }
}
