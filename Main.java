import java.util.Random;

public class Main {
    public static int bossHealth = 1500;
    public static int bossDamage = 50;
    public static String bossDefence;
    public static int medicHeal=200;
    public static int[] heroesHealth = {270, 260, 250, 500, 1000, 265, 390, 300};
    public static int[] heroesDamage = {30, 35, 20, 0, 10, 25, 30,25};
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Medic", "Golem","Lucky", "Berserk", "Thor"};
    public static int roundNumber = 0;
    public static String message = "";

    public static void main(String[] args) {
        printStatistics();
        while (!isGameFinished()) {
            playRound();
            medic();
        }
    }

    public static void playRound() {
        roundNumber++;
        message = "";
        chooseBossDefence();
        bossHits();
        heroesHit();
        golem();
        lucky();
        berserk();
        thor();
        printStatistics();
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length); // 0,1,2
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void bossHits() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                if (heroesHealth[i] - bossDamage < 0) {
                    heroesHealth[i] = 0;
                } else {
                    heroesHealth[i] = heroesHealth[i] - bossDamage;
                }
            }
        }
    }

    public static void heroesHit() {
        for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                int damage = heroesDamage[i];
                if (heroesAttackType[i] == bossDefence) {
                    Random random = new Random();
                    int coefficient = random.nextInt(9) + 2; // 2,3,4,5,6,7,8,9,10;
                    damage = damage * coefficient;
                    message = "Critical damage: " + damage;
                }
                if (bossHealth - damage < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - damage;
                }
            }
        }
    }

    public static boolean isGameFinished() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        /*if (heroesHealth[0] <= 0 && heroesHealth[1] <= 0 && heroesHealth[2] <= 0) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;*/
        boolean allHeroesDead = true;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    public static void printStatistics() {
        System.out.println("ROUND " + roundNumber + " ----------");
        /*String defence;
        if (bossDefence == null) {
            defence = "No defence";
        } else {
            defence = bossDefence;
        }*/
        System.out.println("Boss health: " + bossHealth + " damage: " + bossDamage
                + " defence: " + (bossDefence == null ? "No defence" : bossDefence));
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " + heroesHealth[i]
                    + " damage: " + heroesDamage[i]);
        }
        System.out.println(message);
    }
    public static void medic(){
        if (heroesHealth[3]>0) {
            for (int i = 0; i < 3; i++) {
                if (heroesHealth[i] > 0) {
                    if (heroesHealth[i] < 100) {
                        heroesHealth[i]+=medicHeal;
                        System.out.println("Medic healed teammate");
                        break;
                    }
                }
            }
        }
    }
    public static void golem(){
        heroesHealth[4]-=(bossDamage*4)/5;
    }
    public static void lucky(){
        Random random=new Random();
        random.nextBoolean();
        if (random.nextBoolean()){
            heroesHealth[5]+=bossDamage;
            System.out.println("Lucky dodged the blow");
        }
    }
    public static void berserk(){
        heroesHealth[6]+=bossDamage/2;
        bossHealth-=heroesDamage[6]+=bossDamage/2;
    }
    public static void thor(){
        Random random=new Random();
        random.nextBoolean();
        if (random.nextBoolean()){
            for (int p=0;p<heroesHealth.length;p++){
                heroesHealth[p]+=bossDamage;
                System.out.println("Boss did no damage in the round");
                break;
            }
        }
    }
}
