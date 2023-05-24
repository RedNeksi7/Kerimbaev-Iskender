import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(9991);
        num.add(821923);
        num.add(2832);
        num.add(22);
        num.add(1120);
        num.add(9);
        num.add(3);
        num.add(33);
        num.add(1233);

        Collections.sort(num);
        Collections.reverse(num);
        System.out.println("Числа по убыванию: " + num);

        int[] numnum = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
        ArrayList<Integer> aNumbers = new ArrayList<>();
        ArrayList<Integer> bNumbers = new ArrayList<>();

        for (int n : numnum) {
            if (n % 2 == 0) {
                aNumbers.add(n);
            } else {
                bNumbers.add(n);
            }
        }

        System.out.println("Четные числа: " + aNumbers);
        System.out.println("Нечетные числа: " + bNumbers);


        int[] numbers = {12001, 29384, 12384, 909345, 34289, 1, 2, 3};
        int sum = 0;
        int c = 1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            } else {
                c *= number;
            }
        }

        System.out.println("Сумма всех четных чисел: " + sum);
        System.out.println("Произведение всех нечетных чисел: " + c);

        String[] words = {"переменная", "функция", "метод", "аргумент", "параметр", "привязка", "длина", "высота", "размер"};

        System.out.println("Гласные буквы:");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (isVowel(letter)) {
                    System.out.print(letter + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Согласные буквы:");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (!isVowel(letter) && Character.isLetter(letter)) {
                    System.out.print(letter + " ");
                }
            }
        }

        String[] w = {"java", "kotlin", "python", "javascript", "nodejs", "go", "react", "react native", "swift"};

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (String k:w){
            for (char letter:k.toCharArray()){
                if (isVowels(letter)){
                    vowels.add(letter);
                } else if (Character.isLetter(letter)) {
                    consonants.add(letter);
                }
            }
        }

        System.out.println();
        System.out.println("Гласные буквы: " + vowels);
        System.out.println("Согласные буквы: " + consonants);
        System.out.println("java");
        System.out.println("apple");
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'а' || letter == 'е' || letter == 'ё' || letter == 'и' || letter == 'о' ||
                letter == 'у' || letter == 'ы' || letter == 'э' || letter == 'ю' || letter == 'я';
    }
    private static boolean isVowels(char letters) {
        char lowercaseLetter = Character.toLowerCase(letters);
        return lowercaseLetter == 'a' || lowercaseLetter == 'e' || lowercaseLetter == 'i' ||
                lowercaseLetter == 'o' || lowercaseLetter == 'u';
    }
}