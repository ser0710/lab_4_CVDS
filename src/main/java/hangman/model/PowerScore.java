package hangman.model;

public class PowerScore implements GameScore{
    /**
     * precondicion: Los parametros deben ser mayores a cero
     * postcondicion: si 5 elevado a las correctas es menor a 8 multiplicado
     * por las incorrectas se retorna 0
     * Si 5 elevado a las correctas menos incorrectas por 8 es mayor a 500
     * se retorna 500
     * En caso contrario se calcula el puntaje 
     *
     * @param count letras correctas
     * @param incorrectCount letras incorrectas
     * @return puntaje realizado por el jugador
     */
    @Override
    public int calculateSocre(int count, int incorrectCount) {
        return 0;
    }
}
