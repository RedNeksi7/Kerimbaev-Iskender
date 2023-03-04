public class Main {
    public static void main(String[] args) {
        System.out.println(temp_age(20,generateRandomAge()));
        System.out.println(temp_age(15,generateRandomAge()));
        System.out.println(temp_age(10,generateRandomAge()));
        System.out.println(temp_age(5,generateRandomAge()));
        System.out.println(temp_age(25,generateRandomAge()));
    }
    public static String temp_age(int temp, int age){
        if (age>20&&age<45&&temp>-20&&temp<30||age<20&&temp>0&&temp<28||age>45&&temp>-10&&temp<25){
            return "Можно идти гулять";
        }else{
            return "Оставайтесь дома.";
        }

    }
    public static int generateRandomAge(){
        int a = (int) (Math.random()*(30+1));
        return a;
    }
}