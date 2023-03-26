package kg.geeks.game.players;

import java.util.Random;

public class TrickyBastard extends Hero{
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random=new Random();
        if (random.nextBoolean()){
            this.setHealth(boss.getDamage()+this.getHealth());
            boss.setHealth(boss.getHealth()+this.getDamage());
        }
    }
    public TrickyBastard(int health, int damage,String name) {
        super(health, damage, SuperAbility.TRICKY_BASTARD, name);
    }
}
