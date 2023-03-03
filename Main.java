import java.util.Random;

public class Main {
    public static void main(String[] args) {
        temp_age(generateRandomAge(),18);
        temp_age(generateRandomAge(),20);
        temp_age(generateRandomAge(),46);
        temp_age(generateRandomAge(),32);
        temp_age(generateRandomAge(),10);
    }
    public static void temp_age(int temp, int age){
        if (age>20&&age<45&&temp>-20&&temp<30||age<20&&temp>0&&temp<28||age>45&&temp>-10&&temp<25){
            System.out.println("Можно гулять.");
        }else{
            System.out.println("Оставайтесь дома.");
        }
        return;
    }
    public static int generateRandomAge(){
        int a = (int) (Math.random()*(30+1));
        return a;
    }
}