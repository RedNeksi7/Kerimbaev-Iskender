import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        ArrayList<String>listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listA.add(user_input.nextLine());
        }
        System.out.println(listA);
        ArrayList<String>listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listB.add(user_input.nextLine());
        }
        Collections.reverse(listB);
        System.out.println(listB);
        ArrayList<String>listC= new ArrayList<>();
        listA.addAll(listB);
        Iterator<String>iteratorA = listA.iterator();
        Iterator<String>iteratorB = listB.iterator();
        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            listC.add( iteratorA.next ());
            listC.add( iteratorB.next ());
        }
        System.out.println(listC);
        Collections.sort(listC);
        System.out.println(listC);
    }
}