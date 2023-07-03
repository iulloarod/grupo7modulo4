import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
class RestaTest {

    @org.junit.jupiter.api.Test
    void operar() {
        Resta resta = new Resta();
        int resultado = resta.operar(5, 3);
        Assertions.assertEquals(2, resultado, "La resta debe ser 2");
    }
}