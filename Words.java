import java.util.Random;

public class Words {
    private String[] randomWords = { "casa", "perro", "gato", "sol", "luna",
            "montana", "rio", "playa", "arbol", "flores",
            "ciudad", "coche", "bicicleta", "computadora", "telefono",
            "libro", "musica", "cafe", "amor", "familia",
            "felicidad", "viaje", "aventura", "estrella", "verano",
            "invierno", "primavera", "madera", "juego", "deporte"};
    private String selectedWord;
    private Random random = new Random();
    private char[] letters;
    public Words() {
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString() {
        StringBuilder text = new StringBuilder();

        for(char letter: letters) {

            if(letter == '\u0000'){
                text.append('-');
            }else {
                text.append(letter);
            }
            text.append(' ');
        }

        return text.toString();
    }

    public boolean youreRight() {
        for(char letter: letters){
            if(letter == '\u0000'){
                return false;
            }
        }
        return true;
    }
    public void guess(char letter) {
        for(int i=0; i<selectedWord.length(); i++){
            if(letter == selectedWord.charAt(i)){
                letters[i] = letter;
            }
        }
    }
}
