package Model;
/**
 * @author Richard Calderan - 3672382
 * @author Leticia Burla - 10294950
 */

import Auxiliar.Consts;
import Auxiliar.Draw;

public class BombFire extends Element{
    private int iCountTempo;

    public BombFire(String sNomeImagePNG) {
        super(sNomeImagePNG);
        bMortal=true;
        iCountTempo=0;
    }

    @Override
    public void autoDraw() {
        super.autoDraw();
        iCountTempo++;
        if(iCountTempo >= Consts.TIMER){
            this.setbKill(true);
            //Draw.getGameScreen().removeElement(this);
        }

    }
}
