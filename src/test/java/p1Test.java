import firstTest.p1.Descuento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class p1Test {
/*
        -- Si el sueldo es menor o igual al salario básico no se
           aplica ningún tipo de descuento.
        -- Si el sueldo es mayor al salario básico el descuento
           es del 5%.
        -- Si el sueldo es mayor que el doble del salario básico
           el descuento es del 15%.
 */

    @ParameterizedTest
    @CsvSource({
            "0, ERROR el sueldo ingresado es incorrecto",
            "2000, El sueldo es menor o igual que el salario mínimo el salario actual es: 2000"
    })

    public void verifyMessageSalario(int salario, String expectedResult) throws Exception{
        Descuento desc = new Descuento();
        String actualResult = desc.getMessage(salario);
        Assertions.assertEquals(actualResult, expectedResult, "ERROR el sueldo ingresado es incorrecto");
    }


}
