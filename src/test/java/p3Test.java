import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import firstTest.p3.PermisoUtils;
import firstTest.p3.UserUtils;
import firstTest.p3.Permisos;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class p3Test {
    @BeforeAll
    public static void before(){
        MockedStatic<UserUtils> mockedU =  Mockito.mockStatic(UserUtils.class);
        MockedStatic<PermisoUtils> mockedP =  Mockito.mockStatic(PermisoUtils.class);
    }

    @Test
    public void verify(){

    }
}
