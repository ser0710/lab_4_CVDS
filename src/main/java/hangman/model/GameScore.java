package hangman.model;

public interface GameScore {
    /**
     *
     * @param count letras correctas
     * @param incorrectCount letras incorrectas
     * @return puntaje realizado por el jugador
     */
    public int calculateSocre(int count, int incorrectCount);
}
