import java.util.Random;

public class Pet extends Animal{
    private int age=generateDefaultAge();
    private Color color=Color.BROWN;

    public Pet(int age, Shelter shelter) {
        this.age = age;
        this.shelter = shelter;
    }

    public Pet(int age, Color color, Shelter shelter) {
        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }

    private Shelter shelter= new Shelter("Неизвестное название", "Неизвестный адрес");
    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }
    public int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(1,20);
    }
    public final String getInfo(){
        return "Возраст: "+getAge() +", Окрас: "+getColor()+", Название приюта: "+getShelter();
    }
}
