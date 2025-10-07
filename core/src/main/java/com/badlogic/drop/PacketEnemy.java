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
public class PacketEnemy extends Enemy {
    
    Texture packetTexture;
    Sprite packetSprite;
    
    public PacketEnemy() {
        //Packet texturing and sprite
        packetTexture = new Texture("packet.png");
        packetSprite = new Sprite(packetTexture);
        
        // Variables for default packet stats placeholders for now
        health = 100.0f;
        speed = 0;
    }
}
