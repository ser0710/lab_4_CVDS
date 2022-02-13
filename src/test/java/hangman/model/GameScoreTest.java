package hangman.model;

import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest {
    GameScore prueba;
    /**
     * OriginalScore
     * Clases equivalencia:
     * Si las incorrectas es menor a 11 el puntaje es las correctas menos 10 por las incorrectas
     * Si las incorrectas es 11 o mas el puntaje es 0
     * Frontera:
     * El puntaje esta entre 0 y 100
     */
    @Test
    public void MaxPuntuationOriginalScore(){
        prueba = new OriginalScore();
        int puntaje = prueba.calculateScore(0, 0);
        Assert.assertEquals(puntaje, 100);
    }

    @Test
    public void MinPuntuationOriginalScore(){
        prueba = new OriginalScore();
        int puntaje = prueba.calculateScore(0, 10);
        Assert.assertEquals(puntaje, 0);
    }

    @Test
    public void OutRangePuntuationOriginalScore(){
        prueba = new OriginalScore();
        int puntaje = prueba.calculateScore(0, 13);
        Assert.assertEquals(puntaje, 0);
    }

    @Test
    public void InRangePuntuationOriginalScore(){
        prueba = new OriginalScore();
        int puntaje = prueba.calculateScore(0, 3);
        Assert.assertEquals(puntaje, 70);
    }

    /**
     * BonusScore
     * Clases equivalencia:
     * Si las incorrectas es menor a el doble de las correctas el puntaje es 10 por correctas menos 5 por incorrectas
     * Si las incorrectas es mayor o igual al doble de las correctas el puntaje es 0
     * Frontera:
     * El puntaje siempre es mayor a 0
     */
    @Test
    public void MinPuntuationBonusScore(){
        prueba = new BonusScore();
        int puntaje = prueba.calculateScore(0, 0);
        Assert.assertEquals(puntaje, 0);
    }

    @Test
    public void MinPuntuationBonusScore2(){
        prueba = new BonusScore();
        int puntaje = prueba.calculateScore(4, 10);
        Assert.assertEquals(puntaje, 0);
    }

    @Test
    public void NormalPuntuationBonusScore(){
        prueba = new BonusScore();
        int puntaje = prueba.calculateScore(6, 2);
        Assert.assertEquals(puntaje, 50);
    }

    /**
     * PowerBonusScore
     * Clases equivalencia:
     * Si 5 elevado a las correctas es mayor a las incorrectas por 8 el puntaje es 5 elevado a las correctas menos 8
     * incorrectas
     * Si las incorrectas por 8 es mayor o igual a 5 elevado a las correctas el puntaje es 0
     * Si el calculo del puntaje es mayor a 500 el puntaje final sera de dicho valor
     * Frontera:
     * el puntaje esta en 0 y 500
     */

    @Test
    public void MinPuntuationPowerBonusScore(){
        prueba = new PowerScore();
        int puntaje = prueba.calculateScore(0,0);
        Assert.assertEquals(puntaje, 1);
    }

    @Test
    public void MaxPuntuationPowerBonusScore(){
        prueba = new PowerScore();
        int puntaje = prueba.calculateScore(190,10);
        Assert.assertEquals(puntaje, 500);
    }

    @Test
    public void MinPuntuationPowerBonusScore2(){
        prueba = new PowerScore();
        int puntaje = prueba.calculateScore(3,16);
        Assert.assertEquals(puntaje, 0);
    }

    @Test
    public void NorPuntuationPowerBonusScore(){
        prueba = new PowerScore();
        int puntaje = prueba.calculateScore(3,7);
        Assert.assertEquals(puntaje, 69);
    }
}
