public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("bob", "Питбуль", Color.BROWN, new Shelter("Приют №1", "7-мкр."), 10);
        Dog dog2 = new Dog(11, new Shelter("Приют Бишкека", "Парк Победы"));
        Dog dog3 = new Dog("July", "Овчарка", Color.BLACK,
                new Shelter("Best shelter", "Москва"),"Фас", 12);
        Pet pet= new Pet(10, new Shelter("Приют №2", "Кара-Балта"));
        System.out.println(dog1.printInfo());
        System.out.println(dog2.printInfo());
        System.out.println(dog3.printInfo());
        System.out.println(pet.getInfo());

    }
}