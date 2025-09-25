import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String word;
        String guessWord;
        String guessChar;
        byte select;
        byte lives = 6;
        int lenght;
        boolean hasChar;
        boolean gameWon = false;

        System.out.println("***********HangMan**********");
        System.out.println("Please Player 1 type in your 1 word");
        word = myObj.nextLine();
        lenght = word.length();
        char[] hidden = new char[lenght];
        for(int i = 0; i < lenght; i++){
            hidden[i] = '_';
            System.out.print("_");
        }
        System.out.println("\n");

        while(lives == 0 && !gameWon){
            System.out.println("Player 2 do you want to guess 1.character or 2.word: ");
            select = myObj.nextByte();
            myObj.nextLine();
            switch (select){
                case 1:
                    System.out.print("Which character you think word has: ");
                    guessChar = myObj.nextLine();
                    hasChar = word.contains(guessChar);
                    if(hasChar){
                        System.out.println("Word does contain " + guessChar);
                        for (int i = 0; i < lenght; i++) {
                            if (word.charAt(i) == guessChar.charAt(0)) {
                                hidden[i] = guessChar.charAt(0);
                            }
                        }
                        for (char c : hidden) {
                            System.out.print(c + " ");
                        }
                        System.out.println();
                    }else{
                        System.out.println("Word does not contain " + guessChar);
                        System.out.println("Lives left: " + lives--);
                    }if(lives == 0){
                        System.out.println("You lost all of your lives");
                        System.exit(0);
                    }
                    break;

                case 2:
                    System.out.println("Which word you think it is: ");
                    guessWord = myObj.nextLine();
                    if(guessWord.equals(word) == true) {
                        System.out.println("Word is guessed correctly Player 2 wins!");
                        gameWon = true;
                        return;
                    }else{
                    System.out.println("Word is not guessed correctly");
                    System.out.println("Lives left: " + lives--);
                    }if(lives == 0){
                System.out.println("You lost all of your lives");
                return;
            }
            break;
            }
        }
    }
}