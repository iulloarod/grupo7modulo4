import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;


class SumaTest {

    @org.junit.jupiter.api.Test
    void operar() {
        Suma suma = new Suma();
        int resultado = suma.operar(2, 3);
        Assertions.assertEquals(5, resultado, "La suma debe ser 5");
    }
}