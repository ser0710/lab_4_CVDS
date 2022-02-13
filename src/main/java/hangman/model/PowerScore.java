package hangman.model;
import java.lang.Math.*;

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
    public int calculateScore(int count, int incorrectCount) {
        int puntaje;
        if(incorrectCount * 8 > Math.pow(5, count)){
            puntaje = 0;
        }
        else if(Math.pow(5, count) - incorrectCount * 8 > 500){
            puntaje = 500;
        }
        else{
            puntaje = (int) Math.pow(5, count) - incorrectCount * 8;
        }
        return puntaje;
    }
}
