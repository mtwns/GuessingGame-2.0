import java.util.Scanner;

public class GuessTheWord {
    private boolean play = true;
    private Words randomWord = new Words();
    private Scanner scanner = new Scanner(System.in);
    public void start() {


        do {
            showWord();
            getInput();
            checkInput();
        }while(play);
    }

    void showWord() {
        System.out.println(randomWord);
    }
    void getInput() {
        System.out.println("Please introduce a letter to start: ");
        String playerGuess = scanner.nextLine();
        char letter;

        randomWord.guess(playerGuess.charAt(0));
    }
    void  checkInput() {
        if(randomWord.youreRight()){
            System.out.println("YOU WIN!!!!");
            System.out.println("The word is: " + randomWord);
            play = false;
        }
    }

    public void end() {
        scanner.close();
    }
}
