
public class Main {
    public static void main(String[] args) {
        Weapon weapon=new Weapon("AWP",Weapon.WeaponType.SNIPER);
        weapon.setName("AK47");
        weapon.setType(Weapon.WeaponType.SNIPER);
        Boss boss= new Boss(500, 50, weapon, "Thor");
        System.out.println(boss.printInfo());
    }
}
