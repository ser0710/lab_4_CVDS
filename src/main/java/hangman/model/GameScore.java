package hangman.model;

public interface GameScore {
    /**
     *
     * @param count letras correctas
     * @param incorrectCount letras incorrectas
     * @return puntaje realizado por el jugador
     */
    int calculateScore(int count, int incorrectCount);
    int getScore();
}
