public class BMW_M5F90 extends RacingCar {
    public int addTurbine;
    public BMW_M5F90(int price, int year, int horsePower, int addTurbine){
        this.addTurbine=addTurbine;
    }

    @Override
    public void print() {
        System.out.println("Цена BMW M5 F90: " + price + ", Год выпуска: " + year + ", Лошадиных сил: " +
                horsePower + ", Количество турбин: " + addTurbine);
    }
}
