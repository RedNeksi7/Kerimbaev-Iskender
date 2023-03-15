public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossAbility;
    /*===============================================*/

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setBossAbility(String bossAbility) {
        this.bossAbility = bossAbility;
    }
    /*===============================================*/
    public int getBossHealth() {
        return bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public String getBossAbility() {
        return bossAbility;
    }
    /*===============================================*/
}
