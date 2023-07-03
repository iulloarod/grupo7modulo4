import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
class DivisionTest {

    @org.junit.jupiter.api.Test
    void operar() {
        Division division = new Division();
        double resultado = division.operar(4, 2);
        Assertions.assertEquals(2.0, resultado, "La división debe ser 2.0");
    }
}