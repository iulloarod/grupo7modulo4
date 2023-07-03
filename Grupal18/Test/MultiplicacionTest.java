import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
class MultiplicacionTest {

    @org.junit.jupiter.api.Test
    void operar() {
        Multiplicacion multiplicacion = new Multiplicacion();
        int resultado = multiplicacion.operar(3, 2);
        Assertions.assertEquals(6, resultado, "La multiplicación debe ser 6");
    }
}