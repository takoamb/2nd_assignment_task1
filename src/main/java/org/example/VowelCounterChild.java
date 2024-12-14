package org.example;

public class VowelCounterChild extends VowelCounter {
    public void countVowels(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char vowel = word.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                count++;
            }
        }
        System.out.println("ამ სტრიქონში არის " + count + " ხმოვანი");
    }
}
