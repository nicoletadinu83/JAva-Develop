package ex3_Game;

public class Hero extends Personaj {


    public Hero(int viata, int putereDeAtac) {
        super(viata, putereDeAtac);
    }

    public int decressLife() {
        return getViata()-getPutereDeAtac();

    }



}
