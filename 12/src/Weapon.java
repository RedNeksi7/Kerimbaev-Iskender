public class Weapon {
    private String name;
    public enum WeaponType{
        MACHINE,
        MACHINE_GUN,
        SNIPER
    }
    private WeaponType type;
    public Weapon(String name, WeaponType type){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}
