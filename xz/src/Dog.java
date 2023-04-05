public final class Dog extends Pet{
    private String name= "Неизвестно";
    private String breed= "Неизвестно";
    private String commands="Неизвестно";

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getCommands() {
        return commands;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, int age) {
        super(age, color,shelter);
        this.name = name;
        this.breed = breed;
    }
    public Dog(String name, String breed, Color color, Shelter shelter,String commands, int age) {
        super(age, color,shelter);
        this.name = name;
        this.breed = breed;
        this.commands=commands;
        }

    public Dog(int age, Shelter shelter) {
        super(age,shelter);
    }
    public void makeVoice(String voice, int number){

    }
    public void makeVoice(int number, String voice){

    }
    public void makeVoice(String voice){

    }

    public String printInfo(){
        return "Имя: "+getName()+", Порода: "+
                getBreed()+", Команды: " + getCommands() +", Возраст: "+
                getAge()+", Окрас: "+getColor()+", Название приюта: "+getShelter();
    }

}
