public class Main {
    public static void main(String[] args) {
        Boss hugoBoss = new Boss();
        hugoBoss.setBossHealth(500);
        hugoBoss.setBossDamage(70);
        hugoBoss.setBossAbility("Berserk");
        System.out.println("Boss health: " + hugoBoss.getBossHealth() + ", damage: "+ hugoBoss.getBossDamage()
                + ", ability: " + hugoBoss.getBossAbility());
        }
    }
