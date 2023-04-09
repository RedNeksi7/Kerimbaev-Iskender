public class MERCEDES_S_CLASS extends RacingCar{
    public String equipment;
    public MERCEDES_S_CLASS(int price, int year, int horsePower, String equipment){
        this.equipment=equipment;
    }

    @Override
    public void print() {
        System.out.println("Цена MERCEDES S-CLASS: " + price + ", Год выпуска: " + year + ", Лошадиных сил: " +
                horsePower + ", Комплектация: " + equipment);
    }
}
