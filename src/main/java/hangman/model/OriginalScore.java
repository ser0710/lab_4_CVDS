package hangman.model;

public class OriginalScore implements GameScore{
    /**
     * precondicion: Los parametros deben ser mayores a cero
     * postcondicion: Si las incorrectas son menor que 10 se calcula el puntaje
     * en caso contrario se retorna 0
     * @param count letras correctas
     * @param incorrectCount letras incorrectas
     * @return puntaje realizado por el jugador
     */
    @Override
    public int calculateScore(int count, int incorrectCount) {
        int puntaje = 100;
        if (incorrectCount >= 10){
            puntaje = 0;
        }
        else{
            puntaje -= incorrectCount * 10;
        }
        return puntaje;
    }
}
