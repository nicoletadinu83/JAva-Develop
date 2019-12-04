package ex3_Game;

public class NonPlayerCharacter extends Personaj {


    public NonPlayerCharacter(int viata, int putereDeAtac) {
        super(viata, putereDeAtac);
    }

    public int decressLife() {
        System.out.println("O sa te atac");
         int attack=getViata()-getPutereDeAtac();
        return attack;
    }


}
