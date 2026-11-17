package by.itacademy.malkova;

import java.util.Scanner;

public class CountVowelsAndСonsonants {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String testedString = scanner.nextLine();
        testedString = testedString.toLowerCase();
        testedString = testedString.replace(" ", "");

        String vowels = "aeuoiy";
        int countVowel = 0;
        int countConsonants = 0;
        for (int i = 0; i < testedString.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (testedString.charAt(i) == vowels.charAt(j)) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) {
                countVowel++;
            } else {
                countConsonants++;
            }
        }
        System.out.println("Vowel = " + countVowel);
        System.out.println("Conconants =" + countConsonants);
    }
}
