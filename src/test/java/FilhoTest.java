import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class FilhoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Filho filho = new Filho();
        filho.setSalarioMae(3000.6);
        filho.setSalarioPai(2050.5);

        assertEquals(252.55500000000004, filho.calcularMesada());
    }
}