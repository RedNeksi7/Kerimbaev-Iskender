package kg.geeks.game.players;

import java.util.Random;

public class Kamikadze extends Hero{

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random=new Random();
        if (random.nextBoolean()){
            this.setDamage(this.getHealth()/2);
            System.out.println("KamikadzeDead dealt more damage!");

        }
    }
    public Kamikadze(int health, int damage, String name) {
        super(health, damage, SuperAbility.KAMIDZE, name);
    }
}
