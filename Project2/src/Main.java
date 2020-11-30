import java.util.Random;

public class Main {

    public static void main(String[] args){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String punctuation = "[]{};'#,./";
        Random random = new Random();
        int index = 0;
        int number =0;

        StringBuilder stringBuilderAlphabet = new StringBuilder();
        StringBuilder stringBuilderPunctuation = new StringBuilder();

        char[] alphabetArray = new char[52];
        char[] passwordAlphabet = new char[52];
        String alphabetPassword = "";

        char[] punctuationArray = new char[10];
        char[] passwordPunctuation = new char[10];
        String punctuationPassword = "";

        String finalPassword = "";

        for(int i = 0; i < 52; i++){
            alphabetArray[i] = alphabet.charAt(i);
            passwordAlphabet[i] = alphabetArray[random.nextInt(52)];
        }
        for(int i = 0; i < 10; i++){
            punctuationArray[i] = punctuation.charAt(i);
            passwordPunctuation[i] = punctuationArray[random.nextInt(10)];
        }
        for(int i = 0; i < alphabetArray.length; i++){
            stringBuilderAlphabet.append(passwordAlphabet[i]);
        }
        for(int i = 0; i < punctuationArray.length; i++){
            stringBuilderPunctuation.append(passwordPunctuation[i]);
        }
        alphabetPassword = stringBuilderAlphabet.toString();
        punctuationPassword = stringBuilderPunctuation.toString();
        finalPassword = alphabetPassword + punctuationPassword;

        System.out.println(finalPassword);
    }
}


