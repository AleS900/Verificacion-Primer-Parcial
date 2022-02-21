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

            "1, El sueldo es menor o igual que el salario mínimo el salario actual es: 1",
            "999, El sueldo es menor o igual que el salario mínimo el salario actual es: 999",
            "1000, El sueldo es menor o igual que el salario mínimo el salario actual es: 1000",
            "1001, El sueldo es menor o igual que el salario mínimo el salario actual es: 1001",
            "1999, El sueldo es menor o igual que el salario mínimo el salario actual es: 1999",
            "2000, El sueldo es menor o igual que el salario mínimo el salario actual es: 2000",

            "2010, El sueldo es mayor que el salario mínimo el salario actual es: 1910.0",
            "2999, El sueldo es mayor que el salario mínimo el salario actual es: 2850.0",
            "3000, El sueldo es mayor que el salario mínimo el salario actual es: 2850.0",
            "3001, El sueldo es mayor que el salario mínimo el salario actual es: 2851.0",
            "3999, El sueldo es mayor que el salario mínimo el salario actual es: 3800.0",
            "4000, El sueldo es mayor que el salario mínimo el salario actual es: 3800.0",

            "4001, El sueldo es mayor que el doble del salario mínimo el salario actual es: 3400.85",
            "5999, El sueldo es mayor que el doble del salario mínimo el salario actual es: 5099.15",
            "6000, El sueldo es mayor que el doble del salario mínimo el salario actual es: 5100.0",
            "7999, El sueldo es mayor que el doble del salario mínimo el salario actual es: 6799.15",
            "8000, El sueldo es mayor que el doble del salario mínimo el salario actual es: 6800.0",
    })

    public void verifyMessageSalario(int salario, String expectedResult) throws Exception{
        Descuento desc = new Descuento();
        String actualResult = desc.getMessage(salario);

        Assertions.assertEquals(actualResult, expectedResult, "ERROR el sueldo ingresado es incorrecto");
    }


}
