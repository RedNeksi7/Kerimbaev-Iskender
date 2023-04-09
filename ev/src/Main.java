
public class Main {
    public static void main(String[] args) {
        createObject("BMW_M5F90");
        createObject("MERCEDES_S_CLASS");
        createObject("RacingCar");
    }
    public static String createObject(String className){
        switch (className){
            case "BMW_M5F90":
                BMW_M5F90 bmw_m5F90 = new BMW_M5F90(3000, 2004, 300, 3){};
                bmw_m5F90.print();
                break;
            case "MERCEDES_S_CLASS":
                MERCEDES_S_CLASS mercedes_s_class = new MERCEDES_S_CLASS(45000, 2005,
                        350, "BASE");
                mercedes_s_class.print();
                break;
            case "RacingCar":
                RacingCar racingCar= new RacingCar(2000, 2020, 200){
                };
                racingCar.print();
                break;
        }
        return className;
    }
}
