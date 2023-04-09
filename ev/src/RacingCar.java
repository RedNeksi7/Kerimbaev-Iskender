public abstract class RacingCar extends Transport implements Printable{
    @Override
    public void print() {
        System.out.println("Цена автомобиля: " + price + ", Год выпуска: " + year + ", Лошадиных сил: " +
                horsePower);
    }

    public RacingCar(int price, int year, int horsePower) {
        super(price, year, horsePower);
    }
    public RacingCar(){

    }
}
