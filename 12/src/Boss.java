public class Boss extends GameEntity{
    private Weapon weapon;
    public Boss(){
        super();
    }
    public Boss(int health, int damage, Weapon weapon, String ability) {
        super();
        setHealth(health);
        setDamage(damage);
        setAbility(ability);
        this.weapon = weapon;
    }
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Boss health: "+ getHealth()+", damage: "+ getDamage() + ", ability: "+getAbility()+
                ", weapon type: "+getWeapon().getType()+", weapon name: " + getWeapon().getName()+ ".";
    }
}
