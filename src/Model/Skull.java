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
public class Skull extends Element implements Serializable{
    private int iContaIntervalos;
    
    public Skull(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransposable = true;
        this.iContaIntervalos = 0;
    }

    public void autoDraw() {
        super.autoDraw();

        this.iContaIntervalos++;
        if(this.iContaIntervalos == 6){
            this.iContaIntervalos = 0;
            Fire f = new Fire("fire.png");
            f.setPosition(pPosition.getLine(), pPosition.getColumn()+1);
            Draw.getGameScreen().addElement(f);
        }
    }    
}
