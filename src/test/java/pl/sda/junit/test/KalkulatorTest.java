package pl.sda.junit.test;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.junit.Kalkulator;

public class KalkulatorTest {

    @Test
    public void czteryDo0Daje1(){
        int wynik = Kalkulator.potega(4,0);
        Assert.assertEquals(1, wynik);

    }

    @Test
    public void jedenDo30Daje(){
        Assert.assertEquals(1, Kalkulator.potega(1,30));
    }

    @Test
    public void dwaDo5Daje32(){
        Assert.assertEquals(32,Kalkulator.potega(2,5));
    }

    @Test
    public void piecPrzez0dajeFalse(){
        Assert.assertFalse(Kalkulator.czyLiczzbaPodzielnaPrzez(5,0));
    }

    @Test
    public void czteryPrzez2DajeTrue(){
        Assert.assertTrue(Kalkulator.czyLiczzbaPodzielnaPrzez(4,2));
    }
    @Test
    public void piecPrzez4DajeFalse(){
        Assert.assertFalse(Kalkulator.czyLiczzbaPodzielnaPrzez(5,4));
    }
}
