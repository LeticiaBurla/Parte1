/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Auxiliar.Draw;

import java.io.Serializable;

/**
 * @author Richard Calderan - 3672382
 * @author Leticia Burla - 10294950
 */
public class Fire extends Element implements Serializable{
            
    public Fire(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bMortal = true;
    }

    @Override
    public void autoDraw() {
        super.autoDraw();
        if(!this.moveRight())
            Draw.getGameScreen().removeElement(this);
    }
    
}
