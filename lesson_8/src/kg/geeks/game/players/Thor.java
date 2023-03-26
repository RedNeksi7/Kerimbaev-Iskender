package kg.geeks.game.players;

import java.util.Random;

public class Thor extends Hero{

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random=new Random();
        if (random.nextBoolean()){
            for (int i = 0; i < heroes.length; i++) {
                heroes[i].setHealth(heroes[i].getHealth()+ boss.getDamage());
                System.out.println("Thor stunned boss!");
                break;
            }
        }
    }
    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.THOR, name);
    }
}
