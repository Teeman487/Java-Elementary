package Java_Anagrams_JAVA14;

public class Main2 {
    private static int[] frequency = new int[26];

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (char c : a.toCharArray()) {
            frequency[(int) c - 97]++;
        }
        for (char c : b.toCharArray()) {
            frequency[(int) c - 97]--;
        }

        boolean anagrams = true;
        for (int i : frequency) {
            if (i != 0) {
                anagrams = false;
                break;
            }
        }
        return anagrams;
    }
}
