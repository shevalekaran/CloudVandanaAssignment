// C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet 
from a-z) CandidateName = Karan_Shewale www.shevalekaran1@gmail.com

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        int index;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                index = ch - 'A';
            } else if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
            } else {
                continue;
            }
            alphabet[index] = true;
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String sentence = "Brawny gods just flocked up to quiz and vex him";
        boolean isPangram = isPangram(sentence);
        System.out.println("Is the sentence a pangram ? " + isPangram);
    }
}


// OUTPUT = Is the sentence a pangram ? true
