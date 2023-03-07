
public class Main {
    public static void main(String[] args) {
        double[] mDouble = {1.2, -2.1, 3.4, -4.5, 5.6, -6.7, 7.8, -8.9, 9.1, 2.6, 5.2, -6.8, 5.1, 6.2, -8.3};
        int x = 0;
        double l=0.0;
        int k=0;

        for (double a : mDouble) {
            if (a<0){
                for (int z=x+1;z<mDouble.length;z++){
                    if (mDouble[z]>0){
                        l+=mDouble[z];
                        k++;
                    }
                }
                break;
            }
        }
        System.out.println(l/k);
    }
}
