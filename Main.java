import java.util.Random;

public class Main {
    public static void main(String[] args) {
        n(generateRandomAge(0,45),5);
        n(generateRandomAge(0,45),24);
        n(generateRandomAge(0,45),14);
        n(generateRandomAge(0,45),30);
        n(generateRandomAge(0,45),70);
    }
    public static void n(int age, int temp){
        if (temp>-20&&temp<30&&age>20&&age<45){
            System.out.println("Можно идти гулять.");
        }else if(age<20&&temp<28&&temp>0){
            System.out.println("Можно идти гулять.");
        }else if(age>45&&temp>-10&&temp<25){
            System.out.println("Можно идти гулять.");
        } else {
            System.out.println("Оставайтесь дома.");
        }
        return;
    }
    public static int generateRandomAge(int min, int max) {
        Random rand = new Random();
        int age = rand.nextInt(max - min + 1) + min;
        return age;
    }
}