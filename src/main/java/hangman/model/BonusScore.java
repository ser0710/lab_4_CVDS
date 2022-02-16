package hangman.model;

public class BonusScore implements GameScore{
    private int puntaje = 100;
    /**
     * precondicion: Los parametros deben ser mayores a cero
     * postcondicion: En caso de que las incorrectas sean menor al doble de las correctas,
     * se calcula el puntaje en caso contrario se retorna 0
     * @param count letras correctas
     * @param incorrectCount letras incorrectas
     * @return puntaje realizado por el jugador
     */
    @Override
    public int calculateScore(int count, int incorrectCount) {
        if(incorrectCount * 2 < count){
            puntaje = (count * 10) - (incorrectCount * 5);
        }
        else{
            puntaje = 0;
        }
        return puntaje;
    }

    @Override
    public int getScore() {
        return puntaje;
    }
}
